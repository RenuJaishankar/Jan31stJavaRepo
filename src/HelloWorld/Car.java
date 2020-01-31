package HelloWorld;

public class Car extends Vehicle{


     //unique to car
    public String honkMorn(){
        return "Horn honked.";
    }

   //same method from my vehicle class
    //overriding let me make this method do whatever I want
    @Override
    public String doDrive(){
       // return super.doDrive();
       return "I don't want to drive";
    }
}
