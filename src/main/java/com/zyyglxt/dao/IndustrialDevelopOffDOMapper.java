package com.zyyglxt.dao;

import com.zyyglxt.dataobject.IndustrialDevelopOffDO;
import com.zyyglxt.dataobject.IndustrialDevelopOffDOKey;

import java.util.List;

public interface IndustrialDevelopOffDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_industrial_develop_off
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int deleteByPrimaryKey(IndustrialDevelopOffDOKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_industrial_develop_off
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int insert(IndustrialDevelopOffDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_industrial_develop_off
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int insertSelective(IndustrialDevelopOffDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_industrial_develop_off
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    IndustrialDevelopOffDO selectByPrimaryKey(IndustrialDevelopOffDOKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_industrial_develop_off
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int updateByPrimaryKeySelective(IndustrialDevelopOffDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_industrial_develop_off
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    int updateByPrimaryKey(IndustrialDevelopOffDO record);

    List<IndustrialDevelopOffDO> selectByPage(int start, int end);

    List<IndustrialDevelopOffDO> selectAll();
}