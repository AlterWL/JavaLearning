/* 
    方法重载【overload】机制:

        1、什么时候考虑是由方法重载？
            功能相似时，尽可能让方法名相同；但是功能不同时，尽可能让方法名不同；
        
        2、什么条件满足时构成了方法重载？
            - 在同一个类中
            - 方法名相同
            - 参数列表不同：
                * 数量不同
                * 顺序不同
                * 类型不同

        3、方法重载和什么有关系，和什么没关系？
            - 方法重载和方法名++参数列表有关
            - 方法重载和返回值类型，修饰符列表无关
 */

public class MethodOverload
{
    public static void main(String[] args)
    {
        System.out.println("----------- 不同方法结果 -----------");
        int retInt = sumInt(1, 2);
        long retLong = sumLong(1L, 2L);
        float retFloat = sumFloat(1f, 2f);
        System.out.println("retInt -> "+retInt+"\nretLong -> "+retLong+"\nretFloat -> "+retFloat);
        
        System.out.println("----------- 方法重载结果 -----------");
        // 对不同的数据类型，调用求恶化函数就像是在调用一个方法一样。此时区分方法仅仅依靠参数的类型。
        System.out.println("retInt -> "+sum(2, 3));
        System.out.println("retLong -> "+sum(2L, 3L));
        System.out.println("retFloat -> "+sum(2f, 3f));
    }

    // 1、sumInt, sumLong, sumFloat功能类似都是求和，但方法名不同，这给程序调用带了了不方便。需要程序员记忆更多方法名。
    // 2、代码不美观
    // 求和【int型】
    public static int sumInt(int i, int j){
        return i + j;
    }
    // 求和【long型】
    public static long sumLong(long i, long j){
        return i + j;
    }
    // 求和【float型】
    public static float sumFloat(float i, float j){
        return i + j;
    }

    // 方法的重载
    public static int sum(int i, int j){
        System.out.print("--Int----");
        return i + j;
    }
    public static long sum(long i, long j){
        System.out.print("--Long---");
        return i + j;
    }
    public static float sum(float i, float j){
        System.out.print("--float--");
        return i + j;
    }

}
