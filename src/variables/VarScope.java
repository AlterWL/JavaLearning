package variables;
/* 
    关于java中的变量

        变量的作用域
        
        1、什么是变量的作用域》
            变量的作用域描述的是变量的有效范围，在该范围内变量可以被访问到，出了该范围就无法访问该变量。
        
        2、记住一句话：
            出了大括号就不认识了。
 */
public class VarScope
{
    static int k = 234;  // 成员变量
    // System.out.println(k);  // 类体中不能直接编写java语句【除声名变量之外】

    // 主方法：入口
    public static void main(String[] args)
    {
        // 局部变量
        // int i = 3;
        // 就近原则
        System.out.println(i);

        doSome();
    }

    // 成员变量
    static int i = 456;  // 只有定义为静态变量，才能被main函数访问到
    // int i = 456;

    public static void doSome()
    {
        int i = 90;
        System.out.println(i);

        System.out.println(k);
    }
}