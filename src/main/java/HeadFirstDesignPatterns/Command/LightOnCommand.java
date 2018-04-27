package HeadFirstDesignPatterns.Command;

/**
 * Created by a.shipulin on 18.04.18.
 */
public class LightOnCommand  implements  Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void lightOff() {
        light.off();
    }

    @Override
    public void execute() {
        light.on();
    }
}
