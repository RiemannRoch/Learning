/*
* Exercise 1.4.41: Binomial distribution
*/

public class BinomialDistribution {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double[][] a = new double[n+1][];
        
        for (int i = 0; i <= n; i++){
            a[i] = new double[i+3];
        }

        a[0][1] = 1.0;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i + 1; j++){
                a[i][j] = (a[i-1][j] + a[i-1][j-1])/2;
            }
        }

        for (int i = 0; i < a.length; i++){
            for (int j = 1; j < a[i].length - 1; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
