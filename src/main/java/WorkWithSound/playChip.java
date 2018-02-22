package WorkWithSound;

/**
 * Created by Sanya on 21.02.2018.
 */
public class playChip {
    /*public static void playClip(String audioFile) {
        try {
            AudioInputStream audioInputStream =
                    AudioSystem.getAudioInputStream(
                            this.getClass().getResourceAsStream(audioFile));
            DataLine.Info info =
                    new DataLine.Info(Clip.class, audioInputStream.getFormat());
            Clip clip = (Clip) AudioSystem.getLine(info);
            clip.addLineListener(new LineListener() {
                public void update(LineEvent e) {
                    if (e.getType() == LineEvent.Type.STOP) {
                        synchronized (clip) {
                            clip.notify();
                        }
                    }
                }
            });
            clip.open(audioInputStream);

            clip.setFramePosition(0);

            clip.start();
            synchronized (clip) {
                clip.wait();
            }
            clip.drain();
            clip.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }*/
}