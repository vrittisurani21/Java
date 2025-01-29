public class Time {

    public int hour;
    public int minute;

    public Time(int hour, int minute) {
      this.hour = hour;
      this.minute = minute;
    }
  
    public Time add(Time other) {
      int totalMinutes = this.minute + other.minute;
      int carryHours = totalMinutes / 60;
      int newMinute = totalMinutes % 60;
      int totalHours = this.hour + other.hour + carryHours;
      int newHour = totalHours % 24;
      return new Time(newHour, newMinute);
    }
    public String toString() {
      return String.format("%02d:%02d", hour, minute);
    }
  }