package datatype.array;

/**
 * Access
 * <p>
 * 1、直接打印数组名称，得到的是其内存地址的哈希值。
 * 2、访问数组元素的格式；name[index]。
 * - name -> 数组名，
 * - index -> 元素索引值(int型，0~len-1)。
 * 3、使用动态初始化时，数组元素的默认值为对应数据类型的默认值，class类型默认值为null。
 * 4、静态初始化也有给默认值的过程，不过系统柜立刻将默认值替换为大括号中给定的值。
 * 5、两个数组变量引用堆内存中同一块空间，对任一个数组做修改，都会在另外数组上产生同样的效果。
 * 6、常见异常
 * - java.lang.ArrayIndexOutOfBoundsException -> 索引越界异常
 * - java.lang.NullPointerException -> 空指针异常
 */

public class Access {
    public static void main(String[] args) {
        int[] arr1 = {12, 13, 77}; // 静态初始化(省略格式)
        System.out.println(arr1); // 内存地址哈希值，如[I@10f87f48
        // 直接打印数组元素
        System.out.println("---------- arr1元素值 --------");
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        // 将数组中的值赋值给变量
        System.out.println("---- 将arr1元素值赋给变量 ------");
        int num = arr1[0];
        System.out.printf("num: %d\n", num);

        char[] arr2 = new char[3]; // 动态初始化
        System.out.println("-------- arr2元素默认值 -------");
        System.out.println(arr2[0]);  // '\u0000'
        System.out.println(arr2[1]);  // '\u0000'
        System.out.println(arr2[2]);  // '\u0000'
        // 给数组元素赋值
        System.out.println("------- 给arr2中元素赋值 -------");
        arr2[0] = 'G';
        arr2[1] = 192;
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);

        char[] arr3 = arr2; // 将arr1的地址值赋给了arr3，即两个变量指向堆内存中同一个地址
        System.out.println("---- 引用同一个地址的两个数组 ----");
        System.out.println(arr3[0]);  // 'G'
        System.out.println(arr3[1]);  // 192对应的字符
        arr3[2] = '@'; // 修改arr3的元素值
        System.out.println(arr2[2]);  // arr2的元素值同样会被修改，因为是同一块空间

        // 常见异常
        // System.out.println(arr3[3]); // java.lang.ArrayIndexOutOfBoundsException 索引越界异常
//        int[] arrNull = null;
//        System.out.println(arrNull[1]); // java.lang.NullPointerException
    }
}
