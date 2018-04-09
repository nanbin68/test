package com.nb.t1;

public class Cat extends Pet{

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	public void sound() {
    	System.out.println("猫类的叫");
    }
    public void run() {
    	System.out.println("猫类的跑");
    }
    public void mouse() {
    	System.out.println("猫类的抓老鼠");
    }
    public String toString() {
		return "Cat [name=" + this.getName() + ", age=" + this.getAge() + "]";
	}
}
