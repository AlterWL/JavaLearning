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