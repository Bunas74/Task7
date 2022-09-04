package by.epam.task7.solution3;

public class Solution3 {

	public static void main(String[] args) {
		
		/* 3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы,
		 *  номер группы, успеваемость (массив из пяти элементов). Создайте массив 
		 *  из десяти элементов такого типа. Добавьте возможность вывода фамилий и 
		 *  номеров групп студентов, имеющих оценки, равные только 9 или 10. */
		
		Student s1 = new Student("Smith", 12, 6);
		Student s2 = new Student("Jonh", 13, 9);
		Student s3 = new Student("Konnor", 11, 10);
		Student s4 = new Student("Neily", 14, 8);
		Student s5 = new Student("Spears", 15, 5);
		Student s6 = new Student("Sting", 16, 9);
		Student s7 = new Student("Brian", 17, 4);
		Student s8 = new Student("Rodson", 18, 6);
		Student s9 = new Student("Gibson", 19, 8);
		Student s10 = new Student("Kouper", 20, 10);
	
		Student[] ar = {s1, s2, s3, s4, s5, s6, s7, s8, s9, s10};
		
		for(Student i: ar){		    
		    if(i.getGrade() == 9 || i.getGrade() == 10){		        
		        System.out.println("Surname: " + i.getSurname() + "\t Group number: " + i.getNumberGroup());
		    }		    
		}
	}
}
