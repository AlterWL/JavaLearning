package advance;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {
        Random r = new Random();

        int num = r.nextInt(); // int型数据整个范围
        System.out.println("随机数是：" + num);

        int bound = 10; // 给定随机数范围
        int times = 20; // 循环次数
        System.out.printf("%d个0~%d的随机数是：", times, bound - 1);
        for (int i = 0; i < times; i++) {
            num = r.nextInt(bound); //[0,10)中的正数，即0~9
            System.out.print(num + "\t");
        }

        guessNum();
    }

    public static void guessNum() {
        /**
         * guessNum
         * 猜数字，范围1~100，一共8次机会
         */
        int num = new Random().nextInt(100) + 1; // 只是用一次的情况下可以使用匿名对象
        Scanner sr = new Scanner(System.in); // 对象需要重复使用，所以不能使用匿名对象
        int guessNum; //保存猜测的数字
        System.out.println("---------------- 猜数字游戏 ----------------");
        System.out.println("数字范围是[1~100]，你一共只有8次机会哦。开始！");
        System.out.print("你猜测的数字是：");
        guessNum = sr.nextInt();
        int i = 7; // 剩余次数
        for (; i > 0; i--) {
            if (guessNum > num) {
                System.out.println("太大了！");
            } else if (guessNum < num) {
                System.out.println("太小了！");
            } else {
                System.out.println("你猜对啦！");
                break;
            }
            System.out.printf("再猜！（你还剩%d次机会）：", i);
            guessNum = sr.nextInt();
        }
        if (i <= 0) {
            System.out.printf("真遗憾！答案是：%d。\n", num);
        }
    }
}
