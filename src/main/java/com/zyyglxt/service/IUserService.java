package com.zyyglxt.service;

import com.zyyglxt.dataobject.OrganizationDO;
import com.zyyglxt.dataobject.UserDO;
import com.zyyglxt.dto.UpdatePwdDto;
import com.zyyglxt.dto.UserDto;
import com.zyyglxt.error.BusinessException;
import com.zyyglxt.response.ResponseData;

/**
 * @Author nongcn
 * @Date 2020/10/29 10:37
 * @Version 1.0
 */
public interface IUserService {

    ResponseData Register(UserDto userDto) ;

//    int Login(String username, String password) ;

    ResponseData UpdatePassword(UpdatePwdDto updatePwdDto);

    OrganizationDO selectByOrgNameAndCode(String orgName, String orgCode);

    UserDO selectOne();

//    void Logout();

    void UpdateUserMsg(UserDO userDO);

    void UpdateUserPortrait(UserDO userDO);
}
