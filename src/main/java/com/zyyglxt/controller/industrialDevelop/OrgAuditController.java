package com.zyyglxt.controller.industrialDevelop;

import com.zyyglxt.error.EmBusinessError;
import com.zyyglxt.response.ResponseData;
import com.zyyglxt.service.IAuditService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author lrt
 * @Date 2020/11/15 16:46
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "industrialdevelop")
public class OrgAuditController {

    @Resource
    IAuditService auditService;

    @GetMapping(value = "/audits")
    public ResponseData getAll() {
        return new ResponseData(EmBusinessError.success, auditService.getAll());
    }

    @GetMapping(value = "/audits/{type}")
    public ResponseData getAllByType(@PathVariable String type) {
        return new ResponseData(EmBusinessError.success, auditService.getAllByType(type));
    }

    @GetMapping(value = "/audits/{type}/{itemcode}/{itemid}")
    public ResponseData getDetail(@PathVariable String type, @PathVariable String itemcode, @PathVariable int itemid) {
        switch (type) {
            case "tec":
            case "lab":
            case "tour":
                return new ResponseData(EmBusinessError.success, auditService.getDetailTecSerOrg(itemid,itemcode));
            case "plant":
            case "process":
            case "sale":
            case "produce":
                return new ResponseData(EmBusinessError.success, auditService.getDetailChiMed(itemid,itemcode));
            case "school":
                return new ResponseData(EmBusinessError.success, auditService.getDetailSchool(itemid,itemcode));
            case "hospital":
                return new ResponseData(EmBusinessError.success, auditService.getDetailHospital(itemid,itemcode));
        }
        return new ResponseData(EmBusinessError.fail);
    }

    @GetMapping(value = "/audits/{type}/{itemcode}")
    public ResponseData getDetail(@PathVariable String type, @PathVariable String itemcode) {
        switch (type) {
            case "tec":
            case "lab":
            case "tour":
                return new ResponseData(EmBusinessError.success, auditService.getDetailTecSerOrg(null,itemcode));
            case "plant":
            case "process":
            case "sale":
            case "produce":
                return new ResponseData(EmBusinessError.success, auditService.getDetailChiMed(null,itemcode));
            case "school":
                return new ResponseData(EmBusinessError.success, auditService.getDetailSchool(null,itemcode));
            case "hospital":
                return new ResponseData(EmBusinessError.success, auditService.getDetailHospital(null,itemcode));
        }
        return new ResponseData(EmBusinessError.fail);
    }

}