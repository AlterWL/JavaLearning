/* 
    关于java中的控制语句
        - 选择结构
            * if、if...else
            * switch
        - 循环结构
            * for
            * while
            * do...while()
        - 循环开工至语句
            * break
            * continue

        注意：所有控制语句均可嵌套使用。嵌套使用时，要保证代码格式整洁【使用缩进，一般大括号中的内容需要整体缩进】。

    1、if语句
        - 又称为条件控制语句或分支语句。有四种编写方式：
            第一种：
                if(布尔表达式)
                {
                    java语句;
                    ... ...
                }
            第二种：
                if(布尔表达式)
                {
                    java语句;
                    ... ...
                }
                else
                {
                    java语句;
                    ... ...
                }
            第三种：
                if(布尔表达式)
                {
                    java语句;
                    ... ...
                }
                else if(布尔表达式)
                {
                    java语句;
                    ... ...
                }
                ... ...
            第四种：
                if(布尔表达式)
                {
                    java语句;
                    ... ...
                }
                else if(布尔表达式)
                {
                    java语句;
                    ... ...
                }
                ... ...
                else
                {
                    java语句;
                    ... ...
                }
        - 重点：只要一个分支被执行，整个if结构全部结束。
        - 以上四种方式中，第二种和第四种方式一定会有分支被执行。
        - if语句分支结构中只有一条java语句，可以省略大括号。不推荐这样用，但要能看懂。
 */

/* 
    根据剩余时间【分钟】，决定去上课的速度
    负数时间，已迟到
    若教室在第5教学楼：
        (0,8] min，冲刺吧
        (8,15] min，跑起来
        (15,25] min，慢慢走
        大于25分钟，还早
    若教室在第8教学楼：
        (0,10] min，冲刺吧
        (10,20] min，跑起来
        (20,30] min，慢慢走
        大于30分钟，还早
*/

public class StatementIf
{
    public static void main(String[] args)
    {

        // 以下为从键盘接收输入的代码语句
        // 第一步：创建键盘扫描对象
        java.util.Scanner s = new java.util.Scanner(System.in);
        // 第二步；调用Scanner对象的next()方法等待接收用户键盘输入
        // String classRoom = s.next();  // 接收的是文本【以字符串形式接收】
        System.out.print("教室在哪栋教学楼（5/8）？");
        int classRoom = s.nextInt();  // 接收数字【以int形式接收】
        
        int minutesLeft = -1;
        String attendClass = "已迟到，别挣扎了！";  // 默认对应attendClass为负数的情况
        if(classRoom == 8)
        {
            System.out.print("离上课还有多少分钟？");  // 输出提示语句
            minutesLeft = s.nextInt();  // 接收数字【以int形式接收】
            if(minutesLeft >= 30){
                attendClass = "还早呢，先预习预习！";
            }else if(minutesLeft >= 20){
                attendClass = "时间还够，慢慢走去上课。";
            }else if(minutesLeft >= 10){
                attendClass = "时间有点紧，赶快跑起来！";
            }else if(minutesLeft >= 0){
                attendClass = "啊啊啊冲鸭！";
            }
        }else if(classRoom == 5){
            System.out.print("离上课还有多少分钟？");  // 输出提示语句
            minutesLeft = s.nextInt();  // 接收数字【以int形式接收】
            if(minutesLeft >= 25){
                attendClass = "还早呢，先预习预习！";
            }else if(minutesLeft >= 15){
                attendClass = "时间还够，慢慢走去上课。";
            }else if(minutesLeft >= 8){
                attendClass = "时间有点紧，赶快跑起来！";
            }else if(minutesLeft >= 0){
                attendClass = "啊啊啊冲鸭！";
            }
        }else{
            attendClass = "您没睡醒吧！";
        }
        System.out.println(attendClass);
    }
}