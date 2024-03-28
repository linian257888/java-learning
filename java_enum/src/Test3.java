enum Color3
{
    RED, GREEN, BLUE;

    // 构造函数
    private Color3()
    {
        System.out.println("Constructor called for : " + this.toString());
    }

    public void colorInfo()
    {
        System.out.println("Universal Color");
    }
}

public class Test3
{
    // 输出
    public static void main(String[] args)
    {
        Color3 c1 = Color3.RED;
        System.out.println(c1);
        c1.colorInfo();
    }
}