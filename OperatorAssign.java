/* 
    赋值运算符
        - 基本赋值运算符
            =
            
        - 扩展赋值运算符
            +=
            -=
            *=
            /=
            %=

        1、赋值类运算符优先级：先执行等号右边的表达式，执行结果赋值给左边的变量。

        2、扩展类赋值运算符不改变运算结果的数据类型。不管运算结果是否超出范围，数据类型始终不变，尽管精度损失。
 */
public class OperatorAssign
{
    public static void main(String[] args)
    {
        // 基本赋值类运算符
        int a = 10;
        a = a + 5;
        System.out.println(a);  // 15

        // 扩展的赋值类运算符【+= 运算符可以翻译为“追加/累加”】
        // 这样写更简便，提高程序编写效率
        a += 5;  // a = a + 5;
        System.out.println(a);  // 20
        a -= 5;  // 看似等同于 a = a - 5;
        System.out.println(a);  // 15
        a *= 3;  // 看似等同于 a = a * 3;
        System.out.println(a);  // 45
        a /= 7;  // 看似等同于 a = a / 7;
        System.out.println(a);  // 6
        a %= 4;  // 看似等同于 a = a % 4;
        System.out.println(a);  // 2

        System.out.println("-------------");
        byte t = 10;  // 未超出byte范围，可直接赋值
        t = 20;  // 未超出byte范围，可直接赋值
        // t = t + 5;  //编译错误：不兼容的类型: 从int转换到byte可能会有损失
        t = (byte)(t + 5);  // 轻质转换，编译通过
        t += 5;  // 由此看出，"t +=5"并不等同于"t = t + 5;"而是等同于"t = (byte)(t + 5);"
        System.out.println(t);  // 30

        t += 98;  // 常识结果为128
        System.out.println(t);  // -128
        // 原因是128超出了byte范围，"t += 98;"等同于"t = (byte)(t + 5);"，强制转换结果损失了精度，为-128
        // 同理，只要结果大于了变量数据类型取值范围，扩展赋值运算符会自动强制转换，结果会损失精度
    }
}