
public class AbstractDemo2
{
    public static void main(String [] args)
    {
        Salary2 s = new Salary2("Mohd Mohtashim", "Ambehta, UP", 30, 11100.00);
        Employee2 e = new Salary2("John Adams", "Boston, MA", 20, 10000.00);

        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();

        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();
    }
}

