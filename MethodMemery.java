/* 
    方法在执行过程中，JVM中的内存是如何分配的，内存是如何变化的？

        1、方法只定义不调用，是不会执行的，并且在JVM中不会给该方法分配“运行所属”的内存空间。只有在调用这个方法的时候，才会动态地给这个方法分配所属空间。

        2、在JVM内存划分上有三块主要的内存空间（当然除了这三块之外还有其他空间）
            - 方法区内存
            - 堆内存
            - 栈内存
        
        3、方法代码片段存在哪里，方法执行过程的内存在哪里分配？
            - 方法片段属于.claas字节码文件的一部分，字节码文件在类加载时，将其放到了方法区中。所以，JVM中的三块主要内存空间中最先有数据的是方法区内存，其中存放了代码片段。
            - 代码片段虽然在方法区内存中只有一份，但是可以被重复使用。每次调用都需要给该方法分配独立的活动场所，在栈内存中分配空间。【栈内存中分配方法运行的所属内存空间】
            - 方法在调用时，会在栈内存中分配独立的内存空间，此时发生压栈动作；方法执行结束后，给该方法分配的内存空间会全部释放，此时发生弹栈动作。
            - 局部变量在方法体中声明，运行阶段其内存在栈中分配，
 */

/* 
以下程序运行结果为：
main begins...
m1 begins...
m2 begins...
m3 begins...
m3 ends.
m2 ends.
m1 ends.
main ends.
这体现了压栈和出战的过程。
  */
public class MethodMemery
{
    public static void main(String[] args)
    {
        System.out.println("main begins...");
        m1();
        System.out.println("main ends.");
    }
    
    public static void m1()
    {
        System.out.println("m1 begins...");
        m2();
        System.out.println("m1 ends.");
    }

    public static void m2()
    {
        System.out.println("m2 begins...");
        m3();
        System.out.println("m2 ends.");
    }

    public static void m3()
    {
        System.out.println("m3 begins...");
        System.out.println("m3 ends.");
    }
}
