package by.epam.task7.solution4;

import java.util.Scanner;

public class Solution4 {

	public static void main(String[] args) {
		
		/* 4. Создайте класс Train, содержащий поля: название пункта назначения, 
		 * номер поезда, время отправления. Создайте данные в массив из пяти элементов
		 * типа Train, добавьте возможность сортировки элементов массива по номерам поездов.
		 * Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
		 * Добавьте возможность сортировки массив по пункту назначения, причем поезда
		 * с одинаковыми пунктами назначения должны быть упорядочены по времени отправления. */
		
		Train t1 = new Train("Minsk", 1234, 14);
		Train t2 = new Train("Gomel", 1345, 16);
		Train t3 = new Train("Brest", 1256, 15);
		Train t4 = new Train("Minsk", 1432, 9);
		Train t5 = new Train("Vitebsk", 1567, 10);
		
		Train[] ar = {t1, t2, t3, t4, t5};
		
		System.out.println("Train schedule:");		
		for(Train arg: ar) {		    
		    System.out.println("\t Destination: " + arg.getCity() + " \t Train number: " + arg.getNumberTrain() + " \t Time: " + arg.getTime());		    
		}
		
		System.out.println("If you want to sort train schedules by train number, enter 1.");		
		System.out.println("If you want to sort train schedules by destination, enter 2.");		
		System.out.println("If you want to see the schedule of a specific train, enter one of the following numbers (1234, 1256, 1345, 1432, 1567).");
		System.out.println("If you want to exit from the program, enter 0");
		
		int enter;
		
		try(Scanner sc = new Scanner(System.in)) {
			
			while(true) {
				System.out.print("Enter > ");
				enter = sc.nextInt();		    		
				if(enter == 1) {		    
					sortNumberTrain(ar);		
					System.out.println("Train schedule:");		
					for(Train arg: ar) {		    
						System.out.println("\t Destination: " + arg.getCity() + " \t Train number: " + arg.getNumberTrain() + " \t Time: " + arg.getTime());		    
					}	    	
				}
		
				else if(enter == 2) {		    
					sortCity(ar);		
					System.out.println("Train schedule:");		
					for(Train arg: ar) {		    
						System.out.println("\t Destination: " + arg.getCity() + " \t Train number: " + arg.getNumberTrain() + " \t Time: " + arg.getTime());		    
					}	    	
				}
				
				else if(enter == 0) {
					System.out.println("The program is completed at the request of the user.");
					return;
				}
		
				else {		    
					for(int i = 0; i < ar.length; i++) {		        
						if(ar[i].getNumberTrain() == enter) {		            
							System.out.println("Train schedule:");		            
							System.out.println("\t Destination: " + ar[i].getCity() + " \t Train number: " + ar[i].getNumberTrain() + " \t Time: " + ar[i].getTime());		            
						}		        
					}		    
				}
			}
		}
	}
	
	public static Train[] sortNumberTrain(Train[] array) {	    
	    for(int i = 0; i < array.length; i++) {	        
	        for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].getNumberTrain() > array[j + 1].getNumberTrain()) {
                    Train temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }               
            }	        
	    }	    
	    return array;	    
	}
	
		public static Train[] sortTime(Train[] array) {	    
			for(int i = 0; i < array.length; i++) {	        
				for (int j = 0; j < array.length - i - 1; j++) {
					if (array[j].getTime() > array[j + 1].getTime()) {
						Train temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}              
				}        
			}	    
			return array;	    
		}
	
		public static Train[] sortCity(Train[] array) {		   
		   sortTime(array);	    
		   for(int i = 0; i < array.length; i++) {	        
			   for (int j = 0; j < array.length - i - 1; j++) {
				   if (array[j].getCity().charAt(0) > array[j + 1].getCity().charAt(0)) {
					   Train temp = array[j];
					   array[j] = array[j + 1];
					   array[j + 1] = temp;
				   }               
			   }        
		   }	    
		   return array;	    
	    }
}
