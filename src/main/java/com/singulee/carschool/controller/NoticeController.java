package com.singulee.carschool.controller;

import com.singulee.carschool.pojo.MessageMapper;
import com.singulee.carschool.pojo.Notice;
import com.singulee.carschool.pojo.NoticeMapper;
import com.singulee.carschool.pojo.Student;
import com.singulee.carschool.service.NoticeService;
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
@RequestMapping("/notice")
public class NoticeController {

    @Resource
    private NoticeService noticeService;

    /**
     * 添加
     * @param
     * @return
     */
    @RequestMapping(value = "/addNotice")
    @ResponseBody
    public Map<String,Object> addNotice(@RequestBody Notice notice){
        return noticeService.addNotice(notice);
    }

    /**
     * 更新
     * @param
     * @return
     */
    @RequestMapping(value = "/updateNotice")
    @ResponseBody
    public Map<String,Object> updateNotice(@RequestBody Notice notice){
        return noticeService.updateNotice(notice);
    }

    /**
     * 查询
     * @param
     * @return
     */
    @RequestMapping(value = "/findNotice")
    @ResponseBody
    public Map<String,Object> findNotice(@RequestBody Notice notice){
        return noticeService.findNotice(notice);
    }



}
