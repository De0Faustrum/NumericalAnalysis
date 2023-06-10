/**
 * @author Kosmischer
 * */
public class Main {
    public static void main(String[] args) {
        Calculator calculator1 = new Calculator(0, 1, 1.0E-6);
        calculator1.calculate(1);

        Calculator calculator2 = new Calculator(1, 3, 1.0E-6);
        calculator2.calculate(2);

        Calculator calculator3 = new Calculator(0, 1, 1.0E-6);
        calculator3.calculate(3);

        Calculator calculator4 = new Calculator(0, 1, 1.0E-6);
        calculator4.calculate(4);
    }
}