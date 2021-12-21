package HomeWork3;

public class Exercise12 {
    public static void main(String[] args) {
        int[]mass = Exercise9.obMass();
        int count = 0;
        for (int c:mass){
            count = count+c;
        }
        System.out.println("Среднее арифметическое значение элементов массива: " + count/mass.length);
    }
}
