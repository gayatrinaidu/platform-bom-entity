/**
 * Copyright (C) Altimetrik 2016. All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Altimetrik. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms and conditions
 * entered into with Altimetrik.
 */

package com.platform.bom.domain;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;

/**
 * DeviceType Class.
 * @author Harish Mangala
 */
@NodeEntity
public class DeviceType implements Model {
	private static final long serialVersionUID = -9150343854082076613L;

	@GraphId
	private Long id;

	@Indexed(unique = true, failOnDuplicate = true)
	private String deviceTypeCode;

	@NotNull
	private String deviceTypeName;

	@NotNull
	private Date createdDate;

	/**
	 * Return Device Type Code.
	 * @return deviceTypeCode
	 */
	public String getDeviceTypeCode() {
		return this.deviceTypeCode;
	}

	/**
	 * Set Type Code.
	 * @param deviceTypeCode set
	 */
	public void setDeviceTypeCode(String deviceTypeCode) {
		this.deviceTypeCode = deviceTypeCode;
	}

	/**
	 * Return Device Type Name.
	 * @return deviceTypeName
	 */
	public String getDeviceTypeName() {
		return this.deviceTypeName;
	}

	/**
	 * Set Device Type Name.
	 * @param deviceTypeName set
	 */
	public void setDeviceTypeName(String deviceTypeName) {
		this.deviceTypeName = deviceTypeName;
	}

	/**
	 * Return Created Date.
	 * @return createdDate
	 */
	public Date getCreatedDate() {
		return this.createdDate;
	}

	/**
	 * Set Created Date.
	 * @param createdDate set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * Return Type id.
	 * @return id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Set type Id.
	 * @param id set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "DeviceType [id=" + id + ", deviceTypeCode=" + deviceTypeCode + ", deviceTypeName=" + deviceTypeName + ", createdDate=" + createdDate + "]";
	}

}
