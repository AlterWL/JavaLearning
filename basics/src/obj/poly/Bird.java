package obj.poly;
/**
 * Bird
 * 
 * 子类；鸟类 - 继承自动物类
 */
public class Bird extends Animal {

    // 重写从父类中继承过来的方法
    public void move() {
        System.out.println("鸟在空中飞...");
    }

    public void catchWorm() {
        System.out.println("鸟在啄虫...");
    }
}
