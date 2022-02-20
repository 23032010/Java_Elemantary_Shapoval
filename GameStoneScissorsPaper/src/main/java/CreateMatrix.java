public class CreateMatrix {
    public String whoIsWinner(String a, String b){
        String[][] winner = new String[3][3];
        winner[0][0] = "X";
        winner[0][1] = "P1";
        winner[0][2] = "P2";
        winner[1][0] = "P2";
        winner[1][1] = "X";
        winner[1][2] = "P1";
        winner[2][0] = "P1";
        winner[2][1] = "P2";
        winner[2][2] = "X";

        int i = (int)(Math.random()*3);
        if(i==0){
            System.out.println(a + " chose - STONE");
        }
        else if(i==1){
            System.out.println(a + " chose - SCISSORS");
        }
        else{
            System.out.println(a + " chose - PAPER");
        }
        //-------------------------------------------------------------
        int j = (int)(Math.random()*3);
        if(j==0){
            System.out.println(b + " chose - STONE");
        }
        else if(j==1){
            System.out.println(b + " chose - SCISSORS");
        }
        else {
            System.out.println(b + " chose - PAPER");
        }
        return winner[i][j];
    }
}
