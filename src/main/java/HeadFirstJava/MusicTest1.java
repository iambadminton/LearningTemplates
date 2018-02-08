package HeadFirstJava;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

/**
 * Created by a.shipulin on 21.11.17.
 */
public class MusicTest1 {
    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Мы получили синтезатор");
        } catch (MidiUnavailableException e) {
            System.out.println("неудача");
        }
    }

    public static void main(String[] args) {
        try {
            MusicTest1 mt = new MusicTest1();
            mt.play();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
