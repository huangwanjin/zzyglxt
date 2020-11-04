package com.zyyglxt.controller.ChineseCultural.resource;

import com.zyyglxt.dataobject.ChineseCulturalDO;
import com.zyyglxt.dataobject.ChineseCulturalDOKey;
import com.zyyglxt.dataobject.CulturalResourcesDO;
import com.zyyglxt.dataobject.CulturalResourcesDOKey;
import com.zyyglxt.error.BusinessException;
import com.zyyglxt.error.EmBusinessError;
import com.zyyglxt.response.ResponseData;
import com.zyyglxt.service.ITraditionalCulturalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author:wangzh
 * Date: 2020/10/30 9:19
 * Version: 1.0
 * 中医医史控制器
 */
//@Controller
@RestController
@RequestMapping("/cul/res/traCul")
public class TraditionalCulturalController {

    @Autowired
    private ITraditionalCulturalService traditionalCulturalService;

    //获取所有的中医医史
    @RequestMapping(value = "/getAll" , method = RequestMethod.GET)
    @ResponseBody
    public ResponseData getAllTraditionalCultural(){
        List<CulturalResourcesDO> traditionalCulturalList = traditionalCulturalService.getTraditionalCulturalList();
        return new ResponseData(EmBusinessError.success,traditionalCulturalList);
    }

    //查询一个中医医史

    //去增加页面,这个是为了跳转到增加的页面
//    @RequestMapping(value = "/toAddPage" , method = RequestMethod.GET)
//    public String toAddPage(){
//        return "to add page";
//    }

    //增加一个中医医史
    @RequestMapping(value = "/addTraCul" , method = RequestMethod.POST)
    @ResponseBody
    public ResponseData addTraditionalCultural(@RequestBody CulturalResourcesDO culturalResourcesDO) throws BusinessException {
        culturalResourcesDO.setChineseCulturalType("中医医史");
        culturalResourcesDO.setChineseCulturalStatus("待上架");
        traditionalCulturalService.addTraditionalCultural(culturalResourcesDO);
        return new ResponseData(EmBusinessError.success);
    }

    //删除一个中医医史（真正的数据库中删除）
    @RequestMapping(value = "/delTraCul/{itemID}/{itemCode}" , method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseData deleteTraditionalCultural(@PathVariable("itemID") Integer itemID, @PathVariable("itemCode")String itemCode){
        CulturalResourcesDOKey culturalResourcesDOKey = new CulturalResourcesDOKey();
        culturalResourcesDOKey.setItemid(itemID);
        culturalResourcesDOKey.setItemcode(itemCode);
        traditionalCulturalService.removeTraditionalCultural(culturalResourcesDOKey);
        return new ResponseData(EmBusinessError.success);
    }

    //去修改的页面
    @RequestMapping(value = "/toUpdTraCul/{itemID}/{itemCode}" , method = RequestMethod.GET)
    @ResponseBody
    public ResponseData toUpdatePage(@PathVariable("itemID") Integer itemID, @PathVariable("itemCode")String itemCode){
        CulturalResourcesDOKey culturalResourcesDOKey = new CulturalResourcesDOKey();
        culturalResourcesDOKey.setItemid(itemID);
        culturalResourcesDOKey.setItemcode(itemCode);
        CulturalResourcesDO culturalResources = traditionalCulturalService.getTraditionalCultural(culturalResourcesDOKey);
        return new ResponseData(EmBusinessError.success,culturalResources);
    }

    //修改一个中医医史
    @RequestMapping(value = "/updTraCul" , method = RequestMethod.POST)
    @ResponseBody
    public ResponseData updateTraditionalCultural(@RequestBody CulturalResourcesDO culturalResourcesDO) throws BusinessException {
        traditionalCulturalService.updateTraditionalCultural(culturalResourcesDO);
        return new ResponseData(EmBusinessError.success);
    }

    //修改一个中医医史状态 （逻辑删除，但是是将状态改成下架状态,也可以是处长页面 通过->上架， 未通过->下架）
    @RequestMapping(value = "/cgTraCulSta/{itemID}/{itemCode}" , method = RequestMethod.POST)
    @ResponseBody
    public ResponseData changeStatus(@RequestParam("chineseCulturalStatus") String chineseCulturalStatus , @PathVariable("itemID") Integer itemID, @PathVariable("itemCode")String itemCode){
        CulturalResourcesDOKey culturalResourcesDOKey = new CulturalResourcesDOKey();
        culturalResourcesDOKey.setItemid(itemID);
        culturalResourcesDOKey.setItemcode(itemCode);
        traditionalCulturalService.changeTraditionalCulturalStatus(culturalResourcesDOKey,chineseCulturalStatus);
        return new ResponseData(EmBusinessError.success);
    }

}