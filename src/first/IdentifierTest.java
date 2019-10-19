package first;
/* 
    关于java语言中的标识符

        1、什么事标识符？
            - 在java源程序中凡是程序员有权利字节命名的单词都是标识符。
            - 标识符可以表示的元素:
                * 类名
                * 方法名
                * 接口名
                * 变量名
                * 常量名
                ... ...
        
        2、标识符的命名规则：【违反规则会产生编译错误】
            - 由数字、字母、下划线'_'和美元符'$'组成，不能含有其他符号。
            - 不能以数字开头
            - 严格区分大小写
            - 关键字不能作为标识符
            - 理论上无长度限制【但是最好不要太长】
        
        3、标识符的命名规范：【不属于语法，违反规范编译不会出错，但遵守规范非常重要】
            - 最好见名知意
                public class UserService
                {
                    public static void login(String username, String password)
                    {
                        ... ...
                    }
                }
            - 遵守驼峰命名规范
                SystemService
                UserService
                ClientService
            - 类名、接口名：驼峰命名规范
            - 变量名、方法名：首字母小写，后面每个单词首字母大写
            - 常量名：全部大写
        
        4、合法与不合法的标识符：
            合法            不合法
        -----------------------------
          _123Test        123Test
          HelloWorld      HelloWorld!
          A_B_C           A_B#C
          &ABC            AB C
          class1          class
 */
public class IdentifierTest
{
    public static void main(String[] args)
    {
        
    }
}