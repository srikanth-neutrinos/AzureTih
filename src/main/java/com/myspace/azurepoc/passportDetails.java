package com.myspace.azurepoc;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class passportDetails implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "name")
	private java.lang.String name;
	@org.kie.api.definition.type.Label(value = "location")
	private java.lang.String location;
	@org.kie.api.definition.type.Label(value = "country")
	private java.lang.String country;

	public passportDetails() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getLocation() {
		return this.location;
	}

	public void setLocation(java.lang.String location) {
		this.location = location;
	}

	public java.lang.String getCountry() {
		return this.country;
	}

	public void setCountry(java.lang.String country) {
		this.country = country;
	}

	public passportDetails(java.lang.String name, java.lang.String location,
			java.lang.String country) {
		this.name = name;
		this.location = location;
		this.country = country;
	}

}