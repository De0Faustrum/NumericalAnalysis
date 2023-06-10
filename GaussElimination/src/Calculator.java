/**
 * @author Kosmischer
 **/
public class Calculator {

    private static int series = 0;
    private final int n;
    private final double[][] a;
    private final double[] b;

    public Calculator(int n, double[][] a, double[] b){
        this.n = n;
        this.a = a;
        this.b = b;
        series++;
    }

    public void calculate(){
        double[][] m = new double[n][n];
        for(int k=0; k<n-1; k++){
            int p = 0;
            double maxTemp = 0;
            for(int j=k; j<n; j++){
                if(Math.abs(a[j][k]) > maxTemp){
                    maxTemp = Math.abs(a[j][k]);
                }
            }
            for(p=k; p<n; p++){
                if(Math.abs(a[p][k])==maxTemp){
                    if(a[p][k]==0){
                        System.out.println("Singular Matrix !");
                        return;
                    }
                    if(p != k){
                        for(int ii=0; ii<n; ii++){
                            double temp = a[p][ii];
                            a[p][ii] = a[k][ii];
                            a[k][ii] = temp;
                        }
                        double temp = b[p];
                        b[p] = b[k];
                        b[k] = temp;
                    }
                    break;
                }
            }


            for(int i=k+1; i<n; i++){
                m[i][k] = a[i][k] / a[k][k];
                for(int j=k+1; j<n; j++){
                    a[i][j] = a[i][j] - a[k][j]*m[i][k];

                }
                b[i] = b[i] - b[k]*m[i][k];
            }
        }

        if(a[n-1][n-1] == 0){
            System.out.println("Singular Matrix");
            return;
        }

        double[] x = new double[n];
        x[n-1] = b[n-1]/a[n-1][n-1];

        for(int k=n-2; k>=0; k--){
            double Sigma = 0;
            for(int j=k+1; j<n; j++){

                Sigma += a[k][j]*x[j];
            }

            x[k] = (b[k]-Sigma) / a[k][k];
        }

        if(series < 5){
            System.out.println("问题1,第("+series+")题:");
        }
        else {
            System.out.println("问题2,第("+(series-4)+")题:");
        }
        System.out.print("x^T = [");
        for(int i=0; i<n; i++){
            System.out.printf("%9.6f,",x[i]);
        }
        System.out.println("]\n");

    }
}
