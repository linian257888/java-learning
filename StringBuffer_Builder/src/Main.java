public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(20);
        sb.append("Runoob..");
        System.out.println(sb);
        sb.append("！");
        System.out.println(sb);
        sb.insert(8,"Java");
        System.out.println(sb);
        sb.delete(5,8);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.replace(1,5,"java");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.charAt(0));
        System.out.println(sb.indexOf("！"));
        System.out.println(sb.length());
        System.out.println(Integer.toString(sb.length()) + sb);
    }
}