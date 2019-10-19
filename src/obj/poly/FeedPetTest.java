package obj.poly;
/**
 * FeedPetTest
 * 
 *  多态的作用：
 *      - 降低程序的耦合度，提高程序的扩展能力，
 *  能使用多态尽量使用多态，父类型引用指向子类型对象。
 * 
 * 核心：面向对象编程，尽量不要面向具体编程。
 */
public class FeedPetTest {

    public static void main(String[] args) {
        PetOwner james = new PetOwner(); // 创建主人对象
        Cat tom = new Cat(); // 创建猫对象
        james.feed("鱼", tom); // 主人喂猫

        Dog bend = new Dog(); // 创建小狗对象
        james.feed("骨头", bend); // 主人喂狗

        Boa aya = new Boa(); // 创建小狗对象
        james.feed("耗子", aya); // 主人喂狗
    }
}