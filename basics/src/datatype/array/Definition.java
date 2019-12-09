package datatype.array;

/**
 * Definition
 * <p>
 * 1、数组的概念：一种容器，可以同时存放多个数据。
 * 2、数组的特点：
 * - 数组是一种引用数据类型；
 * - 一个数组中的所有数据类型必须一致；
 * - 数组的长度在程序运行期间不可更改。
 * 3、数组的初始化：在内存中为数组开辟一块空间，并向其中赋予一些默认值。
 * 4、两种常见的初始化方式；
 * - 动态初始化(指定长度)
 * - - 格式；dtype[] name = new dtype[size];
 * - - - dtype -> 数据类型，两处数据类型必须一致，
 * - - - name -> 数组名，
 * - - - new -> 关键字，创建数组，
 * - - - size -> 给定数组大小，一个int数字。
 * - 静态初始化(指定内容)
 * - - 格式；dtype[] name = new dtype[] {ele1, ele2, ...};
 * - - - ele1,ele2,... -> dtype类型的数据
 * - - - 静态初始化的数组长度等于所给数据数量。
 * - - 省略格式；dtype[] name = {ele1, ele2, ...};
 * - 注意：
 * - - 静态初始化没有直接指定长度，但仍会自动推算得到长度；
 * - - 静态初始化标准格式可以拆分为两个步骤；
 * - - 动态初始化标准格式也可以拆分为两个步骤；
 * - - 静态初始化如果使用省略格式，就不能拆分为两个步骤。
 * 5、使用建议：
 * - 若不确定数组内容 -> 动态初始化；
 * - 数组内容已经确定 -> 静态初始化。
 */

public class Definition {
    public static void main(String[] args) {
//        动态初始化
        int[] arrayA = new int[300]; // 创建一个int数组，里面可以存放300个int数据
        double[] arrayB = new double[10]; // 创建一个double数组，里面可以存放10个double数据
        String[] arrayC = new String[12]; // 创建一个字符串数组，里面可以存放12个字符串数据
//        静态初始化
        int[] arrayA1 = new int[]{12, 514, 0}; // 创建一个int数组，并赋值
        String[] arrayC1 = new String[]{"leaf", "love", "leave"}; // 创建一个字符串数组，并给定内容
        String[] arrayC2 = {"leaf", "love", "leave"}; // 省略格式
//        动态初始化拆分为两个步骤
        double[] arrayB1;
        arrayB1 = new double[5];
//        静态初始化拆分为两个步骤
        double[] arrayB2;
        arrayB2 = new double[] {10.0, 132.4, 0.001};
//        省略格式不能拆分
//        int[] arrayA2;
//        arrayA2 = {12, 13, 6};
    }
}
