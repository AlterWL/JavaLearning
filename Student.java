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
    int age;  // 年龄
    String grade;  // 年级

    Computer computer;  // 学生的电脑

    // 方法-描述对象的动作信息
    public void study()
    {
        System.out.println("I'm studying now.");
    }
}