package cn.com.project.test;

import org.junit.Test;

import cn.com.project.controller.TestCotroller;

public class TestActivity {

	@Test
	public void testFuction(){
		System.out.println("123");
		TestCotroller tc = new TestCotroller();
		tc.index();
		
	}
}
