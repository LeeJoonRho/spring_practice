package spring_practice2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(ApplicationConfig.class);
		AdminConnection connection=ctx.getBean("adminConfig",AdminConnection.class);
		
		System.out.println("adminId : " +connection.getAdminId());
		System.out.println("adminPw : " +connection.getAdminPw());
		System.out.println("Sub_adminId : " +connection.getSub_adminId());
		System.out.println("Sub_adminPw : " +connection.getSub_adminPw());
		
		ctx.close();
}

}
