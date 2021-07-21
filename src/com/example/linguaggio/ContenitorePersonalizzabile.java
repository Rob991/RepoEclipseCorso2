package com.example.linguaggio;

public class ContenitorePersonalizzabile<T> {

	private T object;

	public ContenitorePersonalizzabile(T object) {
		super();
		this.object = object;
	}

	public T getPayload() {
		return object;
	}

}
