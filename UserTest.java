/**
 * 参数传递问题： 参数传递实际是传递的参数地址中所存的内容，这个内容可以是字面值，也可以是对象的地址 
 *  1、传递字面值 
 *      接收的参数(等号左边)的值被修改，不会影响传递的参数(等号右边)的值，放过来也是一样的。
 *  2、传递对象地址 
 *      由于传递的是对象地址，所以两个参数保存的内容指向同一对象地址，两方的操作指向同一片空间
 */

public class UserTest {
    public static void main(String[] args) {
        System.out.println("---------- 传递字面值 ----------");
        int i = 10;
        add(i); // 传递i中的字面值10
        System.out.println("value of i in main() is " + i); // 10

        System.out.println("--------- 传递对象地址 ---------");
        User u = new User("Tomas", 56);
        System.out.println(u.name+"'s age before add() is "+u.age); // 10
        add(u); // 传递i中的字面值10
        System.out.println(u.name+"'s age after add() is "+u.age); // 10
    }

    public static void add(int i) {
        i++;
        System.out.println("value of i in add() is " + i); // 11
    }

    public static void add(User u) {
        u.age ++;
        System.out.println(u.name+"'s age within add() is "+u.age);
    }
}

/**
 * User类:
 * 属性：name-姓名，age-年龄
 * 构造方法：User(String n, int a)
 */
class User {
    String name;
    int age;
    
    public User(String n, int a) {
        name = n;
        age = a;
    }
}
