package by.epam.task7.solution6;

public class Time {
	
	private int hours;
    private int minutes;
    private int seconds;
    
    public void setHours(int h) {
        if(h < 0 || h > 24) {
            hours = 0;
        }
        hours = h;
    }
    
    public int getHours() {
        return hours;
    }
    
    public void setMinutes(int m) {
        if(m < 0 || m > 60) {
            minutes = 0;
        }
        minutes = m;
    }
    
    public int getMinutes() {
        return minutes;
    }
    
    public void setSeconds(int s) {
        if(s < 0 || s > 60) {
            seconds = 0;
        }
        seconds = s;
    }
    
    public int getSeconds() {
        return seconds;
    }
    
    public void printTime() {
        System.out.printf( "Current time is: %02d:%02d:%02d\n" , hours, minutes, seconds );
    }

}
