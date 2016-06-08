package com.fuping.test;

import com.fuping.util.ConnManger;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class DbUtilTest {
    @Test
    public void testsave(){
        QueryRunner queryRunner = new QueryRunner();

        String sql="INSERT INTO t_user(name,adress,password) VALUES(?,?,?)";
        try {
            queryRunner.update(ConnManger.getConnection(),sql,"rose","china","456");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
