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
    	System.out.println("è��Ľ�");
    }
    public void run() {
    	System.out.println("è�����");
    }
    public void mouse() {
    	System.out.println("è���ץ����");
    }
    public String toString() {
		return "Cat [name=" + this.getName() + ", age=" + this.getAge() + "]";
	}
}
