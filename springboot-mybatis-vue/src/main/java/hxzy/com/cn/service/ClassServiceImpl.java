package hxzy.com.cn.service;

import hxzy.com.cn.dao.ClassModelMapper;
import hxzy.com.cn.domain.ClassModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * USER: summer
 * CLASSNAME: ClassServiceImpl
 * DATE: 2020/8/14
 * TIME: 14:16
 * Company: 侠客岛
 * JDK 1.8
 */
@Service
public class ClassServiceImpl implements IClassService {
    @Autowired
    private ClassModelMapper classModelMapper;
    @Override
    public List<ClassModel> queryModel() {
        return classModelMapper.findClassModel();
    }

    @Override
    public int updateClass(ClassModel cm) {
        return classModelMapper.updateByPrimaryKeySelective(cm);
    }
}
