/* 
    封装；

        对于该程序，Student类的age属性可以被外部程序随意访问，很不安全【如可能被修改为负数，而年龄不可能为负数，但是这样程序运行时并不会报错】，所以这样直接暴露类属性的程序存在缺陷。
        
        - 封装的好处：
            * 封装复杂的处理过程，对外部提供简单的操作接口，对使用者不需要关心内部实现原理就可以直接使用【如照相机、电视机】，封装之后才形成了真正的独立体，即“对象”；
            * 封装使得适应性更强，可以在程序中重复使用；
            * 封装提高了安全性，从外部不能随意操作内部信息。
        
        - 封装的步骤：
            1. 属性私有化，使用private关键字进行修饰，私有化后的属性只能在本类中访问；
            2. 对外提供简单的操作入口，使得外部只能通过入口访问属性，即提供两个公开方法；set()和get()。
                * set方法命名规范：
                    public void set+属性名首字母大写(形参){

                    }
                * get方法命名规范：
                    public 参数类型 get+属性名首字母大写(){

                    }
                注：getter和setter方法没有static关键字修饰；
                    有static关键字修饰的方法调用：类名.方法名()；
                    没有static关键字修饰的方法调用：引用.方法名()。
 */
public class Student  // 定义一个类，是一个学生对象的模板
{
    // 属性-描述对象的状态信息
    // 属性通常采用变量的方式定义
    // 在类体中，方法体之外的变量称为“成员变量”，默认值向0看齐
    // 成员变量不能通过类直接访问，需要先创建对象，在通过对象去访问。因为在创建对象之后，变量才会被分配内存空间的。因此，这种成员变量又称为“实例变量”/“对象变量”、
    // 成员变量分为实例变量前面修饰符没有static】和静态变量【前面修饰符有static】

    // 实例变量
    String name;  // 姓名
    int number;  // 学号
    boolean gender;  // 性别
    private int age;  // 年龄，私有属性，不能从外部直接访问只能通过入口(setter和getter)
    String grade;  // 年级

    Computer computer;  // 学生的电脑

    // setter
    public void setAge(int a){
        if(age >= 0 && age < 150)  // 安全过滤，年龄不能为负数，也不能过大
            age = a;
        else
            System.out.println("年龄有误!!");
    }

    // getter
    public int getAge(){
        return age;
    }
}