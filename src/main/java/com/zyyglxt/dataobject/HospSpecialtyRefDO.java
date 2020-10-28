package com.zyyglxt.dataobject;

import java.util.Date;

public class HospSpecialtyRefDO extends HospSpecialtyRefDOKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_culpro_hosp_specialty_ref.HOSPITAL_CODE
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private String hospitalCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_culpro_hosp_specialty_ref.SPECIALTY_CODE
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private String specialtyCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_culpro_hosp_specialty_ref.CREATER
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private String creater;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_culpro_hosp_specialty_ref.itemCreateAt
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private Date itemcreateat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_culpro_hosp_specialty_ref.UPDATER
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private String updater;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_culpro_hosp_specialty_ref.itemUpdateAt
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private Date itemupdateat;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_culpro_hosp_specialty_ref.HOSPITAL_CODE
     *
     * @return the value of tb_culpro_hosp_specialty_ref.HOSPITAL_CODE
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public String getHospitalCode() {
        return hospitalCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_culpro_hosp_specialty_ref.HOSPITAL_CODE
     *
     * @param hospitalCode the value for tb_culpro_hosp_specialty_ref.HOSPITAL_CODE
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode == null ? null : hospitalCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_culpro_hosp_specialty_ref.SPECIALTY_CODE
     *
     * @return the value of tb_culpro_hosp_specialty_ref.SPECIALTY_CODE
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public String getSpecialtyCode() {
        return specialtyCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_culpro_hosp_specialty_ref.SPECIALTY_CODE
     *
     * @param specialtyCode the value for tb_culpro_hosp_specialty_ref.SPECIALTY_CODE
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setSpecialtyCode(String specialtyCode) {
        this.specialtyCode = specialtyCode == null ? null : specialtyCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_culpro_hosp_specialty_ref.CREATER
     *
     * @return the value of tb_culpro_hosp_specialty_ref.CREATER
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public String getCreater() {
        return creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_culpro_hosp_specialty_ref.CREATER
     *
     * @param creater the value for tb_culpro_hosp_specialty_ref.CREATER
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_culpro_hosp_specialty_ref.itemCreateAt
     *
     * @return the value of tb_culpro_hosp_specialty_ref.itemCreateAt
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public Date getItemcreateat() {
        return itemcreateat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_culpro_hosp_specialty_ref.itemCreateAt
     *
     * @param itemcreateat the value for tb_culpro_hosp_specialty_ref.itemCreateAt
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setItemcreateat(Date itemcreateat) {
        this.itemcreateat = itemcreateat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_culpro_hosp_specialty_ref.UPDATER
     *
     * @return the value of tb_culpro_hosp_specialty_ref.UPDATER
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public String getUpdater() {
        return updater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_culpro_hosp_specialty_ref.UPDATER
     *
     * @param updater the value for tb_culpro_hosp_specialty_ref.UPDATER
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setUpdater(String updater) {
        this.updater = updater == null ? null : updater.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_culpro_hosp_specialty_ref.itemUpdateAt
     *
     * @return the value of tb_culpro_hosp_specialty_ref.itemUpdateAt
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public Date getItemupdateat() {
        return itemupdateat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_culpro_hosp_specialty_ref.itemUpdateAt
     *
     * @param itemupdateat the value for tb_culpro_hosp_specialty_ref.itemUpdateAt
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setItemupdateat(Date itemupdateat) {
        this.itemupdateat = itemupdateat;
    }
}