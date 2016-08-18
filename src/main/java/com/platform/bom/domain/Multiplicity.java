/**
 * Copyright (C) Altimetrik 2016. All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Altimetrik. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms and conditions
 * entered into with Altimetrik.
 */

package com.platform.bom.domain;

/**
 * Class to define multiplicity of entity relations.
 * @author Gayatri Naidu.
 *
 */
public enum Multiplicity {
	/**
	 * different types of multiplicity.
	 */
	ONE_TO_ONE, ONE_TO_MANY, MANY_TO_MANY;

	/**
	 * Value return.
	 * @return String
	 */
	public String value() {
		return name();
	}

	/**
	 * Get Multiplicity.
	 * @param v String
	 * @return Multiplicity
	 */
	public static Multiplicity fromValue(String v) {
		return valueOf(v);
	}
}
