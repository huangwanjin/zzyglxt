package com.zyyglxt.dataobject;

import java.util.Date;

public class DoctorDO extends DoctorDOKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_culpro_doctor.DOCTOR_NAME
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private String doctorName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_culpro_doctor.DOCTOR_TYPE
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private String doctorType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_culpro_doctor.DOCTOR_TITLE
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private String doctorTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_culpro_doctor.DEPT_CODE
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private String deptCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_culpro_doctor.HOSP_CODE
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private String hospCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_culpro_doctor.VISIT_TIME
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private String visitTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_culpro_doctor.PHONE
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_culpro_doctor.MAIN_VISIT
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private String mainVisit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_culpro_doctor.STATUS
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_culpro_doctor.CREATER
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private String creater;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_culpro_doctor.itemCreateAt
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private Date itemcreateat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_culpro_doctor.UPDATER
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private String updater;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_culpro_doctor.itemUpdateAt
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    private Date itemupdateat;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_culpro_doctor.DOCTOR_NAME
     *
     * @return the value of tb_culpro_doctor.DOCTOR_NAME
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public String getDoctorName() {
        return doctorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_culpro_doctor.DOCTOR_NAME
     *
     * @param doctorName the value for tb_culpro_doctor.DOCTOR_NAME
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName == null ? null : doctorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_culpro_doctor.DOCTOR_TYPE
     *
     * @return the value of tb_culpro_doctor.DOCTOR_TYPE
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public String getDoctorType() {
        return doctorType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_culpro_doctor.DOCTOR_TYPE
     *
     * @param doctorType the value for tb_culpro_doctor.DOCTOR_TYPE
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setDoctorType(String doctorType) {
        this.doctorType = doctorType == null ? null : doctorType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_culpro_doctor.DOCTOR_TITLE
     *
     * @return the value of tb_culpro_doctor.DOCTOR_TITLE
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public String getDoctorTitle() {
        return doctorTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_culpro_doctor.DOCTOR_TITLE
     *
     * @param doctorTitle the value for tb_culpro_doctor.DOCTOR_TITLE
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setDoctorTitle(String doctorTitle) {
        this.doctorTitle = doctorTitle == null ? null : doctorTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_culpro_doctor.DEPT_CODE
     *
     * @return the value of tb_culpro_doctor.DEPT_CODE
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_culpro_doctor.DEPT_CODE
     *
     * @param deptCode the value for tb_culpro_doctor.DEPT_CODE
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_culpro_doctor.HOSP_CODE
     *
     * @return the value of tb_culpro_doctor.HOSP_CODE
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public String getHospCode() {
        return hospCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_culpro_doctor.HOSP_CODE
     *
     * @param hospCode the value for tb_culpro_doctor.HOSP_CODE
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setHospCode(String hospCode) {
        this.hospCode = hospCode == null ? null : hospCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_culpro_doctor.VISIT_TIME
     *
     * @return the value of tb_culpro_doctor.VISIT_TIME
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public String getVisitTime() {
        return visitTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_culpro_doctor.VISIT_TIME
     *
     * @param visitTime the value for tb_culpro_doctor.VISIT_TIME
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setVisitTime(String visitTime) {
        this.visitTime = visitTime == null ? null : visitTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_culpro_doctor.PHONE
     *
     * @return the value of tb_culpro_doctor.PHONE
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_culpro_doctor.PHONE
     *
     * @param phone the value for tb_culpro_doctor.PHONE
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_culpro_doctor.MAIN_VISIT
     *
     * @return the value of tb_culpro_doctor.MAIN_VISIT
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public String getMainVisit() {
        return mainVisit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_culpro_doctor.MAIN_VISIT
     *
     * @param mainVisit the value for tb_culpro_doctor.MAIN_VISIT
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setMainVisit(String mainVisit) {
        this.mainVisit = mainVisit == null ? null : mainVisit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_culpro_doctor.STATUS
     *
     * @return the value of tb_culpro_doctor.STATUS
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_culpro_doctor.STATUS
     *
     * @param status the value for tb_culpro_doctor.STATUS
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_culpro_doctor.CREATER
     *
     * @return the value of tb_culpro_doctor.CREATER
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public String getCreater() {
        return creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_culpro_doctor.CREATER
     *
     * @param creater the value for tb_culpro_doctor.CREATER
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_culpro_doctor.itemCreateAt
     *
     * @return the value of tb_culpro_doctor.itemCreateAt
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public Date getItemcreateat() {
        return itemcreateat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_culpro_doctor.itemCreateAt
     *
     * @param itemcreateat the value for tb_culpro_doctor.itemCreateAt
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setItemcreateat(Date itemcreateat) {
        this.itemcreateat = itemcreateat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_culpro_doctor.UPDATER
     *
     * @return the value of tb_culpro_doctor.UPDATER
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public String getUpdater() {
        return updater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_culpro_doctor.UPDATER
     *
     * @param updater the value for tb_culpro_doctor.UPDATER
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setUpdater(String updater) {
        this.updater = updater == null ? null : updater.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_culpro_doctor.itemUpdateAt
     *
     * @return the value of tb_culpro_doctor.itemUpdateAt
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public Date getItemupdateat() {
        return itemupdateat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_culpro_doctor.itemUpdateAt
     *
     * @param itemupdateat the value for tb_culpro_doctor.itemUpdateAt
     *
     * @mbg.generated Wed Oct 28 16:25:52 CST 2020
     */
    public void setItemupdateat(Date itemupdateat) {
        this.itemupdateat = itemupdateat;
    }
}