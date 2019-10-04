/* 
    封装；
        - 封装的好处：
            * 封装复杂的处理过程，对外部提供简单的操作接口，对使用者不需要关心内部实现原理就可以直接使用【如照相机、电视机】，封装之后才形成了真正的独立体，即“对象”；
            * 封装使得适应性更强，可以在程序中重复使用；
            * 封装提高了安全性，从外部不能随意操作内部信息。
        - 封装的步骤：
            1. 属性私有化，使用private关键字进行修饰，私有化后的属性只能在本类中访问；
            2. 对外提供简单的操作入口，使得外部只能通过入口访问属性，即提供两个公开方法；set()和get()。
                * set方法命名规范：
                    public void set+属性名首字母大写(形参) {
                    }
                * get方法命名规范：
                    public 参数类型 get+属性名首字母大写() {
                    }
                注：getter和setter方法没有static关键字修饰；
                    有static关键字修饰的方法调用：类名.方法名()；
                    没有static关键字修饰的方法调用：引用.方法名()。
        
    构造方法：
        - 构造方法又称为构造函数/构造器/Constructor
        - 构造方法语法结构：
            [修饰符列表] 构造方法名(形参列表){
                构造方法体;
            }
        - 普通方法的语法结构：
            [修饰符列表] 返回值类型 方法名(形参列表){
                方法体;
            }
        - 构造方法的“返回值类型”不需要指定，并且也不能写void。一旦写上“返回值类型”，该方法就成为了普通方法。
        - 构造方法名必须和类名一致。
        - 作用和意义：
            1. 创造对象；
            2. 开辟实例变量的内存空间【初始化赋值】。
                实例变量的内存空间在构造方法执行过程当中完成开辟，并完成初始化赋值，
        - 调用方式：
            * 普通方法调用方式：【有static修饰时】类名.方法名(实参列表)，【无static修饰时类名.方法名(实参列表)
            * new 构造方法(实参列表)
        - 返回值：构造方法执行结束时自动返回值，返回值的类型是方法所在的类本身。
        - 缺省构造器：
            * 当一个类中没有定义任何构造方法时，系统默认给该类提供一个无参数的构造方法，这个构造方法被称为缺省构造器。
            * 当一个类显式地将构造方法定义出来时，那么系统将不再提供缺省构造器。
            * 因为无参数构造方法十分常用，所以建议在开发中手动为当前类定义无参数构造方法【构造方法支持重载机制】。
            
    this关键字：
        - this是一个引用，this是一个变量，变量中保存的内存地址指向自身，this变量存储在JVM堆内存中java对象内部；
        - 每个对象都有自身的this引用；
        - this可以出现在“实例方法”中，它指向正在执行这个动作的对象，即代表当前对象;
        - this在多数情况下都是可以省略不写的，但在用来区分局部变量和实例变量时不能省略；
        - this不能使用在带static关键字定义的方法当中；
        - this可以使用的地方：
            * 实例方法中，代表当前对象，格式为：this.属性 / this.方法
            * 构造方法中，通过当前的构造方法调用其他的构造方法，格式为：this(实参列表)
            【注意】this()只能出现在构造方法的第一句，即其之前不能有其他语句。
 */
// 定义一个类，是一个学生对象的模板
public class Student {
    // 属性-描述对象的状态信息
    // 属性通常采用变量的方式定义
    // 在类体中，方法体之外的变量称为“成员变量”，默认值向0看齐
    // 成员变量不能通过类直接访问，需要先创建对象，在通过对象去访问。因为在创建对象之后，变量才会被分配内存空间的。因此，这种成员变量又称为“实例变量”/“对象变量”
    // 成员变量分为实例变量【前面修饰符没有static】和静态变量【前面修饰符有static】

    // 实例变量
    String name; // 姓名
    int number; // 学号
    boolean gender; // 性别
    private int age; // 年龄，私有属性，不能从外部直接访问只能通过入口(setter和getter)
    int grade; // 年级
    Computer computer; // 学生的电脑

    // 构造方法
    /**
     * Student类的构造方法，带参数
     * 
     * @param name   - 姓名
     * @param num    - 学号
     * @param age    - 年龄
     * @param gender - 性别
     */
    public Student(String name, int num, int age, boolean gender) {
        this.name = name; // 等号前面的name是实例变量的name，等号后面的name是局部变量的name
        this.number = num;
        this.setAge(age);
        this.gender = gender;
        this.grade = 1; // 默认学生年级为1年级
    }

    /**
     * Student类的构造方法【无参数】
     * 默认学生年级为1年级
     */
    public Student() {
        /* this.name = "阿汪";
        this.number = 2019120;
        this.setAge(20);
        this.gender = true;
        this.grade = 1; */

        // System.out.println(); // 该句引起编译错误: 对this的调用必须是构造器中的第一个语句
        // 以上代码可以通过调用另一个构造方来完成，但是不能创建一个新的对象
        // new Student("阿汪", 2019120, 20, true); // 该方式创建了一个新对象
        this("阿汪", 2019120, 20, true);  // 该方式没有创建了一个新的对象，
    }
    
    public void setAge(int age) {
        if (this.age >= 0 && age < 150) // 安全过滤，年龄不能为负数，也不能过大
            this.age = age;
        else
            System.out.println("年龄有误!!");
    }
    
    public int getAge() {
        return age;
    }

    // 没有static的方法称为“实例方法”，实例方法的访问方式为：“引用.方法名(参数列表)”
    // 当一个动作/行为是依赖于对象的，那么需要定义为“实例方法”，
    // 学习动作依赖于学生，而每个学生的学习方式不同
    public void study() {
        // System.out.println(this.name+"在学习...");
        System.out.println(name+"在(da)学(ke)习(shui)..."); // this可以省略不写
    }

    // 说出学生的基本信息
    public void studentInfoGet() {
        String info = this.name;
        info += "是"+this.grade+"年级的";
        info += (this.gender?"男":"女")+"生";
        info += "，有"+this.getAge()+"岁了，";
        info += "学号是"+this.number+"。";
        
        System.out.println(info);
    }

    public void computerInfoGet() {
        String info = this.name;
        if(this.computer != null)
            info += "的电脑是"+this.computer.infoGet();
        else
            info += "没有电脑。";
        System.out.println(info);
    }

    // 该方法执行时是静态方法，通过类名调用，上下文中没有“当前对象”，自然不存在this
    // 所以在带有static的方法中不能“直接”访问实例变量和实例方法
    /* public static void doSome() {
        // name是实例变量，但是该方法不属于实例对象，而是属于类，在该方法中不存在当前对象，自然不能访问当前对象的name
        System.out.println(this.name+"is doing something..."); // 错误: 无法从静态上下文中引用非静态 变量 name
    } */
}