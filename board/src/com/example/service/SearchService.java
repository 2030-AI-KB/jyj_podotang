package com.example.service;

import com.common.AppService;
import com.common.ServiceForward;
import com.example.ds.ExampleDs;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.regex.Pattern;

import static com.common.Constants.BASIC_VIEW_PATH;

public class SearchService implements AppService {
    @Override
    public ServiceForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //String형 input을 선언하고 입력한 id 로드하여 저장한다.
        String input = request.getParameter("myNameId");

        //input 변수의 데이터가 숫자인지 확인하다.
        //만약 숫자가 아니라면 "숫자만 입력하세요" 메세지 출력후 뒤로가기

        if(input==null || input.equals("") || !Pattern.matches("^[0-9]{1,9}$", input)){
            //^:시작 $:끝 [0-9]:0~9까지 인정 [a-z]:소문자 인정 [0-9a-zA-Z가-힣]:0-9까지 숫자,소문자대문자한글인정
            // 특수문자는 입력해둔것만 인정 {1,10}:문자열의 길이 1자리부터 10자리까지 인정
            //null값 확인은 필수!
            return null;
        }
        /*        if (input==null){
            //오류 메시지
        }else{
            if(input.equals("")){
                //오류 메시지
            }else{
                //정규 표현식 사용하여 숫자인지 확인
                if(*//*정규표현식이 맞나?*//*){

                }else {

                }
            }
        }=>>>중첩 if문 복잡함!! */


        //정수형 id를 선언하고 input 변수를 숫자로 변환한다.
        int id = Integer.parseInt(input);

        //String형 name을 선언하고 데이터베이스에서 id로 이름을 검색하여 저장한다.
        ExampleDs ds = new ExampleDs();
        String name = ds.selectNameById(id);
        if(name==null){
            name="검색 결과가 존재하지 않습니다.";
        }


        //request 객체의 attribute에 검색한 이름을 저장한다.
        request.setAttribute("result",name);


        //view를 위한 forward 객체 리턴


        return ServiceForward.builder()
                .path(BASIC_VIEW_PATH + "search.jsp")
                .build();

    }

}
