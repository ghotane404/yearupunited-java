package com.pluralsight;

public class Hello {
    public static void main(String[] args) {
//    Create these methods:
//            a. main()
//            b. sayHello() that prints "Hello, World!"
//            c. sayGoodbye() that prints "Goodbye!"
//            d. sayGoodMorning() that prints "Good morning!"
//    e. Call each method from main()
        sayHello();
        sayGoodbye();
        sayGoodMorning();

    }
    static  void sayHello(){
        System.out.println("Hello, World!");
    }
    static  void sayGoodbye(){
        System.out.println("Goodbye!");
    }
    static  void sayGoodMorning(){
        System.out.println("Good morning!");
    }
}
