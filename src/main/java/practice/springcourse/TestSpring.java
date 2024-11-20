package practice.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

// Внедряем с помощью сеттеров, обычное простое значение (полей). И мы получаем значения с помощью Геттеров.
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic();

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
