package by.epam.task7.solution7;

public class Triangle {
	
	private int sideA;
    private int sideB;
    private int sideC;
    
    Triangle(int a, int b, int c) {
        sideA = a;
        sideB = b;
        sideC = c;
    }
    
    public void printSide() {
        System.out.println("Side A = " + sideA + "\nSide B = " + sideB + "\nSide C = " + sideC);
    }
    
    public int perimeter() {
        int perimeter;
        perimeter = sideA + sideB + sideC;
        return perimeter;
    }
    
    public double area() {
        double area;
        double p;
        
        p = perimeter()/2;
        area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        return area;
    }

}
