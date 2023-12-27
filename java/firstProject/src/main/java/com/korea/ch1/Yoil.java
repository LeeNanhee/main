package com.korea.ch1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  // 1. ���α׷� ���
public class Yoil {
	
	// Ȯ�� : http://localhost:8090/ch1/getYoil?year=2021&month=10&day=1
	
	@RequestMapping("/getYoil")
	public static void main(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		
		String year = request.getParameter("year");
		String month = request.getParameter("month");
		String day = request.getParameter("day");
		
		int yyyy = Integer.parseInt(year);
		int mm = Integer.parseInt(month);
		int dd = Integer.parseInt(day);

		Calendar cal = Calendar.getInstance();
		cal.set(yyyy,  mm-1, dd);
		
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		char yoil = "�Ͽ�ȭ�������".charAt(dayOfWeek);
		
		//3. ���
		response.setContentType("text/html");    // ������ ������ html�� ����
        response.setCharacterEncoding("utf-8");  // ������ ���ڵ��� utf-8�� ����
        PrintWriter out = response.getWriter();  // ���������� ��� ��Ʈ��(out)�� ��´�.
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println(year + "�� " + month + "�� " + day + "���� ");
        out.println(yoil + "�����Դϴ�.");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}









