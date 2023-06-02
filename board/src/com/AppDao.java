package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static com.common.JdbcUtil.close;

public class AppDao {
    private Connection conn;

    //    싱글톤기법
    private AppDao() {

    }

    //class 뒤에 synchronized 들어가는 건 검색해서 나와도 참조XXXXX 옛날꺼임
    private static class LazyHolder {
        private static final AppDao INSTANCE = new AppDao();
    }

    public static AppDao getInstance() { return LazyHolder.INSTANCE;}

    public void setConnection(Connection conn) { this.conn = conn; }
    public boolean insertName(String name){
        PreparedStatement pstmt = null;
        int count = 0;

        try {
            pstmt = conn.prepareStatement(
                    "insert into my_name(name) value (?)");
//            ? 자리 가 문자열 일때
            pstmt.setString(1,name);
            count = pstmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            close(pstmt);
        }
        return count>0? true : false;
    }
    public String selectNameById(int id){
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String name = null;

        try {
            pstmt = conn.prepareStatement(
                    "select name from my_name where id=?");
            pstmt.setInt(1,id);
            rs = pstmt.executeQuery();
            //executeQuery : 셀렉트할때 씀!!
            //for문안씀
            //columnLabel : 컬럼명 적는곳
            while (rs.next()){
                name = rs.getString("name");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            close(rs);
            close(pstmt);
        }

        return name;
    }
    public int selectAccountCountByLoginId(String loginId){
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        int count = 0;

        try {
            pstmt = conn.prepareStatement(
                    "select count(*) from member where login_id=? and leaved=false");
            pstmt.setString(1,loginId);
            rs = pstmt.executeQuery();
            //executeQuery : 셀렉트할때 씀!!
            //for문안씀
            //columnLabel : 컬럼명 적는곳
            while (rs.next()){
                //칼럼순서
                count = rs.getInt(1);

            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            close(rs);
            close(pstmt);
        }

        return count;
    }

}
