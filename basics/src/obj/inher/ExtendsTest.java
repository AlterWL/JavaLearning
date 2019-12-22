package obj.inher;
/**
 *  关于java中的继承：
 *      - 继承是面向对象三大特征之一（封装、继承、多态）；
 *      - 继承的“基本”作用是：复用代码。但其最“重要”的作用是：有了继承才有了以后的“方法覆盖”和“多态机制”；
 *      - 继承语法格式：
 *          [修饰符列表] class 类名 extends 父类名 {
 *              类体（属性+方法）
 *          }
 *      - 关于继承中的一些术语：
 *          如B类继承A类，其中：
 *              A类称为 - 父类、基类、超类、superclass
 *              B类称为 - 子类、派生类、subclass
 *      - java中子类继承父类的数据有哪些？
 *          * 私有的不继承
 *          * 构造方法不继承
 *          * 其它数据都可以被继承
 *      - java语言中的继承只支持单继承，即一个类只能继承一个类，不能同时继承很多类。C++中支持多继承；
 *      - 虽然java中只支持单继承，但是一个类可以间接继承其他类，例如：
 *          C extends B {
 *          }
 *          B extends A {
 *          }
 *          A extends T {
 *          }
 *          这里，C类直接继承B类，间接继承了A，T类；
 *      - java语言中，若一个类没有显式地继承任何类，该类默认继承JavaSE库中提供的java.lang.Object类。
 *        所以java中任何一个类都有Object类的特征。
 */
/**
 * ExtendsTest
 */
public class ExtendsTest {

    public static void main(String[] args) {
        
        ExtendsTest et = new ExtendsTest();
        String s = et.toString(); // 这里编译通过了，这说明ExtendsTest从Object中继承了toString方法
        System.out.println(s);

        HongKongPeople xiao = new HongKongPeople();
        xiao.infoGet();

        HongKongPeople zeng = new HongKongPeople();
        zeng.name = "小曾";
        zeng.id = "1102934x";
        zeng.infoGet();
    }
}