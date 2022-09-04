package by.epam.task7.solution3;

public class Student {
	
    private String surname;
    private int numberGroup;
    private int grade;
   
   
   Student(String s, int n, int g) {       
       surname = s;
       numberGroup = n;
       grade = g;       
   }
   
   public String getSurname() {       
       return surname;       
   }
   
   public int getNumberGroup() {       
       return numberGroup;       
   }
   
   public int getGrade() {       
       return grade;       
   }

}
