package enhance;

import java.util.Arrays;

/**
 * ArrayTest
 * 1. java.util.Arrays是一个与数组相关的工具类，提供了大量的静态方法，用来实现数组常见的操作；
 * - public static void toString(数组); // 将参数数组变成字符串，默认格式为：[元素1，元素2，... ]；
 * - public static void sort(数组); // 按照默认升序(从小到大)，对数组元素进行排序。
 * - - 备注：对于数值，sort默认按照升序，从小到大；
 * - - - -  对于字符串，sort按照字符升序；
 * - - - -  对于其他类，要求类中有comparable或者comparator的接口支持。
 */
public class ArrayTest {
    public static void main(String[] args) {
        
        System.out.println("\n-------------------- 数组定义 --------------------");
        // int类型数组，默认赋值为0
        int[] a = new int[5];
        System.out.print("int类型数组默认赋值：");
        System.out.println(Arrays.toString(a));

        // 分配空间同时赋值
        int[] b = new int[]{1,2,3,4,5}; // 写法1：分配空间同时赋值
        int[] c = {11,22,33,44,55}; // 写法2：省略 new int[]，效果一样
        // 分配空间同时指定内容
        // 分配空间长度和指定内容长度可能发生冲突。
        // 所以如果指定了数组内容，就不能同时设置数组长度，就算长度一致也不行
        // int[] d = new int[5]{111,222,333,444,555}; // 编译错误: 同时使用维表达式和初始化创建数组是非法的

        System.out.println("\n-------------------- 数组赋值 --------------------");
        int[] a1 = new int[5];
        for(int i=0;i<5;i++) {
            a1[i] = (int) (Math.random()*100); // 赋值0~100之间的随机整数
            // System.out.print(a1[i]+", "); // 赋值过后显示数组内容
        }
        System.out.println("赋值数组结果："+Arrays.toString(a1));
        rev(a1); // 反转
        System.out.println("数组反转结果："+Arrays.toString(a1));
        System.out.println("数组最大值为："+max(a1)); // 得到数组最大值
        
        System.out.println("\n-------------------- 数组合并 --------------------");
        int[] sub1 = new int[(int)(5+Math.random()*5)]; // 长度为5~10
        int[] sub2 = new int[(int)(5+Math.random()*5)]; // 长度为5~10
        for(int i=0;i<sub1.length;i++) {
            sub1[i] = (int) (Math.random()*100); // 赋值0~100之间的随机整数
            // System.out.print(sub1[i]+", "); // 赋值过后显示数组内容
        }
        System.out.println("子数组1："+Arrays.toString(sub1));
        for(int i=0;i<sub2.length;i++) {
            sub2[i] = (int) (Math.random()*100); // 赋值0~100之间的随机整数
            // System.out.print(sub2[i]+", "); // 赋值过后显示数组内容
        }
        System.out.println("子数组2："+Arrays.toString(sub2));
        int[] merge_arr = concat(sub1, sub2);
        System.out.println("合并数组："+Arrays.toString(merge_arr));
        
        System.out.println("\n-------------------- 二维数组 --------------------");
        int[][] ar2 = new int[5][5];
        System.out.println("生成的二维数组为；");
        for(int i=0;i<5;i++) {
            for(int j=0;j<5;j++) {
                ar2[i][j] = (int) (Math.random()*100);
                System.out.print(ar2[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("该二维数组中的最大值是："+max(ar2));

    }
    
    /**
     * rev
     * 反转数组
     * @param arr 反转对象数组
     */
    public static void rev(int[] arr) {
        int tmp;
        int len = arr.length;
        int rad = (int) (arr.length/2); // 中间位置
        for(int i=0;i<rad;i++) { // 交换前半部分和后半部分的元素
            tmp = arr[i];
            arr[i] = arr[len-1-i];
            arr[len-1-i] = tmp;
        }
    }

    /**
     * max
     * 找最大值
     * @param arr 数组对象
     * @return max  返回数组的最大值
     */
    public static int max(int[] arr) {
        int max = arr[0];  // 初始值
        // 增强型for循环，只可读不可写
        for(int val : arr) {
            if(max < val) {
                max = val;
            }
        }
        return max;
    }

    /**
     * 
     * @param ar2 二维数组
     * @return max 二维数组中的最大值
     */
    public static int max(int[][] ar2) {
        int max = ar2[0][0];
        for(int i=0;i<5;i++) {
            for(int j=0;j<5;j++) {
                if(max < ar2[i][j]) {
                    max = ar2[i][j];
                }
            }
        }
        return max;
    }

    /**
     * concat
     * 拼接数组
     * @param a1 数组1
     * @param a1 数组2
     * @return
     */
    public static int[] concat(int[] a1, int[] a2) {
        int len1 = a1.length;
        int len2 = a2.length;
        int[] tar_arr = new int[len1+len2];
        System.arraycopy(a1, 0, tar_arr, 0, len1); // 把a1中值，复制到tar_arr的前面部分
        System.arraycopy(a2, 0, tar_arr, len1, len2); // 把a2中的值，复制到tar_arr后面部分
        return tar_arr;
    }
}