public class Overload {
    void test() {
        System.out.println("No parameters");
    }
    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b); 
    } 
    void test(double a) { 
        System.out.println("Inside test(double) a: " + a); 
    } 
}

class OverloadDemo {
    public static void main(String args[]) {
        Overload ob = new Overload (); 
        int i = 30; 
	ob.test(); 
	ob.test(20, 40); 
	ob.test(i);
	ob.test(13.5); 
    }    
}
