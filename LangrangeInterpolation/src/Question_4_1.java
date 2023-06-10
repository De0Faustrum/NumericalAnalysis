/**
 * @author Kosmischer
 * */
public class Question_4_1 {
    public static void main(String[] args) {

        double[] x = {5,50,115,185};
        double[] x1 = {1,4,9};
        Calculator calculator1 = new Calculator(x, x1, 3, 4);
        calculator1.calculate(3);

        double[] x2 = {36,49,64};
        Calculator calculator2 = new Calculator(x, x2, 3, 4);
        calculator2.calculate(3);

        double[] x3 = {100,121,144};
        Calculator calculator3 = new Calculator(x, x3, 3, 4);
        calculator3.calculate(3);

        double[] x4 = {169,196,225};
        Calculator calculator4 = new Calculator(x, x4, 3, 4);
        calculator4.calculate(3);

        System.out.println("\n实际值为: ");
        for (double v : x) {
            System.out.printf("x = %8.4f, y = %8.4f\n", v, calculator1.h(v));
        }
    }
}
