/*
class BetterStudent has better encapsulation. It completely eliminates 
accessors (getters and setters). Accessors are dangerous in the same way 
public fields are: they provide external access to implementation details.
Example: the getAm
*/

public class BetterStudent {
    private String onoma;
    private String eponimo;
    private int am;
    
    public BetterStudent (String onoma, String eponimo, int am) {
        this.onoma = onoma;
        this.eponimo = eponimo;
        this.am = am;
    }
    
    public String toString() {
        String s = onoma + " " + eponimo + "\n" + am; 
                return s;
    }

}


class Tester {
    public static void main(String[] args) {
        
        BetterStudent student1 = new BetterStudent("Nikos", "Pappas", 1104);
        BetterStudent student2 = new BetterStudent("Maria", "Iwannou", 1105);
        BetterStudent student3 = new BetterStudent("Giwrgos", "Leventis", 1106);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
  }
}
