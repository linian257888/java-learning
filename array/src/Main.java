import java.util.Arrays;

public class Main {

    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }

    public static void main(String[] args) {
        // 数组大小
        int size = 10;
        // 定义数组
        double[] myList = new double[size];
        myList[0] = 5.6;
        myList[1] = 4.5;
        myList[2] = 3.3;
        myList[3] = 13.2;
        myList[4] = 4.0;
        myList[5] = 34.33;
        myList[6] = 34.0;
        myList[7] = 45.45;
        myList[8] = 99.993;
        myList[9] = 11123;
        // 计算所有元素的总和
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println("总和为： " + total);
        //打印所有数组元素
        for (double i : myList) {
            System.out.println(i);
        }
        //查找最大元素
        double max = myList[0];
        for (double i : myList) {
            if( i > max) {
                max = i;
            }
        }
        System.out.println("最大元素是" + max);
        System.out.println(Arrays.stream(myList).max());
        System.out.println(Arrays.stream(myList).count());
        System.out.println(Arrays.stream(myList).average());



        double[] result = new double[myList.length];

        for (int i = 0, j = result.length - 1; i < myList.length; i++, j--) {
                result[j] = myList[i];
            }
        for (double i : result) {
            System.out.println(i);
        }

    }
}

