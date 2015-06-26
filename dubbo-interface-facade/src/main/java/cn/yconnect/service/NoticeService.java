package cn.yconnect.service;

import java.util.List;

import cn.yconnect.dto.Notice;

public interface NoticeService {

	String sayHello();
	
	Notice getNotice();
	
	List<Notice> findNoticeList();
}
