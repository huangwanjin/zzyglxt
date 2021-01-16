package com.zyyglxt.controller.industrialDevelop;

import com.zyyglxt.dataobject.IndustrialDevelopTalRecDO;
import com.zyyglxt.dataobject.IndustrialDevelopTalRecDOKey;
import com.zyyglxt.error.EmBusinessError;
import com.zyyglxt.response.ResponseData;
import com.zyyglxt.service.IIndustrialDevelopTalRecService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author lrt
 * @Date 2020/10/29 12:00
 * @Version 1.0
 **/
@Api(tags = "产业发展-人才招募")
@RestController
@RequestMapping(value = "industrialdevelop")
public class TalRecController {
    @Resource
    IIndustrialDevelopTalRecService talRecService;

    @RequestMapping(value = "/talrec", method = RequestMethod.POST)
    @ResponseBody
    public ResponseData addTalRec(@RequestBody IndustrialDevelopTalRecDO record) {
        talRecService.addTalRec(record);
        return new ResponseData(EmBusinessError.success);
    }

    @RequestMapping(value = "/talrec", method = RequestMethod.PUT)
    @ResponseBody
    public ResponseData updTalRec(@RequestBody IndustrialDevelopTalRecDO record) {
        talRecService.updTalRec(record);
        return new ResponseData(EmBusinessError.success);
    }

    @RequestMapping(value = "/talrec", method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseData delTalRec(@RequestBody IndustrialDevelopTalRecDOKey key) {
        talRecService.delTalRec(key);
        return new ResponseData(EmBusinessError.success);
    }

    @GetMapping(value = "/talrec/{orgCode}")
    @ResponseBody
    public ResponseData getTalRec(@PathVariable String orgCode){
        return new ResponseData(EmBusinessError.success, talRecService.getTalRecs(orgCode));
    }
}
