package datatype;
/* 
    关于java中的数据类型

        1、数据类型的作用：
            程序当中有很多数据，这些数据有各自的类型，不同类型数据占用不同大小的空间。
            数据类型的作用是知道JVM在运行程序过程中，给数据分配相应大小的空间。
        
        2、java中数据类型包括：
            - 基本数据类型
            - 引用数据类型
                * 类
                * 接口
                * 数组
                ... ...
        
        3、关于基本数据类型【包括四大类八小种】
            - 整数型
                byte、short、int、long
            - 浮点型
                float、double
            - 布尔型
                boolean
            - 字符型
                char
        
        4、字符串不属于基本数据类型，属于引用数据类型；字符属于基本数据类型
            - 字符串使用双引号 "abc"
            - 字符使用单引号 'a'

        5、计算机在任何情况下只认识二进制。

        6、数据以补码形式存储子啊计算机中，最高位为符号位，0表示正，1表示负。
        
        7、八种基本数据类型各自占用空间大小和取值范围
            基本数据类型        占用空间大小        取值范围
        ------------------------------------------------------
            byte                1字节           [-128 ~ 127]
            short               2字节           [-32768 ~ 32767]
            int                 4字节           [-1247483648 ~ 1247483647]
            long                8字节
            float               4字节
            double              8字节
            boolean             1字节           [true,false]
            char                2字节           [0 ~ 65535]

            注意：short和char类型所表示的种类数相同，不过因为char只有正数，所以它能表示更大的正数。

 */
public class DataType
{
    public static void main(String[] args)
    {
        // 整数型
        byte b = 127;  // 内存空间：1字节
        short s = 456;  // 内存空间：2字节
        int i = 789;  // 内存空间：4字节
        long l = 1024;  // 内存空间：8字节

        // 浮点型
        // 问题：直接初始化为小数编译器报错：不兼容的类型: 从double转换到float可能会有损失
        // float f = 2.3;  // 内存空间：4字节
        float f = 2;  // 内存空间：4字节
        double d = 1.2234;  // 内存空间：8字节

        // 布尔型
        boolean o = true;  // 内存空间：1字节
        
        // 字符型
        char c = 'C';  // 内存空间：2字节

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(o);
        System.out.println(c);
    }
}