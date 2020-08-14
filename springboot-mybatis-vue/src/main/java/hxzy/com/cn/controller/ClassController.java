package hxzy.com.cn.controller;

import hxzy.com.cn.domain.ClassModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * USER: summer
 * CLASSNAME: ClassController
 * DATE: 2020/8/14
 * TIME: 14:12
 * Company: 侠客岛
 * JDK 1.8
 */
@RestController
@RequestMapping("c_class")
public class ClassController {

    @GetMapping("/queryAll.do")
    public List<ClassModel> queryModel(){
        return null;
    }
}
