/**
 * Cat
 * 
 * 子类：猫类 - 继承自动物类
 */
public class Cat extends Animal{

        
    // 重写从父类中继承过来的方法
    public void move() {
        System.out.println("猫在走猫步...");
    }

    // 不是从父类继承过来的方法，是子类对象特有的行为
    public void catchMouse() {
        System.out.println("猫在抓老鼠...");
    }

    public void eat(String food) {
        System.out.println("猫正在吃"+food+"...");
    }
}