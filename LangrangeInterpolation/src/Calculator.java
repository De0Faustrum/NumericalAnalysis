/**
 * @author Kosmischer
 * */
public class Calculator {
    private final double[] x;
    private final double[] xi;
    private final int steps;
    private final int bound;

    public Calculator(double[] x, double[] xi, int steps, int bound){
        this.x = x;
        this.xi = xi;
        this.steps = steps;
        this.bound = bound;
    }

    public void calculate(int type){
        if(type == 1){
            System.out.println("\n插值区间为[" + (-1*bound) + "," + bound +  "], n = " + (steps-1) + ", f(x) = 1/(1+x^2)");
        }
        else if(type == 2){
            System.out.println("\n插值区间为[" + (-1*bound) + "," + bound +  "], n = " + (steps-1) + ", f(x) = e^x");
        }
        for (double v : x) {
            double y = 0.0;
            for (int k = 0; k < steps; k++) {
                double l = 1.0;
                for (int j = 0; j < steps; j++) {
                    if (j != k) {
                        l = l * (v - xi[j]) / (xi[k] - xi[j]);

                    }
                }
                if (type == 1) {
                    y = y + l * f(xi[k]);
                } else if (type == 2) {
                    y = y + l * g(xi[k]);
                } else if (type == 3){
                    y = y + l * h(xi[k]);
                }

            }
            System.out.printf("x = %8.4f, y = %8.4f\n", v, y);
        }
    }

    public double f(double x){
        return 1/(1+x*x);
    }

    public double g(double x){
        return Math.exp(x);
    }

    public double h(double x){
        return Math.sqrt(x);
    }

}
