package advance;

import obj.encap.Computer;

import java.util.ArrayList;

/**
 * ArrayListTest
 * <p>
 * 1.如果想要向ArrayList中存储基本数据类型，需要使用基本数据类型对应的“包装类”。
 * - 包装类属于引用类型，位于java.lang包下，所以使用时不用手动导入
 * - - - 基本类型  - -  对应的包装类 - - -
 * - - - byte     - -  Byte      - - -
 * - - - short    - -  Shout     - - -
 * - - - int      - -  Integer   - - - [特殊]
 * - - - float    - -  Float     - - -
 * - - - double   - -  Double    - - -
 * - - - char     - -  Character - - - [特殊]
 * - - - boolean  - -  Boolean   - - -
 * 从JDK1.5+开始，支持自动装箱、自动拆箱
 * 自动装箱；基本类型 -> 包装类型
 * 自动拆箱；基本类型 <- 包装类型
 */

public class ArrayListTest {
    public static void main(String[] args) {
        // 存储String对象
        ArrayList<String> List1 = new ArrayList<>();
        System.out.println("默认打印："+List1);

        // ArrayList<int> List2 = new ArrayList<>(); // 错误写法：泛型只能是引用类型，不能是基本类型
        ArrayList<Integer> List2 = new ArrayList<>(); // 使用相应的包装类可以解决这个问题
        // 添加和获取都可以直接使用相应的基本数据类型
        List2.add(100); // 自动装箱
        List2.add(200);
        System.out.println("整形ArrayList: "+List2);
        int n = List2.get(1); // 自动拆箱
        System.out.println("第1号元素是："+n);

        // 存储自定义对象
        ArrayList<Computer> Comp1 = new ArrayList<>();
        Comp1.add(new Computer());
        Comp1.add(new Computer("HuaWei", "Meta", "黑", 5999));
        Comp1.add(new Computer("MacBook", "Air", "灰", 8899));
        Comp1.add(new Computer("Asus", "S15", "黄", 5999));
        Comp1.add(new Computer("RedmiBook", "14enforce", "粉", 4999));
        for (int i = 0; i < Comp1.size(); i++) {
            Computer c = Comp1.get(i);
            System.out.println(c.infoGet());
        }
    }
}
