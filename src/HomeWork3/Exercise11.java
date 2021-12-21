package HomeWork3;
public class Exercise11 {
    public static void main(String[] args) {
        int[] mass = Exercise9.obMass();
        int min = mass[0];
        int max = mass[0];
        int indMin=0;
        int indMax=0;
        for(int i = 0;i< mass.length;i++){
            if(min> mass[i]) {
                min = mass[i];
                indMin = i;
            }
            if(max<mass[i]){
                max = mass[i];
                indMax = i;
            }
        }
        int buf = mass[indMin];
        mass[indMin] = mass[indMax];
        mass[indMax] = buf;
        for(int c:mass){
            System.out.print(c + "  ");
        }
    }
}
