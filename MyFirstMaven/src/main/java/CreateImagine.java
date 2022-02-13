public class CreateImagine {
    public void numbersLikeImagine(String[] s){

        int howManySymbols = s.length;
        ChoiceOfNumber choiceOfNumber = new ChoiceOfNumber();

        String[][] mass = new String[12][howManySymbols*7];

        for(int i=0;i<s.length; i++){
            String[][] buffer = choiceOfNumber.whatNumber(s[i]);

            if(i==0){
                for (int j = 0; j<12; j++) {
                    for (int k = 0; k < 7; k++){
                        mass[j][k] = buffer[j][k];
                    }
                }
            }
            else{
                for(int p=0; p<12; p++){
                    for(int n=i*7; n<7+(i*7); n++){
                        mass[p][n] = buffer[p][n-(i*7)];
                    }
                }
            }
        }

        for(int t=0; t<12; t++){
            for(int r=0; r<howManySymbols*7; r++){
                System.out.print(mass[t][r] + " ");
            }
            System.out.println("");
        }
    }
}
