package LearnJavaMail;

//import jdk.internal.org.xml.sax.SAXException;
import org.xml.sax.SAXException;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.TransformerException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

/**
 * Created by a.shipulin on 05.09.18.
 */
public class MailSender {
    String path;
    String propertieFile;
    String addressBook;
    String title;
    private ArrayList<PersonInfo> list;

    public MailSender(String path, String propertieFile, String addressBook, String title) {
        this.path = path;
        this.propertieFile = propertieFile;
        this.addressBook = addressBook;
        this.title = title;
    }

    public void sendAll() throws IOException, MessagingException {
        final Properties properties = new Properties();

        //properties.load(EmailLesson.class.getClassLoader().getResourceAsStream("mail.properties"));
        properties.load(new FileInputStream(this.propertieFile));
        Session mailSession = Session.getDefaultInstance(properties);

        MimeMessage message = new MimeMessage(mailSession);

        message.setFrom(new InternetAddress("shsanya@yandex.ru"));
        message.addRecipient(Message.RecipientType.TO, new InternetAddress("shsanya@inbox.ru"));
        message.setSubject("hello");
        //File html = new File("C:\\SpringProjects\\LearningTemplates\\src\\main\\java\\LearnJavaMail\\1.html");
        //message.setText("Hi, this is my test message from java");

        message.setContent("<html> <title>first html mail</title><body><font color=\"aqua\">This is first html mail</font> </body> </html>", "text/html; charset=utf-8");
        Transport tr = mailSession.getTransport();
        System.out.println(tr.getURLName());
        tr.connect("shsanya", properties.getProperty("mail.smtps.password"));
        tr.sendMessage(message, message.getAllRecipients());
        tr.close();
    }

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException,
            XMLStreamException, TransformerException, MessagingException {
        final Properties properties = new Properties();

        //properties.load(EmailLesson.class.getClassLoader().getResourceAsStream("mail.properties"));
        properties.load(new FileInputStream("C:\\SpringProjects\\LearningTemplates\\src\\main\\java\\LearnJavaMail\\mail.properties"));

        Session mailSession = Session.getDefaultInstance(properties);

        System.out.println(mailSession.getProperties());
        MimeMessage message = new MimeMessage(mailSession);

        message.setFrom(new InternetAddress("shsanya@yandex.ru"));
        message.addRecipient(Message.RecipientType.TO, new InternetAddress("shsanya@inbox.ru"));
        message.setSubject("hello");
        File html = new File("C:\\SpringProjects\\LearningTemplates\\src\\main\\java\\LearnJavaMail\\1.html");
        //message.setText("Hi, this is my test message from java");

        message.setContent("<html> <title>first html mail</title><body><font color=\"aqua\">This is first html mail</font> </body> </html>", "text/html; charset=utf-8");
        Transport tr = mailSession.getTransport();
        System.out.println(tr.getURLName());
        tr.connect("shsanya", properties.getProperty("mail.smtps.password"));
        tr.sendMessage(message, message.getAllRecipients());
        tr.close();

    }
}
