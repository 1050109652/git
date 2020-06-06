package com.wood.wood.mapper;


import com.wood.wood.entity.Tuser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UserMapper {
    /**
     * 查询所有记录
     * @return
     */
    List<Tuser> getUserList();

    /**
     * 根据id修改密码
     * @param id
     * @param pwd
     */
    void updateForId(@Param("id") String id, @Param("pwd") String pwd);
}
