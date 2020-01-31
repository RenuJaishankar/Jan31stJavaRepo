package HelloWorld;


public class HelloWorld {

    public static void main(String[] args) {
        MyClass myclass = new MyClass();
        Car Volvo =new Car();
        Cat Gar = new Cat();
        Object garfield = new Cat(); //polymorphism
        String myString = new String();
        Dog Rover = new Dog();
        Fruit NewFruit = new Fruit();
//making a new Eagle object
        Eagle newEagle = new Eagle();
        //setting newEagle's plumage value is False
        newEagle.setPlumage(true);
        System.out.println(newEagle.isPlumage());

        int num=5;
         int z= myclass.addNum(5,3);
         System.out.println(z);
        int x = 5;
        String otherNum = "Five";
        String  str= "600";
        //String myString = "Hello";
        System.out.println(myString);
//       System.out.println(garfield.doPurr());// doesnt display because it is the object class which is a super
        System.out.println(Rover.bark());
        System.out.println(NewFruit.FruitName());
        System.out.println(Volvo.doDrive());
        System.out.println(Gar.catSound());

    }
}
