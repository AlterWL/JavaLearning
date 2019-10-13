/**
 * Dog
 */
public class Dog extends Pet {

    // 默认名字叫“粉粉”
    public Dog() {
        this("奋奋");
    }
    // 给宠物狗取个名字
    public Dog(String name) {
        setName(name);
    }

    // 重写从父类中继承的move方法，狗的移动方式为小跑
    public void move() {
        System.out.println("狗在小跑...");
    }

    // 重写父类的aet方法，可以给狗吃骨头
    public void eat(String food) {
        System.out.print("(小狗)");
        super.eat(food);
    }
}