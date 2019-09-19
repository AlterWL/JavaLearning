/* 
    "+"运算符

        1、"+"运算符在java中有两个作用：
            - 加法运算，求和
            - 字符串连接运算
        
        2、当"+"两边都是数字时，一定进行加法运算

        3、当"+"两边只要有至少一个数据是字符串时【不是字符，字符型和数字做加法运算，结果为数值】，
        一定会进行字符串连接运算，且运算结果是一个字符串类型数据。
            数字 + 数字 -> 数字
            数字 + 字符串 -> 字符串
            字符串 + 字符 -> 字符串

        4、引用数据类型 String
            String是SUN在JavaSE中提供的字符串类型，源文件为String.java
 */
public class OperatorConcat
{
    public static void main(String[] args)
    {
        int m = 20;
        int n = 30;
        System.out.println(m+"+"+n+"="+m+n);  // 输出20+30=2030
        System.out.println(m+"+"+n+"="+(m+n));  // 输出20+30=50

        String s1 = "Here's a letter ";
        char c1 = 'A';
        System.out.println(s1 + c1);  // 字符串 + 字符 -> 字符串

        String language = "java";
        // language = "C++"
        System.out.println("学习"+language+"真的十分有趣!");

        // 字符+数值，结果为数值
        int a = 12;
        char c2 = 'A';  // ascii码为65
        System.out.println(a+c2);  // 77
        // 单引号在双引号里面就不需要转义字符，此时它作为一个字符串
        System.out.println(a+"+"+"'"+c2+'\''+"="+(a+c2));  //12+'A'=77
    }
}