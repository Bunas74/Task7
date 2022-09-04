package by.epam.task7.solution4;

public class Train {
	
    private String city;
    private int numberTrain;
    private int time;
    
    Train(String c, int n, int t) {       
        city = c;
        numberTrain = n;
        time = t;        
    }
    
    public String getCity() {        
        return city;        
    }
    
    public int getNumberTrain() {      
        return numberTrain;        
    }
    
    public int getTime() {        
        return time;       
    }

}
