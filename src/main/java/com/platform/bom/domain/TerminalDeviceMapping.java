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

import org.springframework.data.neo4j.annotation.EndNode;
import org.springframework.data.neo4j.annotation.Fetch;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.RelationshipEntity;
import org.springframework.data.neo4j.annotation.StartNode;

/**
 * TerminalDeviceMapping.
 * @author Harish Mangala
 */
@RelationshipEntity(type = "MAPPED_TO")
public class TerminalDeviceMapping implements Model {
	private static final long serialVersionUID = -4532159493259347623L;

	@GraphId
	private Long id;
	private Date createdDate;
	@StartNode
	@Fetch
	private Terminal terminal;
	@EndNode
	@Fetch
	private Device device;

	/**
	 * Return id.
	 * @return id
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * Set Id.
	 *
	 * @param id new id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Return Device.
	 *
	 * @return device
	 */
	public Device getDevice() {
		return this.device;
	}

	/**
	 * Set Device.
	 * @param device new device
	 */
	public void setDevice(Device device) {
		this.device = device;
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
	 * @param createdDate new Created Date
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * Return Terminal.
	 * @return terminal
	 */
	public Terminal getTerminal() {
		return this.terminal;
	}

	/**
	 * Set Terminal.
	 * @param terminal new Terminal
	 */
	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
	}

}
