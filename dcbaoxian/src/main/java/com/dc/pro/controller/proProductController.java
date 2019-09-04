package com.dc.pro.controller;
import javax.servlet.http.HttpSessionListener;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/product/")
public class proProductController implements HttpSessionListener{





	@RequestMapping("doProductUI")
	public String doDevelopUI(){
		return "pro/product";
	}
	
	@RequestMapping("doProductEditUI")
	public String doProductEditUI(){
		return "pro/product_edit";
	}
	
	@RequestMapping("doProductParticulars")
	public String doProductParticulars(){
		return "pro/product_particulars";
	}
	
	
	
}







