/*
* Exercise 1.4.38: Birthday problem
*/

// The average of people that have to enter before theres a match is 24. (10000000 trials)

public class BirthdayProblem {
    public static void main(String[] args) {
        //getting number of trials
        int trials = Integer.parseInt(args[0]);

        // initializing the sum for average
        int countSum = 0;
        for (int trial = 0; trial < trials; trial++){
            //initializing an empty room
            boolean[] a = new boolean[365];
            //birthday of first person to enter
            int r = (int)(365*Math.random());
            //counting first person
            int count = 1;
            //if theres no one in the room with this birthday
            while(!a[r]){
                //put this birthday on the list
                a[r] = true;
                // calling another person
                count++;
                // birthday of next person
                r = (int)(365*Math.random());
            }
            // add to the sum for average
            countSum += count;
        }
        System.out.println("The average is: " + countSum/trials);
    }
}
