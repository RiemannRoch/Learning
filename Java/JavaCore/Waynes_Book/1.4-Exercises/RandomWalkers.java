/*
* Exercise 1.4.36: Random walkers
*/
public class RandomWalkers {
    public static void main(String[] args) {
        // getting command-line argument
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        //initialize the sum of walk length
        int lengthSum = 0;

        for (int trial =0; trial < trials; trial++){
            //creating grid
            boolean[][] a = new boolean[n][n];

            //position of the n random walkers
            int[] x = new int[n];
            int[] y = new int[n];

            //setting everyone in the middle
            for (int i=0; i<n; i++){
                x[i] = n/2;
                y[i] = n/2;
            }
            int length = 0;
            while(true){
                //testing if the grid is full
                boolean full = true;
                for (int i=0; i<n; i++){
                    for (int j=0; j<n; j++){
                        full = a[i][j];
                        // one false is enough to know its not full
                        if (!full) break;
                    }
                    if (!full) break;
                }
                //if its full, sum the length and lets try again
                if (full) {
                    lengthSum += length;
                    break;
                }
                
                //if not, lets take another step
                boolean walk = false;
                for (int i=0; i<n; i++){
                    int d = (int) (4*Math.random());
                    if (d==0 && x[i] < n-1) {x[i]++; walk = true;}
                    if (d==1 && y[i] < n-1) {y[i]++; walk = true;}
                    if (d==2 && x[i] > 0) {x[i]--; walk = true;}
                    if (d==3 && y[i] > 0) {y[i]--; walk = true;}
                    a[x[i]][y[i]] = true;
                }
                if (walk) length++;
            }
        }
        System.out.println("The average number of steps to fill the grid is: " + lengthSum/trials);
    }
}
// n=10, trials=10000: 146
// n=11, trials=10000: 170
// n=12, trials=10000: 197 
// n=13, trials=10000: 222
// n=14, trials=10000: 252 
// n=15, trials=10000: 279
// n=16, trials=10000: 311 

// n=18, trials=10000: 376 

// n=22, trials=10000: 515