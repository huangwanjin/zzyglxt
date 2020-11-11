package com.zyyglxt.controller.permissionsController;

import com.zyyglxt.annotation.LogAnnotation;
import com.zyyglxt.dataobject.ResourcesDO;
import com.zyyglxt.dataobject.RoleDO;
import com.zyyglxt.dataobject.RoleDOKey;
import com.zyyglxt.error.EmBusinessError;
import com.zyyglxt.response.ResponseData;
import com.zyyglxt.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wanglx
 * @Date 2020/10/29 0029 11:32
 * @Version 1.0
 */
@RestController
@RequestMapping("role")
public class RoleController {
    @Autowired
    RoleService roleService;

    /**
     * 添加角色
     * @param roleDO
     * @return 添加结果信息
     */
    @LogAnnotation(logTitle = "添加角色", logLevel = "3")
    @RequestMapping(value = "/insertrole", method = RequestMethod.POST)
    public ResponseData insertRoleSelective(@RequestBody RoleDO roleDO){
        roleService.insertSelective(roleDO);
        return new ResponseData(EmBusinessError.success);
    }

    /**
     * 更新角色信息
     * @param roleDO
     * @return
     */
    @LogAnnotation(logTitle = "更新角色信息", logLevel = "2")
    @RequestMapping(value = "/updaterole", method = RequestMethod.PUT)
    public ResponseData updateRoleSelective(RoleDO roleDO){
        roleService.updateByPrimaryKeySelective(roleDO);
        return new ResponseData(EmBusinessError.success);
    }

    /**
     * 删除角色
     * @param key
     * @return
     */
    @LogAnnotation(logTitle = "删除角色", logLevel = "4")
    @RequestMapping(value = "/deleterole", method = RequestMethod.DELETE)
    public ResponseData deleteRoleByPrimaryKey(RoleDOKey key){
        roleService.deleteByPrimaryKey(key);
        return new ResponseData(EmBusinessError.success);
    }

    /**
     * 查询所有角色
     * @return
     */
    @LogAnnotation(logTitle = "查询所有角色", logLevel = "1")
    @RequestMapping(value = "/allroles", method = RequestMethod.GET)
    public ResponseData selectAllRoles(){
        List<RoleDO> roles = roleService.selectAllRole();
        return new ResponseData(EmBusinessError.success, roles);
    }
}
