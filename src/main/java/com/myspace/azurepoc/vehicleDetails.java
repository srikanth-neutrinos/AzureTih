package com.myspace.azurepoc;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class vehicleDetails implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "vehicleNumber")
	private java.lang.String vehicleNumber;
	@org.kie.api.definition.type.Label(value = "driverName")
	private java.lang.String driverName;
	@org.kie.api.definition.type.Label(value = "contactNumber")
	private java.lang.String contactNumber;

	public vehicleDetails() {
	}

	public java.lang.String getVehicleNumber() {
		return this.vehicleNumber;
	}

	public void setVehicleNumber(java.lang.String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public java.lang.String getDriverName() {
		return this.driverName;
	}

	public void setDriverName(java.lang.String driverName) {
		this.driverName = driverName;
	}

	public java.lang.String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(java.lang.String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public vehicleDetails(java.lang.String vehicleNumber,
			java.lang.String driverName, java.lang.String contactNumber) {
		this.vehicleNumber = vehicleNumber;
		this.driverName = driverName;
		this.contactNumber = contactNumber;
	}

}