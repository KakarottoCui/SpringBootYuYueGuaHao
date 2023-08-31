package com.singulee.carschool.pojo;

import java.util.Date;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
/**
 * 消息表(Notice)实体类
 *
 * @author wzq
 * @since 2023-02-25 18:58:52
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Notice implements Serializable {
    private static final long serialVersionUID = -50749667308007128L;
    /**
     * 公告Id
     */
    private Integer nid;
    /**
     * 发送人id 系统0
     */
    private Integer sendid;
    /**
     * 公告内容
     */
    private String content;
    /**
     * 发布时间
     */
    private Date createdate;
    /**
     * 状态 0失效  1有效
     */
    private Integer valid;
    /**
     * 标题
     */
    private String title;


}

