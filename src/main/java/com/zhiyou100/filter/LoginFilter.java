package com.zhiyou100.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zhiyou100.vo.ResponseVo;

public class LoginFilter implements HandlerInterceptor {

	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {

		HttpSession session = request.getSession();
        
        Object user = session.getAttribute("user");
        
        if(user == null){
            // 回去登录
            // 创建需要返回给客户端的结果
            ResponseVo<String> vo = new ResponseVo<String>(-1000, "你需要进行登录", null);
            // 将对象转化为json格式
            ObjectMapper om = new ObjectMapper();
            
            String json = om.writeValueAsString(vo);
            
            // 设置编码格式
             response.setContentType("application/json;charset=utf-8");
            
            response.getWriter().println(json);
            
            return false; // false不能通过
        }else {
            
            return true; // 通过
        }
	}

}
