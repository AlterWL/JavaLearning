/**
 * Pet
 * 
 * 宠物类，继承自动物类
 */
public class Pet extends Animal {

    private String name;

    // 默认名字就叫“宠物”
    public Pet() {
        this("宠物");
    }

    // 给宠物取个名字
    public Pet(String name) {
        setName(name);
    }
    
    // 宠物吃东西
    public void eat(String food) {
        System.out.println(name+"正在吃"+food+"...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}