package datatype;
/* 
    关于八种基本数据类型的默认值：
        数据类型                    默认值
        ----------------------------------
        byte, short, int, long      0
        float, double               0.0
        boolean                     false - C语言中，true是1，false是0
        char                        \u0000
    一切向0看齐

 */
public class DefaultVal
{
    // 成员变量若没有赋值，系统会默认赋值【局部变量不会】
    static byte bm;
    static int im;
    static short sm;
    static long lm;
    static float fm;
    static double dm;
    static boolean om;
    static char cm;

    public static void main(String[] args)
    {

        /* 
        变量必须先声明，再赋值，才能访问
        int i;  // 局部变量
        System.out.println(i);
        */
        System.out.println(bm);
        System.out.println(im);
        System.out.println(sm);
        System.out.println(lm);
        System.out.println(fm);
        System.out.println(dm);
        System.out.println(om);
        System.out.println(cm);
    
    }
}