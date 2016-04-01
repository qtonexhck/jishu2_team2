package com.mytest.business.service;

import com.mytest.business.dao.TUserMapper;
import com.mytest.business.model.Criteria;
import com.mytest.business.model.TUser;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * t_user
 * @version 1.0 2016-03-30
 * @powerby hetgyd 
 */
@Service
public class TUserService {
    @Autowired
    private TUserMapper tUserMapper;

    public int countByExample(Criteria example) {
        int count = this.tUserMapper.countByExample(example);
        return count;
    }

    public TUser selectByPrimaryKey(Integer id) {
        return this.tUserMapper.selectByPrimaryKey(id);
    }

    public List<TUser> selectByExample(Criteria example) {
        return this.tUserMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Integer id) {
        return this.tUserMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(TUser record) {
        return this.tUserMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(TUser record) {
        return this.tUserMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(Criteria example) {
        return this.tUserMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(TUser record, Criteria example) {
        return this.tUserMapper.updateByExampleSelective(record, example.getCondition());
    }

    public int updateByExample(TUser record, Criteria example) {
        return this.tUserMapper.updateByExample(record, example.getCondition());
    }

    public int insert(TUser record) {
        return this.tUserMapper.insert(record);
    }

    public int insertSelective(TUser record) {
        return this.tUserMapper.insertSelective(record);
    }
}