package practice.springcourse;

import java.util.ArrayList;
import java.util.List;

/*
1. Реализуем класс MusicPlayer, который будет зависеть от нашей музыки. В этом классе мы применим IoC.
2. IoC, из-за того что мы сзодали конструктор мы должны вручную создать и пустой конструктор
3. для сеттеров camelCase используется, сеттер Spring читает название этого метода setMusic и он убирает слово set оставляя только Music,
дальше он переводит в маленькую букву music и таким образом когда мы указываем зависимость music он ищет сеттер setMusic
 */
public class MusicPlayer {
    private Music music;

    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
