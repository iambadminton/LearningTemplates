package HeadFirstJava.chap18;

/**
 * Created by a.shipulin on 25.12.17.
 */

import javax.swing.*;
import java.io.*;

public interface Service extends Serializable {
    public JPanel getGuiPanel();

}