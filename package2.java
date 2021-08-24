package folder.folderl1.folderl2;

class calculator{
    public void calculato(int a, int b){
        System.out.println("your result is : "+ a+b);
    }
}

class Sccalculator{
    public void calculato(int a, int b){
        System.out.println("your result is : "+ Math.sin(a+b));
    }
}

class Hycalculator{
    public void calculato(int a, int b){
        System.out.println("your result is : "+ a+b);
        System.out.println("your result is : "+ Math.sin(a+b));
    }
}

public class package2{
    public static void main(String [] args)
    {
        System.out.println("I am main method!");
    }
}