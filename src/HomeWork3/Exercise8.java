package HomeWork3;

public class Exercise8 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        int count = 0;
        for(int i = 0; count<10;i++){
            if(i%2 !=0){
                mass[count] = i;
                if(count != 9) {
                    System.out.print(mass[count] + ", ");
                    count++;
                }
                else {
                    System.out.println(mass[count] + ".");
                    count++;
                }
            }
        }
    }
}
