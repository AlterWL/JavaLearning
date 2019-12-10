package datatype.array;

/**
 * Usage
 * <p>
 * 数组的简单使用
 * 1、打印数组元素
 * 2、反转数组
 */

public class Usage {
    public static void main(String[] args) {
        int[] arr1 = {12, 34, 65, 90, 2, 6, 9, 0};
        System.out.print("交换前：");
        printArray(arr1);
        System.out.print("交换后：");
        int[] arrRv = reversArray(arr1);
        printArray(arrRv);
    }

    // 打印数组元素
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print("\t");
        }
        System.out.println();
    }

    // 得到原数组的反转数组
    public static int[] reversArray(int[] array) {
        int[] arrayRev = array;
        int lowIdx = 0;
        int highIdx = arrayRev.length - 1;
        int temp;
        // 从两头向内依次交换
        while (true) {
            if (lowIdx < highIdx) {
                temp = arrayRev[lowIdx];
                arrayRev[lowIdx] = arrayRev[highIdx];
                arrayRev[highIdx] = temp;
                lowIdx++;
                highIdx--;
            } else {
                break;
            }
        }
        return arrayRev;
    }
}
