package HomeWork2;

public class Average2Numbers {
    public static void main(String[] args) {
        float average = 0;
        System.out.print("Среднее арифметическое чисел " + args[0] + " и " + args[1] + " равно: ");
        for(String str:args){
            int i = Integer.valueOf(str);
            average = average+i;
        }
        System.out.println(average/2);
    }
}

