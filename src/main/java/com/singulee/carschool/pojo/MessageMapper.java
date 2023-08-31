package com.singulee.carschool.pojo;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * 消息表(Message)表数据库访问层
 *
 * @author wzq
 * @since 2023-02-25 19:07:21
 */
@Mapper
public interface MessageMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param mid 主键
     * @return 实例对象
     */
    Message queryById(Integer mid);

    /**
     * 查询指定行数据
     *
     * @param message 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Message> queryAllByLimit(@Param("message") Message message, @Param("pageable") Pageable pageable);
    
    /**
     * 查询指定行数据
     *
     * @param message 查询条件
     * @return 对象列表
     */
    List<Message> queryAll(Message message);

    /**
     * 统计总行数
     *
     * @param message 查询条件
     * @return 总行数
     */
    long count(Message message);

    /**
     * 新增数据
     *
     * @param message 实例对象
     * @return 影响行数
     */
    int insert(Message message);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Message> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Message> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Message> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Message> entities);

    /**
     * 修改数据
     *
     * @param message 实例对象
     * @return 影响行数
     */
    int update(Message message);

    /**
     * 通过主键删除数据
     *
     * @param mid 主键
     * @return 影响行数
     */
    int deleteById(Integer mid);

}

