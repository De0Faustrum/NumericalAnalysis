/**
 * @author Kosmischer
 * */
public class Main {
    public static void main(String[] args) {
        double[][] a1 = {{0.4096, 0.1234, 0.3678, 0.2943},
                         {0.2246, 0.3872, 0.4015, 0.1129},
                         {0.3645, 0.1920, 0.3781, 0.0643},
                         {0.1784, 0.4002, 0.2786, 0.3927}};
        double[]   b1 =  {1.1951, 1.1262, 0.9989, 1.2499};
        Calculator calculator1 = new Calculator(4,a1,b1);
        calculator1.calculate();

        double[][] a2 = {{136.01, 90.860, 0.0000, 0.0000},
                         {90.860, 98.810,-67.590, 0.0000},
                         {0.0000,-67.590, 132.01, 46.260},
                         {0.0000, 0.0000, 46.260, 177.17}};
        double[]   b2 =  {226.87, 122.08, 110.68, 223.43};
        Calculator calculator2 = new Calculator(4,a2,b2);
        calculator2.calculate();

        double[][] a3 = {{1.0/1, 1.0/2, 1.0/3, 1.0/4},
                         {1.0/2, 1.0/3, 1.0/4, 1.0/5},
                         {1.0/3, 1.0/4, 1.0/5, 1.0/6},
                         {1.0/4, 1.0/5, 1.0/6, 1.0/7}};
        double[]   b3 =  {25.0/12, 77.0/60, 57.0/60, 319.0/420};
        Calculator calculator3 = new Calculator(4,a3,b3);
        calculator3.calculate();

        double[][] a4 = {{10,  7,  8,  7},
                         { 7,  5,  6,  5},
                         { 8,  6,  10, 9},
                         { 7,  5,  9, 10}};
        double[]   b4 =  {32, 23, 33, 31};
        Calculator calculator4 = new Calculator(4,a4,b4);
        calculator4.calculate();

        double[][] a5 = {{ 197,  305, -206, -804},
                         {46.8, 71.3,-47.4, 52.0},
                         {88.6, 76.4,-10.8,  802},
                         {1.45, 5.90, 6.13, 36.5}};
        double[]   b5 =  {136, 11.7, 25.1, 6.60};
        Calculator calculator5 = new Calculator(4,a5,b5);
        calculator5.calculate();

        double[][] a6 = {{0.5398, 0.7161,-0.5554,-0.2982},
                         {0.5257, 0.6924, 0.3565,-0.6255},
                         {0.6465,-0.8187,-0.1872, 0.1291},
                         {0.5814, 0.9400,-0.7779,-0.4042}};
        double[]   b6 =  {0.2058, -0.0503, 0.1070, 0.1859};
        Calculator calculator6 = new Calculator(4,a6,b6);
        calculator6.calculate();

        double[][] a7 = {{10,  1,  2},
                         { 1, 10,  2},
                         { 1,  1,  5}};
        double[]   b7 =  {13, 13, 7};
        Calculator calculator7 = new Calculator(3,a7,b7);
        calculator7.calculate();

        double[][] a8 = {{ 4, -2, -4},
                         {-2, 17, 10},
                         {-4, 10,  9}};
        double[]   b8 =  {-2, 25, 15};
        Calculator calculator8 = new Calculator(3,a8,b8);
        calculator8.calculate();
    }
}