package io.spring.restapi.bean;

public class AddressBean extends BaseBean {

	private static final long serialVersionUID = -8135145035717461241L;

	private String type;
	private String address;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
