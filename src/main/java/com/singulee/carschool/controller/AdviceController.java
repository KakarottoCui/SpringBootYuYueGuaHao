//微信：egvh56ufy7hh ，QQ：821898835
import com.singulee.carschool.pojo.Advice;
import com.singulee.carschool.service.AdviceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 
 * Date: 2023/02/19
 * Description:
 * Version: V1.0
 */
@Controller
@RequestMapping("/advice")
public class AdviceController {

    @Resource
    private AdviceService adviceService;

     * 更新
     * @param
     * @return
     */
    @RequestMapping(value = "/updateAdvice")
    @ResponseBody
    public Map<String,Object> updateAdvice(HttpServletRequest request,@RequestBody Advice advice){
        return adviceService.updateAdvice(advice, request);
    }

    /**
     * 查询
     * @param
     * @return
     */
    @RequestMapping(value = "/findAdvice")
    @ResponseBody
    public Map<String,Object> findAdvice(@RequestBody Advice advice){
        return adviceService.findAdvice(advice);
    }


}
