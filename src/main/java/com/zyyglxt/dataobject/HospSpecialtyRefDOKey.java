package com.zyyglxt.dataobject;

public class HospSpecialtyRefDOKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_culpro_hosp_specialty_ref.itemID
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private Integer itemid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_culpro_hosp_specialty_ref.itemCode
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private String itemcode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_culpro_hosp_specialty_ref.itemID
     *
     * @return the value of tb_culpro_hosp_specialty_ref.itemID
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public Integer getItemid() {
        return itemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_culpro_hosp_specialty_ref.itemID
     *
     * @param itemid the value for tb_culpro_hosp_specialty_ref.itemID
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_culpro_hosp_specialty_ref.itemCode
     *
     * @return the value of tb_culpro_hosp_specialty_ref.itemCode
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public String getItemcode() {
        return itemcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_culpro_hosp_specialty_ref.itemCode
     *
     * @param itemcode the value for tb_culpro_hosp_specialty_ref.itemCode
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setItemcode(String itemcode) {
        this.itemcode = itemcode == null ? null : itemcode.trim();
    }
}