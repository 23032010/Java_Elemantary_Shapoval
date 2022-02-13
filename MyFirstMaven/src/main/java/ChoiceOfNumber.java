public class ChoiceOfNumber {
    public String[][] whatNumber(String s) {

        CreateNumbers createNumbers = new CreateNumbers();

        switch (s) {
            case "0": {
                String[][] zero = createNumbers.createZero("0");
                return zero;
            }

            case "1": {
                String[][] one = createNumbers.createOne("1");
                return one;
            }

            case "2": {
                String[][] two = createNumbers.createTwo("2");
                return two;
            }

            case "3": {
                String[][] three = createNumbers.createThree("3");
                return three;
            }

            case "4": {
                String[][] four = createNumbers.createFour("4");
                return four;
            }

            case "5": {
                String[][] five = createNumbers.createFive("5");
                return five;
            }

            case "6": {
                String[][] six = createNumbers.createSix("6");
                return six;
            }

            case "7": {
                String[][] seven = createNumbers.createSeven("7");
                return seven;
            }

            case "8": {
                String[][] eight = createNumbers.createEight("8");
                return eight;
            }

            case "9": {
                String[][] nine = createNumbers.createNine("9");
                return nine;
            }

            default:
                System.out.println("Мы обнаружили ошибку");
        }
        return null;
    }
}
