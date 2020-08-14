package hxzy.com.cn;

import hxzy.com.cn.domain.ClassModel;
import hxzy.com.cn.service.IClassService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
@SpringBootTest(classes={SpringbootMybatisVueApplication.class})
public class SpringbootMybatisVueApplicationTests {
    @Autowired
 private IClassService classService;
 @Test
 public void queryClass(){
     List<ClassModel> classModels = classService.queryModel();
     //iter
     for (ClassModel classModel : classModels) {
         System.out.println(classModel);
     }
 }

}
