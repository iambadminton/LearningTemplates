package javaThreads;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        /**
         * Пример с исправными банкоматами
         */
        System.out.println("Ситуация №1. Мы используем исправные банкоматы");
        CachePoint point1 = new CachePoint();
        point1.setId(1);
        point1.setCacheAmount(5);
        point1.setUserName("Вася");

        CachePoint point2 = new CachePoint();
        point2.setId(2);
        point2.setCacheAmount(5);
        point2.setUserName("Петя");

        CachePoint point3 = new CachePoint();
        point3.setId(3);
        point3.setCacheAmount(5);
        point3.setUserName("Джо");

        point1.start();
        point2.start();
        point3.start();

        System.out.print("point3.toString()=");
        System.out.println(point3.toString());

        //подождем 100 мс. пока все потоки сделают своё дело
        Thread.sleep(100);

        // установим значение счета обратно в 10
        /*MoneyAccount.getInstance().amount  = 10;
        System.out.println();

        / **
         * Пример с неисправными банкоматами
         * /

        System.out.println("Ситуация №2. Мы используем неисправные банкоматы");
        BrokenCachePoint bpoint1 = new BrokenCachePoint();
        bpoint1.setId(1);
        bpoint1.setCacheAmount(5);
        bpoint1.setUserName("ЗлойВася");

        BrokenCachePoint bpoint2 = new BrokenCachePoint();
        bpoint2.setId(2);
        bpoint2.setCacheAmount(5);
        bpoint2.setUserName("НедовольныйПетя");

        BrokenCachePoint bpoint3 = new BrokenCachePoint();
        bpoint3.setId(3);
        bpoint3.setCacheAmount(5);
        bpoint3.setUserName("ДжоВБешенстве");

        bpoint1.start();
        bpoint2.start();
        bpoint3.start();*/

    }

}

