/**
 * Copyright © Altimetrik 2016. All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Altimetrik. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms and conditions
 * entered into with Altimetrik.
 */

package com.platform.bom.domain;
import org.springframework.data.neo4j.annotation.NodeEntity;

/**
 * This class represents a property associated with an entity definition.
 * @author Gayatri Naidu
 *
 */
@NodeEntity
public class Property {
	private Long id;

	private String name;

	private String type;

	private boolean isUnique;

	private boolean createIndex;

	private boolean isMandatory;

	private String validation; // validation for the value of this property

	private String[] values; // possible values allowed for this property

	public Property(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	public Property() {
		super();
	}
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
}
