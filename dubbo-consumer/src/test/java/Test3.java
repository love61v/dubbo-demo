

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import cn.yconnect.dto.Notice;
import cn.yconnect.service.NoticeService;

 
/**
 * 测试 action
 * @author admin
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/test-applicationContext.xml"})
public class Test3 {

	 @Autowired
	 NoticeService noticeService;
	 
	@Test
	public void getModelTest() { 
		Notice notice = noticeService.getNotice();
		print(notice);
	}
	
	@Test
	public void findListTest() { 
		List<Notice> list = noticeService.findNoticeList();
		print(list);
	}
	
	@Test
	public void sayHello() { 
		print(noticeService.sayHello());
	}
	
	private void print(Object obj){
		System.out.println("*******************");
		System.out.println("*********结果**********");
		System.out.println(JSON.toJSONString(obj));
		System.out.println("*******************");
		System.out.println("*******************");
	}

}
