package hxzy.com.cn.controller;

import hxzy.com.cn.domain.ClassModel;
import hxzy.com.cn.service.IClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @Autowired
    private IClassService classService;

    @GetMapping("/queryAll.do")
    public List<ClassModel> queryModel(){
        return classService.queryModel();
    }
    @PostMapping("/updateClass.do")
    public void updateClass(@RequestBody ClassModel cm){
        classService.updateClass(cm);
    }
}
