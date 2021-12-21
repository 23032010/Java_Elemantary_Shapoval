package HomeWork3;

public class Exercise10 {
    public static void main(String[] args) {
        int[] mass1 = Exercise9.obMass();
        int max = mass1[0];
        System.out.print("Наибольший(-ие) элемент(-ы) массива: ");
        for(int i =0; i< mass1.length; i++) {
            if(max<mass1[i]) max = mass1[i];
        }
        for (int c:mass1){
            if(c == max) System.out.print(c + "  ");
        }
    }
}
