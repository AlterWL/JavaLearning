package methods;

/**
 * InvokeTest
 */
public class InvokeTest {

    int i = 10; // 没有static的变量

    // 主方法
    public static void main(String[] args) {
        // 调用method1
        System.out.println("------- 1 begins -------");
        InvokeTest.method1(); // 完整方式
        System.out.println("-------- 1 ends --------\n");
        
        System.out.println("------- 1 begins -------");
        method1(); // 省略方式
        System.out.println("-------- 1 ends --------\n");
        
        // 调用method2
        System.out.println("------- 2 begins -------");
        InvokeTest test = new InvokeTest(); // 完整方式
        test.method2();
        System.out.println("------- 2 ends -------");
        // 省略方式【无】
    }
    
    public static void method1() {
        // 调用doSome
        InvokeTest.doSome(); // 完整方式
        doSome(); // 省略方式
    
        // 调用doOthers
        InvokeTest test = new InvokeTest(); // 完整方式
        test.doOthers();
        // 省略方式【无】

        // 访问i
        System.out.println(test.i); // 完整方式
        // 省略方式【无】
    }
    
    public void method2() {
        // 调用doSome
        InvokeTest.doSome(); // 完整方式
        
        // 省略方式
        // 这一句相当于this.doSome()的省略形式
        // 带有static定义的方法，既可以采用类名的方式调用，也可以采用引用的方式调用
        // 在采用引用的方式调用时，执行时其实和引用所指向的对象无关，但不会出现空指针错误
        // 所以带有static的方法还是建议使用类名的方式访问
        doSome();
        
        // 调用doOthers
        this.doOthers(); // 完整方式
        doOthers(); // 省略方式

        // 访问i
        System.out.println(this.i); // 完整方式
        System.out.println(i); // 省略方式
    }

    // 带有static的方法
    public static void doSome() { 
        System.out.println("Doing something...");
    }

    // 不带static的方法
    public void doOthers() { 
        System.out.println("Doing others...");
    }
}