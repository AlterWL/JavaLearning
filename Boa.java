/**
 * Boa
 * 
 * 蟒蛇类
 */
public class Boa extends Pet {

    // 默认名字叫“粉粉”
    public Boa() {
        this("婵婵");
    }
    // 给宠物狗取个名字
    public Boa(String name) {
        setName(name);
    }

    // 重写继承的move方法，蟒蛇的移动方式为
    public void move() {
        System.out.println("蟒蛇在慢慢蠕动...");
    }

    // 可以给蟒蛇吃耗子
    public void eat(String food) {
        System.out.print("(蟒蛇)");
        super.eat(food);
    }
}