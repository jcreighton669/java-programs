public class Clock {

    int hours = 12;
    int minutes = 0;

    public int next() {
        minutes += 1;
        if (minutes == 60) {
            minutes = 0;
            if (hours == 12) {
                hours = 1;
            }
            else {
                hours++;
            }
        }
        return minutes;
    }
}
