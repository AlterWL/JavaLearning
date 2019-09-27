/* 
	一、JDK、JRE和JVM
		- JDK：java开发工具包 - 开发人员进行java软件开发测试的一套工具
		- JRE：java运行时环境 - java软件成品运行所依赖的环境
		- JVM：java虚拟机 - java语言实现跨平台的一种软件
		JDK包含JRE，JRE包含JVM。 

	二、java程序的加载与执行
		- java程序的运行包括两个非常重要的阶段；
			1. 编译阶段
			2. 运行阶段
		- 编译阶段：
			* 主要任务是检查java源程序语法，符合java语法规则能正常生成字节码文件xxx.class，否则不能生成字节码文件；
			* 字节码文件不是纯粹的二进制文件，无法直接在操作系统中运行；
			* 编译阶段过程：
				1.程序员在硬盘某个位置新建一个.java扩展名的文件(java源文件)，在其中编写java源程序(必须符合java语法规则)，
				2.使用JDK中自带的java编译器工具/命令(javac.exe)通过DOS命令进行java程序编译：javac java源文件路径。
			* 一个java源文件可以生成多个.class文件；
			* 字节码文件是最终执行需要的文件，生成字节码文件之后，java源文件不会影响到java程序的执行。当执行效果不符合预期时，程序员需要修改java源程序，重新编译覆盖之前的字节码文件，再次运行达到新的执行效果。
			* 修改完成的字节码文件可以拷贝到其他操作系统中运行，效果不变。【跨平台】
		- 运行阶段：
			* 使用JDK自带的执行工具/命令(java.exe)运行程序：java 类名 【注意：只写写类名，不写扩展名，更不能写路径】
			* 运行阶段过程：
				1.在DOS串口执行输入：java xxx(类名)，
				2.java.exe启动java虚拟机JVM，JVM启动类加载器(ClassLoader)，
				3.ClassLoader在鹰牌上搜索xxx.class文件，找到该文件并将该文件装载到JVM当中，
				4.JVM将字节码文件解释成二进制数据，
				5.操作系统执行二进制和底层硬件平台进行交互。
		
	三、PATH环境变量
		- Windows操作系统在硬盘上搜索某个命令的过程：
			* 首先从当前目录下搜索；
			* 当前目录搜索不到，从环境变量path指定的目录当中搜索某个命令；
			* 如果都搜索不到，则报错（powershell中）：无法将“javac”项识别为 cmdlet、函数、脚本文件或可运行程序的名称。
		- 要想在硬盘中任何位置都能执行java命令，需要在path环境变量中添加java命令所在的路径，重启终端窗口就可以了。

 */
// public 表示公开的
// class 表示定义了一个类
// HelloWorld 表示一个类名
public class HelloWorld{  // 表示定义一个公开的类，类名为 HelloWorld

	// 类体
	
	// 类体中不允许直接编写java语句【除声明变量之外】
	// System.out.println("Hello World!");

	/*
		static 表示静态的
		void 表示空
		main 表示方法名是main
		(String[] args) 是一个main方法的形式参数列表
		
		需要记住：以下的方法是程序的主方法，是程序执行的入口
	*/
	public static void main(String[] args){  // 表示定义一个公开的静态的主方法
		
		// 方法体
		// 方法体
		// 方法体
		// 方法体
		
		// java语句以“;”终止，分号必须是半角分号
		// 先记住：该行代码是向控制台输出一段消息
		// 双引号必须是半角双引号【java语法的一部分】
		// java 中所有的“字符串”都是以半角双引号括起来的
		System.out.println("Hello World!");
		
		// 再向控制台输出消息
		System.out.println("Hello Alter!");
		
		// 输出中文【以下字符串中“程序员”两边的引号是全角的，他们属于普通字符串】
		System.out.println("我是一个“程序员”。");
	}
}