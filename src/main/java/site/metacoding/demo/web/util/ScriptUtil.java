package site.metacoding.demo.web.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

public class ScriptUtil {
	
	public static void init(HttpServletResponse response) {
		response.setContentType("text/html; charset=utf-8");
		response.setCharacterEncoding("utf-8");
	}
	
	public static void alert(HttpServletResponse response, String alertMsg) throws IOException {
		init(response);
		PrintWriter out = response.getWriter();
		out.println("<script>");
		out.println("alert('"+alertMsg+"');");
		out.println("history.back();");
		out.println("</script>");
		out.flush();
	}

}
