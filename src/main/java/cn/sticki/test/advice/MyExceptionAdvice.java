package cn.sticki.test.advice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器
 *
 * @author 阿杆
 * @version 1.0
 * @date 2022/9/4 23:04
 */
@Slf4j
@RestControllerAdvice
public class MyExceptionAdvice {

	@ExceptionHandler(Exception.class)
	public String allExceptionHandler(Exception e) {
		// 捕获之后打印异常信息
		log.warn(e.getMessage());
		return "系统异常，请稍后再试";
	}

}
