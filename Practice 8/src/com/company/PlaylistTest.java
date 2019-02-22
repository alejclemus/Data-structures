package com.company;
import org.junit.Assert;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PlaylistTest {
    private Playlist test=new Playlist();

    @org.junit.Test
    public void addSong() {
        test.addSong("Te vi","Piso 21,Micro Tdh");
        Assert.assertEquals("Te vi",test.head.song.name);
    }

    @org.junit.Test
    public void playNow() {
        test.addSong("Baila Baila Baila","Ozuna");
        test.addSong("Te confieso","Camila");
        test.playNow(test.head);
        Assert.assertEquals("Baila Baila Baila",test.head.song.name);
    }

    @org.junit.Test
    public void playNext() {
        test.addSong("No te enamores","Paloma Mami");
        test.addSong("Un año","Sebastian Yatra,Reik");
        test.addSong("Solamente tu","Pablo Alborán");
        test.playNext(test.head);
        Assert.assertEquals("Un año",test.head.song.name);
    }

    @org.junit.Test
    public void playPrevious() {
        test.addSong("Te quiero tanto,tanto","Onda Vaselina");
        test.addSong("Creo en ti","Reik");
        test.addSong("Ahora te puedes marchar","Luis Miguel");
        test.playNext(test.head);
        test.playPrevious(test.head);
        Assert.assertEquals("Te quiero tanto,tanto",test.head.song.name);
    }

    @org.junit.Test
    public void printPlaylist() {
        test.addSong("Con Calma","Daddy Yankee");
        test.addSong("Adan y Eva","Paulo Londra");
        test.addSong("Replay","Maikel Delacalle");
        test.addSong("PPP","Kevin Roldan");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        test.printPlaylist(test.head);
        String expected="Playlist: \nCon Calma -Daddy Yankee\nAdan y Eva -Paulo Londra\nReplay -Maikel Delacalle\nPPP -Kevin Roldan\n";
        Assert.assertEquals(expected,outContent.toString());
    }
}