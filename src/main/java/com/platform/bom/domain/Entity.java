/**
 * Copyright © Altimetrik 2016. All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Altimetrik. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms and conditions
 * entered into with Altimetrik.
 */

package com.platform.bom.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import org.neo4j.graphdb.Direction;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

/**
 * Entity Class.
 * @author Harish Mangala
 */
@NodeEntity
public class Entity implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 345373030231614035L;

	@GraphId
	private Long id;

	/** persistent field. */
	private String entityName;

	/** persistent field. */
	private String entityType;

	/** persistent field. */
	private int status;

	/** persistent field. */
	private Date createdDate;

	/** persistent field. */
	private Date updatedDate;

	/** persistent field. */
	private String entityCode;

	/** persistent field. */
	private String timeZone;

	private int isSynced;

	@RelatedTo(type = "BRANCHED_TO", direction = Direction.INCOMING)
	private Set<EntityBranch> entityBranches;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return this.id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new entity id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the entity name.
	 *
	 * @return the entity name
	 */
	public String getEntityName() {
		return this.entityName;
	}

	/**
	 * Sets the entity name.
	 *
	 * @param entityName the new entity name
	 */
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	/**
	 * Gets the entity type.
	 *
	 * @return the entity type
	 */
	public String getEntityType() {
		return this.entityType;
	}

	/**
	 * Sets the entity type.
	 *
	 * @param entityType the new entity type
	 */
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public int getStatus() {
		return this.status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public void setStatus(int status) {
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

	/**
	 * Gets the entity code.
	 *
	 * @return the entity code
	 */
	public String getEntityCode() {
		return this.entityCode;
	}

	/**
	 * Sets the entity code.
	 *
	 * @param entityCode the new entity code
	 */
	public void setEntityCode(String entityCode) {
		this.entityCode = entityCode;
	}

	/**
	 * Gets the time zone.
	 *
	 * @return the time zone
	 */
	public String getTimeZone() {
		return this.timeZone;
	}

	/**
	 * Sets the time zone.
	 *
	 * @param timeZone the new time zone
	 */
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	/**
	 * Gets the checks if is synced.
	 *
	 * @return the checks if is synced
	 */
	public int getIsSynced() {
		return isSynced;
	}

	/**
	 * Sets the checks if is synced.
	 *
	 * @param isSynced the new checks if is synced
	 */
	public void setIsSynced(int isSynced) {
		this.isSynced = isSynced;
	}

	/**
	 * Gets the entity branches.
	 *
	 * @return the entity branches
	 */
	public Set<EntityBranch> getEntityBranches() {
		return this.entityBranches;
	}

	/**
	 * Sets the entity branches.
	 *
	 * @param entityBranches the new entity branches
	 */
	public void setEntityBranches(Set<EntityBranch> entityBranches) {
		this.entityBranches = entityBranches;
	}

	@Override
	public String toString() {
		return "Entity [id=" + id + ", entityName=" + entityName + ", entityType=" + entityType + ", status=" + status + ", createdDate=" + createdDate + ", updatedDate="
				+ updatedDate + ", entityCode=" + entityCode + ", timeZone=" + timeZone + ", isSynced=" + isSynced + ", entityBranches=" + entityBranches + "]";
	}

}
