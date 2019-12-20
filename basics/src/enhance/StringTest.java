package enhance;

import java.util.Scanner;

/**
 * StringTest
 * 字符串测试程序
 */

public class StringTest {
    public static void main(String[] args) {
        System.out.println("----------- 字符串创建方法 -----------");
        createMethods(); // 字符串的创建方法

        System.out.println("------------ 字符串常量池 ------------");
        constantPool(); // 字符串常量池的测试

        System.out.println("----------- 字符串方法测试 -----------");
        stringMethodsTest(); // 字符串方法测试

        System.out.print("输入一个字符串，我会返回字符类型统计：");
        String str = new Scanner(System.in).next();
        charTypeCount(str);
    }

    // 字符串的创建方法
    public static void createMethods() {
        /**
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
         */
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
        /**
         * 4. 字符串常量池；双引号直接写的字符串在“常量池”中，new创建的字符串不在池中。
         */
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

    // 字符串方法测试
    public static void stringMethodsTest() {
        /**
         * 5. ==进行对象的地址比较，字符串的内容比较可以使用两种方法
         * - public boolean equals(Object obj); // 参数可以是任何对象，但只有是字符串并且内容相同才返回true，否则返回false
         * - - 注意；
         * - - * 任何对象对能用equals接收；
         * - - * equals 具有对称性，即是说，a.equals(b)和b.equals(a)效果一样；
         * - - * 如果比较双方一个是常量，一个是变量，推荐使用常量的equals方法。
         * - - - 原因；变量可能是null，会出现空指针异常-NullPointerException
         * - public boolean equalsIgnoreCase(Object obj); // 忽略大小写的内容比较
         */
        String str0 = "Lemon";
        String str1 = "Lemon";
        char[] charArray = {'L', 'e', 'm', 'o', 'n'};
        String str2 = new String(charArray);

        System.out.println("str0 is str1? " + str0.equals(str1));
        System.out.println("str1 is str2? " + str1.equals(str2));
        System.out.println("\"Lemon\" is str2? " + "Lemon".equals(str2)); // 推荐
        System.out.println("str2 is \"Lemon\"? " + str2.equals("Lemon")); // 不推荐，可能出现空指针异常，如下

//        String nullStr = null;
//        System.out.println(nullStr.equals("Lemon")); // java.lang.NullPointerException

        String strA = "society";
        String strB = "Society";
        System.out.println("strA is strB? " + strA.equals(strB)); // 严格一致才返回true
        System.out.println("strA is strB? " + strA.equalsIgnoreCase(strB)); // 不区英文分大小写

        System.out.println("strB有多长？" + strB.length()); // 获取字符串长度

        // 拼接字符串
        strB = "science"; // 字符串一旦创建，不能改变内容，但可以重新赋值，此时地址改变，指向另一个对象
        String strC = strA.concat(strB);
        System.out.println("strA： " + strA); // 原字符串不变
        System.out.println("strB： " + strB); // 原字符串不变
        System.out.println("拼接字符串stcC：" + strC); // 新字符串

        // 字符/字符串查找
        String strD = "IntelliJ IDEA";
        System.out.println("strD中索引1位置的字符为：" + strD.charAt(1));
        System.out.println("\"lli\"在strC中何处? " + strD.indexOf("lli")); // 查找参数字符串在本字符串中首次出现的位置，不存在返回-1

        // 字符串截取
        String strE = "we met in the county down.";
        System.out.println("截取字符串strE到结尾：" + strE.substring(14)); // [14, strE.length)
        System.out.println("从strE中截取字符串：" + strE.substring(14, 20)); // [14, 20)

        // 字符串的转换相关方法
        char[] chars = "mystery".toCharArray(); // 字符串转换成字符数组
        System.out.println("chars中第3个字符：" + chars[3]);
        System.out.println("chars的长度：" + chars.length);

        byte[] bytes = "present".getBytes(); // 字符串转换成字节数组
        System.out.println("bytes中第0个字符：" + bytes[0]);

        String strF = "No shadow behind the charm.";
        String strRp = strF.replace("the", "your");
        System.out.println("原字符串：" + strF);
        System.out.println("替代后的字符串：" + strRp);

        // 字符串分割
        String strG = "If you can meet with triumph and disaster";
        String[] strArray = strG.split(" "); // 参数为正则表达式(Regular expression)
        System.out.print("strG中的单词：");
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i] + ", ");
        }
        System.out.println();
    }

    // 统计所给字符串中各种字符类型的个数
    public static void charTypeCount(String str) {
        int countAlpha = 0;
        int countNum = 0;
        int countOthers = 0;

        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (c >= 'A' && c <= 'z') {
                countAlpha++;
            } else if (c >= '0' && c <= '9') {
                countNum++;
            } else {
                countOthers++;
            }
        }
        System.out.printf("字母有%d个，数字有%d个，其他字符有%d个。", countAlpha, countNum, countOthers);
    }
}
