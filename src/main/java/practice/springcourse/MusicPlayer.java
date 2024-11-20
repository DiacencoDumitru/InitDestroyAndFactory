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

    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    // IoC
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer() {
    }

    // через setter
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        for (Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }
}
