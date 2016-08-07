/**
 * Copyright © Altimetrik 2016. All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Altimetrik. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms and conditions
 * entered into with Altimetrik.
 */

package com.platform.bom.domain;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.data.neo4j.annotation.Fetch;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

/**
 * Device Class.
 * @author Harish Mangala
 */
@NodeEntity
public class Device implements Model {

	private static final long serialVersionUID = -1842980174598406911L;

	@GraphId
	private Long id;
	@NotNull
	private String deviceCode;
	@Indexed(unique = true, failOnDuplicate = true)
	private String deviceSlNo;
	@NotNull
	private String firmwareVersion;
	@NotNull
	private String manufacturerName;
	private String description;
	private String registeredBy;
	@NotNull
	private Integer status;
	@NotNull
	private Date createdDate;
	private Date updatedDate;
	@RelatedTo(type = "DEVICE_TYPE")
	@Fetch
	private DeviceType deviceType;

	/**
	 * Get the device Id.
	 * @return id
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * Set the Device Id.
	 * @param id value
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the device code.
	 *
	 * @return the device code
	 */
	public String getDeviceCode() {
		return this.deviceCode;
	}

	/**
	 * Sets the device code.
	 *
	 * @param deviceCode the new device code
	 */
	public void setDeviceCode(String deviceCode) {
		this.deviceCode = deviceCode;
	}

	/**
	 * Gets the device sl no.
	 *
	 * @return the device sl no
	 */
	public String getDeviceSlNo() {
		return this.deviceSlNo;
	}

	/**
	 * Sets the device sl no.
	 * @param deviceSlNo the new device sl no
	 */
	public void setDeviceSlNo(String deviceSlNo) {
		this.deviceSlNo = deviceSlNo;
	}

	/**
	 * Gets the firmware version.
	 * @return the firmware version
	 */
	public String getFirmwareVersion() {
		return this.firmwareVersion;
	}

	/**
	 * Sets the firmware version.
	 * @param firmwareVersion the new firmware version
	 */
	public void setFirmwareVersion(String firmwareVersion) {
		this.firmwareVersion = firmwareVersion;
	}

	/**
	 * Gets the manufacturer name.
	 * @return the manufacturer name
	 */
	public String getManufacturerName() {
		return this.manufacturerName;
	}

	/**
	 * Sets the manufacturer name.
	 * @param manufacturerName the new manufacturer name
	 */
	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	/**
	 * Gets the description.
	 * @return the description
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Sets the description.
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Gets the registered by.
	 * @return the registered by
	 */
	public String getRegisteredBy() {
		return this.registeredBy;
	}

	/**
	 * Sets the registered by.
	 * @param registeredBy the new registered by
	 */
	public void setRegisteredBy(String registeredBy) {
		this.registeredBy = registeredBy;
	}

	/**
	 * Gets the status.
	 * @return the status
	 */
	public int getStatus() {
		return this.status;
	}

	/**
	 * Sets the status.
	 * @param status the new status
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * Gets the created date.
	 * @return the created date
	 */
	public Date getCreatedDate() {
		return this.createdDate;
	}

	/**
	 * Sets the created date.
	 * @param createdDate the new created date
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * Gets the updated date.
	 * @return the updated date
	 */
	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	/**
	 * Sets the updated date.
	 * @param updatedDate the new updated date
	 */
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	/**
	 * Gets the device type.
	 * @return the device type
	 */
	public DeviceType getDeviceType() {
		return this.deviceType;
	}

	/**
	 * Sets the device type.
	 * @param deviceType the new device type
	 */
	public void setDeviceType(DeviceType deviceType) {
		this.deviceType = deviceType;
	}

	@Override
	public String toString() {
		return "Device [id=" + id + ", deviceCode=" + deviceCode + ", deviceSlNo=" + deviceSlNo + ", firmwareVersion=" + firmwareVersion + ", manufacturerName=" + manufacturerName
				+ ", description=" + description + ", registeredBy=" + registeredBy + ", status=" + status + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate
				+ ", deviceType=" + deviceType + "]";
	}

}
