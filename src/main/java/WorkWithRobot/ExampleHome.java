package WorkWithRobot;

/**
 * Created by a.shipulin on 21.02.18.
 *  по мотивам https://github.com/rubenlagus/TelegramBots/releases/
 *  и https://habrahabr.ru/sandbox/111328/
 *  для отсылки сообщение от бота используем вот такой http-запрос:
 *  https://api.telegram.org/bot487888252:AAHZyw0Nimz5njzY-7I7O78wuuaGjJDAojs/sendMessage?chat_id=203487491&text=%D0%BF%D1%80%D0%B8%D0%B2%D0%B5%D1%82
 */

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class ExampleHome extends TelegramLongPollingBot{
    public static void main(String[] args) {
        ApiContextInitializer.init(); // Инициализируем апи
        TelegramBotsApi botapi = new TelegramBotsApi();


        try {
            botapi.registerBot(new ExampleHome());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }


    // ==>

    // <==


    public void mySend() {
        // -->
        /*SendMessage s = new SendMessage();
        s.setText("test!!!");
        try { //Чтобы не крашнулась программа при вылете Exception
            sendMessage(s);
        } catch (TelegramApiException e){
            e.printStackTrace();
        }*/
        SendMessage s = new SendMessage();

        //s.setChatId(msg.getChatId()); // Боту может писать не один человек, и поэтому чтобы отправить сообщение, грубо говоря нужно узнать куда его отправлять
        s.setText("test");
        // <--
    }


    @Override
    public String getBotUsername() {
        return "ANNUNCIATORBOT";
        //возвращаем юзера
    }

    @Override
    public void onUpdateReceived(Update e) {
        // Тут будет то, что выполняется при получении сообщения
        Message msg = e.getMessage(); // Это нам понадобится
        String txt = msg.getText();
        if (txt.equals("/start")) {
            sendMsg(msg, "This is my test bot FROM my HOME!");
        }
        if (txt.equals("/privet")) {
            sendMsg(msg, "Привет-привет!");
        }
    }

    @Override
    public String getBotToken() {
        //return "308143153:AAHd-ZTAqnzwExr9tYzEfxRMN0QzAVJlJCQ"; // ckbraninout bot
        return "487888252:AAHZyw0Nimz5njzY-7I7O78wuuaGjJDAojs"; // annunciator bot
        //Токен бота
    }

    @SuppressWarnings("deprecation") // Означает то, что в новых версиях метод уберут или заменят
    private void sendMsg(Message msg, String text) {
        SendMessage s = new SendMessage();
        System.out.println("msg.getChatId() =" + msg.getChatId());
        s.setChatId(msg.getChatId()); // Боту может писать не один человек, и поэтому чтобы отправить сообщение, грубо говоря нужно узнать куда его отправлять
        s.setText(text);
        try { //Чтобы не крашнулась программа при вылете Exception
            sendMessage(s);
        } catch (TelegramApiException e){
            e.printStackTrace();
        }
    }



}
