package com.zyyglxt.service.impl;

import com.zyyglxt.dao.UserRoleRefDOMapper;
import com.zyyglxt.dataobject.UserRoleRefDO;
import com.zyyglxt.dataobject.UserRoleRefDOKey;
import com.zyyglxt.error.BusinessException;
import com.zyyglxt.error.EmBusinessError;
import com.zyyglxt.service.UserRoleRefService;

import com.zyyglxt.util.DateUtils;

import com.zyyglxt.util.UUIDUtils;
import com.zyyglxt.validator.ValidatorImpl;
import com.zyyglxt.validator.ValidatorResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author wanglx
 * @Date 2020/10/29 0029 14:52
 * @Version 1.0
 */
@Service
public class UserRoleRefServiceImpl implements UserRoleRefService {

    @Autowired
    UserRoleRefDOMapper userRoleRefDOMapper;
    @Autowired
    private ValidatorImpl validator;

    @Override
    public int deleteByPrimaryKey(UserRoleRefDOKey key) {
        return userRoleRefDOMapper.deleteByPrimaryKey(key);
    }

    @Override
    public int insertSelective(UserRoleRefDO record) {
        ValidatorResult result = validator.validate(record);
        if(result.isHasErrors()){
            throw new BusinessException(result.getErrMsg(), EmBusinessError.PARAMETER_VALIDATION_ERROR);
        }
        record.setItemcode(UUIDUtils.getUUID());
        return userRoleRefDOMapper.insertSelective(record);
    }

    @Override
    public UserRoleRefDO selectByPrimaryKey(UserRoleRefDOKey key) {
        return userRoleRefDOMapper.selectByPrimaryKey(key);
    }

    @Override
    public int updateByPrimaryKeySelective(UserRoleRefDO record) {
        return userRoleRefDOMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByKeySelective(UserRoleRefDO record) {
        return userRoleRefDOMapper.updateByKeySelective(record);
    }

    @Override
    public UserRoleRefDO selectByUserCode(String itemcode) {
        return userRoleRefDOMapper.selectByUserCode(itemcode);
    }
}
