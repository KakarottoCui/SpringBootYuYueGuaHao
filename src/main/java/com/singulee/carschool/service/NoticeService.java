package com.singulee.carschool.service;

import com.singulee.carschool.pojo.MessageMapper;
import com.singulee.carschool.pojo.Notice;
import com.singulee.carschool.pojo.NoticeMapper;
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
public class NoticeService {
    @Resource
    private NoticeMapper noticeMapper;

    public Map<String,Object> addNotice(Notice notice){
        notice.setCreatedate(new Date());
        noticeMapper.insert(notice);
        return getRes(200,"success");
    }

    public Map<String,Object> updateNotice(Notice notice){
        noticeMapper.update(notice);
        return getRes(200,"success");
    }

    public Map<String,Object> findNotice(Notice notice){
        return getRes(200,noticeMapper.queryAll(notice));
    }

    public Map<String,Object> getRes(Integer code,Object data){
        Map<String,Object> res = new HashMap<>();
        res.put("code",code);
        res.put("data",data);
        res.put("msg","操作成功");
        return  res;
    }
}
