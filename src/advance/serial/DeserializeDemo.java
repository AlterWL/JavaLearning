package advance.serial;

/**
 * DeserializeDemo
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {
    public static void main(String[] args) {
        Employee e = null;
        try {
            FileInputStream fileIn = new FileInputStream("employee.ser"); // 创建文件输入流，输入/tmp/employee.ser文件
            ObjectInputStream in = new ObjectInputStream(fileIn); // 创建对象输入流，从文件 /emp/empolyee.ser中输入对象
            e = (Employee) in.readObject(); // 使用对戏输入流输入对象，并用 Employee 对象接收
            in.close(); // 关闭对象输入流
            fileIn.close(); // 关闭文件输入流
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("Deserialized Employee...");;
        e.mailCheck();
        System.out.println("SSN: " + e.SSN);
        System.out.println("Number: " + e.number);
    }
}
