package datatype;
/*
	关于字面值：
	
		字面值：
			- 123、10
			- 3.14
			- "java"
			- 'A'
			- false, true
		
		* 字面值就是数据
		
		* 字面值是java源程序的组成部分之一。标识符和关键字也都是java源程序的组成部分之一
		
		* 数据在现实生活中是分门别类的，所以计算机编程语言中也需要对数据进行分类：【数据类型】
			- 123、10		整数类字面值
			- 3.14				浮点类字面值
			- "asdfg"			字符串类字面值
			- 'A'、'人'		字符类字面值
			- false, true		布尔型字面值
			
		* 注意：
			java中所有的字符串类字面值需要用半角双引号括起来
			java中所有的字符类字面值需要用半角单引号括起来
		
*/

public class ConstTest
{
	public static void main(String[] args)
	{
		System.out.println("abc");
		
		System.out.println("你忙吗？");
		
		System.out.println(false);
		
		System.out.println(123);
		
		System.out.println("3.14");
		
		System.out.println('A');
		
		// 编译报错，因为单引号里只能放单个字符，属于字符型字面值
		// System.out.println('ASD');
	}
}
