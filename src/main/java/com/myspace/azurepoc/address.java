package com.myspace.azurepoc;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class address implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "streeName")
	private java.lang.String streetName;
	@org.kie.api.definition.type.Label(value = "country")
	private java.lang.String country;
	@org.kie.api.definition.type.Label(value = "state")
	private java.lang.String state;

	public address() {
	}

	public java.lang.String getStreetName() {
		return this.streetName;
	}

	public void setStreetName(java.lang.String streetName) {
		this.streetName = streetName;
	}

	public java.lang.String getCountry() {
		return this.country;
	}

	public void setCountry(java.lang.String country) {
		this.country = country;
	}

	public java.lang.String getState() {
		return this.state;
	}

	public void setState(java.lang.String state) {
		this.state = state;
	}

	public address(java.lang.String streetName, java.lang.String country,
			java.lang.String state) {
		this.streetName = streetName;
		this.country = country;
		this.state = state;
	}

}