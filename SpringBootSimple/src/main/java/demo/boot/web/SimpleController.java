package demo.boot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.boot.service.ISimpleService;

@RestController
public class SimpleController {

	@Autowired
	ISimpleService service;
	@GetMapping
	public String disp() {
		return "Presentation Layer"+service.disp();
	}
	
	//path will be localhost:8080/app1/info app1 as its mentioned in application properties file
//	@GetMapping("info")
//	public String info() {
//		return "Believe in yourself";
//	}
//	
}
