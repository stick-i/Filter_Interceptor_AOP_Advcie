package cn.sticki.test.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 过滤器演示操作
 *
 * @author 阿杆
 * @version 1.0
 * @date 2022/9/4 10:17
 */
@Slf4j
@WebFilter(urlPatterns = {"/name", "/all"})
public class MyFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
		log.info("before filter");
		// 请求放行
		chain.doFilter(request, response);
		log.info("after filter");
	}

}
