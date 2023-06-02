package com.example.ds;

import com.AppDao;
import com.common.JdbcUtil;

import java.sql.Connection;

import static com.common.JdbcUtil.*;

public class ExampleDs {
    private Connection conn;

    private AppDao setDao(){
//        AppDao는 private걸어놔서 못가져옴으로 instance로 가져옴
        AppDao dao = AppDao.getInstance();
        this.conn = getConnection();
//        바가지 가져옴
        dao.setConnection(this.conn);
        return dao;
    }

    public void insertName(String name){
        AppDao dao = setDao();
        boolean isSuccess = dao.insertName(name);
        if (isSuccess){
            commit(this.conn);
        }else {
            rollback(this.conn);
        }
        close(conn);
    }
    //검색
    public String selectNameById(int id) {
        AppDao dao = setDao();
        String name = dao.selectNameById(id);
        close(conn);
        return name;

    }
}
