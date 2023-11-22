package com.app.demo;

public final class MyImmutableClass {
	private final int id;

	private final String name;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public MyImmutableClass() {
		this.name = "Kalpesh";
		this.id = 76543;
	}

	public MyImmutableClass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public MyImmutableClass getMyImmutableObject() {
		
		return null;	
	}
}
