package com.zyyglxt.service.impl;

import com.zyyglxt.dto.industrialDevelop.IndustrialDevelopChiMedDto;
import com.zyyglxt.service.IFileService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zyyglxt.dao.IndustrialDevelopChiMedMapper;
import com.zyyglxt.dataobject.IndustrialDevelopChiMed;
import com.zyyglxt.service.IndustrialDevelopChiMedService;

import java.util.ArrayList;
import java.util.List;

/**
   *@Author lrt
   *@Date 2020/11/6 20:00
   *@Version 1.0
**/
@Service
public class IndustrialDevelopChiMedServiceImpl implements IndustrialDevelopChiMedService{

    @Resource
    private IndustrialDevelopChiMedMapper industrialDevelopChiMedMapper;

    @Resource
    private IFileService fileService;

    @Override
    public int deleteByPrimaryKey(Integer itemid,String itemcode) {
        return industrialDevelopChiMedMapper.deleteByPrimaryKey(itemid,itemcode);
    }

    @Override
    public int insert(IndustrialDevelopChiMed record) {
        return industrialDevelopChiMedMapper.insert(record);
    }

    @Override
    public int insertSelective(IndustrialDevelopChiMed record) {
        return industrialDevelopChiMedMapper.insertSelective(record);
    }

    @Override
    public IndustrialDevelopChiMed selectByPrimaryKey(Integer itemid,String itemcode) {
        return industrialDevelopChiMedMapper.selectByPrimaryKey(itemid,itemcode);
    }

    @Override
    public int updateByPrimaryKeySelective(IndustrialDevelopChiMed record) {
        return industrialDevelopChiMedMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(IndustrialDevelopChiMed record) {
        return industrialDevelopChiMedMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<IndustrialDevelopChiMedDto> selectAll(String type) {
        List<IndustrialDevelopChiMed> list = industrialDevelopChiMedMapper.selectAll(type);
        List<IndustrialDevelopChiMedDto> resList = new ArrayList<>();
        for (IndustrialDevelopChiMed item: list){
            IndustrialDevelopChiMedDto newObj = new IndustrialDevelopChiMedDto();
            BeanUtils.copyProperties(item,newObj);
            resList.add(newObj);
        }
        BeanUtils.copyProperties(list,resList);
        for (IndustrialDevelopChiMedDto item: resList){
            item.setFilePath(fileService.selectFileByDataCode(item.getItemcode()).getFilePath());
        }
        return resList;
    }

}
