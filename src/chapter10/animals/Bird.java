package chapter10.animals;

public class Bird extends Animal{
    
    public Bird() {
    }
    
    public Bird(String name) {
        super(name);
    }
    
    @Override
    public void move() {
        System.out.println("Fly");
    }
    
    @Override
    public void makeNoise() {
        System.out.println("Chirp");
    }
}
