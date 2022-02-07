/**
 * Exercise 1.4.40: RiffleShuffle
 

 // in 1000000 trials, the mean is approx 19230

 // with 10 riffle shuffles the standard deviation is 150
 // with 11, is 142
 // with 20, is 136
 
 // in 520000 trials, the mean is 10000

 // with 20 riffle shuffles, the standard deviation is 97
 // with 40, is 97 (seems to stabilize before 20)
 // with 15, is 97

*/

public class RiffleShuffle {
    public static void main(String[] args) {
        // getting the number of cards
        int n = Integer.parseInt(args[0]);

        // number of trials
        int trials = Integer.parseInt(args[1]);

        // number of riffle shuffles
        int shuffles = Integer.parseInt(args[2]);

        // statistics: how many times the ith card is taken to the jth spot
        int[][] stats = new int[n][n];
        
        // in each trial
        for (int trial = 0; trial < trials; trial++){
            // setting the deck of n cards
            int[] deck = new int[n];
            for (int i = 0; i < n; i++){
            deck[i] = i;
            }

            // riffle shuffle 'shuffles' times
            for (int j = 0; j < shuffles; j++){
                // gererating a random integer r according to a binomial distribution
                int r = 0;
                for (int i = 0; i < n; i++){
                    if (Math.random()<0.5) r++;
                }
                            
                // number of cards in the first pile
                int n1 = r;
                
                // number of cards in the second pile
                int n2 = n-r;

                // the deck after shuffle
                int[] newdeck = new int[n];

                // for each i in [0,n-1]        
                for (int i = 0; i < n; i++){
                    //choose the (n-i-1)th card in the shuffled deck
                    if (Math.random() < 1.0*n1/(n1+n2)){
                        newdeck[n-1-i] = deck[r-n1];
                        n1--;
                    }
                    else {
                        newdeck[n-1-i] = deck[n-n2];
                        n2--;
                    }
                }

                // turn the original deck into the shuffled deck
                deck = newdeck;
            }

            // noting what card the shuffles took to the ith position
            for (int i = 0; i < n; i++){
                stats[deck[i]][i]++;
            }
        }

        // 

        // calculating the standard deviation of the distribution
        double dist = 0.0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                double x = Math.abs(1.0*trials/n - stats[i][j]);
                dist += x*x;
            }
        }
        dist = Math.sqrt(dist/(n*n-1));

        System.out.println("The mean is: " + 1.0*trials/n);
        System.out.println("The standard deviation is: " + dist);

    }
}