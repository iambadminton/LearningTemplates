package multithreading.mytests;

import org.apache.poi.hssf.record.TableRecord;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Main1 {
    public static void main(String[] args) {
        CountryCodes countryCodes = new CountryCodes();
        countryCodes.addNewCountry("Ukraine", "UA");
        countryCodes.addNewCountry("Poland", "PL");
        countryCodes.addNewCountry("Finland", "FI");
        countryCodes.addNewCountry("Turkey", "TR");

        class MyThread extends Thread {
            @Override
            public void run() {
                countryCodes.removeCountry("Ukraine");
                countryCodes.removeCountry("Belarussia");
                countryCodes.removeCountry("Russia");
                countryCodes.removeCountry("Poland");
                countryCodes.countries.forEach((k,v) -> System.out.println( this.getName() + ": " + k + " => " + v));

            }
        }

        MyThread myThread = new MyThread();
        myThread.setName("thread 1");
        myThread.start();

        new MyThread().start();

    }

    static class CountryCodes {
        ConcurrentHashMap countries = new ConcurrentHashMap<String, String>();
        public void addNewCountry(String country, String code) {
            countries.put(country, code);
        }

        public void removeCountry(String country) {
            countries.remove(country);
        }


    }



}
