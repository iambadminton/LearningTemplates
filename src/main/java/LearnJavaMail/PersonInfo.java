package LearnJavaMail;

/**
 * Created by a.shipulin on 06.09.18.
 */
public class PersonInfo {
    String FIO;
    String email;
    String id;

    public PersonInfo(String FIO, String email, String id) {
        this.FIO = FIO;
        this.email = email;
        this.id = id;
    }

    public String getFIO() {
        return FIO;
    }

    public String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }


}
