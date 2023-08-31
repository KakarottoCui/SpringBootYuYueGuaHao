package com.singulee.carschool.controller;

import com.singulee.carschool.pojo.Message;
import com.singulee.carschool.service.MessageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 
 * Date: 2023/02/19
 * Description:
 * Version: V1.0
 */
@Controller
@RequestMapping("/message")
public class MessageController {

    @Resource
    private MessageService messageService;

    /**
     * 添加
     * @param
     * @return
     */
    @RequestMapping(value = "/addMessage")
    @ResponseBody
    public Map<String,Object> addMessage(@RequestBody Message message){
        return messageService.addMessage(message);
    }

    /**
     * 更新
     * @param
     * @return
     */
    @RequestMapping(value = "/updateMessage")
    @ResponseBody
    public Map<String,Object> updateMessage(@RequestBody Message message){
        return messageService.updateMessage(message);
    }

    /**
     * 查询
     * @param
     * @return
     */
    @RequestMapping(value = "/findMessage")
    @ResponseBody
    public Map<String,Object> findMessage(@RequestBody Message message){
        return messageService.findMessage(message);
    }


}
