/* 
    java语言中的char类型：
        转义字符：\  反斜杠在java语言中具有转义功能
        转义字符出现在特殊含义字符之前，会将其转义为普通含义的字符

        \n      换行符
        \t      制表符
        \'      普通单引号
        \"      普通双引号
        \\      普通反斜杠
        \u4e2d  unicode编码，表示汉字'中'
 */
public class DataTypeChar
{
    static char x;  // 默认赋值\u0000
    public static void main(String[] args)
    {
        // println()会自动换行
        System.out.println("Hello world!");
        
        // print()不会自动换行
        System.out.print("Hello ");
        System.out.print("world!");
        System.out.print('\n');  // '\n'是换行符，是一个字符，属于char类型数据

        System.out.print("Data");
        System.out.print('\t');  // '\t'是制表符
        System.out.println("Type");

        // 反写杠将后面的单引号转义成不具备特殊含义的普通字符单引号字符，
        // 引起左边的单引号缺少结束的单引号，编译报错：未结束的字符文字
        // System.out.println('\');

        System.out.println('\\');  // 前一个反斜杠将后一个斜杠转义成普通的反斜杠字符

        // 编译错误：空字符文字
        // System.out.println('');  // java不允许输出空字符

        // 编译错误：空字符文字
        //    错误: 未结束的字符文字
        // System.out.println(''');
        System.out.println('\'');

        System.out.println('"');  // 输出一个普通额双引号字符

        System.out.println("\"Hello world!\"");  // 输出带双引号的Hello world

        System.out.println('中');
        char n = '\u4e2d';
        System.out.println(n);  // '中'对应的Unicode编码是'4e2d'

        System.out.println("----------");
        char x1 = '\u0000';  // 
        System.out.println(x);
        System.out.println(x1);
        System.out.println("----------");
    }
}