/* 
    关于java中的运算符-逻辑运算符：
        &       逻辑与-两边为true，结果才为true
        |       逻辑或-一遍为true，结果就为true
        ！      逻辑非-取反【单目运算符】
        ^       逻辑异或-两边不同，结果才为true

        &&      短路与
        ||      短路或

    1、逻辑运算符要求其两边的算子都是布尔类型，并且其最终结果也是布尔类型。

    2、短路与/或和逻辑与/或最终的运算结果一样，只不过短路与/或存在短路现象。

    3、什么情况下出现短路现象？
        使用短路与/或才有可能出现短路现象。
        - 第一个表达式结果为true，发生短路或，结果为true；
        - 第一个表达式结果为false，会发生短路与，结果为false。

    4、什么时候使用逻辑与/或，什么时候使用短路与/或?
        短路与/或相较于逻辑与/或更高效，所以这种方式在实际开发中更常用。
        但是在某些特殊业务逻辑情况下，需要逻辑运算符两边算子都要执行到，这是就要用到逻辑与/或。
 */
public class OperatorLogic
{
    public static void main(String[] args)
    {
        // 不确定优先级，就加小括号
        System.out.println(5>3 & 5>2);  // true
        System.out.println(5>3 & 5>6);  // false
        System.out.println(5>5 | 5>6);  // false
        System.out.println(5>3 | 5>6);  // true
        System.out.println(!(5>3));  // false
        System.out.println(5>2 ^ 5>3);  // false
        System.out.println(5>2 ^ 5>6);  // false

        // 以逻辑与和短路与为例，逻辑或和短路或同理
        int i = 10;
        System.out.println(i<8 & ++i<8);  // 逻辑与，两边表达式都执行了
        System.out.println(i);  // 11，说明++i被执行了
        i = 10;
        System.out.println(i<8 && ++i<8);  // 短路与，后边表达式没必要执行
        System.out.println(i);  // 10，说明++i没有被执行，这种现象称为短路现象

    }
}