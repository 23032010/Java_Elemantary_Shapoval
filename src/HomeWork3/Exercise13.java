package HomeWork3;

public class Exercise13 {
    public static void main(String[] args) {
        char[][] mass = new char[8][8];
        for(int i = 0; i< mass.length;i++){
            for(int j = 0; j< mass.length; j++){
                if(i%2==0 && j%2!=0)mass[i][j] = 'W';
                else if(i%2==0 && j%2==0)mass[i][j] = 'B';
                else if(i%2!=0 && j%2!=0)mass[i][j] = 'B';
                else mass[i][j] = 'W';
                System.out.print(mass[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
