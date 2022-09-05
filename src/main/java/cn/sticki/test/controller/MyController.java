package cn.sticki.test.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 阿杆
 * @version 1.0
 * @date 2022/9/4 16:46
 */
@Slf4j
@RestController
public class MyController {

	@GetMapping("/name")
	public String getName() {
		log.info("getName");
		return "sticki";
	}

	@GetMapping("/age")
	public Integer getAge() {
		log.info("getAge");
		return 22;
	}

	@GetMapping("/exception")
	public String getException() {
		log.info("getException");
		throw new RuntimeException("报错啦");
	}

	@GetMapping("/aop")
	public String getAop() {
		log.info("getAop");
		return "aop";
	}

	@GetMapping("all")
	public String getAll() {
		log.info("getAll");
		// 这里得抛个异常
		throw new RuntimeException("all exception");
	}

}
