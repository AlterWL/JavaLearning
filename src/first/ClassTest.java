package first;
/*
一个 java 源文件当中可以定义多个 class
一个 java 源文件当中 public 的 class 不是必须的
一个 class 定义会生成一个 xxx.class 字节码文件
一个 java 源文件中定义公开类的话，只能有一个，并且该类的名称必须和 java 源文件名称一致
每一个 class 当中都可以编写 main 方法，都可以设定程序的入口，想执行 B.class 中的 main 方法>java B，想执行 X.class 中的 main 方法>java X
*/

class A
{
	public static void main(String[] args)
	{
		System.out.println("A's main method invoke!");
	}
}

/* class B
{
	public static void main(String[] args)
	{
		System.out.println("B's main method invoke!")
	}
}  */

/* 注意：当命令窗口中执行 java B 时，要求 B.class 中必须有主方法，若没有，会在运行阶段出现如下错误：
	D:\Files\Codes\java> java B
	错误: 在类 B 中找不到 main 方法, 请将 main 方法定义为:
	public static void main(String[] args) */
class B
{
	
}

class X
{
	public static void main(String[] args)
	{
		System.out.println("X's main method invoke!");
	}
}

class Y
{
	public static void main(String[] args)
	{
		System.out.println("Y's main method invoke!");
	}
}

public class ClassTest
{
	public static void main(String[] args)
	{
		System.out.println("ClassTest's main method invoke!");
	}
}
