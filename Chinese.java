/**
 * Chinese
 * 
 * 成员变量为实例变量的情况：不同对象的该属性具有不同的值；
 * 成员变量为静态变量的情况：所有对象的该属性值一致。
 * 
 * 关于java中的static关键字：
 *  - static修饰的方法称为静态方法，static修饰的变量称为静态变量；
 *  - 所有static修饰的元素都称为静态的，都可以使用“类名.”的方式访问，也可以使用“引用.”的方式，但不建议这样；
 *  - static修饰的所有元素都是类级别的特征或行为，与具体对象无关，
 * 
 * 实例语句块/代码块【使用得很少】
 *  - 实例代码块可以编写多个，同样遵循自上而下的执行原则；
 *  - 实例代码块在构造方法执行之前执行，构造方法执行一次【即创建一个实例】，实例代码块对应执行一次；
 *  - 实例代码块也是java语言为程序员准备的一个特殊时机，称为“对象初始化时机”。
 */
public class Chinese {
    
    // 实例代码块1
    {
        System.out.println("Chinese实例代码块 -- > 1");
    }
        
    String id; // 身份证号
    String name; // 姓名
    
    // 所有对象的国籍一样，这个特征属于类级别的特征
    // 静态变量在类加载的时候初始化，不需要创建对象内存就被开辟了，存储在方法区内存中
    // 这样不用每次创建实例时都为该属性开辟空间，更节省内存开销
    static String country = "中国"; // 国籍

    // 构造方法
    public Chinese() {
    }
    
    public Chinese(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public void infoGet() {
        String info = this.name;
        info += "是"+Chinese.country+"人，";
        info += "身份证号是"+this.id+"。";
        System.out.println(info);
    }

    // 实例代码块2
    {
        System.out.println("Chinese实例代码块 -- > 2");
    }
}