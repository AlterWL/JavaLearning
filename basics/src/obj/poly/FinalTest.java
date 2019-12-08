package obj.poly;
/**
 * FinalTest
 * 
 * 关于java中的final关键字： - final是一个关键字，表示最终的，不可变的； - final修饰的类无法被继承； -
 * final修饰的方法无法被覆盖； - final修饰的变量一旦赋值后，不可重新赋值【不可二次赋值】； -
 * final修饰的实例变量必须手动赋值，不嫩采用系统默认值； - final修饰的引用一旦指向某个对象，就不能再指向其它对象，
 * 所以这块内存空间在整个运行期间无法被垃圾回收器回收，但是所指向对象的的内部内存是可以被修改的； -
 * final修饰的实例变量，一般和static联合使用，此时称为“常量”。
 * 
 * 尽量所有的程序都链接源码，养成看源码的好习惯。
 * 
 * 类库一般包含三个部分： - 源码【可以看源码来理解程序】， - 字节码【程序开发过程中实际使用的部分】， - 帮助文档【为开发提供帮助】。
 * 注意使用时要版本统一。
 * 
 */
public class FinalTest {

    // 实例变量有默认值 + final关键字修饰的变量一旦赋值不能再修改
    // 综合考虑，java语言最终规定实例变量使用final修饰只有，必须手动赋值，不能采用系统默认值
    // final int num; // 编译错误: 变量 name 未在默认构造器中初始化

    // 解决方法一：
    final int num = 555;
    // 解决方法二：
    final int num2;
    public FinalTest() {
        this.num2 = 999;
    }
    // 两种方法的实现原理一样，都是在创建对象时【调用构造方法】，给成员变量赋值
    
    public static void main(String[] args) {
        
        final int v1 = 123;
        // v1 = 456; // 编译错误: 无法为最终变量v1分配值

        final int v2;
        v2 = 333;
        // v2 = 666; // 错误: 可能已分配变量v2

        final Boa b1 = new Boa(); // 不能重新改变b1引用的地址，
        System.out.println(b1.getName());
        // b1 = new Boa(); // 错误: 无法为最终变量b1分配值
        b1.setName("卷卷"); // 虽然不能指向其它对象，但是所指向对象的的内部内存是可以被修改的
        System.out.println(b1.getName());

        final Boa b2;
        b2 = new Boa();

        System.out.println(Math.PI);
    }
}

// 错误: 无法从最终String进行继承
// 因为String定义中有final关键字修饰：public final class String
/* class MyString extends String {
} */

final class A {

}

// 尝试继承final类
// 编译错误: 无法从最终A进行继承
/* class B extends A {

} */

class C {
    // 定义一个final方法
    public final void m1() {
        System.out.println("This is a final method!");
    }
}

class D extends C {
    // 尝试重写父类C的方法m1
    // 编译错误: D中的m1()无法覆盖C中的m1()
    /* public void m1() {
        System.out.println("This is a normal method.");
    } */
    private int id;
}

class Math {
    // final修饰的的实例变量是不可变的，这种变量一般和static联合使用，定义“常量”
    // 定义格式如下：
    //     public static final 类型 常量名 = 值;
    // java中所有常量名字大写，每个单词之间用下划线连接
    public static final double PI = 3.1415926;
}
