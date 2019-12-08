package datatype;
/* 
    关于java中的浮点型数据:

        float [单精度-4字节]
        double [双精度-8字节]
    
    double的精度太低【相对来说】，不适合做财务软件，财务涉及到钱的问题，精度要求较高。
    SUN公司在基础类库当中为程序员准备了精度更高的类型，其为一种引用数据类型，不属于基本数据类型：
    java.math.BigD1mal

    其实SUN为java程序开发提供了一套庞大的类库，java程序员是基于这套基础类库来进行开发的。
    当前版本的SE类库在源码路径在：C:\Program Files\Java\jdk-12.0.2\lib\src.zip

    java语言中，所有的浮点型字面值，默认被当做double型处理。
    要想float型处理浮点型字面值，需在其后面添加F/f。

    注意：
        浮点型数据在计算机中的二进制存储时都是近似值。因为计算机空间济源是有限的，无法精确表示无限小数值。
*/
public class DecimTest
{
    public static void main(String[] args)
    {
        // 3.0和d1都是double类型的，不存在类型转换
        double d1 = 3.0;
        System.out.println(d1);

        // 3.14是double类型的字面值，d2是float类型的变量
        // 编译错误：不兼容的类型: 从double转换到float可能会有损失
        // float d2 = 3.14;
        
        // 解决方法一：强制类型转换
        float d3 = (float)3.14;
        System.out.println(d3);

        // 解决方法二：无需类型转换
        float d4 = 6.28f;
        System.out.println(d4);
    }
}