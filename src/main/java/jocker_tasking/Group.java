package jocker_tasking;

import sobes.Measurable;

public enum Group implements Measurable {

    Few(1, 4),
    Several(5, 19),
    Pack(10, 19),
    Lots(20, 49),
    Swarm(50, Integer.MAX_VALUE);

    private int min, max;

    Group(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public static Group of(int count) {
        for (Group group : Group.values()) {
            if (count >= group.min && count <= group.max) {
                return group;
            }

        }
        throw new IllegalArgumentException();
    }

    public static void main(String[] args) {
        System.out.println(Group.of(15));

        Group group = Group.valueOf("Lots");
        System.out.println(group);
        System.out.println(group.ordinal());
        System.out.println(group.compareTo(Group.Few));
        System.out.println(group.measure(20));

    }


    @Override
    public String measure(int value) {
        return Group.of(value).toString();
    }
}
