/**
 * Exercise 1.4.35: Three-dimensional self-avoiding walks
 */
public class RandomWalk3 {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int deadEnds = 0;

        for (int i = 0; i < trials; i++){
            boolean[][][] a = new boolean[n][n][n];
            int x = n/2;
            int y = n/2;
            int z = n/2;

            while(x > 0 && x < n-1 && y > 0 && y < n-1 && z > 0 && z < n-1){
                a[x][y][z] = true;

                if(a[x+1][y][z] && a[x-1][y][z] && a[x][y+1][z] && a[x][y-1][z] && a[x][y][z+1] && a[x][y][z-1]){
                    deadEnds++;
                    break;
                }

                int d = (int) (Math.random()*6);
                if (d==0 && !a[x+1][y][z]) x++;
                if (d==1 && !a[x-1][y][z]) x--;
                if (d==2 && !a[x][y+1][z]) y++;
                if (d==3 && !a[x][y-1][z]) y--;
                if (d==4 && !a[x][y][z+1]) z++;
                if (d==5 && !a[x][y][z-1]) z--;
            }
        }
        System.out.println(100*deadEnds/trials + "% dead-ends.");
    }
}