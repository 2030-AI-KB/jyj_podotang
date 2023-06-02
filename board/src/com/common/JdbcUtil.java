package com.common;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcUtil {
    public static Connection getConnection(){
        Connection conn = null;

        try{
            //Context 객체 초기화
            Context initCtx = new InitialContext();
            //context 는 설정파일 관리 -> jsp말고 스프링에서 많이 쓰임

            //context.xml 로드
            Context envCtx = (Context) initCtx.lookup("java:comp/env");
            //(Context) 형변환해주는 도구 object와 context사이에서

            //context.xml 정보에서 name 이 "jdbc/MariaDB"인 resource 로드
            DataSource ds = (DataSource) envCtx.lookup("jdbc/MariaDB");
            //(DataSource)로 데이터 캐스팅함

            //resource 정보에서 로드한 접속 정보를 사용하여 connection 객체 얻어옴
            conn = ds.getConnection();

            // auto commit off
            conn.setAutoCommit(false);

        } catch (Exception e){
            e.printStackTrace();
        }
        return conn;
    }
    //connection 객체 close(리소스 반환= 바가지 돌려줌)
    public static void close(Connection conn){
        if (conn != null){
            try{
                conn.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    // preparedstatement 객체 close(리소스 반환 =바가지 돌려줌)
    public static void close(PreparedStatement pstmt){
        if (pstmt != null){
            try{
                pstmt.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
    // Resultset  객체 close(리소스 반환 =바가지 돌려줌)
    public static void close(ResultSet rs){
        if (rs != null){
            try{
                rs.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    //insert,update,delete 한 데이터 실제 저장 (commit)
    public static void commit(Connection conn){
        if(conn != null){
            try{
                conn.commit();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    //insert,update,delete 프로시저 간 오류 및 예외 발생시 이전으로 클릭
    public static void rollback(Connection conn){
        if(conn != null){
            try{
                conn.rollback();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

}
