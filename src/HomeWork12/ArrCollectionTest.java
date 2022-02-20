package HomeWork12;

import HomeWork8.ArrColl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArrCollectionTest {

    @Test
    void testAddValue() {
        System.out.println("-----------------------------------------------------\n" +
                "test 'add value'");
        ArrCollection adding = new ArrCollection();
        adding.add("Ivanenko");
        Assertions.assertEquals("Ivanenko", adding.get(0));
    }

    @Test
    void testAddIndexAndValue() {
        System.out.println("-----------------------------------------------------\n" +
                "test 'add value to index'");
        ArrCollection adding = new ArrCollection();
        adding.add(5,"Ivanenko");
        Assertions.assertEquals("Ivanenko", adding.get(5));
    }

    @Test
    void testDeleteValue() {
        System.out.println("-----------------------------------------------------\n" +
                "test 'delete value'");
        ArrCollection arrCollection = new ArrCollection();
        arrCollection.add("Ivanenko");
        arrCollection.add("Sydorenko");
        arrCollection.add("Petrenko");
        arrCollection.delete("Ivanenko");
        Assertions.assertEquals("Sydorenko", arrCollection.get(0));
    }

    @Test
    void testGetElement() {
        System.out.println("-----------------------------------------------------\n" +
                "test 'get element'");
        ArrCollection arrCollection = new ArrCollection();
        arrCollection.add("Петренко");
        String value = arrCollection.get(0);
        Assertions.assertEquals("Петренко", value);
    }

    @Test
    void testContainElement() {
        System.out.println("-----------------------------------------------------\n" +
                "test 'contain element'");
        ArrCollection arrCollection = new ArrCollection();
        arrCollection.add("Иваненко");
        Assertions.assertEquals(true, arrCollection.contain("Иваненко"));
    }

    @Test
    void testEqualsTwoArrays() {
        System.out.println("-----------------------------------------------------\n" +
                "test 'equals two arrays'");
        ArrCollection arrCollection = new ArrCollection();
        arrCollection.add("Иваненко");
        arrCollection.add("Пилипенко");
        arrCollection.add("Шип");

        String[] mass = new String[]{"Иваненко", "Пилипенко", "Шип"};
        Assertions.assertEquals(true, arrCollection.equals(mass));
    }

    @Test
    void testClear() {
        System.out.println("-----------------------------------------------------\n" +
                "test 'clear array'");
        ArrColl arrColl = new ArrColl();
        arrColl.add("Иваненко");
        arrColl.add("Пилипенко");
        arrColl.clear();

        Assertions.assertEquals(null, arrColl.get(0));
        Assertions.assertEquals(null, arrColl.get(1));
    }

    @Test
    void size() {
        ArrCollection arrCollection = new ArrCollection();
        arrCollection.add("Иваненко");
        arrCollection.add("Пилипенко");
        arrCollection.add("Шип");

        Assertions.assertEquals(3, arrCollection.size());
    }
}