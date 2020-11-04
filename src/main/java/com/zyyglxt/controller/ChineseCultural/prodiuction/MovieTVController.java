package com.zyyglxt.controller.ChineseCultural.prodiuction;

import com.zyyglxt.dataobject.ChineseCulturalDO;
import com.zyyglxt.dataobject.ChineseCulturalDOKey;
import com.zyyglxt.error.BusinessException;
import com.zyyglxt.error.EmBusinessError;
import com.zyyglxt.response.ResponseData;
import com.zyyglxt.service.IMovieTVService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Author:wangzh
 * Date: 2020/10/30 12:21
 * Version: 1.0
 * 电影电视控制器
 */
//@Controller
@RestController
@RequestMapping("/cul/pro/movTv")
public class MovieTVController {

    @Resource
    private IMovieTVService iMovieTVService;

    //获取所有的电影电视
    @RequestMapping(value = "/getAll" , method = RequestMethod.GET)
    @ResponseBody
    public ResponseData getAllMovieTV(){
        List<ChineseCulturalDO> movieTVList = iMovieTVService.getMovieTVList();
        return new ResponseData(EmBusinessError.success,movieTVList);
    }

//    //查询一个电影电视
//
//    //去增加页面,这个是为了跳转到增加的页面
//    @RequestMapping(value = "/toAddPage" , method = RequestMethod.GET)
//    public ResponseData toAddPage(){
//        return "to add page";
//    }

    //增加一个漫画典故
    @RequestMapping(value = "/addMovTv" , method = RequestMethod.POST)
    @ResponseBody
    public ResponseData addMovieTV(@RequestBody ChineseCulturalDO chineseCulturalDO) throws BusinessException {
        chineseCulturalDO.setChineseCulturalType("电影电视");
        chineseCulturalDO.setChineseCulturalStatus("待上架");
        iMovieTVService.addMovieTV(chineseCulturalDO);
        return new ResponseData(EmBusinessError.success);
    }

    //删除一个电影电视（真正的数据库中删除）
    @RequestMapping(value = "/delMovTv/{itemID}/{itemCode}" , method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseData deleteMovieTV(@PathVariable("itemID") Integer itemID, @PathVariable("itemCode")String itemCode){
        ChineseCulturalDOKey chineseCulturalDOKey = new ChineseCulturalDOKey();
        chineseCulturalDOKey.setItemid(itemID);
        chineseCulturalDOKey.setItemcode(itemCode);
        iMovieTVService.removeMovieTV(chineseCulturalDOKey);
        return new ResponseData(EmBusinessError.success);
    }

    //去修改的页面
    @RequestMapping(value = "/toUpdMovTv/{itemID}/{itemCode}" , method = RequestMethod.GET)
    @ResponseBody
    public ResponseData toUpdatePage(@PathVariable("itemID") Integer itemID, @PathVariable("itemCode")String itemCode){
        ChineseCulturalDOKey chineseCulturalDOKey = new ChineseCulturalDOKey();
        chineseCulturalDOKey.setItemid(itemID);
        chineseCulturalDOKey.setItemcode(itemCode);
        ChineseCulturalDO chineseCultural = iMovieTVService.getMovieTV(chineseCulturalDOKey);
        return new ResponseData(EmBusinessError.success,chineseCultural);
    }

    //修改一个电影电视
    @RequestMapping(value = "/updMovTv" , method = RequestMethod.POST)
    @ResponseBody
    public ResponseData updateMovieTV(@RequestBody ChineseCulturalDO chineseCulturalDO) throws BusinessException {
        iMovieTVService.updateMovieTV(chineseCulturalDO);
        return new ResponseData(EmBusinessError.success);
    }

    //修改一个电影电视状态 （逻辑删除，但是是将状态改成下架状态,也可以是处长页面 通过->上架， 未通过->下架）
    @RequestMapping(value = "/cgMovTvSta/{itemID}/{itemCode}" , method = RequestMethod.POST)
    @ResponseBody
    public ResponseData changeStatus(@RequestParam("chineseCulturalStatus") String chineseCulturalStatus ,@PathVariable("itemID") Integer itemID, @PathVariable("itemCode")String itemCode){
        ChineseCulturalDOKey chineseCulturalDOKey = new ChineseCulturalDOKey();
        chineseCulturalDOKey.setItemid(itemID);
        chineseCulturalDOKey.setItemcode(itemCode);
        iMovieTVService.changeMovieStatus(chineseCulturalDOKey,chineseCulturalStatus);
        return new ResponseData(EmBusinessError.success);
    }
}