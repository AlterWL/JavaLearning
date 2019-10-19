/**
 * ChineseTest
 * 
 * 使用static关键字定义“静态代码块”：
 *  - 语法格式：
 *      static {
 *          java语句；
 *      }
 *  - 静态代码块只在类加载时执行一次；
 *  - 静态代码块可以在一个类中编写多个，并且遵循自上而下的顺序依次执行；
 *  - 静态代码块的用途：
 *      * 这和具体需求有关，例如项目中要求在类加载时执行代码完成日志的记录，那么这段记录日志的代码就可以编写到静态代码块中，以完成日志记录；
 *      * 静态代码块是java为程序员准备的一个特殊时刻，这个特殊时刻被称为类加载时刻。若希望在此刻执行一段特殊的程序，该段程序可以直接放到静态代码块中；
 *      * 通常在静态代码块中完成预备工作，数据的准备工作，例如：初始化连接，接续XML配置文件...
 * 
 * 静态方法：
 *  - 方法描述的是动作，当所有对象执行这个动作产生的结构相同时，这个动作就不属于特定的某一个对象，可以将其提升为类级别的方法，模板级别的动作；
 *  - 静态方法无法直接访问实例变量和调用实例方法；
 *  - 大多数方法都需要定义为实例方法，因为一般一个动作方式时，都需要对象的参与；
 *  - 但是也有例外，例如“工具类”的方法就是静态方法，如add(), divide(), print()，这样调用时不用创建对象，更加方便。
 */
public class ChineseTest {

    static {
        System.out.println("ChineseTest静态代码块 --> 1");
    }
    
    public static void main(String[] args) {
        Chinese lan = new Chinese("20192345", "蓝湛");
        lan.infoGet();

        Chinese wen = new Chinese("20191766", "温宁");
        wen.infoGet();

        // 所有静态的数据都可以采用类名方法访问，也可以采用引用的方式，但是建议采用类名方式访问
        System.out.println(Chinese.country);
        System.out.println(lan.country);
        // 即使引用为空，也不会出现空指针异常，因为访问静态数据不需要对象存在
        wen = null;
        System.out.println(wen.country);
    }

    static {
        System.out.println("ChineseTest静态代码块 --> 2");
    }
}