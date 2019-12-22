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
 *          * 方法重写时，方法名相同，参数列表相同，返回值必须【小于等于】父类的返回值范围
 *          * 所以建议重写方法时，尽量复制粘贴，而不是手动编写，容易出错导致没有覆盖，
 *          * 方法重写时，访问权限不能更低，可以更高，
 *          * 方法重写时，抛出异常不能更多，可以更少
 *      - 注意：
 *          * 私有方法不能继承，所以不能覆盖，
 *          * 构造方法不能继承，所以不能覆盖，
 *          * 静态方法不存在覆盖，【与多态有关】
 *          * 覆盖只针对方法，不谈属性。
 *      - @Override写在方法名前面，用来检测是不是有效的方法覆盖 - 该注解(annotation)并非强制要求
 */
public class HongKongPeople extends Chinese {

    public static final String NATIVEPLACE = Chinese.NATIONALITY+"香港"; // 籍贯

    // 只有子类构造方法，才能调用父类的构造方法
    public HongKongPeople() {
//        super父类构造方法调用必须是子类的第一个语句，且只能调用一次，不写则默认调用，写了则用写的
//        super(); // 子类构造方法中有一个默认隐含的super()调用，所以父类构造一定先与子类构造方法执行
//        super("20190023hk", "世光"); // 子类构造方法可以通过super调用父类重载构造
        this.id = this.id + "hk";
    }

    @Override
    public void infoGet() {
        System.out.println(super.info(HongKongPeople.NATIVEPLACE));
//        System.out.println(info(HongKongPeople.NATIVEPLACE)); // 可以直接调用info，因为已被继承
    }
}