/*Uses wrapper class Integer. 
*/

public class Calc
{   
public static void main(String args[])  {
	int operand1, operand2;
        char operator;
          
        if (args.length != 3) {
                System.out.println("Missing parameters ...");
                return;
        }
        
        operand1 = Integer.parseInt(args[0]); 
        operand2 = Integer.parseInt(args[1]);        
        operator = args[2].charAt(0);
   
       switch(operator) {
            case ('-'): 
                System.out.print(args[0] + args[2] + args[1] + "=");
                System.out.println(operand1 - operand2); 
                break;
            case ('+'):
                System.out.print(args[0] + args[2] + args[1] + "=");
                System.out.println(operand1 + operand2); 
                break;
            case ('x'):
                System.out.print(args[0] + args[2] + args[1] + "=");
                System.out.println(operand1 * operand2); 
                break;
            case ('/'):
                if (operand2==0)
                    System.out.println("Unable to execute the operation");
                else {
                    System.out.print(args[0] + args[2] + args[1] + "=");
                    System.out.println(operand1 / operand2); 
                    break;
                }
      default:
        System.out.println("Error: invalid operator!"); 
    }
  }
}