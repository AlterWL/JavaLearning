/* 
    java中的循环结构：

        1、循环结构：使一段代码重复执行的程序结构，这使得代码无需重复编写而完成重复运行。
                    循环结构将需要反复执行的代码片段放到“循环体”，再联合计数器，共同控制这段代码。
        
        2、基本上所有的编程语言支持的循环结构包括三种：
            - for循环
            - while循环
            - do...while循环
        
    for循环：

        1、语法结构：
            for(初始化表达式;布尔表达式;更新表达式)
            {
                需要重复执行的代码片段【由java语句】
            }
        
        2、执行过程/执行原理：
            - 初始化表达式、布尔表达式和更新表达式都不是必须写的，但是分号必须写；
            - 初始表达式最先执行，并且只执行一次；
            - 不二表达式结果只能是true/false，不能是其他结果；
            - for执行过程：
                ① 先执行初始表达式，之后不再执行；
                ② 判断布尔表达式结果是true还是false；
                    * 布尔表达式结果为true：
                        - 执行循环体
                        - 执行更新表达式
                        - 到第②步
                    * 布尔表达式结果为false:
                        - 循环结束
*/

public class ControlStateLoop
{
    public static void main(String[] args)
    {
        // 输出数字0~9
        /* for(int i=0;i<10;i++)  // 这个i的作用域只在当前for循环内，出了循环就无法访问了
        {
            System.out.println(i);
        }
        System.out.println(i);  // 编译错误: 找不到符号 */

        //死循环
        /* for(;;)
        {
            System.out.println("死循环");
        } */
        
        int i=0;
        for(;i<10;)  // 可以在声名时赋值，也可以在初始表达式中赋值
        {
            // 跟新表达式可以写到循环体内，并且其放置的位置会影响输出结果
            i++;  // 输出1~10
            System.out.print(i+" ");
            // i++;  // 输出0~9
        }
        System.out.println("\ni -> "+i);  // 退出循环后i=10 
        
        // 输出1~100内的所有奇数，并计算它们的和
        System.out.println("--------------1~100内的奇数-------------");
        int sumOfOdds = 0;
        /* // 方法一；
        for(int n=1;n<=100;n++)
        {
            if(n % 2 != 0){
                sumOfOdds += n;
                System.out.print(n+" ");
            }
        } */
        // 方法二：显然方法二更高效
        for(int n=1;n<=100;n+=2)
        {
            sumOfOdds += n;
            System.out.print(n+" ");
        }
        System.out.println("\n奇数和为："+sumOfOdds);  // 2500

        // 九九乘法表
        System.out.println("---------------九九乘法表---------------");
        for(int row=1;row<=9;row++)  // 一共九行
        {
            for(int column=1;column<=row;column++)  //每行列数和行号数相同
                System.out.print(row+"*"+column+"="+row*column+" ");  // 拼出乘法表达式
            System.out.println();  // 换行
        }
        
        // 输出一个n行高的等腰三角形
        System.out.println("---------------等腰三角形---------------");
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("想要输出三角形的高度(数字)：");
        int lines = s.nextInt();
        // 循环嵌套
        for(int k=0;k<lines;k++)
        {
            for(int m=0;m<lines-k;m++)  // 输出空格，使图形呈等腰形状
                System.out.print(' ');
            for(int j=1;j<=2*k+1;j++)  //输出每行的填充字符
                System.out.print('*');
            System.out.println();  // 每行结尾换行
        }
    }
}
