package com.study.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 요청과 응답
        // 클라이언트의 요청정보는 req에 담겨있음
        // resp에 응답할 데이터를 담아서 응답

        // 1. 응답타입 설정
        resp.setContentType("text/plain");
        resp.setCharacterEncoding("UTF-8");

        // 2. 응답 body에 쓸 문자열 준비
        String msg = "안녕하세요! 내가 직접 쏴주는 데이터";

        // 3~4번은 스프핑에서 return으로 대체됨
        //3. 응답도구 셋팅
        PrintWriter writer = resp.getWriter();
        // 4. 메세지 작성
    }


}
