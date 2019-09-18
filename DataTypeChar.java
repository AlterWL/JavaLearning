/* 
    java语言中的char类型：

        1、计算机如何表示现实世界中的文字？
            八种基本数据类型中，前7种底层都是数字，十进制和二进制之间存在固定的转换关系，计算机在表示时比较容易。
            唯独char类型需要表示现实世界中的文字，而二进制和文字之间默认情况下不存在任何转换关系。
            为使这种表示能够实现，需要人为制定好“文字”和“二进制”之间的对照转换关系，这种对照关系称为：字符编码。

        2、计算机最初只支持英文
            ASCII码，采用一个字节编码，其中；
            'a' -> 97 [01100001]
            'A' -> 65
            '0' -> 48
            由字符到二进制的过程为解码，反过来为编码。编码和解码采用同一套字典/对照表，就可准确无误。
        
        3、后来出现了支持西欧语言的编码方式
            ISO-8859-1，又叫latin-1，由ISO【国际标准化组织】制定，向上兼容ASCII码
        
        4、随着计算机向亚洲发展，出现了支持中文、日文、韩文的编码方式
            GB2312 < GBK < GB18030 它们支持简体中文，越大支持的简体中文书越多
            big5【大五码】，支持繁体中文
        
        5、后来出现了一种统一全球所有文字的编码方式
            unicode编码方式，它有多种实现：
            - UTF-8
            - UTF-16
            - UTF-32
            ... ...
            实际开发者，采用UTF-8编码方式较多。
        
        6、java语言采用的编码方式：
            java语言源代码采用unicode编码方式，所以“标识符”可以是中文。
        

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