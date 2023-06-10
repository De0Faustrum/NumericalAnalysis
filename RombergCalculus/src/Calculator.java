/**
 * @author Kosmischer
 * */
public class Calculator {
    private final double a;
    private final double b;
    private final double epsilon;


    public Calculator(double a, double b, double epsilon){
        this.a = a;
        this.b = b;
        this.epsilon = epsilon;
    }

    public void calculate(int serial){
        double[][] T;
        double h;
        double sigma;
        int i;
        int ii;
        boolean termination = false;

        T = new double[100][100];
        h = b - a;
        i = 1;
        T[0][0] = 0.5 * h *(f(a, serial) + f(b, serial));

        while(!termination){
            sigma = 0;
            ii = (int) Math.pow(2,i-1);
            for(int k=1; k<=ii; k++){
                sigma += f((a+(k-0.5)*h) , serial);
            }
            T[0][i] = 0.5 * T[0][i-1] + 0.5 * h * sigma;
            for(int m=1; m<=i; m++){
                int k = i - m;
                T[m][k] = ((Math.pow(4,m))*T[m-1][k+1]-T[m-1][k]) / ((Math.pow(4,m))-1);
            }

            if(Math.abs(T[i][0] - T[i-1][0]) < epsilon){
                termination = true;
                output(serial,i,T[i][0],T);
                continue;
            }
            h = 0.5 * h;
            i++;
        }

    }

    public double f(double x, int type){
        switch (type){
            case 1: return x*x*Math.exp(x);
            case 2: return Math.exp(x)*Math.sin(x);
            case 3: return 4/(1+x*x);
            case 4: return 1/(1+x);
            default: return 0;
        }
    }

    public void output(int serial, int i, double res, double[][] T){
        String prefix = "\n积分∫_"+a+"^"+b;
        String functionName="";
        switch (serial){
            case 1: functionName = "[x^2*e^2]dx"; break;
            case 2: functionName = "[e^xsinx]dx"; break;
            case 3: functionName = "[4/(1+x^2)]dx"; break;
            case 4: functionName = "[1/(1+x)]dx"; break;
            default: break;
        }
        String suffix = "的运算结果是:" + res + ", (epsilon = 10E-6)";
        System.out.println(prefix+functionName+suffix);
        System.out.println("龙贝格T-数表:");
        for(int index = 0; index <=i; index++){
            for(int iii=0; iii<=i; iii++){
                for(int jjj=0; jjj<=i; jjj++){
                    if(iii + jjj == index){
                        System.out.printf("%12.8f",T[jjj][iii]);
                    }
                }
            }
            System.out.println();
        }
        System.out.println();
    }

}
