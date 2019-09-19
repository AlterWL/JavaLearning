/* 
    三元/三目/条件运算符

        1、语法规则：
            布尔表达式 ? 表达式1 : 表达式2

        2、执行原理；
            当布尔表达式的结果为true时，将表达式1的执行结果作为整个表达式执行的结果；
            反之，如果前者为false，整体表达式结果为表达式2的结果。
 */

public class OperatorCondit
{
    public static void main(String[] args)
    {
        boolean sex = true;
        // sex ? '男' : '女';  // 编译错误: 不是语句
        char gender = sex ? '男' : '女';
        System.out.println(gender); 
        sex = false;
        gender = sex ? '男' : '女';
        System.out.println(gender);

        // 编译错误: 不兼容的类型: 条件表达式中的类型错误
        // 因为出现了String类型和char类型，表达式结果类型不确定，所以不能用char类型接收
        // 注意：编译阶段不会计算表达式结果
        // char c = sex ? "男" : '女';

        System.out.println(sex ? '男' : "女");  // 可以，println方法可以接收多种类型数据
    }
}
