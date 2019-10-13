/**
 * PetOwner
 * 
 * 这种方式没有使用java语言的多态机制，存在的缺点是：
 * PetOwner的扩展力很差，因为只要添加一个新的宠物，PetOwner就要定义一个相应的新方法，
 * 即是说，PetOwner和Cat、Dog的关联程度很强，耦合度很高，扩展能力差。
 */
/* public class PetOwner {

    //给宠物喂食
    public void feed(String food, Cat c) {
        c.eat(food);
    }

    public void feed(String food, Dog d) {
        d.eat(food);
    }
} */

/**
 * PetOwner
 * 
 * 降低程序的耦合度【解耦合】，提高程序的扩展力【软件开发的一个重要目标】
 */
public class PetOwner {

    public void feed(String food, Animal a) {
        a.eat(food);
    }
}
