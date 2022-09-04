package by.epam.task7.solution8;

public class Solution8 {

	public static void main(String[] args) {
		
		/* 8. Создать класс Customer, спецификация которого приведена ниже.
		 * Определить конструкторы, set- и get- методы и метод  toString().
		 * Создать второй класс, агрегирующий массив типа Customer, с подходящими
		 * конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.  
		 
		   Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.  
		   Найти и вывести :  
		   a ) список покупателей в алфавитном порядке;  
		   b ) список покупателей, у которых номер кредитной карточки находится в заданном интервале  */
		        
		        Customer c1 = new Customer(1, "Ivanov", "Ivan", "Ivanovich", "Ivanovskaya 1-1", 1111, 111111);
		        Customer c2 = new Customer(2, "Petrov", "Petr", "Petrovich", "Petrovskaya 2-2", 2222, 222222);
		        Customer c3 = new Customer(3, "Sidorov", "Sidor", "Sidorovich", "Sidorovskaya 3-3", 3333, 333333);
		        Customer c4 = new Customer(4, "Vasechkin", "Vasiliy", "Vasilevich", "Vasilevskaya 4-4", 4444, 444444);
		        Customer c5 = new Customer(5, "Karpov", "Karp", "Karpovich", "Karpovskaya 5-5", 5555, 555555);
		        
		        Customer[] ar = {c1, c2, c3, c4, c5};
		                    
		        c1.title();
		        
		        System.out.println("List of customers:");       
		        for(Customer arg: ar) {
		            arg.printList();
		        }    
		        
		        System.out.println();
		        
		        System.out.println("List of customers in alphabetical order:");
		        sortSurname(ar);    
		        for(Customer arg: ar) {
		            arg.printList();
		        }  
		        
		        System.out.println() ;
		        
		        System.out.println("Customers with card numbers in the range from 2222 to 4444:");
		        for(Customer arg: ar) {          
		            if(arg.getNumberCard() > 1111 && arg.getNumberCard() < 5555) {
		            arg.printList();
		            }
		        }   		            
		    }
		    
		    public static Customer[] sortSurname(Customer[] array) {
			    
			    for(int i = 0; i < array.length; i++) {	        
			        for (int j = 0; j < array.length - i - 1; j++) {
		                if (array[j].getSurname().charAt(0) > array[j + 1].getSurname().charAt(0)) {
		                    Customer temp = array[j];
		                    array[j] = array[j + 1];
		                    array[j + 1] = temp;
		                }          
		            }      
			    }    
			    return array;  
			}
}
