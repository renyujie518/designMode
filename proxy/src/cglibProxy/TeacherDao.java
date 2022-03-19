package cglibProxy;

/**
 * @description 静态代理和JDK代理模式都要求目标对象是实现一个接口，但是有时候目标对象只
 * 是一个单独的对象，并没有实现任何的接口，这个时候可使用目标对象子类来实现
 * 代理这就是Cglib代理
 *
 * 需要引入cglib的jar文件
 */
public class TeacherDao {

	public String teach() {
		System.out.println(" 老师授课中  ， 我是cglib代理，不需要实现接口 ");
		return "hello";
	}
}
