package WorkWithRobot;

/**
 * Created by a.shipulin on 21.02.18.
 */

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class Example extends TelegramLongPollingBot{
    public static void main(String[] args) {
        ApiContextInitializer.init(); // Инициализируем апи
        TelegramBotsApi botapi = new TelegramBotsApi();


        try {
            botapi.registerBot(new Example());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }


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
        return "CKBRANINOUT";
        //возвращаем юзера
    }

    @Override
    public void onUpdateReceived(Update e) {
        // Тут будет то, что выполняется при получении сообщения
        Message msg = e.getMessage(); // Это нам понадобится
        String txt = msg.getText();
        if (txt.equals("/start")) {
            sendMsg(msg, "This is my test bot!");
        }
    }

    @Override
    public String getBotToken() {
        return "308143153:AAHd-ZTAqnzwExr9tYzEfxRMN0QzAVJlJCQ";
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
