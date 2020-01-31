package HelloWorld;
public class Cat extends animal{

    public String animalsound(){
        return"This animal roars";
        }
        public String doPurr() {
        return "purrr";
        }

    @Override
    public String catSound() {
        return "This Cat says hello purr";
        //return super.catSound();
    }
}