package org.kie.internal.builder;

import java.util.List;

import org.kie.api.io.Resource;

public interface AOPKnowledgeBuilder {
	void readAOPResources(List<Resource> resources);

	List<Resource> applyAOPToResource(List<Resource> resources);
}
