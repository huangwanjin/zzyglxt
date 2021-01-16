package com.zyyglxt.dao;

import com.zyyglxt.dataobject.IndustrialDevelopExpertRefDO;
import com.zyyglxt.dataobject.IndustrialDevelopExpertRefDOKey;
import com.zyyglxt.dto.ExmaineDto;

import java.util.List;

public interface IndustrialDevelopExpertRefDOMapper {

    int deleteByPrimaryKey(IndustrialDevelopExpertRefDOKey key);

    int insert(IndustrialDevelopExpertRefDO record);

    int insertSelective(IndustrialDevelopExpertRefDO record);

    IndustrialDevelopExpertRefDO selectByPrimaryKey(IndustrialDevelopExpertRefDOKey key);

    List<ExmaineDto> selectAll();

    List<ExmaineDto> selectByExpertCode(String expertCode);

    int updateByPrimaryKeySelective(IndustrialDevelopExpertRefDO record);

    int updateByPrimaryKey(IndustrialDevelopExpertRefDO record);

    List<IndustrialDevelopExpertRefDO> selectByTopicCode(String topicCode);

    int deleteByTopicCode(String topicCode);
}