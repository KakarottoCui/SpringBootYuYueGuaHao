package com.singulee.carschool.service;

import com.singulee.carschool.pojo.Message;
import com.singulee.carschool.pojo.MessageMapper;
import com.singulee.carschool.pojo.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 
 * Date: 2023/02/19
 * Description:
 * Version: V1.0
 */
@Service
public class MessageService {

    @Resource
    MessageMapper messageMapper;

    public Map<String,Object> addMessage(Message message){
        message.setCreatedate(new Date());
        message.setValid(1);
        messageMapper.insert(message);
        return getRes(200,"success");
    }

    public Map<String,Object> updateMessage(Message message){
        messageMapper.update(message);
        return getRes(200,"success");
    }

    public Map<String,Object> findMessage(Message message){
        return getRes(200,messageMapper.queryAll(message));
    }

    public Map<String,Object> getRes(Integer code, Object data){
        Map<String,Object> res = new HashMap<>();
        res.put("code",code);
        res.put("data",data);
        res.put("msg","操作成功");
        return  res;
    }
}
