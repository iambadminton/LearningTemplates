package LearnJavaMail;

/**
 * Created by a.shipulin on 06.09.18.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*from www.java2s.com*/
public class BufferedReaderExample {
    String fileName;

    private String content;

    public BufferedReaderExample(String fileName) {
        this.fileName = fileName;
    }

    public String getContent() {
        return content;
    }

    public boolean loadContent(String path, String charsetName) {
        Path wiki_path = Paths.get(path, this.fileName);
        Charset charset = Charset.forName(charsetName);
        try (BufferedReader reader = Files.newBufferedReader(wiki_path, charset)) {
            String line = null;
            StringBuilder str = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                str.append(line);
            }
            //System.out.println(str.toString());
            this.content = str.toString();
            return true;
        } catch (IOException e) {
            System.err.println(e);
            return false;
        }
    }


    public static void main(String[] args) {

        Path wiki_path = Paths.get("C:/htmlfolder", "000000000000.html");

        Charset charset = Charset.forName("UTF-8");
        try (BufferedReader reader = Files.newBufferedReader(wiki_path, charset)) {
            String line = null;
            long i = 0;
            StringBuilder str = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                /*System.out.println(line);*/
                str.append(line);
                i++;
            }
            System.out.println(str.toString());
            System.out.println("i=" + i);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
