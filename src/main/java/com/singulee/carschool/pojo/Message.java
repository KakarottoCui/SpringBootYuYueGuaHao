package com.singulee.carschool.pojo;

import java.util.Date;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
/**
 * 消息表(Message)实体类
 *
 * @author wzq
 * @since 2023-02-25 19:07:21
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message implements Serializable {
    private static final long serialVersionUID = 851821960275378289L;
    /**
     * 回复Id
     */
    private Integer mid;
    /**
     * 发送人id 系统0
     */
    private Integer sendid;
    /**
     * 消息内容
     */
    private String message;
    /**
     * 创建时间
     */
    private Date createdate;
    /**
     * 1有效0无效
     */
    private Integer valid;


}

