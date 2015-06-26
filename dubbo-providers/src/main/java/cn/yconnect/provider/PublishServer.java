package cn.yconnect.provider;

import java.io.IOException;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 发布服务
 * @author admin
 *
 */
public class PublishServer implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "/applicationContext-dubbo.xml" });
		System.out.println("启动");
		context.start();
		System.out.println("启动了");
		/*try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}*/
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {

	}

}
