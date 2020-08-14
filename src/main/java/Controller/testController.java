package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {
    @RequestMapping("/test")
    public String test(){
        System.out.println("成功了!!!!!");
        return "success";
    }
}
