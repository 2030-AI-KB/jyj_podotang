package com;

import com.common.AppService;
import com.common.ServiceForward;
import com.example.service.MainService;
import com.member.service.AjaxCheckIdService;
import com.member.service.JoinFormService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("*.do")
public class FrontController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doProcess(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doProcess(request, response);
    }

    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String command = request.getRequestURI();


        ServiceForward forward = null;
        try {
            if (command.equals("/main.do")) {
                AppService service = new MainService();
                forward = service.execute(request, response);

            }else if (command.equals("/member/join/form.do")) {
                AppService service = new JoinFormService();
                forward = service.execute(request, response);

            }else if (command.equals("/member/check/id.do")) {
                AppService service = new AjaxCheckIdService();
                forward = service.execute(request, response);
            }
            /*else if (command.equals("/result.do")) {
                AppService service = new ResultService();
                forward = service.execute(request, response);
            } else if (command.equals("/search.do")) {
                AppService service = new SearchService();
                forward = service.execute(request, response);
            }*/

        } catch (Exception e) {
            e.printStackTrace();
        }

        if (forward != null) {
            if (forward.isRedirect()) {
            } else {
                RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
                dispatcher.forward(request, response);
            }
        }else {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            //history.back(); : 뒤로가기
            out.println("<script>alert('잘못된 접근입니다.');history.back();</script>");
            out.close();
        }
    }
}