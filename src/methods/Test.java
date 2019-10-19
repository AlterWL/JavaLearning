package methods;
/* 
    关于java中的方法：
        - 方法的本质是一段代码，它可以完成某个特定的功能，并且可以被重复使用。
        - 方法定义在类体中，在一个类中可以定义多个方法，没有先后顺序。
        - 方法体中不能再定义方法。
        - 方法体中代码遵守自上而下顺序执行。
    
    1、语法结构【定义】：

        [修饰符列表] 返回值类型 方法名(形式参数)
        {
            方法体;
        }

        - 修饰符列表：
            * 可选项，不是必须的
            * 目前知道的形式是：public static
        - 返回值类型：
            * 方法执行结束后大多需要返回结果，结果可能是一个具体数据，这个数据叫做返回值
            * 返回值类型指定了返回数据的类型
            * 可以指定java中的任意一种类型，包括基本数据类型和所有的引用数据类型
            * 可能方法执行结束后不会返回任何数据，这是返回值类型位置须写上关键字：void
            * 返回值类型若不是void，则方法必须返回一个具体数据，若此方法没有返回任何数据时，编译器报错
            * 函数返回值的语句为“return 值;”，返回值的类型必须和方法定义时指定的类型一致，否则编译报错
            * 返回值类型是void时，方法体中不能有“return 值;”语句，但可以写“return;”
            * 只要带有return关键字的语句执行，该语句所在的方法结束
            * 不能编写在return语句之后执行的语句，因为它们永远执行不到，编译报错
        - 方法名：
            * 合法的标识符
            * 最好见名知意
            * 最好是动词
            * 首字母要求小写，后面每个单词首字母大写
        - 形式参数列表：【简称形参】
            * 形参是局部变量
            * 形参个数可以是：0~N个
            * 多个形参之间用逗号隔开
            * 形参中起决定性作用的是形参的参数类型，形参的名字就是局部变量的名字
            * 方法在调用时，实际传给方法的真实参数称为实际参数【简称实参】
            * 实参和形参列表必须满足：数量相同，类型对应形同
        - 方法体：
            一段java语句片段，由大括号括起来，执行顺序自上而下。在当前行程序没有结束时，下一行无法被执行。
    
    2、调用：
        - 方法只在被调用时才执行，调用语法：【方法修饰符列表中有static时】
            类名.方法名(实参列表参数)
        - 方法在调用时，参数传递的是实参中保存的值，而非实参变量。

 */

public class Test
{
    public static void main(String[] args)
    {
        System.out.println("----------------方法调用----------------");
        MethodTest.method1();  // 调用方法
        method1();  // 对于同一类体中的方法，其修饰符列表中有static关键字的，调用时“类名.”可省略
        
        A.doOthers();  // 调用其他类中的方法
        // doOthers();  // 编译错误：找不到符号。默认从当前类体中找该方法，而当前类体中该方法不存在
        
        System.out.println("----------------返回值----------------");
        divide(10, 3);  // 可以不接受返回值
        
        int x = 117652343;
        int y = 48538;
        long r = divide(x, y);  // 存在自动类型转换
        System.out.println(x+"除以"+y+"的正数结果为"+r);
        
        System.out.println(x+"除以"+y+"的正数结果为"+divide(x, y));  // 可以直接输出

        System.out.println("----------------return语句----------------");
        System.out.println(retTest());
        retTest2();
    }

    // 测试调用的函数1
    public static void method1()
    {
        System.out.println("method1 executed!");
        // MethodTest.method2();  // 完整的方法
        method2();  // 省略的方式
        A.method2();  // 调用其他类的方法
        
    }
    
    // 测试调用的函数1
    public static void method2()
    {
        System.out.println("method2 executed!");
    }

    // 求两个数的整数商
    public static int divide(int i, int j)
    {
        return i/j;
    }

    // 测试return语句
    public static int retTest()
    {
        int a = 10;
        // 若只写了if而没写else，编译器无法保证return一定会执行，会编译报错：缺少返回语句
        /* if(a > 3)
            return 1;
        else
            return 0; */

        //和以上语句执行效果形同
        /* if(a > 3)
            return 1;
        return 0; */
        
        // 和以上语句执行效果形同
        return a>3 ? 1 : 0;
        
        // 在return语句之后，该语句无法执行
        // System.out.println("这句话执行不到");  // 编译错误: 无法访问的语句
    }

    public static void retTest2()
    {
        for(int i=0;i<10;i++)
        {
            if(i>5)
                // return i;  // 编译错误: 不兼容的类型: 意外的返回值。返回值类型为空，不能返回值；
                return;  // 终止所在方法
                // break;
            System.out.print(i+" ");
        }
        // 编译不会报错，因为不确定return会不会执行
        System.out.println("\nThis statement can't be reached");  // 将return改为break，该句会被执行到
    }
}


// 实际开发中，一般一个java文件中只写一个class
// 这里为了测试方法调用的性质，而多写了类A
class A
{
    public static void doOthers()
    {
        System.out.println("A's doOthers method has been invoked");
    }

    public static void method2()
    {
        System.out.println("method2 in A executed!");
    }
}
