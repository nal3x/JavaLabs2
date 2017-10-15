public class Student {
    private String onoma;
    private String eponimo;
    private int am;
    
    public void setOnoma(String onoma)
    {
    this.onoma= onoma;
    }
    
    public void setEponimo(String surname)
    {
    eponimo=surname;
    }

    public void setAm(int num)
    {
    am=num;
    }
 
    public String getOnoma()
    {
    return onoma;
    }

    public String getEponimo()
    {
    return eponimo;
    }

    public int getAm()
    {
    return am;
    }

public void printStudent()
    {
    System.out.println(onoma + " " + eponimo + " " + am);
    }
}


class Main {
    public static void main(String[] args) {
        Student std1=new Student();
        Student std2=new Student();
        Student std3=new Student();

        std1.setEponimo("Pappas");
        std1.setOnoma("Nikos");
        std1.setAm(1104);

        std2.setEponimo("Iwannou");
        std2.setOnoma("Maria");
        std2.setAm(1105);

        std3.setEponimo("Leventis");
        std3.setOnoma("Giwrgos");
        std3.setAm(1106);

        std1.printStudent();
        std2.printStudent();
        std3.printStudent();
  }
}
