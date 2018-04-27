package HeadFirstDesignPatterns.Command;

/**
 * Created by a.shipulin on 18.04.18.
 */
public class CeilingFanOnCommand  implements Command {

    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.high();
    }
}
