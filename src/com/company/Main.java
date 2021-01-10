package com.company;

public class Main {

    public static void main(String[] args) {
        String myName = "hello";
	    System.out.println(myName);

	    Person person1 = new Person("ola", 20);
	    person1.info(); //calling info method from Person class
	    String pName = person1.name;
        System.out.println("Persons name is " + pName);
        method(); //calling method within Main
    }

    public static void method (){
        System.out.println("inside method");
    }
}
