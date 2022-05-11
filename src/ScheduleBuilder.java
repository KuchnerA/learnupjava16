import java.util.ArrayList;
import java.util.List;

public class ScheduleBuilder {

    public ScheduleBuilder() {
    }

    List<Boolean> schedule = new ArrayList<>();

    public void dayOff() {
        schedule.add(false);
    }

    public void dayOffs(int count) {
        for (int i = 0; i < count; i++) {
            schedule.add(false);
        }
    }

    public void wordDay() {
        schedule.add(true);
    }

    public void wordDays(int count) {
        for (int i = 0; i < count; i++) {
            schedule.add(true);
        }
    }

    public void setSize(int size) {
        if (schedule.size() < size) {
            for (int i = 0; i < size - schedule.size() + i; i++) {
                schedule.add(false);
            }
        } else if (schedule.size() > size) {
            for (int i = 0; i < schedule.size() - size + i; i++) {
                schedule.remove(schedule.size() - 1);
            }
        }
    }

    public Schedule build() {
        Boolean[] scheduleRes = new Boolean[schedule.size()];
        for (int i = 0; i < schedule.size(); i++) {
            scheduleRes[i] = schedule.get(i);
        }
        return new Schedule(scheduleRes);
    }
}
