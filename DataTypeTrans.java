/* 
    关于基本数据类型之间的相互转换：转换规则

        1、八种数据类型中，除去布尔型之外，其余7中类型都可互相转换。
        
        2、小容量向大容量转换称为自动类型转换，容量大小排序为：
            byte < short < int < long < float < double
                   char
            注：
                任何浮点型不管占用多少个字节，都比整数型大。
                char类型和short类型可表示形同种类的数量，但是char可以取更大的正整数。   

        3、大容量转换成小容量称为强制类型转换。需要使用强制类型转换符。程序编译才能通过。
        但是在运行阶段可能会损失精度，所以谨慎使用。

        4、当整数型字面值没有超出byte、short、char类型的取值范围时，可以直接赋值给对应类型的变量。

        5、byte、short、char混合运算时、先各自转换成int类型再做运算。

        6、多种类型混合运算，先转换成容量最大的类型【按2中的大小】在做运算。
 */

public class DataTypeTrans
{
    public static void main(String[] args)
    {
        // byte a = 1000;  // 编译错误：1000超出了byte的范围
        byte a = 20;  // 编译通过：规则4
        // short a  =1000;  // 编译错误：变量不能重名
        short b = 1000;  // 编译通过：规则4
        int c = 1000;  // 编译通过：同类型直接赋值
        long d = c;  // 编译通过：规则2
        // int e = d;  // 编译错误：规则3，小容量->大容量
        int e = (int)d;  // 编译通过：规则3，使用强转符

        int f = 10 / 3;  // 编译通过：规则6，以最大容量类型int做运算，结果为3
        // 同理分析一下语句
        double dd = 10 / 3;  // 3.0
        System.out.println(dd);
        dd = 10.0 / 3;  // 3.3333333333333335
        System.out.println(dd);

        long g = 10;
        // int h = g / 3;  // 编译错误：long -> int
        int h = (int)g / 3;  // 编译通过：强制转换成int，因为没有超出int范围，不会有精度损失
        System.out.println(h);
        long h1 = g / 3;  // 编译通过：直接用long类型变量接收结果
        System.out.println(h1);
        // byte h3 = (byte)(int)g / 3;  // 编译错误：g被转换成了byte类型，但是3位int类型，编译期间只检查语法，不进行运算
        byte h3 = (byte)(int)(g/3);  // 编译通过：结果被转换成了byte型，且为超出范围
        byte h4 = (byte)(g/3);  // 编译通过：结果被转换成了byte型，且为超出范围
        short h5 = (short)(g/3);  // 编译通过：结果被转换成了short型，且为超出范围

        short i = 10;
        byte j = 5;
        // short k = i + j;  // 编译错误：规则5，先转换为int类，计算结果为int型，int -> short可能有精度损失
        short k = (short)(i+j);  // 编译通过：结果被转换为short型
        int k1 = i + j;  // 编译通过：类型一致

        char l = 'a';
        System.out.println(l);
        System.out.println((byte)(l));  // 结果输出为'a'的ASCII码97
        int m = l + 100;  // 编译通过：规则5，结果为197
        System.out.println(m);
    }
}
