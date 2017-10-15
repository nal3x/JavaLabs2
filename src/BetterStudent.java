/*
class BetterStudent has better encapsulation. It completely eliminates 
accessors (getters and setters). Accessors are dangerous in the same way 
public fields are: they provide external access to implementation details.
Suppose we had a getAm method which returns an int and at one point we change 
it to return a long. A programmer who used our class has to change every line 
of code where am was assigned to an integer value. Notice that instead of 
getters we simply return a string represantation of our object via toString 
method which overrides Object's method (more on that later...)
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
