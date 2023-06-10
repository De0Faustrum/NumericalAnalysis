/**
 * @author Kosmischer
 * */
public class Question_2_2 {
    public static void main(String[] args) {
        double[] x = {-4.75, -0.25, 0.25, 4.75};
        double[] x5 = new double[6];
        for(int i=0; i<6; i++){
            x5[i] = -5+(10.0/5)*i;
        }
        Calculator calculator5 = new Calculator(x, x5, 6, 5);
        calculator5.calculate(2);

        double[] x10 = new double[11];
        for(int i=0; i<11; i++){
            x10[i] = -5+(10.0/10)*i;
        }
        Calculator calculator10 = new Calculator(x, x10, 11, 5);
        calculator10.calculate(2);

        double[] x20 = new double[21];
        for(int i=0; i<21; i++){
            x20[i] = -5+(10.0/20)*i;
        }
        Calculator calculator20 = new Calculator(x, x20, 21, 5);
        calculator20.calculate(2);

        System.out.println("\n实际值为: ");
        for (double v : x) {
            System.out.printf("x = %6.4f, y = %6.4f\n", v, calculator5.g(v));
        }
    }
}
