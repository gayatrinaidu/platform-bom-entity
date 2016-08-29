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

import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;

/**
 * Terminal Class.
 * @author Harish Mangala
 *
 */
@NodeEntity
public class TerminalType extends Entity {

	// The Constant serialVersionUID.
	private static final long serialVersionUID = -5332607030597094235L;

	@Indexed(unique = true, failOnDuplicate = true)
	private String terminalTypeName;
	@NotNull
	private Date createdDate;

	/**
	 * Return Terminal Type Name.
	 * @return terminalTypeName
	 */
	public String getTerminalTypeName() {
		return this.terminalTypeName;
	}

	/**
	 * Set Terminal type name.
	 * @param terminalTypeName new terminal type name
	 */
	public void setTerminalTypeName(String terminalTypeName) {
		this.terminalTypeName = terminalTypeName;
	}

	/**
	 * Return created date.
	 * @return createdDate
	 */
	public Date getCreatedDate() {
		return this.createdDate;
	}

	/**
	 * Set created date.
	 * @param createdDate new created date
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "TerminalType [id=" + id + ", terminalTypeName=" + terminalTypeName + ", createdDate=" + createdDate + "]";
	}

}
