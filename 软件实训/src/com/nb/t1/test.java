package com.nb.t1;

import java.util.ArrayList;

public class test {
	public static void main(String[] args) {
		ArrayList<Pet> p=new ArrayList<Pet>();
		Cat c=new Cat("cat1",9);
		Dog d=new Dog("dog1",11);
		p.add(c);
		p.add(d);
		for(int i=0;i<p.size();i++) {
			System.out.println(p.get(i).toString());
			if(p.get(i) instanceof Dog) {
				((Dog) p.get(i)).swim();
			}
			else
				((Cat) p.get(i)).mouse();
			p.get(i).sound();
			p.get(i).run();		
		}
		}
			
		
	

}
