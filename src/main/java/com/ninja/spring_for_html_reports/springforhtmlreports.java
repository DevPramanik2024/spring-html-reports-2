package com.ninja.spring_for_html_reports;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class springforhtmlreports 
{
@RequestMapping("/test")
	public String test()
	{
	return "This is Test Page";
	}
}
