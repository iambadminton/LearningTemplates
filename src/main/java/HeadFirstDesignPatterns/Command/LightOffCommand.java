package HeadFirstDesignPatterns.Command;

/**
 * Created by a.shipulin on 18.04.18.
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
