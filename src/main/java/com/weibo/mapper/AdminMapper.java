package com.weibo.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.weibo.po.Admin;
import com.weibo.po.AdminExample;

public interface AdminMapper {
    int countByExample(AdminExample example);

    int deleteByExample(AdminExample example);

    int insert(Admin record);

    int insertSelective(Admin record);

    List<Admin> selectByExample(AdminExample example);

    int updateByExampleSelective(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByExample(@Param("record") Admin record, @Param("example") AdminExample example);
}