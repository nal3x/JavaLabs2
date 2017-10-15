public class Clock {
	private int hours, minutes, seconds;

	public Clock() { // default constructor
	   hours = 0;
	   minutes = 0;
	   seconds = 0;
    	}

	public Clock (int h, int min, int sec) { //* overloaded constructor*/
		if ((sec >= 0) && (sec < 60) &&
		     (min >= 0) && (min < 60) &&
		     (h >= 0) && (h < 24)) {
			hours = h;
			minutes = min;
			seconds = sec;
		}
		else {
		  	hours = 0;
		   	minutes = 0;
		  	seconds = 0;
		}
	}
        
        public void display_Clock() {
		System.out.println(hours + ":" + minutes + ":" + seconds);
	 }
}

class ClockTester {
    public static void main (String[] args) {
        
    }

}