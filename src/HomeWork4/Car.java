/**
 * Создать класс машина с полями
 * - объем бака ------------------------------------------------------------ (volume)
 * - остаток в баке -------------------------------------------------------- (residue)
 * - расход топлива на 100 км ---------------------------------------------- (consumption)
 *
 * создать методы:
 * - залить полный бак с учетом объема остатка ----------------------------- (fillTankFull)
 * - определить остаток топлива по преодолении N км ------------------------ (fuelRemaining)
 * - определить сколько надо до заправить топлива при преодолении N км ----- (refuel)
 */
package HomeWork4;

public class Car {
    private static final int volume = 129;
    private static final int residue = 55;
    private static final float consumption = 16.8f;

    public float getConsumption(){return consumption;}

    public static float fillTankFull(){
        return (float) (volume - residue);
    }

    public static float fuelRemaining(float distance){
        return (float) volume - distance * consumption/100;
    }

    public static float refuel(float remainder){
        return (float) volume - remainder;
    }
}
