package cn.yconnect.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.yconnect.dto.Notice;
import cn.yconnect.service.NoticeService;

@Controller
@RequestMapping("/notice")
public class NoticeAction {

	@Autowired
	private NoticeService noticeService;

	/**
	 * 返回字符串
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/getNotice.html", method = RequestMethod.GET)
	public String getNotice(Model model) {
		String result = noticeService.sayHello();
		model.addAttribute("result", result);

		return "notice/list";
	}

	/**
	 * 返回单个实体json
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/getNotice.json", method = RequestMethod.GET)
	@ResponseBody
	public Notice getNoticeBean(Model model) {
		return noticeService.getNotice();
	}

	/**
	 * 返回单个实体json
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "findlist.json", method = RequestMethod.GET)
	@ResponseBody
	public List<Notice> findlist(Model model) {
		return noticeService.findNoticeList();
	}

}
