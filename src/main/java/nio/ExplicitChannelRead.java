package nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExplicitChannelRead {
    public static void main(String[] args) {
        int count;
        Path filepath = null;

        //сначала получить путь к файлу
        try {
            filepath = Paths.get("d:/nio_test/test.txt");

        } catch (InvalidPathException e) {
            System.out.println("Path Error: " + e);
            return;
        }

        //затем получаем канал к этому файлу в блоке try с ресурсами
        try (SeekableByteChannel fChan = Files.newByteChannel(filepath)) {
            //выделяем память под буфер
            ByteBuffer mBuf = ByteBuffer.allocate(128);
            do {
                // читаем данные из файла в буфер
                count = fChan.read(mBuf);

                if (count != -1) {
                    // подготавливаем буфер к чтению из него данных
                    mBuf.rewind();
                    // читаем байты данных из буфера и выводим их на экран как символы
                    for (int i = 0; i < count; i++) {
                        System.out.print((char) mBuf.get());

                    }
                }

            } while (count != -1);
            System.out.println();

        } catch (IOException e) {
            System.out.println("Ощибка ввода-вывода: " + e);
        }
    }
}
