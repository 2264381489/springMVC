package Controller;

import Entry.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class testController {
    @RequestMapping("/test")
    public String test(){
        System.out.println("成功了!!!!!");
        return "success";
    }
/**
 * 简历提交
  */
    @RequestMapping("/resume")
    public  String resume(){
        System.out.println("转向简历");
        return "resume";
    }
    /**
     * 简历处理
     * 这就是 自定义转换发生的位置 可以自动将前端传过来的数据转化成目标的数据
     * 可是这又是如何匹配的.
     *
     */
    @RequestMapping("/resumeSolution")
    public String resumeSolution(@RequestParam("resume")Person person) throws Exception {
        System.out.println("处理简历");
        if (person==null){
            throw new Exception("没有成功!");
        }
        System.out.println(person);
        return "success";
    }
}
