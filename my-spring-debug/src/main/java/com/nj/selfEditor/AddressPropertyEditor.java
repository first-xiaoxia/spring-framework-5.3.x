package com.nj.selfEditor;

import java.beans.PropertyEditorSupport;

public class AddressPropertyEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] ss = text.split("_");
		Address address = new Address();
		for (int i=0;i<ss.length;i++) {
			if (i == 0) {
				address.setProvince(ss[i]);
			}
			else if (i == 1) {
				address.setCity(ss[i]);
			}
			else if (i == 3) {
				address.setTown(ss[i]);
			}
		}
		this.setValue(address);
	}
}
