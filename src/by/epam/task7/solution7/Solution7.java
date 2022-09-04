package by.epam.task7.solution7;

public class Solution7 {

	public static void main(String[] args) {
		
		/*7. Описать класс, представляющий треугольник. Предусмотреть методы для
		 *создания объектов, вычисления площади, периметра и точки пересечения медиан. */
        
        Triangle t = new Triangle(5, 6, 7);
        
        System.out.println("Side of triangle is:");
        t.printSide();
        
        System.out.println("Perimeter of triangle is: " + t.perimeter());
        
        System.out.printf("Area of triangle is: %.2f", t.area());

	}
}
