package com.gsdp.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 这是一个拦截器的样例，我们可以通过拦截器来完成字符编码，用户角色的控制等工作。
 * @author yizijun
 *
 */
public class SampleInterceptor implements HandlerInterceptor {

	@Override
	/*
	 * 拦截一个处理程序的执行。 在HandlerMapping确定一个合适的处理程序对象后被唤醒,
	 * 但在HandlerAdapter调用处理程序之前，也就是在调用我们的控制器方法之前。
	 * 
	 * 返回false  请求将被终止
	 * 返回true   请求继续执行。
	 */
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	/*
	 * 这个方法会在执行了拦截目标对象之后，在返回view之前执行，也就是说我们可以通过这个方法
	 * 来改变ModelAndView里面的一些东西
	 */
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO 自动生成的方法存根
		
	}

	@Override
	/*
	 * 这个方法是在视图显示之后所进行的操作，比如像一些资源的释放什么的。
	 */
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO 自动生成的方法存根
		
	}


}
