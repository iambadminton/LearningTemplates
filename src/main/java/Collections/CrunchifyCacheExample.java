package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Пример взят отсюда: https://crunchify.com/implement-simple-threadsafe-cache-using-hashmap-without-using-synchronized-collection/
НЕ РАБОТАЕТ должным образом!
 */

public class CrunchifyCacheExample<K, V> {
    private long timeToLive;
    private HashMap<K, V> cacheMap;

    protected class CrunchifyCacheObject {
        public long lastAccessed = System.currentTimeMillis();
        public String value;

        protected CrunchifyCacheObject(String value) {
            this.value = value;
        }
    }

    public CrunchifyCacheExample(long timeToLive, final long timeInterval, int max) {
        this.timeToLive = timeToLive * 2000;

        cacheMap = new HashMap<K, V>(max);
        if (timeToLive > 0 && timeInterval > 0) {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        try {
                            Thread.sleep(timeInterval * 1000);

                        } catch (InterruptedException e) {

                        }
                    }
                }
            });

            t.setDaemon(true);
            t.start();
        }
    }

    // PUT method
    public void put(K key, V value) {
        synchronized (cacheMap) {
            cacheMap.put(key, value);
        }
    }

    // GET method
    public V get(K key) {
        synchronized (cacheMap) {
            CrunchifyCacheObject c = (CrunchifyCacheObject) cacheMap.get(key);

            if (c == null)
                return null;
            else {
                c.lastAccessed = System.currentTimeMillis();
                return (V) c.value;
            }
        }
    }

    public void remove(String key) {
        synchronized (cacheMap) {
            cacheMap.remove(key);
        }
    }

    public int size() {
        synchronized (cacheMap) {
            return cacheMap.size();
        }
    }

    // CLEANUP method
    public void cleanup() {

        long now = System.currentTimeMillis();
        ArrayList<K> deleteKey = null;

        synchronized (cacheMap) {
            Iterator<?> itr = cacheMap.entrySet().iterator();

            deleteKey = new ArrayList<K>((cacheMap.size() / 2) + 1);
            CrunchifyCacheObject c = null;

            while (itr.hasNext()) {
                K key = (K) itr.next();
                c = (CrunchifyCacheObject) ((Map.Entry<?, ?>) itr).getValue();
                if (c != null && (now > (timeToLive + c.lastAccessed))) {
                    deleteKey.add(key);
                }
            }
        }

        for (K key : deleteKey) {
            synchronized (cacheMap) {
                cacheMap.remove(key);
            }

            Thread.yield();
        }
    }


    public static void main(String[] args) {
        CrunchifyCacheExample<String, String> cache =
                new CrunchifyCacheExample<>(20, 2, 20);
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 128; i++) {
                char ch = (char) i;
                String currentString = Character.toString(ch);
                cache.put(currentString, currentString + currentString);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("size = " + cache.size());
            }

        });

        Thread thread2 = new Thread(() -> {
            while(true) {
                try {
                    System.out.println("trying to clean up....");
                    cache.cleanup();

                } catch (Exception e) {
                    System.out.println("clenup() exception: " + e.getLocalizedMessage());
                }

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }

        });

        thread1.start();
        thread2.start();

    }


}
