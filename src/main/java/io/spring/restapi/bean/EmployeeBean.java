package io.spring.restapi.bean;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class EmployeeBean extends BaseBean {

	private static final long serialVersionUID = 1001014720485719325L;

	private Integer id;
	private String name;
	private String emailId;
	private Long phn;
	private BigDecimal salary;
	private Date dateOfBirth;
	private boolean variablePay;
	private List<AddressBean> address;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Long getPhn() {
		return phn;
	}

	public void setPhn(Long phn) {
		this.phn = phn;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public boolean isVariablePay() {
		return variablePay;
	}

	public void setVariablePay(boolean variablePay) {
		this.variablePay = variablePay;
	}

	public List<AddressBean> getAddress() {
		return address;
	}

	public void setAddress(List<AddressBean> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", emailId=");
		builder.append(emailId);
		builder.append(", phn=");
		builder.append(phn);
		builder.append(", salary=");
		builder.append(salary);
		builder.append(", dateOfBirth=");
		builder.append(dateOfBirth);
		builder.append(", variablePay=");
		builder.append(variablePay);
		builder.append(", address=");
		builder.append(address);
		builder.append("]");
		return builder.toString();
	}
}
