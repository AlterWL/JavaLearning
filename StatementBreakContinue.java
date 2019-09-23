/* 
    1、break语句：
        - break是java中的关键字，被译为“中断/折断”；
        - break+";" 可以成为一个单独完整的java语句：“break;”；
        - break语句可在switch结构中使用，用来终止switch语句的执行；
        - break语句可以用在循环语句中，用来终止循环的执行；
        - break只终止当前所在循环【离他最近的循环语句】。 

 */

public class StatementBreakContinue
{
    public static void main(String[] args)
    {
        for(int i=1;i<5;i++)
        {
            int j = 1;
            while(true)
            {
                j ++;
                if(j > 5)
                    break;  // 这里的break语句只会终止内层的while循环，不会影响到外层的for循环。
                System.out.print(i*j+" ");
            }
            System.out.println();
        }

        System.out.println("-----------------------");
        // 一下语法较少使用：break终止指定循环
        F1:for(int i=1;i<5;i++)  // 给for循环起名F1
        {
            int j = 1;
            W2:while(true)  // 给while循环起名W2
            {
                j ++;
                if(j > 5)
                    break F1;  // 终止F1循环
                System.out.print(i*j+" ");
            }
        }        
    }
}
