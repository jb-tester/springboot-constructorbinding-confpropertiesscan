package com.mytests.spring.constructorBindingConfPropertiesScan.confProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "my.props12")
public class ConfigPropsWithInheritedPojoProps {
	private String property1;
	private Nested property2;

	public String getProperty1() {
		return property1;
	}

	public void setProperty1(String property1) {
		this.property1 = property1;
	}

	public Nested getProperty2() {
		return property2;
	}

	public void setProperty2(Nested property2) {
		this.property2 = property2;
	}

	public static class Nested extends NestedParent {
		private String nestedProp;

		public String getNestedProp() {
			return nestedProp;
		}

		public void setNestedProp(String nestedProp) {
			this.nestedProp = nestedProp;
		}
	}
	
	public static abstract class NestedParent {
		private String inheritedProp;

		public String getInheritedProp() {
			return inheritedProp;
		}

		public void setInheritedProp(String inheritedProp) {
			this.inheritedProp = inheritedProp;
		}
	}
}