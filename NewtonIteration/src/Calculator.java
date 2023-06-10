/**
 * @author Kosmischer
 * */
public class Calculator {
    private double alpha;
    private double epsilon1;
    private double epsilon2;
    private int N;

    public Calculator(double alpha, double epsilon1, double epsilon2, int N){
        this.alpha = alpha;
        this.epsilon1 = epsilon1;
        this.epsilon2 = epsilon2;
        this.N = N;
    }

    public void calculate(int serial){
        double belta = 0;
        double F = 0;
        double DF = 0;
        double Tol = 0;
        int endFlag = 0;

        for(int n=1 ; n<N && endFlag==0 ; n++){
            F = f(alpha, serial);
            DF = df(alpha, serial);
            if(Math.abs(F) < epsilon1){
                endFlag = 1;
                output(serial, alpha);
                continue;
            }
            if(Math.abs(DF) < epsilon2){
                endFlag = 2;
                System.out.println("Iteration Failed !");
                continue;
            }
            belta = alpha - F/DF;
            Tol = Math.abs(belta-alpha);
            if(Tol < epsilon1){
                endFlag = 1;
                output(serial, belta);
                continue;
            }
            alpha = belta;
        }
    }

    public double f(double x, int serial){
        switch (serial){
            case 1: return Math.cos(x) - x;
            case 2: return Math.exp(-1*x) - Math.cos(x);
            case 3: return x - Math.exp(-1*x);
            case 4: return x*x - 2*x*Math.exp(-1*x) + Math.exp(-2*x);
            default:return 0;
        }
    }

    public double df(double x, int serial){
        switch (serial){
            case 1: return -1*Math.sin(x) - 1;
            case 2: return -1*Math.exp(-1*x) - Math.sin(x);
            case 3: return 1 + Math.exp(-1*x);
            case 4: return 2*x - 2*Math.exp(-1*x) + 2*x*Math.exp(-1*x) - 2*Math.exp(-2*x);
            default:return 0;
        }
    }

    public void output(int serial, double res){
        switch (serial){
            case 1: System.out.println("\n(" + serial + ").cosx-x=0, epsilon1=10E-6, epsilon2=10E-4, N=10, x0=π/4\n 由Newton迭代得，方程的解为" + res + "."); break;
            case 2: System.out.println("\n(" + serial + ").e^(-x)-sinx=0, epsilon1=10E-6, epsilon2=10E-4, N=10, x0=0.6\n 由Newton迭代得，方程的解为" + res + "."); break;
            case 3: System.out.println("\n(" + serial + ").x-e^(-x)=0, epsilon1=10E-6, epsilon2=10E-4, N=10, x0=0.5\n 由Newton迭代得，方程的解为" + res + "."); break;
            case 4: System.out.println("\n(" + serial + ").x^2-2xe^(-x)+e^(-2x), epsilon1=10E-6, epsilon2=10E-4, N=20, x0=0.5\n 由Newton迭代得，方程的解为" + res + "."); break;
            default: break;
        }
    }
}
