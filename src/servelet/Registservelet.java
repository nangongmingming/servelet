package servelet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/regist")
public class Registservelet extends HttpServlet {
      
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//设置发送数据编码
		req.setCharacterEncoding("UTF-8");
		String username = req.getParameter("username");
		System.out.println("获取到的客户端" + username);
		// 设置响应数据编码
		res.setCharacterEncoding("UTF-8");
		res.getWriter().println("服务端的相应数据为" + username);
	}

}
