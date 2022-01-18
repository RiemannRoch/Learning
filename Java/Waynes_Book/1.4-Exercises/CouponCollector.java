/*
* Exercise 1.4.39: Coupon collector
*/
public class CouponCollector {
    public static void main(String[] args) {
        // getting the number of distinct cards
        int n = Integer.parseInt(args[0]);
        
        // getting number of trials
        int trials = Integer.parseInt(args[1]);

        // sum of picked cards for average
        int pickedSum = 0;

        for (int trial = 0; trial < trials; trial++){
            // creating the collection: no cards collected yet
            boolean[] isCollected= new boolean[n];

            // number of collected cards
            int collected = 0;

            //number of cards picked
            int picked = 0;

            // while the number of distinct cards collected is lesser than n
            while(collected < n){
                // pick a random card
                int r = (int)(n*Math.random());
                // count it
                picked++;
                // if it hasnt been picked yet
                if (!isCollected[r]){
                    // mark it as collected
                    isCollected[r] = true;
                    // count it as collected
                    collected++;
                }
            }
            // sum the number of cards picked for average
            pickedSum += picked;
        }
        System.out.println("The average of picked cards to collect " + n + " is " + pickedSum/trials);
        double harmonic = 0.0;
        for (int i = 1; i<=n; i++){
            harmonic += 1.0/i;
        }
        System.out.println("The expexted value (n * H_n) is: " + n*harmonic);
    }
}
