package datatype;
/* 
    关于布尔数据类型:
        boolean【1字节】

    boolean只有两个值：true/false。不像C语言中，0和1可以表示真和假。

    实际存储时，false底层是0，true底层是1。

    布尔类型在实际开发中非常重要，常用于逻辑运算和条件控制语句中。
 */

 public class BoolTest
 {
     public static void main(String[] args)
     {
        // 编译错误：不兼容的类型: int无法转换为boolean
        //  boolean flag = 1;

        boolean loginSuccess = true;
        // if语句【条件控制语句】
        if(loginSuccess)
            System.out.println("登陆成功！");
        else
            System.out.println("用户名不存在或密码错误！");
     }
 }
