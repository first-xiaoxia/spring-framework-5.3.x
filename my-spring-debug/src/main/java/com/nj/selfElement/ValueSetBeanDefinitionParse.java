package com.nj.selfElement;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ValueSetBeanDefinitionParse extends AbstractSingleBeanDefinitionParser {

	@Override
	protected Class<?> getBeanClass(Element element) {
		return ValueSet.class;
	}

	@Override
	protected String getBeanClassName(Element element) {
		return ValueSet.class.getSimpleName();
	}

	@Override
	protected void doParse(Element element, BeanDefinitionBuilder builder) {
		// 获取标签具备的属性值
		String name = element.getAttribute("name");
		String value = element.getAttribute("value");
		if (StringUtils.hasText(name)) {
			builder.addPropertyValue("name",name);
		}
		if (StringUtils.hasText(value)) {
			builder.addPropertyValue("value",value);
		}

		System.out.println();
	}

	protected void parseCarObj(Element element, BeanDefinitionBuilder builder) throws ClassNotFoundException {
		NodeList childNodes = element.getChildNodes();
		for (int i=0; i< childNodes.getLength();i++) {
			Node node = childNodes.item(i);
			if(node.getNodeName().endsWith(":car-obj")){
				NamedNodeMap attributes = node.getAttributes();
				String className = attributes.getNamedItem("id").getNodeValue();
				Class clazz = Class.forName(className);
				builder.getBeanDefinition().setBeanClass(clazz);
				NodeList entryList = node.getChildNodes();
				for (int j = 0; j < entryList.getLength(); j++) {
					Node item = entryList.item(j);
					if (item.getNodeName().equals("carName")) {
						builder.addPropertyValue("carName",item.getAttributes());
						System.out.println();
					}
				}
			}
		}
	}
}
