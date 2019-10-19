package src.obj;

/**
 * AccessPerm
 * 
 *  访问控制全向修饰符：
 *      - 访问控制权限修饰符控制元素的访问范围；
 *      - 访问控制权限修饰符包括：
 *          public     |    公开的，任何位置都可以访问，
 *          protected  |    保护的，同包和子类可以访问，
 *          default    |    缺省的(不写时为缺省的)，同包可以访问，
 *          private    |    私有的，只在本类中可以访问，
 *      - 访问控制权限修饰符可以修饰类、方法、变量(属性)...
 *      - 当只希望某个数据被子类使用时，使用protected修饰；
 *      - 修饰符控制范围：
 *          private < default < protected < public 。
 */
public class AccessPerm {

    System.out.println("Access Control Permission...");
}