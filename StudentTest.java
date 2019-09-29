/* 
    类的实例化：

        - 通过一个类可以实例化N个对象。实例化对象的语法是；new 类名();

        - new 是java语言中的一个运算符，其作用是创建对象，在JVM的堆内存中开辟新的内存空间

        - 方法区内存 - 在类加载时，class字节码代码片段会被加载到给内存空间中
        - 栈内存 - 方法代码片段在执行时，JVM会给该方法分配内存空间存储“局部变量”，在栈内存中压栈。
        - 堆内存 - new所创建的对象在该内存中存储。“成员变量”中的实例变量在堆内存的java对象内部存储。
        - 最先有数据的是方法区内存，变化最频繁的是栈内存，垃圾回收主要针对栈内存。
        - 当没有引用指向内存中的一个java对象时，它就变成了垃圾，自动垃圾回收(GC)起会将其占用的内存回收。

        - java语言中，程序员不能直接操作堆内存(java中没有像C语言中的指针概念)。只能通过“引用”去访问堆内存中对象内部的实例变量。
 */

// 学生测试类
public class StudentTest
{
    // 每一个类中都可以编写主方法，但一般情况下，一个系统只有一个入口，所以主方法一般只写一个
    // 所以Student类中不需要编写主方法
    public static void main(String[] args)
    {
        Student s = new Student();  // s是new所创建的对象的引用，即保存的是在堆内存中保存的对象的地址
        
        // 访问实例变量：
        // 读取：引用.变量名;
        // 修改：引用.变量名 = 值;
        System.out.println("--------- 初始值 ---------");
        System.out.println("姓名 ->"+s.name+"\n学号 ->"+s.number+"\n年龄 ->"+s.getAge()+"\n性别 ->"+(s.gender?"男":"女"));
        s.name = "阿羡";
        s.number = 2019123;
        s.setAge(20);
        s.gender = true;
        System.out.println("--------- 修改后 ---------");
        System.out.println("姓名 ->"+s.name+"\n学号 ->"+s.number+"\n年龄 ->"+s.getAge()+"\n性别 ->"+(s.gender?"男":"女"));
        // System.out.println(Student.name);  // 编译错误: 无法从静态上下文中引用非静态 变量 name

        // s = null;
        // 空引用访问实例相关的数据，编译通过因为符合语法， 运行时发生异常
        // System.out.println(s.name);  // 运行时发生空指针异常：java.lang.NullPointerException

        System.out.println("--------- 电脑对象 ---------");
        // System.out.println(s.name+"的电脑颜色是"+s.computer.color);  // java.lang.NullPointerException
        Computer laptop = new Computer();
        laptop.brand = "ASUS";
        laptop.style = "Office";
        laptop.color = "Red";
        laptop.price = 5499;

        s.computer = laptop;
        System.out.println(s.name+"的电脑颜色是"+s.computer.color);
    }
}
