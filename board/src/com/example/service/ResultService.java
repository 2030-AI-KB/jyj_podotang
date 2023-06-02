package com.example.service;

import com.common.AppService;
import com.common.ServiceForward;
import com.example.ds.ExampleDs;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.common.Constants.BASIC_VIEW_PATH;

public class ResultService implements AppService {
    @Override
    public ServiceForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception{
    //String형 name 을 선언하고 myName 키 값으로 입력한데이터를 저장한다.
        String name =request.getParameter("myName");


    //request 객체에 뷰로 전송할 name 데이터를 저장한다.
        request.setAttribute("name",name);
        ExampleDs ds = new ExampleDs();
        ds.insertName(name);
    //ServiceForward 객체 forward를 선언하고 빌더를 통해 경로 데이터를 저장한다.
        ServiceForward forward = ServiceForward.builder()
                .path(BASIC_VIEW_PATH +"result.jsp")
                .build();
    //forward 객체를 리턴한다.
        return forward;
    }
}