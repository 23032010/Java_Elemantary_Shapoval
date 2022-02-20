import java.util.Scanner;

public class MySSP {
    public static void main(String[] args) {
        System.out.println("Please enter the name of the first player:");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        System.out.println("Please enter the name of the second player:");
        String b = scanner.nextLine();
        boolean s = true;
        while(s==true){
            CreateMatrix createMatrix = new CreateMatrix();
            String choice = createMatrix.whoIsWinner(a, b);

            if(choice.equals("X")){
                System.out.println("There is no winner. Try again.\n");
            }
            else if(choice.equals("P1")){
                System.out.println(a + " is the WINNER!!! Congratulations!!!\n");
            }
            else{
                System.out.println(b + " is the WINNER!!! Congratulations!!!\n");
            }

            String yesNo;
            do {
                System.out.println("-----------------------------------------------------------------");
                System.out.println("Do you want to try more? (Y / N)");
                yesNo = scanner.nextLine();
                if (yesNo.equalsIgnoreCase("Y")) {
                    s = true;
                } else if (yesNo.equalsIgnoreCase("N")) {
                    s = false;
                    break;
                } else {
                    System.out.println("You make the wrong choice.");
                }
            }while(!yesNo.equalsIgnoreCase("Y"));
        }
    }
}
