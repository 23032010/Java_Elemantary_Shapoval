package HomeWork2;

import java.util.Scanner;

public class BankSystem {
    public static void main(String[] args) {
        System.out.println("Вас приветствует банк 'Ваши деньги - наши деньги.' \n Введите сумму, которую Вы хотите у нас оставить.");

        Scanner scanner = new Scanner(System.in);
        float money = scanner.nextFloat();

        System.out.println("Мы с рабостью примем у себя Ваши (а теперь уже наши) " + money +
                " грн.\n\nА теперь выберите годовую процентную ставку:");

        float percent = scanner.nextFloat();

        System.out.println("Итак, Ваша алчность позволила пожелать " + percent +
                " % годовых.\n\nА теперь укажите количество лет, на протяжении которых Вы собираетесь 'хранить' деньги у нас:");

        int term = scanner.nextInt();
        float[] massMoney = new float[term*12];
        int years = 1;
        float summaMoney = 0;
        float sumPercent = 0;
        float yearsMoney;
        float yearsPercent;
        float monthPercent = percent/100/12;
        for(int i=1; i<massMoney.length;i++){
            massMoney[i] = money + money*monthPercent;
            sumPercent = sumPercent + money*monthPercent;
            money = massMoney[i];
            summaMoney = massMoney[i];
            if(i%12 == 0 && i!=0){
                yearsMoney = money;
                yearsPercent = sumPercent;
                System.out.println("После " + years + " года (лет) Вы можете мечтать о " + yearsMoney + " грн. Из которых " +
                        yearsPercent + "грн. это начисленные проценты");
                years++;
            }
        }
        System.out.println("И попробуете закрыть счёт на " + years + " год с общей суммой " + summaMoney + " грн.");
    }
}

