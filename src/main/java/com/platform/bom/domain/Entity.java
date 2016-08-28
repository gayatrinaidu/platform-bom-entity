/**
 * Copyright (C) Altimetrik 2016. All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Altimetrik. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms and conditions
 * entered into with Altimetrik.
 */

package com.platform.bom.domain;

import org.springframework.data.neo4j.annotation.GraphId;

/**
 * Entity Class.
 * @author Harish Mangala
 */
public abstract class Entity implements Model {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 345373030231614035L;

	@GraphId
	protected Long id;

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
	 * This is the default mechanism for providing entity identity to the
	 * OGM
	 *
	 * It is required because the OGM can currently accept objects with NO id
	 * value set. This is a restriction that must be changed
	 *
	 * @param o the object to compare, either or both may not yet be persisted.
	 * @return boolean
	 */
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || id == null || getClass() != o.getClass()) {
			return false;
		}
		Entity entity = (Entity) o;

		if (!id.equals(entity.id)) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		return (id == null) ? -1 : id.hashCode();
	}
}
