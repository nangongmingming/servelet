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
		//���÷������ݱ���
		req.setCharacterEncoding("UTF-8");
		String username = req.getParameter("username");
		System.out.println("��ȡ���Ŀͻ���" + username);
		// ������Ӧ���ݱ���
		res.setCharacterEncoding("UTF-8");
		res.getWriter().println("����˵���Ӧ����Ϊ" + username);
	}

}
