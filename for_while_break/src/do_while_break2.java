public class do_while_break2 {
    public static void main(String[] args) {
        int [] numbers = {10,20,30,40,50};
        for(int x : numbers){
            if (x == 30){
//                break;
                continue;
            }
            System.out.print(x);
            System.out.print(",");
        }
        System.out.println("\n");
    }

}
