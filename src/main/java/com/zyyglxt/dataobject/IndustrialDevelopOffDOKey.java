package com.zyyglxt.dataobject;

public class IndustrialDevelopOffDOKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_industrial_develop_off.itemID
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private Integer itemid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_industrial_develop_off.itemCode
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private String itemcode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_industrial_develop_off.itemID
     *
     * @return the value of tb_industrial_develop_off.itemID
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public Integer getItemid() {
        return itemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_industrial_develop_off.itemID
     *
     * @param itemid the value for tb_industrial_develop_off.itemID
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_industrial_develop_off.itemCode
     *
     * @return the value of tb_industrial_develop_off.itemCode
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public String getItemcode() {
        return itemcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_industrial_develop_off.itemCode
     *
     * @param itemcode the value for tb_industrial_develop_off.itemCode
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setItemcode(String itemcode) {
        this.itemcode = itemcode == null ? null : itemcode.trim();
    }
}