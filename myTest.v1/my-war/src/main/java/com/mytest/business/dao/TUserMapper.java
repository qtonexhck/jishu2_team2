package com.mytest.business.dao;

import com.mytest.business.model.Criteria;
import com.mytest.business.model.TUser;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface TUserMapper {
    /**
     * 根据条件查询记录总数
     */
    int countByExample(Criteria example);

    /**
     * 根据条件删除记录
     */
    int deleteByExample(Criteria example);

    /**
     * 根据主键删除记录
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(TUser record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(TUser record);

    /**
     * 根据条件查询记录集
     */
    List<TUser> selectByExample(Criteria example);

    /**
     * 根据主键查询记录
     */
    TUser selectByPrimaryKey(Integer id);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByExampleSelective(@Param("record") TUser record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据条件更新记录
     */
    int updateByExample(@Param("record") TUser record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(TUser record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(TUser record);
}