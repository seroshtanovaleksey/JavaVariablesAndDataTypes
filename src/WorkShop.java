import java.util.Arrays;

public class WorkShop {
    public static void main(String[] args) {
        Friend[] friends = {
                new Friend("Вася",Integer.parseInt("18"),true,4),
                new Friend("Катя",Integer.parseInt("19"),false,(float) 5.35),
                new Friend("Дима", Integer.parseInt("20"),true,8),
                new Friend("Никита", Integer.parseInt("18"),true,5),
                new Friend("Оля", Integer.parseInt("18"),true,(float) 6.8)
        };

        System.out.println("My friends: " + Arrays.toString(friends));
    }
}

class Friend {
    private String name;
    private int age;

    private boolean isFriendFromSchool;
    private float hoursSpentTogetherLastWeek;

    public Friend(String name, int age, boolean isFriendFromSchool, float hoursSpentTogetherLastWeek) {
        this.name = name;
        this.age = age;
        this.isFriendFromSchool = isFriendFromSchool;
        this.hoursSpentTogetherLastWeek = hoursSpentTogetherLastWeek;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isFriendFromSchool=" + isFriendFromSchool +
                ", hoursSpentTogetherLastWeek=" + hoursSpentTogetherLastWeek +
                '}';
    }
}