package Skiena.Chapter4;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by a.shipulin on 15.02.18.
 */
public class TestSplitHashMap {
    public static void main(String... ignored) {
        StringBuilder sb = new StringBuilder();
        // start with as much free memory as possible.
        System.gc();

        long start = memoryUsed();
        Map<String, long[]> frequencyMap = new HashMap<>();
        int keys = 50 * 1000;
        for (int i = 0; i < keys; i++) {
            sb.setLength(0);
            sb.append("word-").append(i);
            String key = sb.toString();
            long[] count = {i};
            frequencyMap.put(key, count);
        }
        long used = memoryUsed() - start;
        System.out.printf("To create a map with " + frequencyMap.size() + " key/values used %,d KB%n", used / 1024);
    }

    public static long memoryUsed() {
        return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }
}
