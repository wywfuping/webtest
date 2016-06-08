package com.fuping.dao;



public class UserDao {
    public Long count(){

        return 12l;
    }

    public Object findId(Integer id){
        if(id.equals(1)){
            return new Object();
        }
        return null;
    }
}
