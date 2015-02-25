package org.kie.api.definition.aop;

import java.util.regex.Pattern;


public interface AOP {
	String getPattern();
	Pattern getCompiledPattern();
	String getImports();
	String getAfterRule();
	String getAfterWhen();
}
