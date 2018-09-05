package javaThreads;

/**
 * Created by a.shipulin on 31.08.18.
 */
/**
 * А это сломаный банкомат. Он может отдавать деньги пользователям, даже если на их счету ноль.
 * В этом банкомате не используется синхронизация, что приведет к полной порче и потере данных.
 */
public final class BrokenCachePoint extends Thread {

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
        //сохраняем текущее значение счета
        final int previousAccountValue = MoneyAccount.getInstance().getAccount();

        //дадим потокам время запустится. Можно убрать этот кусок, но тогда будет сложнее воспроизвести
        // ситуацию с рассинхронизацией доступа к данным.
        try {
            sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //если на счете денег меньше, чем запрашивают, говорим что денег мало и не даем ничего
        //
        // Замечание: Эту проверку все 3 потока уже прошли успешно, так как их доступ к этому месту
        // не синхронизирован
        if (previousAccountValue < cacheAmount) {
            System.out.println(userName + " не смог снять деньги. Недостаточно средств");
            return;
        }
        //списываем указанную сумму
        //
        //Замечание: А в этом месте все 3 пототка с чистой совестью отнимают от существующего счета
        //требуемую сумму
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

        //А тут у нас отрицательный баланс :(
        System.out.println(message);
    }
}
