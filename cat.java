/**
 * Cat
 * 
 * 子类：猫类 - 继承自动物类
 */
public class Cat extends Pet{

    // 默认名字叫“粉粉”
    public Cat() {
        this("荣荣");
    }
    // 给宠物狗取个名字
    public Cat(String name) {
        setName(name);
    }
        
    // 重写从父类中继承过来的方法
    public void move() {
        System.out.println("猫在走猫步...");
    }

    // 不是从父类继承过来的方法，是子类对象特有的行为
    public void catchMouse() {
        System.out.println("猫在抓老鼠...");
    }

    // 可以给猫吃鱼
    public void eat(String food) {
        System.out.print("(小猫)");
        super.eat(food);
    }
}