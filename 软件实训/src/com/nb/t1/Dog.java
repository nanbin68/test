package com.nb.t1;

public class Dog extends Pet{

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	public void sound() {
    	System.out.println("����Ľ�");
    }
    public void run() {
    	System.out.println("�������");
    }
    public void swim() {
    	System.out.println("�������Ӿ");
    }
    public String toString() {
		return "Dog [name=" + this.getName() + ", age=" + this.getAge() + "]";
	}
}
