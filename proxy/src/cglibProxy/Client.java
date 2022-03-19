package cglibProxy;

/**
 * @description
 * 代理模式（Proxy Design Pattern）的原理和代码实现都不难掌握。
 * 它在不改变原始类（或叫被代理类）代码的情况下，通过引入代理类来给原始类附加功能
 * 【装饰器是增强功能，代理是附加新的功能】。
 */
public class Client {

	public static void main(String[] args) {

		//创建目标对象
		TeacherDao target = new TeacherDao();
		//获取到代理对象，并且将目标对象传递给代理对象
		TeacherDao proxyInstance = (TeacherDao)new ProxyFactory(target).getProxyInstance();

		//执行代理对象的方法，触发intecept 方法，从而实现 对目标对象的调用
		String res = proxyInstance.teach();
		System.out.println("res=" + res);
	}


}
