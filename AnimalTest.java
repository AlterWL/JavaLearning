/**
 * AnimalTest
 * 
 *  关于java中的多态语法机制：
 *      - Animal、Bird、Cat三个类之间的关系：
 *          * Bird继承自Animal，
 *          * Cat继承自Animal，
 *          * Bird和Cat之间没有任何继承关系；
 *      - 关于多态种涉及到的概念：
 *          * 向上转型(upcasting)：
 *              子类型 -> 父类型 ，又称为自动类型转换
 *          * 向下转型(downcasting)：
 *              父类型 -> 子类型 ， 又称为强制类型转换
 *          * 
 */
public class AnimalTest {

     public static void main(String[] args) {

        // 之前的写法
        Animal a1 = new Animal();
        a1.move();
        Bird b1 = new Bird();
        b1.move();
        Cat c1 = new Cat();
        c1.move();

        // 使用多态语法机制
        /**
         * 1、Animal和Cat之间存在继承关系，Animal是父类，Cat是子类；
         * 2、Cat is an Animal【合理地】；
         * 3、new Cat()创建的是Cat对象，a2引用的是Animal的数据类型，可见它们之间进行了类型转换
         * 子类转换为父类，向上类型转型(upcasting)，自动类型转换；
         * 4、java中允许这种语法，即父类引用指向子类对象。
         */
        Animal a2 = new Cat();
        /**
         * 1、java程序分一直都为编译阶段和运行阶段；
         * 2、先分析编译阶段，再分析运行阶段，编译无法通过，根本是无法运行的；
         * 3、编译阶段编译器检查a2这个引用数据类型为Animal，由于Animal.class字节码中有move()方法，所以编译通过了。
         * 这个过程称为静态绑定，编译阶段绑定，只有静态绑定成功之后才有后续的运行；
         * 4、在程序运行阶段，JVM堆内存中真实创建的对象是Cat对象，那么一下语句在运行阶段一定会调用Cat对象的move()方法。
         * 此时发生了程序的动态绑定，运行阶段绑定。
         * 5。无论Cat类有没有重写move方法，运行阶段一定调用的是Cat对象的move方法，因为底层真实的对象就是Cat对象；
         * 6、父类型引用指向子类型对象这种机制导致程序在编译阶段和运行阶段绑定两种不同的形态/状态，
         * 这种机制称为一种多态语法机制。
         */
        a2.move();
        /**
         * 以下程序不能调用，编译错误：找不到符号。
         * 原因；在编译阶段a2的类型是Animal，从Animal.class字节码文件中查找不到catchMouse方法
         *      静态绑定失败，则编译失败，更别谈运行了，
         */
        // a2.catchMouse();
     }
}