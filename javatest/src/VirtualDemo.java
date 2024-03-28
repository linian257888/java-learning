public class VirtualDemo {
    public static void main(String[] args) {
        Salary s = new Salary("员工 A", "北京", 3, 3600.00);
        Employee e = new Salary("员工 B", "上海", 2, 2400.00);
        System.out.println("使用 Salary 的引用调用 mailCheck -- ");
        s.mailCheck();
        s.setSalary(10000);
        System.out.println("员工 A最新工资" + s.getSalary());
        System.out.println("\n使用 Employee 的引用调用 mailCheck--");
        e.mailCheck();

        e.setAddress("武汉");
        s.setAddress("大连");
        System.out.println("员工 A最新地址"+e.getAddress());
        System.out.println("员工 B最新地址"+s.getAddress());

    }
}




