package justmiscellanious;

import java.util.Arrays;

public class ObjectCreator {
    public static void main(String[] args) {
        Class<?> cl = null;
        try {
            cl = Class.forName(args[0]);

        }
        catch (ClassNotFoundException e) {
            System.out.println("Error! Class not found!");
        }

        try {
            String[] instanceArgs = Arrays.copyOfRange(args, 1, args.length - 1);

            cl.getClass().getConstructor(String.class).newInstance(instanceArgs);
            System.out.println(cl.getClass().getName());
        }
        catch (Exception e) {
            e.printStackTrace();
        }


    }
}
