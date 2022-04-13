package com.nj;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClassXmlPathApplicationContext extends ClassPathXmlApplicationContext {

	public MyClassXmlPathApplicationContext(String... configLocations) {
		super(configLocations);
	}

	@Override
	protected void initPropertySources() {
		System.out.println("扩展initPropertiesSources");
		this.getEnvironment().setRequiredProperties("userName");
	}

	/**
	 * 扩展customizeBeanFactory方法
	 * @param beanFactory the newly created bean factory for this context
	 */
	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		beanFactory.setAllowBeanDefinitionOverriding(false);
		beanFactory.setAllowCircularReferences(false);
		super.customizeBeanFactory(beanFactory);
	}


}
