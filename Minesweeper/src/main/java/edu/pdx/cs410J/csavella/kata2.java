package edu.pdx.cs410J.csavella;

public class kata2 {
    public static void main(String[] args) {
    /*System.err.println("Missing command line arguments");
    System.exit(1);*/
    /*for(int i=0;i<args.length;i++){
      System.out.println(args[i]);
      System.out.println();
    }*/
        /**
         * example input:
         * 4 4 ...* *... .... .*..
         */
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        int[][] mine = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mine[i][j] = 0;
            }
        }
        for (int i = 2; i < args.length; i++) {
            if (args[i].indexOf("*") != -1) {
                mine[i - 2][args[i].indexOf("*")] = 999;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mine[i][j] == 999) {
                    boolean up = false;
                    boolean down = false;
                    boolean left = false;
                    boolean right = false;
                    if (i - 1 >= 0) {
                        up = true;
                    }
                    if (i + 1 < n) {
                        down = true;
                    }
                    if (j - 1 >= 0) {
                        left = true;
                    }
                    if (j - 1 < n) {
                        right = true;
                    }
                    if(up){
                        mine[i-1][j]++;
                        if(right){
                            mine[i-1][j+1]++;
                        }
                    }
                    if(right){
                        mine[i][j+1]++;
                        if(down){
                            mine[i+1][j+1]++;
                        }
                    }
                    if(down){
                        mine[i+1][j]++;
                        if(left){
                            mine[i+1][j-1]++;
                        }
                    }
                    if(left){
                        mine[i][j-1]++;
                        if(up){
                            mine[i-1][j-1]++;
                        }
                    }
                }
            }
        }
    }
}
