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

import org.neo4j.graphdb.Direction;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

/**
 * EntityBranch Class.
 * @author Harish Mangala
 */
@NodeEntity
public class EntityBranch implements Model {

	private static final long serialVersionUID = -2029812120847670545L;

	@GraphId
	private Long id;
	private String entityBranchCode;
	private String entityBranchName;
	private String contactPerson;
	private String contactNumber;
	private String emailId;
	private Integer status;
	private Date createdDate;
	private Date updatedDate;
	@RelatedTo(type = "BRANCHED_TO", direction = Direction.OUTGOING)
	private Entity entity;

	/**
	 * Gets the entity branch id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * Sets the entity branch id.
	 *
	 * @param id the new entity branch id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the entity branch code.
	 *
	 * @return the entity branch code
	 */
	public String getEntityBranchCode() {
		return this.entityBranchCode;
	}

	/**
	 * Sets the entity branch code.
	 *
	 * @param entityBranchCode the new entity branch code
	 */
	public void setEntityBranchCode(String entityBranchCode) {
		this.entityBranchCode = entityBranchCode;
	}

	/**
	 * Gets the entity branch name.
	 *
	 * @return the entity branch name
	 */
	public String getEntityBranchName() {
		return this.entityBranchName;
	}

	/**
	 * Sets the entity branch name.
	 *
	 * @param entityBranchName the new entity branch name
	 */
	public void setEntityBranchName(String entityBranchName) {
		this.entityBranchName = entityBranchName;
	}

	/**
	 * Gets the contact person.
	 *
	 * @return the contact person
	 */
	public String getContactPerson() {
		return this.contactPerson;
	}

	/**
	 * Sets the contact person.
	 *
	 * @param contactPerson the new contact person
	 */
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	/**
	 * Gets the contact number.
	 *
	 * @return the contact number
	 */
	public String getContactNumber() {
		return this.contactNumber;
	}

	/**
	 * Sets the contact number.
	 *
	 * @param contactNumber the new contact number
	 */
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	/**
	 * Gets the email id.
	 *
	 * @return the email id
	 */
	public String getEmailId() {
		return this.emailId;
	}

	/**
	 * Sets the email id.
	 *
	 * @param emailId the new email id
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
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

}
