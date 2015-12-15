package com.example;

/**
 * @author Heiko Braun
 * @since 15/12/15
 */
class Greeting {
	private String message;

	Greeting() {
	}

	public Greeting(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
