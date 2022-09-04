package by.epam.task7.solution6;

import java.util.Scanner;

public class Solution6 {

	public static void main(String[] args) {
		
		/* 6. Составьте описание класса для представления времени. Предусмотрите
		 * возможности установки времени и изменения его отдельных полей (час, минута, секунда)
		 * с проверкой допустимости вводимых значений. В случае недопустимых значений полей
		 * поле устанавливается в значение 0. Создать методы изменения времени на заданное
		 * количество часов, минут и секунд. */
		
        Time t = new Time();
        
        System.out.println("Clock setting menu.");
        System.out.println("Enter:");
        System.out.println("\t1 - setting hours; \n\t2 - setting minutes;  \n\t3 - setting seconds;  \n\t4 - viewing the current time;  \n\t0 - exit from the program.");
        
        try(Scanner sc = new Scanner(System.in)) {
            
            int enter;
            
            while(true) {
                
                System.out.print("Enter > ");
                enter = sc.nextInt();
                
                if(enter == 1) {
                    System.out.print("Hours > ");
                    t.setHours(sc.nextInt());
                }
                else if(enter == 2) {
                    System.out.print("Minutes > ");
                    t.setMinutes(sc.nextInt());
                }
                else if(enter == 3) {
                    System.out.print("Seconds > ");
                    t.setSeconds(sc.nextInt());
                }
                else if(enter == 4) {
                    t.printTime();
                }
                else if(enter == 0) {
                    System.out.print("Good luck.");
                    return;
                }
            }
        }
	}
}
