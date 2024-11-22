package practice.springcourse;

// так как реализуем интерфейс Music, мы обязаны реализовать метод getSong()
public class ClassicalMusic implements Music {
    public void doMyInit() {
        System.out.println("Initializing ClassicalMusic bean (Singleton)");
    }

    public void doMyDestroy() {
        System.out.println("Destroying ClassicalMusic bean (Singleton)");
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
