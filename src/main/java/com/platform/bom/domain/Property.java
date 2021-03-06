/**
 * Copyright (C) Altimetrik 2016. All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Altimetrik. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms and conditions
 * entered into with Altimetrik.
 */

package com.platform.bom.domain;

import java.util.Arrays;

import javax.validation.constraints.NotNull;

import org.springframework.data.neo4j.annotation.NodeEntity;

/**
 * This class represents a property associated with an entity definition.
 * @author Gayatri Naidu
 *
 */
@NodeEntity
public class Property extends Entity {

	private static final long serialVersionUID = 7227953059801973548L;

	@NotNull
	private String name;
	@NotNull
	private String type;
	private boolean isUnique;
	private boolean createIndex;
	private boolean isMandatory;
	private String validation; // validation for the value of this property
	private String[] values; // possible values allowed for this property

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isUnique() {
		return isUnique;
	}

	public void setUnique(boolean isUnique) {
		this.isUnique = isUnique;
	}

	public boolean isCreateIndex() {
		return createIndex;
	}

	public void setCreateIndex(boolean createIndex) {
		this.createIndex = createIndex;
	}

	public boolean isMandatory() {
		return isMandatory;
	}

	public void setMandatory(boolean isMandatory) {
		this.isMandatory = isMandatory;
	}

	public String getValidation() {
		return validation;
	}

	public void setValidation(String validation) {
		this.validation = validation;
	}

	public String[] getValues() {
		return values;
	}

	public void setValues(String[] values) {
		this.values = values;
	}

	@Override
	public String toString() {
		return "Property [name=" + name + ", type=" + type + ", isUnique=" + isUnique + ", createIndex=" + createIndex + ", isMandatory=" + isMandatory + ", validation="
				+ validation + ", values=" + Arrays.toString(values) + "]";
	}

}
