package by.epam.task7.solution5;

import java.util.Scanner;

public class Solution5 {

	public static void main(String[] args) {
		
		/* 5. Опишите класс, реализующий десятичный счетчик, который может
		 * увеличивать или уменьшать свое значение на единицу в заданном диапазоне.
		 * Предусмотрите инициализацию счетчика значениями по умолчанию и 
		 * произвольными значениями. Счетчик имеет методы увеличения и уменьшения
		 * состояния, и метод позволяющее получить его текущее состояние. Написать
		 * код, демонстрирующий все возможности класса. */
	    
	    
       		 Counter c = new Counter();
        
        	System.out.println("Counter management menu(range from 1 to 10).");
       	        System.out.println("Enter:");
       	        System.out.println("\t 1 - to increase the counter value by one.");
       	        System.out.println("\t 2 - to decrease the counter value by one.");
       	        System.out.println("\t 3 - to see the current state of the counter.");
                System.out.println("\t 4 - to set your own counter value.");
        
                try(Scanner sc = new Scanner(System.in)) {
    
               		 int enter;
    
       			 while(c.getCount() >= 0 && c.getCount() <= 10) {
          			 System.out.print("Enter > ");
           			 enter = sc.nextInt();
        
           			 if(enter == 1) {
               				 c.countPlus();
                			 System.out.println("+");
           			 }
           			 else if(enter == 2) {
              			 	 c.countMinus();
               			 	 System.out.println("-");
           			 }
           			 else if(enter == 3) {
                			System.out.println("Current state of the counter is: " + c.getCount());
            			}
            			else if(enter == 4) {
               				System.out.print("Enter your own counter value > ");
                			c.setCount(sc.nextInt());
           		        }
            			else if(enter == 0) {	
               				System.out.println("The program is completed at the request of the user.");
                			return;
           		        }
				 
           		        if(c.getCount() < 0 || c.getCount() > 10) {
                			System.out.println("Error.Counter range exceeded.");
            			}           
        		 }       
     		 }
  	 }
}
