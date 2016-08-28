/**
 * Copyright (C) Altimetrik 2016. All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Altimetrik. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms and conditions
 * entered into with Altimetrik.
 */

package com.platform.bom.domain;

import org.springframework.data.neo4j.annotation.NodeEntity;

/**
 * User Class.
 * @author Harish Mangala
 */
@NodeEntity
public class User extends Entity {
	private static final long serialVersionUID = -8628859801579198781L;

	private String firstName;
	private String lastName;

	/**
	 * Return first name.
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Set First Name.
	 * @param firstName new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Return last name.
	 * @return lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Set Last Name.
	 * @param lastName new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
