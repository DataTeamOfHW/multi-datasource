package com.comstar.mars.entity;

public class SecurityPaymentScheduleKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMSTPLC.SECURITY_PYMN_SCHD.SEQ
     *
     * @mbggenerated Wed Jul 30 13:56:40 CST 2014
     */
    private Integer seq;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COMSTPLC.SECURITY_PYMN_SCHD.SECURITY_CODE
     *
     * @mbggenerated Wed Jul 30 13:56:40 CST 2014
     */
    private String securityCode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMSTPLC.SECURITY_PYMN_SCHD.SEQ
     *
     * @return the value of COMSTPLC.SECURITY_PYMN_SCHD.SEQ
     *
     * @mbggenerated Wed Jul 30 13:56:40 CST 2014
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMSTPLC.SECURITY_PYMN_SCHD.SEQ
     *
     * @param seq the value for COMSTPLC.SECURITY_PYMN_SCHD.SEQ
     *
     * @mbggenerated Wed Jul 30 13:56:40 CST 2014
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COMSTPLC.SECURITY_PYMN_SCHD.SECURITY_CODE
     *
     * @return the value of COMSTPLC.SECURITY_PYMN_SCHD.SECURITY_CODE
     *
     * @mbggenerated Wed Jul 30 13:56:40 CST 2014
     */
    public String getSecurityCode() {
        return securityCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COMSTPLC.SECURITY_PYMN_SCHD.SECURITY_CODE
     *
     * @param securityCode the value for COMSTPLC.SECURITY_PYMN_SCHD.SECURITY_CODE
     *
     * @mbggenerated Wed Jul 30 13:56:40 CST 2014
     */
    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode == null ? null : securityCode.trim();
    }
}