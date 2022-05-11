public class Schedule {

    private Boolean[] schedule = null;

    public Schedule(Boolean[] schedule) {
        this.schedule = schedule;
    }

    public void print() {
        for (boolean day : schedule) {
            System.out.println(day);
        }
    }
}

