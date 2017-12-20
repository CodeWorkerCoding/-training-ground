package com.nchu.learn.mybatis.model;

import java.math.BigDecimal;
import java.util.Date;

public class Refund {
    private String id;

    private String tradeId;

    private String tradeNo;

    private String fundLoanId;

    private String retTradeCode;

    private String fundId;

    private String fundShortName;

    private String brand;

    private String returnType;

    private String returnReason;

    private String orderNo;

    private String dealerName;

    private BigDecimal loanAmount;

    private BigDecimal merchantFee;

    private BigDecimal loanPrincipal;

    private Integer loanPeriod;

    private String loanName;

    private String repayType;

    private String loanType;

    private String innerProductno;

    private Long outputPayTime;

    private Long outputRefundTime;

    private Long submitRefundTime;

    private String refundStatus;

    private BigDecimal outputRefundAmt;

    private BigDecimal outputRefundPrincipal;

    private BigDecimal outputRefundInterest;

    private Date createdTime;

    private Date modifiedTime;

    private String creater;

    private String updater;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId == null ? null : tradeId.trim();
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    public String getFundLoanId() {
        return fundLoanId;
    }

    public void setFundLoanId(String fundLoanId) {
        this.fundLoanId = fundLoanId == null ? null : fundLoanId.trim();
    }

    public String getRetTradeCode() {
        return retTradeCode;
    }

    public void setRetTradeCode(String retTradeCode) {
        this.retTradeCode = retTradeCode == null ? null : retTradeCode.trim();
    }

    public String getFundId() {
        return fundId;
    }

    public void setFundId(String fundId) {
        this.fundId = fundId == null ? null : fundId.trim();
    }

    public String getFundShortName() {
        return fundShortName;
    }

    public void setFundShortName(String fundShortName) {
        this.fundShortName = fundShortName == null ? null : fundShortName.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType == null ? null : returnType.trim();
    }

    public String getReturnReason() {
        return returnReason;
    }

    public void setReturnReason(String returnReason) {
        this.returnReason = returnReason == null ? null : returnReason.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName == null ? null : dealerName.trim();
    }

    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    public BigDecimal getMerchantFee() {
        return merchantFee;
    }

    public void setMerchantFee(BigDecimal merchantFee) {
        this.merchantFee = merchantFee;
    }

    public BigDecimal getLoanPrincipal() {
        return loanPrincipal;
    }

    public void setLoanPrincipal(BigDecimal loanPrincipal) {
        this.loanPrincipal = loanPrincipal;
    }

    public Integer getLoanPeriod() {
        return loanPeriod;
    }

    public void setLoanPeriod(Integer loanPeriod) {
        this.loanPeriod = loanPeriod;
    }

    public String getLoanName() {
        return loanName;
    }

    public void setLoanName(String loanName) {
        this.loanName = loanName == null ? null : loanName.trim();
    }

    public String getRepayType() {
        return repayType;
    }

    public void setRepayType(String repayType) {
        this.repayType = repayType == null ? null : repayType.trim();
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType == null ? null : loanType.trim();
    }

    public String getInnerProductno() {
        return innerProductno;
    }

    public void setInnerProductno(String innerProductno) {
        this.innerProductno = innerProductno == null ? null : innerProductno.trim();
    }

    public Long getOutputPayTime() {
        return outputPayTime;
    }

    public void setOutputPayTime(Long outputPayTime) {
        this.outputPayTime = outputPayTime;
    }

    public Long getOutputRefundTime() {
        return outputRefundTime;
    }

    public void setOutputRefundTime(Long outputRefundTime) {
        this.outputRefundTime = outputRefundTime;
    }

    public Long getSubmitRefundTime() {
        return submitRefundTime;
    }

    public void setSubmitRefundTime(Long submitRefundTime) {
        this.submitRefundTime = submitRefundTime;
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus == null ? null : refundStatus.trim();
    }

    public BigDecimal getOutputRefundAmt() {
        return outputRefundAmt;
    }

    public void setOutputRefundAmt(BigDecimal outputRefundAmt) {
        this.outputRefundAmt = outputRefundAmt;
    }

    public BigDecimal getOutputRefundPrincipal() {
        return outputRefundPrincipal;
    }

    public void setOutputRefundPrincipal(BigDecimal outputRefundPrincipal) {
        this.outputRefundPrincipal = outputRefundPrincipal;
    }

    public BigDecimal getOutputRefundInterest() {
        return outputRefundInterest;
    }

    public void setOutputRefundInterest(BigDecimal outputRefundInterest) {
        this.outputRefundInterest = outputRefundInterest;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater == null ? null : updater.trim();
    }
}