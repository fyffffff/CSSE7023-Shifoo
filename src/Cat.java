public class Cat extends Animal{

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String communicate() {
        return "Meow";
    }
}
