package com.nj.selfElement;


import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class ValueSetNamespaceHandler extends NamespaceHandlerSupport {

	@Override
	public void init() {
		registerBeanDefinitionParser("value-set",new ValueSetBeanDefinitionParse());
	}
}
