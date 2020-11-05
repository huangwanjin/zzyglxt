package com.zyyglxt.dao;

import com.zyyglxt.dataobject.CulturalResourcesDO;
import com.zyyglxt.dataobject.CulturalResourcesDOKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CulturalResourcesDOMapper {

    int deleteByPrimaryKey(CulturalResourcesDOKey key);

    int insert(CulturalResourcesDO record);

    int insertSelective(CulturalResourcesDO record);

    CulturalResourcesDO selectByPrimaryKey(@Param("key")CulturalResourcesDOKey key, @Param("chineseCulturalType") String chineseCulturalType);

    List<CulturalResourcesDO> selectCulturalResourcesList(String chineseCulturalType);

    int updateByPrimaryKeySelective(CulturalResourcesDO record);

    int changeStatusByPrimaryKeySelective(@Param("key") CulturalResourcesDOKey key, @Param("status") String chineseCulturalStatus);

    int updateByPrimaryKeyWithBLOBs(CulturalResourcesDO record);

    int updateByPrimaryKey(CulturalResourcesDO record);
}