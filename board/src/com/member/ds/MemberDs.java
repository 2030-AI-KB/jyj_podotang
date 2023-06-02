package com.member.ds;

import com.AppDao;

import java.sql.Connection;

import static com.common.JdbcUtil.*;

public class MemberDs {
    private Connection conn;

    private AppDao setDao(){
//        AppDao는 private걸어놔서 못가져옴으로 instance로 가져옴
        AppDao dao = AppDao.getInstance();
        this.conn = getConnection();
//        바가지 가져옴
        dao.setConnection(this.conn);
        return dao;
    }
    public int selectAccountCountByLoginId(String loginId) {
        AppDao dao = setDao();
        int count = dao.selectAccountCountByLoginId(loginId);
        close(conn);
        return count;
    }

/*    public int selectAccountCountByLoginId(String loginId){
        return 1;
    }*/
}
