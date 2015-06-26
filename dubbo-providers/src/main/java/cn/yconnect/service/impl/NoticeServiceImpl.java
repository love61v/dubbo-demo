package cn.yconnect.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.alibaba.dubbo.config.annotation.Service;

import cn.yconnect.dto.Notice;
import cn.yconnect.service.NoticeService;

@Service
public class NoticeServiceImpl implements NoticeService{

	@Override
	public String sayHello() {
		return "你好－－－dubbo";
	}

	@Override
	public Notice getNotice() {
		Notice notice = new Notice();
		notice.setId(1);
		notice.setName("中国好声音");
		notice.setDate(new Date());
		
		return notice;
	}

	@Override
	public List<Notice> findNoticeList() {
		List<Notice> list = new ArrayList<Notice>();
		for (int i = 0; i < 5; i++) {
			Notice notice = new Notice();
			notice.setId(i);
			notice.setName("你好dubbo" + i);
			notice.setDate(new Date());
			
			list.add(notice);
		}
		
		return list;
	}

}
