package com.nchu.learn.mybatis.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RefundExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RefundExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTradeIdIsNull() {
            addCriterion("trade_id is null");
            return (Criteria) this;
        }

        public Criteria andTradeIdIsNotNull() {
            addCriterion("trade_id is not null");
            return (Criteria) this;
        }

        public Criteria andTradeIdEqualTo(String value) {
            addCriterion("trade_id =", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdNotEqualTo(String value) {
            addCriterion("trade_id <>", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdGreaterThan(String value) {
            addCriterion("trade_id >", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdGreaterThanOrEqualTo(String value) {
            addCriterion("trade_id >=", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdLessThan(String value) {
            addCriterion("trade_id <", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdLessThanOrEqualTo(String value) {
            addCriterion("trade_id <=", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdLike(String value) {
            addCriterion("trade_id like", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdNotLike(String value) {
            addCriterion("trade_id not like", value, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdIn(List<String> values) {
            addCriterion("trade_id in", values, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdNotIn(List<String> values) {
            addCriterion("trade_id not in", values, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdBetween(String value1, String value2) {
            addCriterion("trade_id between", value1, value2, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeIdNotBetween(String value1, String value2) {
            addCriterion("trade_id not between", value1, value2, "tradeId");
            return (Criteria) this;
        }

        public Criteria andTradeNoIsNull() {
            addCriterion("trade_no is null");
            return (Criteria) this;
        }

        public Criteria andTradeNoIsNotNull() {
            addCriterion("trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andTradeNoEqualTo(String value) {
            addCriterion("trade_no =", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotEqualTo(String value) {
            addCriterion("trade_no <>", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThan(String value) {
            addCriterion("trade_no >", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("trade_no >=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThan(String value) {
            addCriterion("trade_no <", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThanOrEqualTo(String value) {
            addCriterion("trade_no <=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLike(String value) {
            addCriterion("trade_no like", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotLike(String value) {
            addCriterion("trade_no not like", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoIn(List<String> values) {
            addCriterion("trade_no in", values, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotIn(List<String> values) {
            addCriterion("trade_no not in", values, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoBetween(String value1, String value2) {
            addCriterion("trade_no between", value1, value2, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotBetween(String value1, String value2) {
            addCriterion("trade_no not between", value1, value2, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andFundLoanIdIsNull() {
            addCriterion("fund_loan_id is null");
            return (Criteria) this;
        }

        public Criteria andFundLoanIdIsNotNull() {
            addCriterion("fund_loan_id is not null");
            return (Criteria) this;
        }

        public Criteria andFundLoanIdEqualTo(String value) {
            addCriterion("fund_loan_id =", value, "fundLoanId");
            return (Criteria) this;
        }

        public Criteria andFundLoanIdNotEqualTo(String value) {
            addCriterion("fund_loan_id <>", value, "fundLoanId");
            return (Criteria) this;
        }

        public Criteria andFundLoanIdGreaterThan(String value) {
            addCriterion("fund_loan_id >", value, "fundLoanId");
            return (Criteria) this;
        }

        public Criteria andFundLoanIdGreaterThanOrEqualTo(String value) {
            addCriterion("fund_loan_id >=", value, "fundLoanId");
            return (Criteria) this;
        }

        public Criteria andFundLoanIdLessThan(String value) {
            addCriterion("fund_loan_id <", value, "fundLoanId");
            return (Criteria) this;
        }

        public Criteria andFundLoanIdLessThanOrEqualTo(String value) {
            addCriterion("fund_loan_id <=", value, "fundLoanId");
            return (Criteria) this;
        }

        public Criteria andFundLoanIdLike(String value) {
            addCriterion("fund_loan_id like", value, "fundLoanId");
            return (Criteria) this;
        }

        public Criteria andFundLoanIdNotLike(String value) {
            addCriterion("fund_loan_id not like", value, "fundLoanId");
            return (Criteria) this;
        }

        public Criteria andFundLoanIdIn(List<String> values) {
            addCriterion("fund_loan_id in", values, "fundLoanId");
            return (Criteria) this;
        }

        public Criteria andFundLoanIdNotIn(List<String> values) {
            addCriterion("fund_loan_id not in", values, "fundLoanId");
            return (Criteria) this;
        }

        public Criteria andFundLoanIdBetween(String value1, String value2) {
            addCriterion("fund_loan_id between", value1, value2, "fundLoanId");
            return (Criteria) this;
        }

        public Criteria andFundLoanIdNotBetween(String value1, String value2) {
            addCriterion("fund_loan_id not between", value1, value2, "fundLoanId");
            return (Criteria) this;
        }

        public Criteria andRetTradeCodeIsNull() {
            addCriterion("ret_trade_code is null");
            return (Criteria) this;
        }

        public Criteria andRetTradeCodeIsNotNull() {
            addCriterion("ret_trade_code is not null");
            return (Criteria) this;
        }

        public Criteria andRetTradeCodeEqualTo(String value) {
            addCriterion("ret_trade_code =", value, "retTradeCode");
            return (Criteria) this;
        }

        public Criteria andRetTradeCodeNotEqualTo(String value) {
            addCriterion("ret_trade_code <>", value, "retTradeCode");
            return (Criteria) this;
        }

        public Criteria andRetTradeCodeGreaterThan(String value) {
            addCriterion("ret_trade_code >", value, "retTradeCode");
            return (Criteria) this;
        }

        public Criteria andRetTradeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ret_trade_code >=", value, "retTradeCode");
            return (Criteria) this;
        }

        public Criteria andRetTradeCodeLessThan(String value) {
            addCriterion("ret_trade_code <", value, "retTradeCode");
            return (Criteria) this;
        }

        public Criteria andRetTradeCodeLessThanOrEqualTo(String value) {
            addCriterion("ret_trade_code <=", value, "retTradeCode");
            return (Criteria) this;
        }

        public Criteria andRetTradeCodeLike(String value) {
            addCriterion("ret_trade_code like", value, "retTradeCode");
            return (Criteria) this;
        }

        public Criteria andRetTradeCodeNotLike(String value) {
            addCriterion("ret_trade_code not like", value, "retTradeCode");
            return (Criteria) this;
        }

        public Criteria andRetTradeCodeIn(List<String> values) {
            addCriterion("ret_trade_code in", values, "retTradeCode");
            return (Criteria) this;
        }

        public Criteria andRetTradeCodeNotIn(List<String> values) {
            addCriterion("ret_trade_code not in", values, "retTradeCode");
            return (Criteria) this;
        }

        public Criteria andRetTradeCodeBetween(String value1, String value2) {
            addCriterion("ret_trade_code between", value1, value2, "retTradeCode");
            return (Criteria) this;
        }

        public Criteria andRetTradeCodeNotBetween(String value1, String value2) {
            addCriterion("ret_trade_code not between", value1, value2, "retTradeCode");
            return (Criteria) this;
        }

        public Criteria andFundIdIsNull() {
            addCriterion("fund_id is null");
            return (Criteria) this;
        }

        public Criteria andFundIdIsNotNull() {
            addCriterion("fund_id is not null");
            return (Criteria) this;
        }

        public Criteria andFundIdEqualTo(String value) {
            addCriterion("fund_id =", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdNotEqualTo(String value) {
            addCriterion("fund_id <>", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdGreaterThan(String value) {
            addCriterion("fund_id >", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdGreaterThanOrEqualTo(String value) {
            addCriterion("fund_id >=", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdLessThan(String value) {
            addCriterion("fund_id <", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdLessThanOrEqualTo(String value) {
            addCriterion("fund_id <=", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdLike(String value) {
            addCriterion("fund_id like", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdNotLike(String value) {
            addCriterion("fund_id not like", value, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdIn(List<String> values) {
            addCriterion("fund_id in", values, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdNotIn(List<String> values) {
            addCriterion("fund_id not in", values, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdBetween(String value1, String value2) {
            addCriterion("fund_id between", value1, value2, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundIdNotBetween(String value1, String value2) {
            addCriterion("fund_id not between", value1, value2, "fundId");
            return (Criteria) this;
        }

        public Criteria andFundShortNameIsNull() {
            addCriterion("fund_short_name is null");
            return (Criteria) this;
        }

        public Criteria andFundShortNameIsNotNull() {
            addCriterion("fund_short_name is not null");
            return (Criteria) this;
        }

        public Criteria andFundShortNameEqualTo(String value) {
            addCriterion("fund_short_name =", value, "fundShortName");
            return (Criteria) this;
        }

        public Criteria andFundShortNameNotEqualTo(String value) {
            addCriterion("fund_short_name <>", value, "fundShortName");
            return (Criteria) this;
        }

        public Criteria andFundShortNameGreaterThan(String value) {
            addCriterion("fund_short_name >", value, "fundShortName");
            return (Criteria) this;
        }

        public Criteria andFundShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("fund_short_name >=", value, "fundShortName");
            return (Criteria) this;
        }

        public Criteria andFundShortNameLessThan(String value) {
            addCriterion("fund_short_name <", value, "fundShortName");
            return (Criteria) this;
        }

        public Criteria andFundShortNameLessThanOrEqualTo(String value) {
            addCriterion("fund_short_name <=", value, "fundShortName");
            return (Criteria) this;
        }

        public Criteria andFundShortNameLike(String value) {
            addCriterion("fund_short_name like", value, "fundShortName");
            return (Criteria) this;
        }

        public Criteria andFundShortNameNotLike(String value) {
            addCriterion("fund_short_name not like", value, "fundShortName");
            return (Criteria) this;
        }

        public Criteria andFundShortNameIn(List<String> values) {
            addCriterion("fund_short_name in", values, "fundShortName");
            return (Criteria) this;
        }

        public Criteria andFundShortNameNotIn(List<String> values) {
            addCriterion("fund_short_name not in", values, "fundShortName");
            return (Criteria) this;
        }

        public Criteria andFundShortNameBetween(String value1, String value2) {
            addCriterion("fund_short_name between", value1, value2, "fundShortName");
            return (Criteria) this;
        }

        public Criteria andFundShortNameNotBetween(String value1, String value2) {
            addCriterion("fund_short_name not between", value1, value2, "fundShortName");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andReturnTypeIsNull() {
            addCriterion("return_type is null");
            return (Criteria) this;
        }

        public Criteria andReturnTypeIsNotNull() {
            addCriterion("return_type is not null");
            return (Criteria) this;
        }

        public Criteria andReturnTypeEqualTo(String value) {
            addCriterion("return_type =", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNotEqualTo(String value) {
            addCriterion("return_type <>", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeGreaterThan(String value) {
            addCriterion("return_type >", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeGreaterThanOrEqualTo(String value) {
            addCriterion("return_type >=", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeLessThan(String value) {
            addCriterion("return_type <", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeLessThanOrEqualTo(String value) {
            addCriterion("return_type <=", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeLike(String value) {
            addCriterion("return_type like", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNotLike(String value) {
            addCriterion("return_type not like", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeIn(List<String> values) {
            addCriterion("return_type in", values, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNotIn(List<String> values) {
            addCriterion("return_type not in", values, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeBetween(String value1, String value2) {
            addCriterion("return_type between", value1, value2, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNotBetween(String value1, String value2) {
            addCriterion("return_type not between", value1, value2, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnReasonIsNull() {
            addCriterion("return_reason is null");
            return (Criteria) this;
        }

        public Criteria andReturnReasonIsNotNull() {
            addCriterion("return_reason is not null");
            return (Criteria) this;
        }

        public Criteria andReturnReasonEqualTo(String value) {
            addCriterion("return_reason =", value, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonNotEqualTo(String value) {
            addCriterion("return_reason <>", value, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonGreaterThan(String value) {
            addCriterion("return_reason >", value, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonGreaterThanOrEqualTo(String value) {
            addCriterion("return_reason >=", value, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonLessThan(String value) {
            addCriterion("return_reason <", value, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonLessThanOrEqualTo(String value) {
            addCriterion("return_reason <=", value, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonLike(String value) {
            addCriterion("return_reason like", value, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonNotLike(String value) {
            addCriterion("return_reason not like", value, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonIn(List<String> values) {
            addCriterion("return_reason in", values, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonNotIn(List<String> values) {
            addCriterion("return_reason not in", values, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonBetween(String value1, String value2) {
            addCriterion("return_reason between", value1, value2, "returnReason");
            return (Criteria) this;
        }

        public Criteria andReturnReasonNotBetween(String value1, String value2) {
            addCriterion("return_reason not between", value1, value2, "returnReason");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andDealerNameIsNull() {
            addCriterion("dealer_name is null");
            return (Criteria) this;
        }

        public Criteria andDealerNameIsNotNull() {
            addCriterion("dealer_name is not null");
            return (Criteria) this;
        }

        public Criteria andDealerNameEqualTo(String value) {
            addCriterion("dealer_name =", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameNotEqualTo(String value) {
            addCriterion("dealer_name <>", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameGreaterThan(String value) {
            addCriterion("dealer_name >", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameGreaterThanOrEqualTo(String value) {
            addCriterion("dealer_name >=", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameLessThan(String value) {
            addCriterion("dealer_name <", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameLessThanOrEqualTo(String value) {
            addCriterion("dealer_name <=", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameLike(String value) {
            addCriterion("dealer_name like", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameNotLike(String value) {
            addCriterion("dealer_name not like", value, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameIn(List<String> values) {
            addCriterion("dealer_name in", values, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameNotIn(List<String> values) {
            addCriterion("dealer_name not in", values, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameBetween(String value1, String value2) {
            addCriterion("dealer_name between", value1, value2, "dealerName");
            return (Criteria) this;
        }

        public Criteria andDealerNameNotBetween(String value1, String value2) {
            addCriterion("dealer_name not between", value1, value2, "dealerName");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIsNull() {
            addCriterion("loan_amount is null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIsNotNull() {
            addCriterion("loan_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountEqualTo(BigDecimal value) {
            addCriterion("loan_amount =", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotEqualTo(BigDecimal value) {
            addCriterion("loan_amount <>", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountGreaterThan(BigDecimal value) {
            addCriterion("loan_amount >", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("loan_amount >=", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLessThan(BigDecimal value) {
            addCriterion("loan_amount <", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("loan_amount <=", value, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountIn(List<BigDecimal> values) {
            addCriterion("loan_amount in", values, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotIn(List<BigDecimal> values) {
            addCriterion("loan_amount not in", values, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loan_amount between", value1, value2, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andLoanAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loan_amount not between", value1, value2, "loanAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantFeeIsNull() {
            addCriterion("merchant_fee is null");
            return (Criteria) this;
        }

        public Criteria andMerchantFeeIsNotNull() {
            addCriterion("merchant_fee is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantFeeEqualTo(BigDecimal value) {
            addCriterion("merchant_fee =", value, "merchantFee");
            return (Criteria) this;
        }

        public Criteria andMerchantFeeNotEqualTo(BigDecimal value) {
            addCriterion("merchant_fee <>", value, "merchantFee");
            return (Criteria) this;
        }

        public Criteria andMerchantFeeGreaterThan(BigDecimal value) {
            addCriterion("merchant_fee >", value, "merchantFee");
            return (Criteria) this;
        }

        public Criteria andMerchantFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("merchant_fee >=", value, "merchantFee");
            return (Criteria) this;
        }

        public Criteria andMerchantFeeLessThan(BigDecimal value) {
            addCriterion("merchant_fee <", value, "merchantFee");
            return (Criteria) this;
        }

        public Criteria andMerchantFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("merchant_fee <=", value, "merchantFee");
            return (Criteria) this;
        }

        public Criteria andMerchantFeeIn(List<BigDecimal> values) {
            addCriterion("merchant_fee in", values, "merchantFee");
            return (Criteria) this;
        }

        public Criteria andMerchantFeeNotIn(List<BigDecimal> values) {
            addCriterion("merchant_fee not in", values, "merchantFee");
            return (Criteria) this;
        }

        public Criteria andMerchantFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("merchant_fee between", value1, value2, "merchantFee");
            return (Criteria) this;
        }

        public Criteria andMerchantFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("merchant_fee not between", value1, value2, "merchantFee");
            return (Criteria) this;
        }

        public Criteria andLoanPrincipalIsNull() {
            addCriterion("loan_principal is null");
            return (Criteria) this;
        }

        public Criteria andLoanPrincipalIsNotNull() {
            addCriterion("loan_principal is not null");
            return (Criteria) this;
        }

        public Criteria andLoanPrincipalEqualTo(BigDecimal value) {
            addCriterion("loan_principal =", value, "loanPrincipal");
            return (Criteria) this;
        }

        public Criteria andLoanPrincipalNotEqualTo(BigDecimal value) {
            addCriterion("loan_principal <>", value, "loanPrincipal");
            return (Criteria) this;
        }

        public Criteria andLoanPrincipalGreaterThan(BigDecimal value) {
            addCriterion("loan_principal >", value, "loanPrincipal");
            return (Criteria) this;
        }

        public Criteria andLoanPrincipalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("loan_principal >=", value, "loanPrincipal");
            return (Criteria) this;
        }

        public Criteria andLoanPrincipalLessThan(BigDecimal value) {
            addCriterion("loan_principal <", value, "loanPrincipal");
            return (Criteria) this;
        }

        public Criteria andLoanPrincipalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("loan_principal <=", value, "loanPrincipal");
            return (Criteria) this;
        }

        public Criteria andLoanPrincipalIn(List<BigDecimal> values) {
            addCriterion("loan_principal in", values, "loanPrincipal");
            return (Criteria) this;
        }

        public Criteria andLoanPrincipalNotIn(List<BigDecimal> values) {
            addCriterion("loan_principal not in", values, "loanPrincipal");
            return (Criteria) this;
        }

        public Criteria andLoanPrincipalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loan_principal between", value1, value2, "loanPrincipal");
            return (Criteria) this;
        }

        public Criteria andLoanPrincipalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("loan_principal not between", value1, value2, "loanPrincipal");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodIsNull() {
            addCriterion("loan_period is null");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodIsNotNull() {
            addCriterion("loan_period is not null");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodEqualTo(Integer value) {
            addCriterion("loan_period =", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodNotEqualTo(Integer value) {
            addCriterion("loan_period <>", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodGreaterThan(Integer value) {
            addCriterion("loan_period >", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("loan_period >=", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodLessThan(Integer value) {
            addCriterion("loan_period <", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("loan_period <=", value, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodIn(List<Integer> values) {
            addCriterion("loan_period in", values, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodNotIn(List<Integer> values) {
            addCriterion("loan_period not in", values, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodBetween(Integer value1, Integer value2) {
            addCriterion("loan_period between", value1, value2, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("loan_period not between", value1, value2, "loanPeriod");
            return (Criteria) this;
        }

        public Criteria andLoanNameIsNull() {
            addCriterion("loan_name is null");
            return (Criteria) this;
        }

        public Criteria andLoanNameIsNotNull() {
            addCriterion("loan_name is not null");
            return (Criteria) this;
        }

        public Criteria andLoanNameEqualTo(String value) {
            addCriterion("loan_name =", value, "loanName");
            return (Criteria) this;
        }

        public Criteria andLoanNameNotEqualTo(String value) {
            addCriterion("loan_name <>", value, "loanName");
            return (Criteria) this;
        }

        public Criteria andLoanNameGreaterThan(String value) {
            addCriterion("loan_name >", value, "loanName");
            return (Criteria) this;
        }

        public Criteria andLoanNameGreaterThanOrEqualTo(String value) {
            addCriterion("loan_name >=", value, "loanName");
            return (Criteria) this;
        }

        public Criteria andLoanNameLessThan(String value) {
            addCriterion("loan_name <", value, "loanName");
            return (Criteria) this;
        }

        public Criteria andLoanNameLessThanOrEqualTo(String value) {
            addCriterion("loan_name <=", value, "loanName");
            return (Criteria) this;
        }

        public Criteria andLoanNameLike(String value) {
            addCriterion("loan_name like", value, "loanName");
            return (Criteria) this;
        }

        public Criteria andLoanNameNotLike(String value) {
            addCriterion("loan_name not like", value, "loanName");
            return (Criteria) this;
        }

        public Criteria andLoanNameIn(List<String> values) {
            addCriterion("loan_name in", values, "loanName");
            return (Criteria) this;
        }

        public Criteria andLoanNameNotIn(List<String> values) {
            addCriterion("loan_name not in", values, "loanName");
            return (Criteria) this;
        }

        public Criteria andLoanNameBetween(String value1, String value2) {
            addCriterion("loan_name between", value1, value2, "loanName");
            return (Criteria) this;
        }

        public Criteria andLoanNameNotBetween(String value1, String value2) {
            addCriterion("loan_name not between", value1, value2, "loanName");
            return (Criteria) this;
        }

        public Criteria andRepayTypeIsNull() {
            addCriterion("repay_type is null");
            return (Criteria) this;
        }

        public Criteria andRepayTypeIsNotNull() {
            addCriterion("repay_type is not null");
            return (Criteria) this;
        }

        public Criteria andRepayTypeEqualTo(String value) {
            addCriterion("repay_type =", value, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeNotEqualTo(String value) {
            addCriterion("repay_type <>", value, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeGreaterThan(String value) {
            addCriterion("repay_type >", value, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("repay_type >=", value, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeLessThan(String value) {
            addCriterion("repay_type <", value, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeLessThanOrEqualTo(String value) {
            addCriterion("repay_type <=", value, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeLike(String value) {
            addCriterion("repay_type like", value, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeNotLike(String value) {
            addCriterion("repay_type not like", value, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeIn(List<String> values) {
            addCriterion("repay_type in", values, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeNotIn(List<String> values) {
            addCriterion("repay_type not in", values, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeBetween(String value1, String value2) {
            addCriterion("repay_type between", value1, value2, "repayType");
            return (Criteria) this;
        }

        public Criteria andRepayTypeNotBetween(String value1, String value2) {
            addCriterion("repay_type not between", value1, value2, "repayType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeIsNull() {
            addCriterion("loan_type is null");
            return (Criteria) this;
        }

        public Criteria andLoanTypeIsNotNull() {
            addCriterion("loan_type is not null");
            return (Criteria) this;
        }

        public Criteria andLoanTypeEqualTo(String value) {
            addCriterion("loan_type =", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeNotEqualTo(String value) {
            addCriterion("loan_type <>", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeGreaterThan(String value) {
            addCriterion("loan_type >", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeGreaterThanOrEqualTo(String value) {
            addCriterion("loan_type >=", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeLessThan(String value) {
            addCriterion("loan_type <", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeLessThanOrEqualTo(String value) {
            addCriterion("loan_type <=", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeLike(String value) {
            addCriterion("loan_type like", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeNotLike(String value) {
            addCriterion("loan_type not like", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeIn(List<String> values) {
            addCriterion("loan_type in", values, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeNotIn(List<String> values) {
            addCriterion("loan_type not in", values, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeBetween(String value1, String value2) {
            addCriterion("loan_type between", value1, value2, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeNotBetween(String value1, String value2) {
            addCriterion("loan_type not between", value1, value2, "loanType");
            return (Criteria) this;
        }

        public Criteria andInnerProductnoIsNull() {
            addCriterion("inner_productno is null");
            return (Criteria) this;
        }

        public Criteria andInnerProductnoIsNotNull() {
            addCriterion("inner_productno is not null");
            return (Criteria) this;
        }

        public Criteria andInnerProductnoEqualTo(String value) {
            addCriterion("inner_productno =", value, "innerProductno");
            return (Criteria) this;
        }

        public Criteria andInnerProductnoNotEqualTo(String value) {
            addCriterion("inner_productno <>", value, "innerProductno");
            return (Criteria) this;
        }

        public Criteria andInnerProductnoGreaterThan(String value) {
            addCriterion("inner_productno >", value, "innerProductno");
            return (Criteria) this;
        }

        public Criteria andInnerProductnoGreaterThanOrEqualTo(String value) {
            addCriterion("inner_productno >=", value, "innerProductno");
            return (Criteria) this;
        }

        public Criteria andInnerProductnoLessThan(String value) {
            addCriterion("inner_productno <", value, "innerProductno");
            return (Criteria) this;
        }

        public Criteria andInnerProductnoLessThanOrEqualTo(String value) {
            addCriterion("inner_productno <=", value, "innerProductno");
            return (Criteria) this;
        }

        public Criteria andInnerProductnoLike(String value) {
            addCriterion("inner_productno like", value, "innerProductno");
            return (Criteria) this;
        }

        public Criteria andInnerProductnoNotLike(String value) {
            addCriterion("inner_productno not like", value, "innerProductno");
            return (Criteria) this;
        }

        public Criteria andInnerProductnoIn(List<String> values) {
            addCriterion("inner_productno in", values, "innerProductno");
            return (Criteria) this;
        }

        public Criteria andInnerProductnoNotIn(List<String> values) {
            addCriterion("inner_productno not in", values, "innerProductno");
            return (Criteria) this;
        }

        public Criteria andInnerProductnoBetween(String value1, String value2) {
            addCriterion("inner_productno between", value1, value2, "innerProductno");
            return (Criteria) this;
        }

        public Criteria andInnerProductnoNotBetween(String value1, String value2) {
            addCriterion("inner_productno not between", value1, value2, "innerProductno");
            return (Criteria) this;
        }

        public Criteria andOutputPayTimeIsNull() {
            addCriterion("output_pay_time is null");
            return (Criteria) this;
        }

        public Criteria andOutputPayTimeIsNotNull() {
            addCriterion("output_pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andOutputPayTimeEqualTo(Long value) {
            addCriterion("output_pay_time =", value, "outputPayTime");
            return (Criteria) this;
        }

        public Criteria andOutputPayTimeNotEqualTo(Long value) {
            addCriterion("output_pay_time <>", value, "outputPayTime");
            return (Criteria) this;
        }

        public Criteria andOutputPayTimeGreaterThan(Long value) {
            addCriterion("output_pay_time >", value, "outputPayTime");
            return (Criteria) this;
        }

        public Criteria andOutputPayTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("output_pay_time >=", value, "outputPayTime");
            return (Criteria) this;
        }

        public Criteria andOutputPayTimeLessThan(Long value) {
            addCriterion("output_pay_time <", value, "outputPayTime");
            return (Criteria) this;
        }

        public Criteria andOutputPayTimeLessThanOrEqualTo(Long value) {
            addCriterion("output_pay_time <=", value, "outputPayTime");
            return (Criteria) this;
        }

        public Criteria andOutputPayTimeIn(List<Long> values) {
            addCriterion("output_pay_time in", values, "outputPayTime");
            return (Criteria) this;
        }

        public Criteria andOutputPayTimeNotIn(List<Long> values) {
            addCriterion("output_pay_time not in", values, "outputPayTime");
            return (Criteria) this;
        }

        public Criteria andOutputPayTimeBetween(Long value1, Long value2) {
            addCriterion("output_pay_time between", value1, value2, "outputPayTime");
            return (Criteria) this;
        }

        public Criteria andOutputPayTimeNotBetween(Long value1, Long value2) {
            addCriterion("output_pay_time not between", value1, value2, "outputPayTime");
            return (Criteria) this;
        }

        public Criteria andOutputRefundTimeIsNull() {
            addCriterion("output_refund_time is null");
            return (Criteria) this;
        }

        public Criteria andOutputRefundTimeIsNotNull() {
            addCriterion("output_refund_time is not null");
            return (Criteria) this;
        }

        public Criteria andOutputRefundTimeEqualTo(Long value) {
            addCriterion("output_refund_time =", value, "outputRefundTime");
            return (Criteria) this;
        }

        public Criteria andOutputRefundTimeNotEqualTo(Long value) {
            addCriterion("output_refund_time <>", value, "outputRefundTime");
            return (Criteria) this;
        }

        public Criteria andOutputRefundTimeGreaterThan(Long value) {
            addCriterion("output_refund_time >", value, "outputRefundTime");
            return (Criteria) this;
        }

        public Criteria andOutputRefundTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("output_refund_time >=", value, "outputRefundTime");
            return (Criteria) this;
        }

        public Criteria andOutputRefundTimeLessThan(Long value) {
            addCriterion("output_refund_time <", value, "outputRefundTime");
            return (Criteria) this;
        }

        public Criteria andOutputRefundTimeLessThanOrEqualTo(Long value) {
            addCriterion("output_refund_time <=", value, "outputRefundTime");
            return (Criteria) this;
        }

        public Criteria andOutputRefundTimeIn(List<Long> values) {
            addCriterion("output_refund_time in", values, "outputRefundTime");
            return (Criteria) this;
        }

        public Criteria andOutputRefundTimeNotIn(List<Long> values) {
            addCriterion("output_refund_time not in", values, "outputRefundTime");
            return (Criteria) this;
        }

        public Criteria andOutputRefundTimeBetween(Long value1, Long value2) {
            addCriterion("output_refund_time between", value1, value2, "outputRefundTime");
            return (Criteria) this;
        }

        public Criteria andOutputRefundTimeNotBetween(Long value1, Long value2) {
            addCriterion("output_refund_time not between", value1, value2, "outputRefundTime");
            return (Criteria) this;
        }

        public Criteria andSubmitRefundTimeIsNull() {
            addCriterion("submit_refund_time is null");
            return (Criteria) this;
        }

        public Criteria andSubmitRefundTimeIsNotNull() {
            addCriterion("submit_refund_time is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitRefundTimeEqualTo(Long value) {
            addCriterion("submit_refund_time =", value, "submitRefundTime");
            return (Criteria) this;
        }

        public Criteria andSubmitRefundTimeNotEqualTo(Long value) {
            addCriterion("submit_refund_time <>", value, "submitRefundTime");
            return (Criteria) this;
        }

        public Criteria andSubmitRefundTimeGreaterThan(Long value) {
            addCriterion("submit_refund_time >", value, "submitRefundTime");
            return (Criteria) this;
        }

        public Criteria andSubmitRefundTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("submit_refund_time >=", value, "submitRefundTime");
            return (Criteria) this;
        }

        public Criteria andSubmitRefundTimeLessThan(Long value) {
            addCriterion("submit_refund_time <", value, "submitRefundTime");
            return (Criteria) this;
        }

        public Criteria andSubmitRefundTimeLessThanOrEqualTo(Long value) {
            addCriterion("submit_refund_time <=", value, "submitRefundTime");
            return (Criteria) this;
        }

        public Criteria andSubmitRefundTimeIn(List<Long> values) {
            addCriterion("submit_refund_time in", values, "submitRefundTime");
            return (Criteria) this;
        }

        public Criteria andSubmitRefundTimeNotIn(List<Long> values) {
            addCriterion("submit_refund_time not in", values, "submitRefundTime");
            return (Criteria) this;
        }

        public Criteria andSubmitRefundTimeBetween(Long value1, Long value2) {
            addCriterion("submit_refund_time between", value1, value2, "submitRefundTime");
            return (Criteria) this;
        }

        public Criteria andSubmitRefundTimeNotBetween(Long value1, Long value2) {
            addCriterion("submit_refund_time not between", value1, value2, "submitRefundTime");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNull() {
            addCriterion("refund_status is null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNotNull() {
            addCriterion("refund_status is not null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusEqualTo(String value) {
            addCriterion("refund_status =", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotEqualTo(String value) {
            addCriterion("refund_status <>", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThan(String value) {
            addCriterion("refund_status >", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThanOrEqualTo(String value) {
            addCriterion("refund_status >=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThan(String value) {
            addCriterion("refund_status <", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThanOrEqualTo(String value) {
            addCriterion("refund_status <=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLike(String value) {
            addCriterion("refund_status like", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotLike(String value) {
            addCriterion("refund_status not like", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIn(List<String> values) {
            addCriterion("refund_status in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotIn(List<String> values) {
            addCriterion("refund_status not in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusBetween(String value1, String value2) {
            addCriterion("refund_status between", value1, value2, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotBetween(String value1, String value2) {
            addCriterion("refund_status not between", value1, value2, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andOutputRefundAmtIsNull() {
            addCriterion("output_refund_amt is null");
            return (Criteria) this;
        }

        public Criteria andOutputRefundAmtIsNotNull() {
            addCriterion("output_refund_amt is not null");
            return (Criteria) this;
        }

        public Criteria andOutputRefundAmtEqualTo(BigDecimal value) {
            addCriterion("output_refund_amt =", value, "outputRefundAmt");
            return (Criteria) this;
        }

        public Criteria andOutputRefundAmtNotEqualTo(BigDecimal value) {
            addCriterion("output_refund_amt <>", value, "outputRefundAmt");
            return (Criteria) this;
        }

        public Criteria andOutputRefundAmtGreaterThan(BigDecimal value) {
            addCriterion("output_refund_amt >", value, "outputRefundAmt");
            return (Criteria) this;
        }

        public Criteria andOutputRefundAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("output_refund_amt >=", value, "outputRefundAmt");
            return (Criteria) this;
        }

        public Criteria andOutputRefundAmtLessThan(BigDecimal value) {
            addCriterion("output_refund_amt <", value, "outputRefundAmt");
            return (Criteria) this;
        }

        public Criteria andOutputRefundAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("output_refund_amt <=", value, "outputRefundAmt");
            return (Criteria) this;
        }

        public Criteria andOutputRefundAmtIn(List<BigDecimal> values) {
            addCriterion("output_refund_amt in", values, "outputRefundAmt");
            return (Criteria) this;
        }

        public Criteria andOutputRefundAmtNotIn(List<BigDecimal> values) {
            addCriterion("output_refund_amt not in", values, "outputRefundAmt");
            return (Criteria) this;
        }

        public Criteria andOutputRefundAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("output_refund_amt between", value1, value2, "outputRefundAmt");
            return (Criteria) this;
        }

        public Criteria andOutputRefundAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("output_refund_amt not between", value1, value2, "outputRefundAmt");
            return (Criteria) this;
        }

        public Criteria andOutputRefundPrincipalIsNull() {
            addCriterion("output_refund_principal is null");
            return (Criteria) this;
        }

        public Criteria andOutputRefundPrincipalIsNotNull() {
            addCriterion("output_refund_principal is not null");
            return (Criteria) this;
        }

        public Criteria andOutputRefundPrincipalEqualTo(BigDecimal value) {
            addCriterion("output_refund_principal =", value, "outputRefundPrincipal");
            return (Criteria) this;
        }

        public Criteria andOutputRefundPrincipalNotEqualTo(BigDecimal value) {
            addCriterion("output_refund_principal <>", value, "outputRefundPrincipal");
            return (Criteria) this;
        }

        public Criteria andOutputRefundPrincipalGreaterThan(BigDecimal value) {
            addCriterion("output_refund_principal >", value, "outputRefundPrincipal");
            return (Criteria) this;
        }

        public Criteria andOutputRefundPrincipalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("output_refund_principal >=", value, "outputRefundPrincipal");
            return (Criteria) this;
        }

        public Criteria andOutputRefundPrincipalLessThan(BigDecimal value) {
            addCriterion("output_refund_principal <", value, "outputRefundPrincipal");
            return (Criteria) this;
        }

        public Criteria andOutputRefundPrincipalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("output_refund_principal <=", value, "outputRefundPrincipal");
            return (Criteria) this;
        }

        public Criteria andOutputRefundPrincipalIn(List<BigDecimal> values) {
            addCriterion("output_refund_principal in", values, "outputRefundPrincipal");
            return (Criteria) this;
        }

        public Criteria andOutputRefundPrincipalNotIn(List<BigDecimal> values) {
            addCriterion("output_refund_principal not in", values, "outputRefundPrincipal");
            return (Criteria) this;
        }

        public Criteria andOutputRefundPrincipalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("output_refund_principal between", value1, value2, "outputRefundPrincipal");
            return (Criteria) this;
        }

        public Criteria andOutputRefundPrincipalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("output_refund_principal not between", value1, value2, "outputRefundPrincipal");
            return (Criteria) this;
        }

        public Criteria andOutputRefundInterestIsNull() {
            addCriterion("output_refund_interest is null");
            return (Criteria) this;
        }

        public Criteria andOutputRefundInterestIsNotNull() {
            addCriterion("output_refund_interest is not null");
            return (Criteria) this;
        }

        public Criteria andOutputRefundInterestEqualTo(BigDecimal value) {
            addCriterion("output_refund_interest =", value, "outputRefundInterest");
            return (Criteria) this;
        }

        public Criteria andOutputRefundInterestNotEqualTo(BigDecimal value) {
            addCriterion("output_refund_interest <>", value, "outputRefundInterest");
            return (Criteria) this;
        }

        public Criteria andOutputRefundInterestGreaterThan(BigDecimal value) {
            addCriterion("output_refund_interest >", value, "outputRefundInterest");
            return (Criteria) this;
        }

        public Criteria andOutputRefundInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("output_refund_interest >=", value, "outputRefundInterest");
            return (Criteria) this;
        }

        public Criteria andOutputRefundInterestLessThan(BigDecimal value) {
            addCriterion("output_refund_interest <", value, "outputRefundInterest");
            return (Criteria) this;
        }

        public Criteria andOutputRefundInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("output_refund_interest <=", value, "outputRefundInterest");
            return (Criteria) this;
        }

        public Criteria andOutputRefundInterestIn(List<BigDecimal> values) {
            addCriterion("output_refund_interest in", values, "outputRefundInterest");
            return (Criteria) this;
        }

        public Criteria andOutputRefundInterestNotIn(List<BigDecimal> values) {
            addCriterion("output_refund_interest not in", values, "outputRefundInterest");
            return (Criteria) this;
        }

        public Criteria andOutputRefundInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("output_refund_interest between", value1, value2, "outputRefundInterest");
            return (Criteria) this;
        }

        public Criteria andOutputRefundInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("output_refund_interest not between", value1, value2, "outputRefundInterest");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIsNull() {
            addCriterion("modified_time is null");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIsNotNull() {
            addCriterion("modified_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeEqualTo(Date value) {
            addCriterion("modified_time =", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotEqualTo(Date value) {
            addCriterion("modified_time <>", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeGreaterThan(Date value) {
            addCriterion("modified_time >", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modified_time >=", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeLessThan(Date value) {
            addCriterion("modified_time <", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeLessThanOrEqualTo(Date value) {
            addCriterion("modified_time <=", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIn(List<Date> values) {
            addCriterion("modified_time in", values, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotIn(List<Date> values) {
            addCriterion("modified_time not in", values, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeBetween(Date value1, Date value2) {
            addCriterion("modified_time between", value1, value2, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotBetween(Date value1, Date value2) {
            addCriterion("modified_time not between", value1, value2, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("updater not between", value1, value2, "updater");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}