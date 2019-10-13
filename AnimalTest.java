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
 *             父类型 -> 子类型 ， 又称为强制类型转换【需要加强制类型转换符】 
 *          * 无论是向上还是向下类型转换，两种类型之间都必须要有继承关系，不然编译无法通过。
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

        /**
         * 需求；让a2对象调用catchMouse()方法。
         *  - 当调用的方法是子类中特有的，在父类中不存在，必须进行向下转型(downcasting)。
         *  -这里的catchMouse()方法是Cat子类特有的方法，a2(Animal类型)中没有catchMouse()方法，
         *  所以需要将a2强制转换成为Cat类型。
         */
        Cat c2 = (Cat) a2;
        c2.catchMouse();

        /**
         * 第二句运行异常：java.lang.ClassCastException
         *  - 编译通过：向下转型；
         *  - 运行异常原因：JVM中引用指向的真实对象是Bird对象，而Bird对象无法转换成没有继承关系的Cat对象。
         *  此种类型称为“类型转换异常”，这总是在向下转型时发生。
         * 
         *  结论：类型转换异常只在强制类型转换的时候可能发生，所以向下转型存在隐患，
         *        编译通过，但是运行出错，向上转型只有要编译通过，运行一定通过。
         */
        /* Animal a3 = new Bird();
        Cat c3 = (Cat) a3; */

        /**
         * 避免ClassCastingException的方法；
         *     instanceof
         * 
         * instanceof运算符的使用：
         *     - 语法格式：(引用 instanceof 数据类型)；
         *     - 以上语法执行结果为布尔类型(true/false)，
         *        如；(a instanceof Animal)，
         *        true -> a 所指向的对象类型为Animal，
         *        false -> a 所指向的对象类型不是Animal，；
         * 
         * java规范中要求，在进行强制类型转换之前，建议采用instanceof运算符进行判断，避免ClassCastingException发生。
         */
         Animal a3 = new Bird();
         Bird b3 = null;
         Cat c3 = null;
         if(a3 instanceof Bird) {
            b3 = (Bird) a3;
         }else if(a3 instanceof Cat) {
            c3 = (Cat) a3;
         }
         if(b3 != null) {
            b3.move();
            b3.catchWorm();
         }
         if(c3 != null) {
            c3.move();
            c3.catchMouse();
         }

         // 不能像这样编写，存在作用域问题，if条件下创建的对象是临时对象，出了作用域【大括号】就会被当做垃圾回收
         /* if(a3 instanceof Bird) {
            Bird bc = (Bird) a3;
         }else if(a3 instanceof Cat) {
            Cat bc = (Cat) a3;
         } */
         // bc.move(); // 编译错误: 找不到符号。这是作用域问题引起的
      }
}