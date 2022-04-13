package com.nj.selfEditor;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

/**
 * 实现自定义的属性值解析注册器
 * @author nijun
 * @date 2022-04-12
 */
public class AddressPropertyEditorRegistrar implements PropertyEditorRegistrar {

	@Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {
		registry.registerCustomEditor(Address.class,new AddressPropertyEditor());
	}
}
