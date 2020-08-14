package hxzy.com.cn.dao;

import hxzy.com.cn.domain.ClassModel;

public interface ClassModelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ClassModel record);

    int insertSelective(ClassModel record);

    ClassModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClassModel record);

    int updateByPrimaryKey(ClassModel record);
}