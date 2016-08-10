/**
 * Copyright © Altimetrik 2016. All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Altimetrik. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms and conditions
 * entered into with Altimetrik.
 */

package com.platform.bom.domain;

import javax.validation.constraints.NotNull;

import org.springframework.data.neo4j.annotation.EndNode;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.RelationshipEntity;
import org.springframework.data.neo4j.annotation.StartNode;

/**
 * Class to store the relationship between entity definitions.
 * @author Gayatri Naidu
 *
 */
@RelationshipEntity(type = "HAS_RELATION")
public class EntityRelation implements Model {

	private static final long serialVersionUID = 7841730675397189710L;

	@GraphId
	private Long id;

	@NotNull
	private String name;

	private Multiplicity multiplicity;

	private boolean cascadeDelete;

	@StartNode
	private EntityDefinition startEntityDef;

	@EndNode
	private EntityDefinition endEntityDef;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public EntityDefinition getStartEntityDef() {
		return startEntityDef;
	}
	public void setStartEntityDef(EntityDefinition startEntityDef) {
		this.startEntityDef = startEntityDef;
	}
	public EntityDefinition getEndEntityDef() {
		return endEntityDef;
	}
	public void setEndEntityDef(EntityDefinition endEntityDef) {
		this.endEntityDef = endEntityDef;
	}
	public Multiplicity getMultiplicity() {
		return multiplicity;
	}
	public void setMultiplicity(Multiplicity multiplicity) {
		this.multiplicity = multiplicity;
	}
	public boolean isCascadeDelete() {
		return cascadeDelete;
	}
	public void setCascadeDelete(boolean cascadeDelete) {
		this.cascadeDelete = cascadeDelete;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
}
