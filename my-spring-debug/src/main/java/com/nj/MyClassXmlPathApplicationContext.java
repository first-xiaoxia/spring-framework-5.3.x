package com.nj;

import com.nj.selfEditor.AddressPropertyEditorRegistrar;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
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

	/**
	 * 扩展
	 * @param beanFactory the bean factory used by the application context
	 */
	@Override
	protected void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
		// 添加自定义的PropertyEditorRegistrar
		beanFactory.addPropertyEditorRegistrar(new AddressPropertyEditorRegistrar());
		// 添加自定义的BeanPostProcessor
		super.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());
		System.out.println("扩展postProcessBeanFactory方法，实现自己的具体要求");
	}
}
