package com.myspace.customer_greeting;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class GreetingResponse implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Greeting")
	private java.lang.String greeting;
	@org.kie.api.definition.type.Label(value = "Salutation")
	private java.lang.String salutation;

	public GreetingResponse() {
	}

	public java.lang.String getGreeting() {
		return this.greeting;
	}

	public void setGreeting(java.lang.String greeting) {
		this.greeting = greeting;
	}

	public java.lang.String getSalutation() {
		return this.salutation;
	}

	public void setSalutation(java.lang.String salutation) {
		this.salutation = salutation;
	}

	public GreetingResponse(java.lang.String greeting,
			java.lang.String salutation) {
		this.greeting = greeting;
		this.salutation = salutation;
	}

}