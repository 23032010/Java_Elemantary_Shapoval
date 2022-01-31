/**
 * Класс в который заносятся данные списка.
 */

package HomeWork9;

public class Link {
    public String iData;
    public Link next;

    public Link(String id){
        iData = id;
        next = null;
    }

    public void print(){
        System.out.println("{ " + iData + " }");
    }

    public Link(){
    }
}
