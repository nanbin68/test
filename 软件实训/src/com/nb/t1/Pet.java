package com.nb.t1;

public class Pet {
	private String name;
	private int age;
	
	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Pet(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
    public void sound() {
    	System.out.println("宠物类的叫");
    }
    public void run() {
    	System.out.println("宠物类的跑");
    }
	@Override
	public String toString() {
		return "Pet [name=" + name + ", age=" + age + "]";
	}
	
	

}
