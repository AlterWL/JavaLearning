package operators;
/* 
    关于java中的运算符-关系运算符：
        >       大于
        >=      大于等于
        <       小于
        <=      小于等于
        ==      等于
        !=      不等于

    关系运算符的结果一定是布尔类型：true/false
    
    关系运算符的运算原理：
        比较运算符两边变量中保存的值之间的大小【变量中保存的不一定是一个字面值，可能是一个java对象的地址】
 */
public class Relat
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 10;
        System.out.println(a > b);  // false
        System.out.println(a >= b);  // true
        System.out.println(a < b);  // false
        System.out.println(a <= b);  // true
        System.out.println(a == b);  // true
        System.out.println(a != b);  // false
    }
}