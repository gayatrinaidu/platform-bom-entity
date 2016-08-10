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
import java.util.Set;

import javax.validation.constraints.NotNull;

import org.springframework.data.neo4j.annotation.Fetch;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;
import org.springframework.data.neo4j.annotation.RelatedToVia;

/**
 * Terminal Class.
 * @author Harish Mangala
 */
@NodeEntity
public class Terminal implements Model {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -1578752139764808188L;

	@GraphId
	private Long id;
	@Indexed(unique = true, failOnDuplicate = true)
	private String terminalCode;
	@NotNull
	private Integer status;
	@NotNull
	private Integer version;
	@NotNull
	private Date createdDate;
	private Date updatedDate;
	@RelatedTo(type = "TERMINAL_TYPE")
	@Fetch
	private TerminalType terminalType;
	@RelatedToVia(type = "MAPPED_TO")
	private Set<TerminalDeviceMapping> terminalDeviceMappings;

	public Long getId() {
		return this.id;
	}

	/**
	 * Sets the terminal id.
	 *
	 * @param id the new terminal id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the terminal code.
	 *
	 * @return the terminal code
	 */
	public String getTerminalCode() {
		return this.terminalCode;
	}

	/**
	 * Sets the terminal code.
	 *
	 * @param terminalCode the new terminal code
	 */
	public void setTerminalCode(String terminalCode) {
		this.terminalCode = terminalCode;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public Integer getStatus() {
		return this.status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * Gets the version.
	 *
	 * @return the version
	 */
	public Integer getVersion() {
		return this.version;
	}

	/**
	 * Sets the version.
	 *
	 * @param version the new version
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}

	/**
	 * Gets the created date.
	 *
	 * @return the created date
	 */
	public Date getCreatedDate() {
		return this.createdDate;
	}

	/**
	 * Sets the created date.
	 *
	 * @param createdDate the new created date
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * Gets the updated date.
	 *
	 * @return the updated date
	 */
	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	/**
	 * Sets the updated date.
	 *
	 * @param updatedDate the new updated date
	 */
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	/**
	 * Gets the terminal type.
	 *
	 * @return the terminal type
	 */
	public TerminalType getTerminalType() {
		return this.terminalType;
	}

	/**
	 * Sets the terminal type.
	 *
	 * @param terminalType the new terminal type
	 */
	public void setTerminalType(TerminalType terminalType) {
		this.terminalType = terminalType;
	}

	/**
	 * Gets the terminal device mappings.
	 *
	 * @return the terminal device mappings
	 */
	public Set<TerminalDeviceMapping> getTerminalDeviceMappings() {
		return this.terminalDeviceMappings;
	}

	/**
	 * Sets the terminal device mappings.
	 *
	 * @param terminalDeviceMappings the new terminal device mappings
	 */
	public void setTerminalDeviceMappings(Set<TerminalDeviceMapping> terminalDeviceMappings) {
		this.terminalDeviceMappings = terminalDeviceMappings;
	}

}
