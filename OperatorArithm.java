/* 
    关于java中的运算符-算术运算符：
        +   和
        -   差
        *   积
        /   商
        %   余【取模】

        ++  自加
        --  自减

    注意：
        一个表达式中有多个运算符，运算符有优先级，加上小括号优先级得到提升。
        所以没必要专门记忆运算符的优先级。
 */
public class OperatorArithm
{
    public static void main(String[] args)
    {
        int i = 10;
        int j = 3;
        System.out.println(i + j);  // 13
        System.out.println(i - j);  // 7
        System.out.println(i * j);  // 30
        System.out.println(i / j);  // 3
        System.out.println(i % j);  // 1

        // 以++为例，--同理【单目运算符】
        // ++运算符可出现在变量后，也可出现在变量前，都会使变量自加1
        int k = 100;
        k ++;
        System.out.println(k);
        ++ k;
        System.out.println(k);

        int a = 1000;
        // ++ 出现在变量后，先赋值再自加
        int b = a ++;
        System.out.println(a);  // 1001
        System.out.println(b);  // 1000
        // ++ 出现在变量前，先自加再赋值
        b = ++ a;
        System.out.println(a);
        System.out.println(b);

        // 同理
        int m = 50;
        System.out.println(m ++);  // 50
        System.out.println(m);  // 51
        System.out.println(++ m);  //52
        System.out.println(m);  // 52

        System.out.println("--------------");
        System.out.println(--m);  // 51
        System.out.println(m++);  // 51
        System.out.println(m--);  // 52
        System.out.println(m--);  // 51
        System.out.println(m++);  // 50
        System.out.println(m);  // 51
    }
}
