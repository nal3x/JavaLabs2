/* Clock class using an hierarchy of constructors to avoid code duplicates.
From within a constructor we use the this keyword to call another constructor 
in the same class */

public class Clock {
	private int hours, minutes, seconds;

	public Clock() { // default constructor
	   hours = 0;
	   minutes = 0;
	   seconds = 0;
    	}
        
        public Clock (int hours) { 
            this();
            if ((hours >= 0) && (hours < 24)) {
                this.hours = hours;
            }
        }
        
        public Clock (int hours, int minutes) {
            this(hours);
            if ((minutes >= 0) && (minutes < 60)) {
                this.minutes = minutes;
            }
        }
        
        public Clock (int hours, int minutes, int seconds) {
            this(hours, minutes);
            if ((seconds >= 0) && (seconds < 60)) {
                this.seconds = seconds;
            }
        }
                
        public String toString() {
		String s = hours + ":" + minutes + ":" + seconds;
                return s;
	 }
}

class ClockTester {
    public static void main (String[] args) {
        Clock clock1 = new Clock();
        Clock clock2 = new Clock(23);
        Clock clock3 = new Clock(32,1);
        Clock clock4 = new Clock(32,59,60);
        
        System.out.println(clock1);
        System.out.println(clock2);
        System.out.println(clock3);
        System.out.println(clock4);
        
    }

}