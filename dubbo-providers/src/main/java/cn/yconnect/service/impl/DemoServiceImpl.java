package cn.yconnect.service.impl;

import com.alibaba.dubbo.config.annotation.Service;

import cn.yconnect.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {

	@Override
	public String hello() {
		 
		return "hello";
	}

}
