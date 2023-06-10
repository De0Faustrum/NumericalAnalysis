/**
 * @author Kosmischer
 * */
public class Main {
    public static void main(String[] args) {

        Calculator calculator1 = new Calculator(Math.PI/4, 10E-6, 10E-4, 10);
        Calculator calculator2 = new Calculator(0.6, 10E-6, 10E-4, 10);
        Calculator calculator3 = new Calculator(0.5, 10E-6, 10E-4, 10);
        Calculator calculator4 = new Calculator(0.5, 10E-6, 10E-4, 20);

        calculator1.calculate(1);
        calculator2.calculate(2);
        calculator3.calculate(3);
        calculator4.calculate(4);
    }
}