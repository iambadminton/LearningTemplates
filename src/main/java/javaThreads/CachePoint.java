package javaThreads;

/**
 * Created by a.shipulin on 31.08.18.
 */
/**
 * =======================================================
 * Ниже объявим класс, ктороый будет выполнять функции банкомата
 * =======================================================
 */

/**
 * Это собственно банкомат. Его функциональность заключается в том, что
 * он должен будет списывать деньги со счета и выдывать их пользователю
 *
 * Замечание: Банкомат у нашем случае реализаует интерфейс Runnable, что позволит нам
 * вынести его работу в отдельный поток
 */
public final class CachePoint extends Thread {

    /**
     * Ссылка на наш счет. Мы будем использовать ее для синхронного предоставления дотсупа к счету
     */
    private static final MoneyAccount moneyAccount = MoneyAccount.getInstance();

    /**
     * Номер банкомата
     */
    private Integer id;

    /**
     * Имя владельца банковской карты
     */
    private String userName;

    /**
     * Кол-во денег которое мы хотим снять
     */
    private Integer cacheAmount;

    /**
     * Устанавливает кол-во денег для снятия
     *
     * @param cacheAmount Кол-во денег
     */
    public void setCacheAmount(final Integer cacheAmount) {
        this.cacheAmount = cacheAmount;
    }

    /**
     * Устанавливает имя владельца карты
     *
     * @param name Имя
     */
    public void setUserName(final String name) {
        this.userName = name;
    }

    /**
     * Устанавливает номер банкомата
     *
     * @param id Номер
     */
    public void setId(final Integer id) {
        this.id = id;
    }


    /**
     * {inherited_doc}
     */
    @Override
    public void run() {
        synchronized (moneyAccount) {
            //сохраняем текущее значение счета
            final int previousAccountValue = MoneyAccount.getInstance().getAccount();

            //если на счете денег меньше, чем запрашивают, говорим что денег мало и не даем ничего
            if (previousAccountValue < cacheAmount) {
                System.out.println(userName + " не смог снять деньги. Недостаточно средств");
                return;
            }
            //списываем указанную сумму
            MoneyAccount.getInstance().cache(cacheAmount);


            //формируем сообщение об успешной транзакции
            final StringBuilder message = new StringBuilder();
            message.append("Произведено снятие средств пользоваталем ");
            message.append(userName);
            message.append(" с банкомата ");
            message.append(id);
            message.append(" на сумму ");
            message.append(cacheAmount);
            message.append(". Остаток на счете до снятия:  ");
            message.append(previousAccountValue);
            message.append(", после снятия: ");
            message.append(MoneyAccount.getInstance().getAccount());

            //спасаем мир от всесущего зла ^^
            System.out.println(message);
        }
    }
}
