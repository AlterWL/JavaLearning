package statements;
/* 
    关于switch语句：

        1、switch语句属于选择/分支结构。

        2、switch语句的语法结构：

            switch(int或者String类型的字面值或变量){
                case int或者String类型的字面值或变量:
                    java语句;
                    ...
                    break;
                case int或者String类型的字面值或变量:
                    java语句;
                    ...
                    break;
                ...
                default:
                    java语句;
                    ...
            }

        3、switch语句的执行原理：
            - switch后面的小括号中的数据和case后面的数据进行一一匹配，匹配成功的分支执行。按照自上而下的顺序执行。
            - case穿透现象；
                * 匹配成功的分支执行，分支中最后有break语句的话，整个switch语句终止；
                * 匹配成功的分支执行，分支中最后没有break语句的话，直接进入下一个分支执行【不进行匹配】；
                所以，提供break语句可以避免穿透现象。
            - 如果所有case都没有匹配成功，执行default分支中的程序【有default分支的话】；
        
        4、switch后case后面只能是int或者String类型的字面值或变量，不能探测其他类型。
            - byte，short，char类型也可以直接写到switch和case后面，因为它们可以进行自动类型转换【转换为int类型】；
            - JDK6中，switch和case后面只能探测int类型；
            - JDK7之后【包括JDK7】引入新特性，可以探测String类型数据。
        
        5、case可以合并。
            int i = 2;
            switch(i){
                case 1: case 2: case 3: case 10:
                    System.out.println("Merged cases.")  // i=1,2,3,10都会执行该分支中的语句
            }
 */

 public class MultiBranch
 {
    public static void main(String[] args)
    {
        long i = 100L;
        // switch(i){}  // 编译错误：不兼容的类型: 从long转换到int可能会有损失  
        switch((int)i){} 

        // 第4条
        // byte x = 12;
        // short x = 12;
        char x = 12;
        switch(x){}

        // switch(true){}  // 编译错误: 不兼容的类型: boolean无法转换为int

        String name = "ZhangSan";
        switch(name){}

        /* 
            接受用户输入；1~7
            1 -> 星期一
            2 -> 星期二
            ...
            7 -> 星期天
        */
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入数字（1~7）；");
        int num = s.nextInt();
        String dayOfWeek = "";
        switch(num){  // 识别int类型数据
            case 1:
                dayOfWeek = "星期一";
                break;
            case 2:
                dayOfWeek = "星期二";
                break;
            case 3:
                dayOfWeek = "星期三";
                break;
            case 4:
                dayOfWeek = "星期四";
                break;
            case 5:
                dayOfWeek = "星期五";
                break;
            case 6:
                dayOfWeek = "星期六";
                break;
            case 7:
                dayOfWeek = "星期天";
                break;
            default:
                dayOfWeek = "错误";
                break;
        }
        // System.out.println(dayOfWeek);
        
        // case穿透，合并，因为存在穿透，所以可以合并
        String dayOfWorkOrRest = "";
        switch(dayOfWeek){  // 识别Sting类型数据
            case "星期一": case "星期二": case "星期三": case "星期四": case "星期五":
                dayOfWorkOrRest = "工作日";
                break;
            case "星期六": case "星期天":
                dayOfWorkOrRest = "休息日";
                break;
            default:
                dayOfWorkOrRest = "输入不在指定范围";
                break;
        }
        System.out.println(dayOfWeek+"："+dayOfWorkOrRest);
    }
 }
