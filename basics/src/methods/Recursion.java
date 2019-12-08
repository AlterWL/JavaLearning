package methods;
/* 
    方法的递归调用：

        1、方法自身调用自身称为方法的递归。

        2、递归是很耗费栈内存的，可以不用时尽量不用。

        3、递归必须有结束条件，否则运行时会发生栈内存溢出错误。

        4、即使有正确的结束条件，也可能会发生栈内存溢出，此时是因为栈太深了。

 */

public class Recursion
{
    public static void main(String[] args)
    {
        int n = 10;
        System.out.println(sum(n));
        System.out.println(sum1(n));
    }

    // 使用递归计算1~n的整数和
    public static int sum(int n)
    {
        if(n == 1)
        return 1;
        return n + sum(n-1);
    }
    
    // 不使用递归计算1~n的整数和
    public static int sum1(int n)
    {
        int sumValue=0;
        for(int i=1;i<=n;i++)
        {
            sumValue += i;
        }
        return sumValue;
    }
}
