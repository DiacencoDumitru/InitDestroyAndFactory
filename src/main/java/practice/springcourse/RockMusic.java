package practice.springcourse;

public class RockMusic implements Music {
    public void doMyInitPrototype() {
        System.out.println("Initializing RockMusic bean (Prototype)");
    }

    public void doMyDestroyPrototype() {
        System.out.println("Destroying RockMusic bean (Prototype)");
    }

    @Override
    public String getSong() {
        return "Wing cries Mary";
    }
}
