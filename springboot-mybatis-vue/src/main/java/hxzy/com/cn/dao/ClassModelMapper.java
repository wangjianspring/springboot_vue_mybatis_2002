package hxzy.com.cn.dao;

import hxzy.com.cn.domain.ClassModel;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ClassModelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ClassModel record);

    ClassModel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClassModel record);

    int updateByPrimaryKey(ClassModel record);
    @Select("select * from t_class")
    public List<ClassModel> findClassModel();
}