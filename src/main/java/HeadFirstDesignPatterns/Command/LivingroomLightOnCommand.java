package HeadFirstDesignPatterns.Command;

/**
 * Created by a.shipulin on 18.04.18.
 */
public class LivingroomLightOnCommand implements Command {
    Light light;

    public LivingroomLightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
