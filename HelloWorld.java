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
		System.out.println("Helllo World!");
		
		// 再向控制台输出消息
		System.out.println("Hello Alter!");
		
		// 输出中文【以下字符串中“程序员”两边的引号是全角的，他们属于普通字符串】
		System.out.println("我是一个“程序员”。");
	}
}