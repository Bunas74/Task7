package by.epam.task7.solution5;

public class Counter {
	
	private int count;
    
   	 Counter() {     
       		 count = 0;       
   	 }
    
   	 Counter(int c) {      
        	count = c;       
   	 } 
    
   	 public void setCount(int c) {
       		 count = c;
   	 }
    
   	 public int getCount() {
        	return count;
  	  }
    
   	 public int countPlus() {
       		 count++;
       		 return count;
   	 }
    
   	 public int countMinus() {
       		 count--;
       		 return count;
    	}

}
