package com.ikkong.system.controller;

import com.ikkong.system.controller.base.UrlPermissController;

public class TestController extends UrlPermissController{
	private static String LIST_SOURCE = "Dept.list";
	private static String BASE_PATH = "/system/dept/";
	private static String CODE = "dept";
	private static String PERFIX = "tfw_dept";
	
	public void index() {
		renderJson("test--------------");
	}
}
