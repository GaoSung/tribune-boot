package org.gaosung.dao;

import org.apache.ibatis.annotations.Mapper;
import org.gaosung.dao.po.User;

@Mapper
public interface UserDAO {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}