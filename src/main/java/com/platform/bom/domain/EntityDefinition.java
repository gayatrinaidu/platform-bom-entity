/**
 * Copyright (C) Altimetrik 2016. All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Altimetrik. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms and conditions
 * entered into with Altimetrik.
 */

package com.platform.bom.domain;

import java.util.Set;

import javax.validation.constraints.NotNull;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.RelatedTo;

/**
 * Class that describes an entity definition.
 * @author Gayatri Naidu
 *
 */
@NodeEntity
public class EntityDefinition implements Model {

	private static final long serialVersionUID = -8090741868229864507L;

	@GraphId
	private Long id;
	private boolean isAbstract;
	@NotNull
	private String name;
	private String version;
	private boolean processed;
	@RelatedTo(type = "EXTENDS_FROM")
	private Set<EntityDefinition> extendsFrom;
	@RelatedTo(type = "HAS_METADATA")
	private Set<Property> metaAttributes;
	@RelatedTo(type = "HAS_ATTRIBUTE")
	private Set<Property> attributes;
	@RelatedTo(type = "HAS_RELATION")
	private Set<EntityRelation> relations;
	private ProcessingStatus processingStatus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isAbstract() {
		return isAbstract;
	}

	public void setAbstract(boolean isAbstract) {
		this.isAbstract = isAbstract;
	}

	public Set<Property> getMetaAttributes() {
		return metaAttributes;
	}

	public void setMetaAttributes(Set<Property> metaAttributes) {
		this.metaAttributes = metaAttributes;
	}

	public Set<Property> getAttributes() {
		return attributes;
	}

	public void setAttributes(Set<Property> attributes) {
		this.attributes = attributes;
	}

	public Set<EntityRelation> getRelations() {
		return relations;
	}

	public void setRelations(Set<EntityRelation> relations) {
		this.relations = relations;
	}

	public Set<EntityDefinition> getExtendsFrom() {
		return extendsFrom;
	}

	public void setExtendsFrom(Set<EntityDefinition> extendsFrom) {
		this.extendsFrom = extendsFrom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public boolean isProcessed() {
		return processed;
	}

	public void setProcessed(boolean processed) {
		this.processed = processed;
	}

	public ProcessingStatus getProcessingStatus() {
		return processingStatus;
	}

	public void setProcessingStatus(ProcessingStatus processingStatus) {
		this.processingStatus = processingStatus;
	}

}
