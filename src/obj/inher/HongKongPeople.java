package obj.inher;
/**
 * HongKongPeople
 * 
 *  关于java中的方法覆盖：
 *      - 方法覆盖有被称为方法重写（override/overwrite）。
 *      - 什么时候发生方法重写？
 *          * 当父类中的方法已经无法满足当前子类的业务需求时，
 *            子类有必要将从父类继承过来的方法进行重新编写，
 *            这个过程称为方法重写/覆盖。
 *      - 什么条件写方法会发生重写？
 *          * 方法重写发生在具有继承关系的父子类之间，
 *          * 方法重写时，返回值相同，方法名相同，参数列表相同，
 *          * 所以建议重写方法时，尽量复制粘贴，而不是手动编写，容易出错导致没有覆盖，
 *          * 方法重写时，访问权限不能更低，可以更高，
 *          * 方法重写时，抛出异常不能更多，可以更少
 *      - 注意：
 *          * 私有方法不能继承，所以不能覆盖，
 *          * 构造方法不能继承，所以不能覆盖，
 *          * 静态方法不存在覆盖，【与多态有关】
 *          * 覆盖只针对方法，不谈属性。
 */
public class HongKongPeople extends Chinese {

    public static final String NATIVEPLACE = Chinese.NATIONALITY+"香港"; // 籍贯

    public HongKongPeople() {
        super();
    }

    public void infoGet() {
        String info = this.name;
        info += "是"+HongKongPeople.NATIVEPLACE+"人 ，";
        info += "身份证号是"+this.id+"。";
        System.out.println(info);
    }
}