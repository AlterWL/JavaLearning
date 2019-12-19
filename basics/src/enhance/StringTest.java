package enhance;

/**
 * StringTest
 * <p>
 * 1. java.lang.String类代表字符串，API原文：
 * "All string literals in Java programs, such as "abc", are implemented as instances of this class."
 * 即是说，程序当中所有的双引号字符串都是String类对象（就算没有new也是）。
 * 2. 字符串的特点：
 * - 字符串的内容永远不变；[重点]
 * - 字符串可以共享使用 - 因为字符串不可改变；
 * - 字符串效果上可以当做char[]字符数组，底层原理是byte[]字节数组。
 * 3. 创建字符串常见的3+1中方式；
 * - 三种构造方法付：
 * - - public String(); // 创建一个空字符串，没有任何内容
 * - - public String(char[] array); // 根据字符数组的内容，创建对应的字符串
 * - - public String(byte[] array); // 根据字符数组的内容，创建对应的字符串
 * - 直接创建[常用]：String str = "hello"; // 直接写上双引号，就是字符串对象
 * 4. 字符串常量池；双引号直接写的字符串在“常量池”中，new创建的字符串不在池中。
 */

public class StringTest {
    public static void main(String[] args) {
        createMethods(); // 字符串的创建方法
        constantPool(); // 字符串常量池的测试
    }

    // 字符串的创建方法
    public static void createMethods() {
        // 使用空参构造
        String str0 = new String();
        System.out.println("str0: " + str0);

        // 由字符数组创建
        char[] charArray = {'A', 'B', 'C'};
        String str1 = new String(charArray);
        System.out.println("str1: " + str1);

        // 由字节数组创建
        byte[] byteArray = {97, 98, 99};
        String str2 = new String(byteArray);
        System.out.println("str2: " + str2);

        // 直接创建
        String str3 = "Wow! You can really dance~";
        System.out.println(str3);
    }

    // 字符串常量池的测试
    public static void constantPool() {
        // str1 和 str2 对象在常量池中，地址相同，指向同一片空间
        String str1 = "Let's dance~";
        String str2 = "Let's dance~";

        char[] charArray = {'L', 'e', 't', 's', ' ', 'd', 'a', 'n', 'c', 'e', '~'};
        String str3 = new String(charArray);
        System.out.printf("str1: %s\nstr2: %s\nstr3: %s\n", str1, str2, str3);

        System.out.println("str1==str2? " + (str1 == str2)); // 对于引用类型来说，==进行的是地址值的比较
        System.out.println("str1==str3? " + (str1 == str3));
        System.out.println("str2==str3? " + (str2 == str3));
    }
}
