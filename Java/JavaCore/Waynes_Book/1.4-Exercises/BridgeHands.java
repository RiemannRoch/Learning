/*
* Exercise 1.3.37: Bridge hands
*/

// in 1000000 trials, we got
// 15% of 5-3-3-2
// 21% of 4-4-3-2
// 10% of 4-3-3-3

// So, sounds like 4-4-3-2 is more likely


public class BridgeHands {
    public static void main(String[] args) {
        // getting number of trials
        int trials = Integer.parseInt(args[0]);
        String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};

        // defining deck: only SUITS are necessary
        String[] deck = new String[52];
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 13; j++){
                deck[13*i + j] = SUITS[i];
            }
        }
        
        int[] countHand = new int[3];
        // the counter: countHand[0] counts the times 5-3-3-2 shows up
        // countHand[1] counts 4-4-3-2
        // countHand[2] counts 4-3-3-3


        for (int trial = 0; trial < trials; trial++){
            // obtaining a permutation of 52
            int[] perm = new int[52];
            for (int i = 0; i < 52; i++){
                perm[i] = i;
            }

            for (int i = 0; i < 52; i++){
                int r = i + (int)(Math.random()*(52-i));
                int temp = perm[r];
                perm[r] = perm[i];
                perm[i] = temp;
            }
            
            for (int j = 0;j < 4;j++){
                // sampling without replacement
                String[] hand = new String[13];
                for (int i = 0; i < 13; i++){
                    hand[i] = deck[perm[13*j + i]];
                }

                // counting cards of each suit
                int[] countSuits = new int[4];
                for (int i = 0; i < 13; i++){
                    switch (hand[i]) {
                        case "Clubs": countSuits[0]++;                    
                            break;
                        case "Diamonds": countSuits[1]++;
                            break;
                        case "Hearts": countSuits[2]++;
                            break;
                        case "Spades": countSuits[3]++;
                            break;            
                        default:
                            break;
                    }
                }
                // trace
                //System.out.print(countSuits[0] + ", " + countSuits[1] + ", ");
                //System.out.println(countSuits[2] + ", " + countSuits[3]);
                
                // which one is it?
                int a = 0, b = 13;

                for (int i = 0; i < 4; i++){
                    a = Math.max(a, countSuits[i]);
                    b = Math.min(b, countSuits[i]);
                }

                if (a == 4){
                    if (b==3) countHand[2]++;
                    if (b==2) countHand[1]++;
                }
                if (a == 5 && b == 2){
                    if (countSuits[0] == 3 || countSuits[1] == 3 || countSuits[2] == 3 || countSuits[3] == 3){
                        countHand[0]++;
                    }
                }
            }
        }

        System.out.println("The rate of 5-3-3-2 hands is: " + 100*countHand[0]/(4*trials) + "%");
        System.out.println("The rate of 4-4-3-2 hands is: " + 100*countHand[1]/(4*trials) + "%");
        System.out.println("The rate of 4-3-3-3 hands is: " + 100*countHand[2]/(4*trials) + "%");
    }
}