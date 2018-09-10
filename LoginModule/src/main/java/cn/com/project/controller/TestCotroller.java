package cn.com.project.controller;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.com.project.mapper.TestMapper;
import cn.com.project.model.AdminInfo;

import java.lang.*;

@RestController
@RequestMapping("test")
public class TestCotroller {
	
	@Resource
	private TestMapper testMapper;
	
	@RequestMapping(method=RequestMethod.GET,produces="text/html;charset=utf-8")
	public String index()
	{
		//System.out.println("hello");
		//System.out.println("******"+testMapper.findName());
		return testMapper.findName();
		
	}
	
	
}