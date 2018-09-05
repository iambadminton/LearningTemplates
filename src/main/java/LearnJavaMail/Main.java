package LearnJavaMail;

import jdk.internal.org.xml.sax.SAXException;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.TransformerException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by a.shipulin on 05.09.18.
 */
public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException,
            XMLStreamException, TransformerException, MessagingException {
        final Properties properties = new Properties();
        //FileInputStream in = new FileInputStream("mail.properties");
        //properties.load(EmailLesson.class.getClassLoader().getResourceAsStream("mail.properties"));
        properties.load(new FileInputStream("C:\\SpringProjects\\LearningTemplates\\src\\main\\java\\LearnJavaMail\\mail.properties"));
        //properties.load(new FileInputStream(new File("c:/mail.properties")));
        //properties.load(new FileInputStream("C:\\mail.properties"));
        Session mailSession = Session.getDefaultInstance(properties);

        System.out.println(mailSession.getProperties());
        MimeMessage message = new MimeMessage(mailSession);
        message.setFrom(new InternetAddress("shsanya@yandex.ru"));
        message.addRecipient(Message.RecipientType.TO, new InternetAddress("shsanya@inbox.ru"));
        message.setSubject("hello");
        message.setText("Hi, this is my test message from java");
        Transport tr = mailSession.getTransport();
        System.out.println(tr.getURLName());
        tr.connect("shsanya", "piramida");
        tr.sendMessage(message, message.getAllRecipients());
        tr.close();

    }
}
