package com.mytest.business.dao;

import com.mytest.business.model.Criteria;
import com.mytest.business.model.TUser;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface TUserMapper {
    /**
     * ����������ѯ��¼����
     */
    int countByExample(Criteria example);

    /**
     * ��������ɾ����¼
     */
    int deleteByExample(Criteria example);

    /**
     * ��������ɾ����¼
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * �����¼,���ܼ�¼����������Ƿ�Ϊ��
     */
    int insert(TUser record);

    /**
     * �������Բ�Ϊ�յļ�¼
     */
    int insertSelective(TUser record);

    /**
     * ����������ѯ��¼��
     */
    List<TUser> selectByExample(Criteria example);

    /**
     * ����������ѯ��¼
     */
    TUser selectByPrimaryKey(Integer id);

    /**
     * ���������������Բ�Ϊ�յļ�¼
     */
    int updateByExampleSelective(@Param("record") TUser record, @Param("condition") Map<String, Object> condition);

    /**
     * �����������¼�¼
     */
    int updateByExample(@Param("record") TUser record, @Param("condition") Map<String, Object> condition);

    /**
     * ���������������Բ�Ϊ�յļ�¼
     */
    int updateByPrimaryKeySelective(TUser record);

    /**
     * �����������¼�¼
     */
    int updateByPrimaryKey(TUser record);
}