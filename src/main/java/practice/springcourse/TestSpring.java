package practice.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
Инициализация singleton-бина в Spring происходит перед prototype-бинами, потому что Spring создаёт singleton-бины при запуске контекста,
а prototype-бины — только по запросу, то есть при вызове context.getBean().
*/
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        System.out.println("\n=== Prototype Scope: RockMusic ===");
        RockMusic rockMusic1 = context.getBean("musicBean2", RockMusic.class);
        RockMusic rockMusic2 = context.getBean("musicBean2", RockMusic.class);
        RockMusic rockMusic3 = context.getBean("musicBean2", RockMusic.class);

        System.out.println(rockMusic1.getSong());
        System.out.println(rockMusic2.getSong());
        System.out.println(rockMusic3.getSong());

        System.out.println("\n=== Singleton Scope: ClassicalMusic ===");
        ClassicalMusic classicalMusic1 = context.getBean("musicBean", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("musicBean", ClassicalMusic.class);
        ClassicalMusic classicalMusic3 = context.getBean("musicBean", ClassicalMusic.class);

        System.out.println(classicalMusic1.getSong());
        System.out.println(classicalMusic2.getSong());
        System.out.println(classicalMusic3.getSong());

        System.out.println("\nClosing context...");
        context.close();
    }
}