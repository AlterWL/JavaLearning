package advance.serial;

/**
 * SerializeDemo
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Reyan Ali";
        e.address = "Phokka Kuan, Ambehta Peer";
        e.SSN = 11122333;
        e.number = 101;
        e.mailCheck();
        System.out.println("SSN: " + e.SSN);
        System.out.println("Number: " + e.number);
        try {
            FileOutputStream fileOut = new FileOutputStream("employee.ser"); // 创建了一个名为tmp/employee.ser文件，由此创建一个文件输出流对象
            ObjectOutputStream out = new ObjectOutputStream(fileOut); // 使用创建的文件对象创建一个对象输出流，用于序列化之前的e对象到文件employee.ser中去
            out.writeObject(e); // 序列化 e 到文件 employee.ser 中去
            out.close(); // 关闭对象输出流
            fileOut.close(); // 关闭文件输出流
            System.out.printf("Serialized data is saved in employee.ser");
        } catch (IOException i) { // 捕获到上面部分代码执行中的IO异常
            i.printStackTrace();
        }
    }
}
