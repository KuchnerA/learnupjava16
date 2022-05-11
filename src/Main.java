public class Main {

    public static void main(String[] args) {

        ScheduleBuilder builder = new ScheduleBuilder();
        builder.dayOffs(2);
        builder.wordDays(2);
        builder.setSize(8);

        System.out.println("-".repeat(20));
        Schedule schedule = builder.build();
        schedule.print();
        System.out.println("-".repeat(20));
    }

}
