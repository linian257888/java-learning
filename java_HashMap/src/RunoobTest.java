import java.util.HashMap;
public class RunoobTest {
    public static void main(String[] args) {
        // 创建 HashMap 对象 Sites
        HashMap<Integer, String> Sites = new HashMap<Integer, String>();
        // 添加键值对
        Sites.put(1, "Google");
        Sites.put(2, "Runoob");
        Sites.put(3, "Taobao");
        Sites.put(4, "Zhihu");
        System.out.println(Sites);

        for (Integer i : Sites.keySet()) {
            System.out.println("key: " + i + " value: " + Sites.get(i));
        }
        // 返回所有 value 值
        for(String value: Sites.values()) {
            // 输出每一个value
            System.out.print(value + ", ");
        }
        HashMap<Integer, String> sites2 = new HashMap<>();
        sites2.putAll(Sites);
        System.out.println("\nsites2 HashMap: " + sites2);

        Sites.remove(4);
        System.out.println(Sites);
        System.out.println(Sites.get(2));
        System.out.println(Sites.size());
        Sites.clear();
        System.out.println(Sites);
    }
}

//https://m.runoob.com/java/java-hashmap.html