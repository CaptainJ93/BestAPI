package com.best1.api.entity.crm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TcrmCusttransactiondetailsExample {
 
    protected String orderByClause;

    protected boolean distinct;

   
    protected List<Criteria> oredCriteria;


    public TcrmCusttransactiondetailsExample() {
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

        public Criteria andTransactionidIsNull() {
            addCriterion("TRANSACTIONID is null");
            return (Criteria) this;
        }

        public Criteria andTransactionidIsNotNull() {
            addCriterion("TRANSACTIONID is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionidEqualTo(Long value) {
            addCriterion("TRANSACTIONID =", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidNotEqualTo(Long value) {
            addCriterion("TRANSACTIONID <>", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidGreaterThan(Long value) {
            addCriterion("TRANSACTIONID >", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidGreaterThanOrEqualTo(Long value) {
            addCriterion("TRANSACTIONID >=", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidLessThan(Long value) {
            addCriterion("TRANSACTIONID <", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidLessThanOrEqualTo(Long value) {
            addCriterion("TRANSACTIONID <=", value, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidIn(List<Long> values) {
            addCriterion("TRANSACTIONID in", values, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidNotIn(List<Long> values) {
            addCriterion("TRANSACTIONID not in", values, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidBetween(Long value1, Long value2) {
            addCriterion("TRANSACTIONID between", value1, value2, "transactionid");
            return (Criteria) this;
        }

        public Criteria andTransactionidNotBetween(Long value1, Long value2) {
            addCriterion("TRANSACTIONID not between", value1, value2, "transactionid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNull() {
            addCriterion("CUSTOMERID is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("CUSTOMERID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(Long value) {
            addCriterion("CUSTOMERID =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(Long value) {
            addCriterion("CUSTOMERID <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(Long value) {
            addCriterion("CUSTOMERID >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(Long value) {
            addCriterion("CUSTOMERID >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(Long value) {
            addCriterion("CUSTOMERID <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(Long value) {
            addCriterion("CUSTOMERID <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<Long> values) {
            addCriterion("CUSTOMERID in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<Long> values) {
            addCriterion("CUSTOMERID not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(Long value1, Long value2) {
            addCriterion("CUSTOMERID between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(Long value1, Long value2) {
            addCriterion("CUSTOMERID not between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andReferencevalueIsNull() {
            addCriterion("REFERENCEVALUE is null");
            return (Criteria) this;
        }

        public Criteria andReferencevalueIsNotNull() {
            addCriterion("REFERENCEVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andReferencevalueEqualTo(Long value) {
            addCriterion("REFERENCEVALUE =", value, "referencevalue");
            return (Criteria) this;
        }

        public Criteria andReferencevalueNotEqualTo(Long value) {
            addCriterion("REFERENCEVALUE <>", value, "referencevalue");
            return (Criteria) this;
        }

        public Criteria andReferencevalueGreaterThan(Long value) {
            addCriterion("REFERENCEVALUE >", value, "referencevalue");
            return (Criteria) this;
        }

        public Criteria andReferencevalueGreaterThanOrEqualTo(Long value) {
            addCriterion("REFERENCEVALUE >=", value, "referencevalue");
            return (Criteria) this;
        }

        public Criteria andReferencevalueLessThan(Long value) {
            addCriterion("REFERENCEVALUE <", value, "referencevalue");
            return (Criteria) this;
        }

        public Criteria andReferencevalueLessThanOrEqualTo(Long value) {
            addCriterion("REFERENCEVALUE <=", value, "referencevalue");
            return (Criteria) this;
        }

        public Criteria andReferencevalueIn(List<Long> values) {
            addCriterion("REFERENCEVALUE in", values, "referencevalue");
            return (Criteria) this;
        }

        public Criteria andReferencevalueNotIn(List<Long> values) {
            addCriterion("REFERENCEVALUE not in", values, "referencevalue");
            return (Criteria) this;
        }

        public Criteria andReferencevalueBetween(Long value1, Long value2) {
            addCriterion("REFERENCEVALUE between", value1, value2, "referencevalue");
            return (Criteria) this;
        }

        public Criteria andReferencevalueNotBetween(Long value1, Long value2) {
            addCriterion("REFERENCEVALUE not between", value1, value2, "referencevalue");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNull() {
            addCriterion("COMPANYID is null");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNotNull() {
            addCriterion("COMPANYID is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyidEqualTo(Long value) {
            addCriterion("COMPANYID =", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotEqualTo(Long value) {
            addCriterion("COMPANYID <>", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThan(Long value) {
            addCriterion("COMPANYID >", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThanOrEqualTo(Long value) {
            addCriterion("COMPANYID >=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThan(Long value) {
            addCriterion("COMPANYID <", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThanOrEqualTo(Long value) {
            addCriterion("COMPANYID <=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIn(List<Long> values) {
            addCriterion("COMPANYID in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotIn(List<Long> values) {
            addCriterion("COMPANYID not in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidBetween(Long value1, Long value2) {
            addCriterion("COMPANYID between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotBetween(Long value1, Long value2) {
            addCriterion("COMPANYID not between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andAccounttypeidIsNull() {
            addCriterion("ACCOUNTTYPEID is null");
            return (Criteria) this;
        }

        public Criteria andAccounttypeidIsNotNull() {
            addCriterion("ACCOUNTTYPEID is not null");
            return (Criteria) this;
        }

        public Criteria andAccounttypeidEqualTo(Integer value) {
            addCriterion("ACCOUNTTYPEID =", value, "accounttypeid");
            return (Criteria) this;
        }

        public Criteria andAccounttypeidNotEqualTo(Integer value) {
            addCriterion("ACCOUNTTYPEID <>", value, "accounttypeid");
            return (Criteria) this;
        }

        public Criteria andAccounttypeidGreaterThan(Integer value) {
            addCriterion("ACCOUNTTYPEID >", value, "accounttypeid");
            return (Criteria) this;
        }

        public Criteria andAccounttypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ACCOUNTTYPEID >=", value, "accounttypeid");
            return (Criteria) this;
        }

        public Criteria andAccounttypeidLessThan(Integer value) {
            addCriterion("ACCOUNTTYPEID <", value, "accounttypeid");
            return (Criteria) this;
        }

        public Criteria andAccounttypeidLessThanOrEqualTo(Integer value) {
            addCriterion("ACCOUNTTYPEID <=", value, "accounttypeid");
            return (Criteria) this;
        }

        public Criteria andAccounttypeidIn(List<Integer> values) {
            addCriterion("ACCOUNTTYPEID in", values, "accounttypeid");
            return (Criteria) this;
        }

        public Criteria andAccounttypeidNotIn(List<Integer> values) {
            addCriterion("ACCOUNTTYPEID not in", values, "accounttypeid");
            return (Criteria) this;
        }

        public Criteria andAccounttypeidBetween(Integer value1, Integer value2) {
            addCriterion("ACCOUNTTYPEID between", value1, value2, "accounttypeid");
            return (Criteria) this;
        }

        public Criteria andAccounttypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("ACCOUNTTYPEID not between", value1, value2, "accounttypeid");
            return (Criteria) this;
        }

        public Criteria andAccountnumberIsNull() {
            addCriterion("ACCOUNTNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andAccountnumberIsNotNull() {
            addCriterion("ACCOUNTNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnumberEqualTo(Long value) {
            addCriterion("ACCOUNTNUMBER =", value, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberNotEqualTo(Long value) {
            addCriterion("ACCOUNTNUMBER <>", value, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberGreaterThan(Long value) {
            addCriterion("ACCOUNTNUMBER >", value, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberGreaterThanOrEqualTo(Long value) {
            addCriterion("ACCOUNTNUMBER >=", value, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberLessThan(Long value) {
            addCriterion("ACCOUNTNUMBER <", value, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberLessThanOrEqualTo(Long value) {
            addCriterion("ACCOUNTNUMBER <=", value, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberIn(List<Long> values) {
            addCriterion("ACCOUNTNUMBER in", values, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberNotIn(List<Long> values) {
            addCriterion("ACCOUNTNUMBER not in", values, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberBetween(Long value1, Long value2) {
            addCriterion("ACCOUNTNUMBER between", value1, value2, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberNotBetween(Long value1, Long value2) {
            addCriterion("ACCOUNTNUMBER not between", value1, value2, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andTransactionamountIsNull() {
            addCriterion("TRANSACTIONAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTransactionamountIsNotNull() {
            addCriterion("TRANSACTIONAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionamountEqualTo(BigDecimal value) {
            addCriterion("TRANSACTIONAMOUNT =", value, "transactionamount");
            return (Criteria) this;
        }

        public Criteria andTransactionamountNotEqualTo(BigDecimal value) {
            addCriterion("TRANSACTIONAMOUNT <>", value, "transactionamount");
            return (Criteria) this;
        }

        public Criteria andTransactionamountGreaterThan(BigDecimal value) {
            addCriterion("TRANSACTIONAMOUNT >", value, "transactionamount");
            return (Criteria) this;
        }

        public Criteria andTransactionamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANSACTIONAMOUNT >=", value, "transactionamount");
            return (Criteria) this;
        }

        public Criteria andTransactionamountLessThan(BigDecimal value) {
            addCriterion("TRANSACTIONAMOUNT <", value, "transactionamount");
            return (Criteria) this;
        }

        public Criteria andTransactionamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANSACTIONAMOUNT <=", value, "transactionamount");
            return (Criteria) this;
        }

        public Criteria andTransactionamountIn(List<BigDecimal> values) {
            addCriterion("TRANSACTIONAMOUNT in", values, "transactionamount");
            return (Criteria) this;
        }

        public Criteria andTransactionamountNotIn(List<BigDecimal> values) {
            addCriterion("TRANSACTIONAMOUNT not in", values, "transactionamount");
            return (Criteria) this;
        }

        public Criteria andTransactionamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANSACTIONAMOUNT between", value1, value2, "transactionamount");
            return (Criteria) this;
        }

        public Criteria andTransactionamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANSACTIONAMOUNT not between", value1, value2, "transactionamount");
            return (Criteria) this;
        }

        public Criteria andTransactiondateIsNull() {
            addCriterion("TRANSACTIONDATE is null");
            return (Criteria) this;
        }

        public Criteria andTransactiondateIsNotNull() {
            addCriterion("TRANSACTIONDATE is not null");
            return (Criteria) this;
        }

        public Criteria andTransactiondateEqualTo(Date value) {
            addCriterion("TRANSACTIONDATE =", value, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateNotEqualTo(Date value) {
            addCriterion("TRANSACTIONDATE <>", value, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateGreaterThan(Date value) {
            addCriterion("TRANSACTIONDATE >", value, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateGreaterThanOrEqualTo(Date value) {
            addCriterion("TRANSACTIONDATE >=", value, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateLessThan(Date value) {
            addCriterion("TRANSACTIONDATE <", value, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateLessThanOrEqualTo(Date value) {
            addCriterion("TRANSACTIONDATE <=", value, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateIn(List<Date> values) {
            addCriterion("TRANSACTIONDATE in", values, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateNotIn(List<Date> values) {
            addCriterion("TRANSACTIONDATE not in", values, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateBetween(Date value1, Date value2) {
            addCriterion("TRANSACTIONDATE between", value1, value2, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andTransactiondateNotBetween(Date value1, Date value2) {
            addCriterion("TRANSACTIONDATE not between", value1, value2, "transactiondate");
            return (Criteria) this;
        }

        public Criteria andCreditdebitflgIsNull() {
            addCriterion("CREDITDEBITFLG is null");
            return (Criteria) this;
        }

        public Criteria andCreditdebitflgIsNotNull() {
            addCriterion("CREDITDEBITFLG is not null");
            return (Criteria) this;
        }

        public Criteria andCreditdebitflgEqualTo(String value) {
            addCriterion("CREDITDEBITFLG =", value, "creditdebitflg");
            return (Criteria) this;
        }

        public Criteria andCreditdebitflgNotEqualTo(String value) {
            addCriterion("CREDITDEBITFLG <>", value, "creditdebitflg");
            return (Criteria) this;
        }

        public Criteria andCreditdebitflgGreaterThan(String value) {
            addCriterion("CREDITDEBITFLG >", value, "creditdebitflg");
            return (Criteria) this;
        }

        public Criteria andCreditdebitflgGreaterThanOrEqualTo(String value) {
            addCriterion("CREDITDEBITFLG >=", value, "creditdebitflg");
            return (Criteria) this;
        }

        public Criteria andCreditdebitflgLessThan(String value) {
            addCriterion("CREDITDEBITFLG <", value, "creditdebitflg");
            return (Criteria) this;
        }

        public Criteria andCreditdebitflgLessThanOrEqualTo(String value) {
            addCriterion("CREDITDEBITFLG <=", value, "creditdebitflg");
            return (Criteria) this;
        }

        public Criteria andCreditdebitflgLike(String value) {
            addCriterion("CREDITDEBITFLG like", value, "creditdebitflg");
            return (Criteria) this;
        }

        public Criteria andCreditdebitflgNotLike(String value) {
            addCriterion("CREDITDEBITFLG not like", value, "creditdebitflg");
            return (Criteria) this;
        }

        public Criteria andCreditdebitflgIn(List<String> values) {
            addCriterion("CREDITDEBITFLG in", values, "creditdebitflg");
            return (Criteria) this;
        }

        public Criteria andCreditdebitflgNotIn(List<String> values) {
            addCriterion("CREDITDEBITFLG not in", values, "creditdebitflg");
            return (Criteria) this;
        }

        public Criteria andCreditdebitflgBetween(String value1, String value2) {
            addCriterion("CREDITDEBITFLG between", value1, value2, "creditdebitflg");
            return (Criteria) this;
        }

        public Criteria andCreditdebitflgNotBetween(String value1, String value2) {
            addCriterion("CREDITDEBITFLG not between", value1, value2, "creditdebitflg");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIsNull() {
            addCriterion("CREATEDBY is null");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIsNotNull() {
            addCriterion("CREATEDBY is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedbyEqualTo(Long value) {
            addCriterion("CREATEDBY =", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotEqualTo(Long value) {
            addCriterion("CREATEDBY <>", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyGreaterThan(Long value) {
            addCriterion("CREATEDBY >", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyGreaterThanOrEqualTo(Long value) {
            addCriterion("CREATEDBY >=", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLessThan(Long value) {
            addCriterion("CREATEDBY <", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLessThanOrEqualTo(Long value) {
            addCriterion("CREATEDBY <=", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIn(List<Long> values) {
            addCriterion("CREATEDBY in", values, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotIn(List<Long> values) {
            addCriterion("CREATEDBY not in", values, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyBetween(Long value1, Long value2) {
            addCriterion("CREATEDBY between", value1, value2, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotBetween(Long value1, Long value2) {
            addCriterion("CREATEDBY not between", value1, value2, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedtimestampIsNull() {
            addCriterion("CREATEDTIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andCreatedtimestampIsNotNull() {
            addCriterion("CREATEDTIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedtimestampEqualTo(Date value) {
            addCriterion("CREATEDTIMESTAMP =", value, "createdtimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedtimestampNotEqualTo(Date value) {
            addCriterion("CREATEDTIMESTAMP <>", value, "createdtimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedtimestampGreaterThan(Date value) {
            addCriterion("CREATEDTIMESTAMP >", value, "createdtimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedtimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATEDTIMESTAMP >=", value, "createdtimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedtimestampLessThan(Date value) {
            addCriterion("CREATEDTIMESTAMP <", value, "createdtimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedtimestampLessThanOrEqualTo(Date value) {
            addCriterion("CREATEDTIMESTAMP <=", value, "createdtimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedtimestampIn(List<Date> values) {
            addCriterion("CREATEDTIMESTAMP in", values, "createdtimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedtimestampNotIn(List<Date> values) {
            addCriterion("CREATEDTIMESTAMP not in", values, "createdtimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedtimestampBetween(Date value1, Date value2) {
            addCriterion("CREATEDTIMESTAMP between", value1, value2, "createdtimestamp");
            return (Criteria) this;
        }

        public Criteria andCreatedtimestampNotBetween(Date value1, Date value2) {
            addCriterion("CREATEDTIMESTAMP not between", value1, value2, "createdtimestamp");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyIsNull() {
            addCriterion("LASTMODIFIEDBY is null");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyIsNotNull() {
            addCriterion("LASTMODIFIEDBY is not null");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyEqualTo(Long value) {
            addCriterion("LASTMODIFIEDBY =", value, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyNotEqualTo(Long value) {
            addCriterion("LASTMODIFIEDBY <>", value, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyGreaterThan(Long value) {
            addCriterion("LASTMODIFIEDBY >", value, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyGreaterThanOrEqualTo(Long value) {
            addCriterion("LASTMODIFIEDBY >=", value, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyLessThan(Long value) {
            addCriterion("LASTMODIFIEDBY <", value, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyLessThanOrEqualTo(Long value) {
            addCriterion("LASTMODIFIEDBY <=", value, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyIn(List<Long> values) {
            addCriterion("LASTMODIFIEDBY in", values, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyNotIn(List<Long> values) {
            addCriterion("LASTMODIFIEDBY not in", values, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyBetween(Long value1, Long value2) {
            addCriterion("LASTMODIFIEDBY between", value1, value2, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedbyNotBetween(Long value1, Long value2) {
            addCriterion("LASTMODIFIEDBY not between", value1, value2, "lastmodifiedby");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedtimestampIsNull() {
            addCriterion("LASTMODIFIEDTIMESTAMP is null");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedtimestampIsNotNull() {
            addCriterion("LASTMODIFIEDTIMESTAMP is not null");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedtimestampEqualTo(Date value) {
            addCriterion("LASTMODIFIEDTIMESTAMP =", value, "lastmodifiedtimestamp");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedtimestampNotEqualTo(Date value) {
            addCriterion("LASTMODIFIEDTIMESTAMP <>", value, "lastmodifiedtimestamp");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedtimestampGreaterThan(Date value) {
            addCriterion("LASTMODIFIEDTIMESTAMP >", value, "lastmodifiedtimestamp");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedtimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("LASTMODIFIEDTIMESTAMP >=", value, "lastmodifiedtimestamp");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedtimestampLessThan(Date value) {
            addCriterion("LASTMODIFIEDTIMESTAMP <", value, "lastmodifiedtimestamp");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedtimestampLessThanOrEqualTo(Date value) {
            addCriterion("LASTMODIFIEDTIMESTAMP <=", value, "lastmodifiedtimestamp");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedtimestampIn(List<Date> values) {
            addCriterion("LASTMODIFIEDTIMESTAMP in", values, "lastmodifiedtimestamp");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedtimestampNotIn(List<Date> values) {
            addCriterion("LASTMODIFIEDTIMESTAMP not in", values, "lastmodifiedtimestamp");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedtimestampBetween(Date value1, Date value2) {
            addCriterion("LASTMODIFIEDTIMESTAMP between", value1, value2, "lastmodifiedtimestamp");
            return (Criteria) this;
        }

        public Criteria andLastmodifiedtimestampNotBetween(Date value1, Date value2) {
            addCriterion("LASTMODIFIEDTIMESTAMP not between", value1, value2, "lastmodifiedtimestamp");
            return (Criteria) this;
        }

        public Criteria andProductidIsNull() {
            addCriterion("PRODUCTID is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("PRODUCTID is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(Long value) {
            addCriterion("PRODUCTID =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(Long value) {
            addCriterion("PRODUCTID <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(Long value) {
            addCriterion("PRODUCTID >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(Long value) {
            addCriterion("PRODUCTID >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(Long value) {
            addCriterion("PRODUCTID <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(Long value) {
            addCriterion("PRODUCTID <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<Long> values) {
            addCriterion("PRODUCTID in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<Long> values) {
            addCriterion("PRODUCTID not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(Long value1, Long value2) {
            addCriterion("PRODUCTID between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(Long value1, Long value2) {
            addCriterion("PRODUCTID not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andReferencetypeidIsNull() {
            addCriterion("REFERENCETYPEID is null");
            return (Criteria) this;
        }

        public Criteria andReferencetypeidIsNotNull() {
            addCriterion("REFERENCETYPEID is not null");
            return (Criteria) this;
        }

        public Criteria andReferencetypeidEqualTo(Integer value) {
            addCriterion("REFERENCETYPEID =", value, "referencetypeid");
            return (Criteria) this;
        }

        public Criteria andReferencetypeidNotEqualTo(Integer value) {
            addCriterion("REFERENCETYPEID <>", value, "referencetypeid");
            return (Criteria) this;
        }

        public Criteria andReferencetypeidGreaterThan(Integer value) {
            addCriterion("REFERENCETYPEID >", value, "referencetypeid");
            return (Criteria) this;
        }

        public Criteria andReferencetypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("REFERENCETYPEID >=", value, "referencetypeid");
            return (Criteria) this;
        }

        public Criteria andReferencetypeidLessThan(Integer value) {
            addCriterion("REFERENCETYPEID <", value, "referencetypeid");
            return (Criteria) this;
        }

        public Criteria andReferencetypeidLessThanOrEqualTo(Integer value) {
            addCriterion("REFERENCETYPEID <=", value, "referencetypeid");
            return (Criteria) this;
        }

        public Criteria andReferencetypeidIn(List<Integer> values) {
            addCriterion("REFERENCETYPEID in", values, "referencetypeid");
            return (Criteria) this;
        }

        public Criteria andReferencetypeidNotIn(List<Integer> values) {
            addCriterion("REFERENCETYPEID not in", values, "referencetypeid");
            return (Criteria) this;
        }

        public Criteria andReferencetypeidBetween(Integer value1, Integer value2) {
            addCriterion("REFERENCETYPEID between", value1, value2, "referencetypeid");
            return (Criteria) this;
        }

        public Criteria andReferencetypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("REFERENCETYPEID not between", value1, value2, "referencetypeid");
            return (Criteria) this;
        }

        public Criteria andMulticodeidIsNull() {
            addCriterion("MULTICODEID is null");
            return (Criteria) this;
        }

        public Criteria andMulticodeidIsNotNull() {
            addCriterion("MULTICODEID is not null");
            return (Criteria) this;
        }

        public Criteria andMulticodeidEqualTo(Long value) {
            addCriterion("MULTICODEID =", value, "multicodeid");
            return (Criteria) this;
        }

        public Criteria andMulticodeidNotEqualTo(Long value) {
            addCriterion("MULTICODEID <>", value, "multicodeid");
            return (Criteria) this;
        }

        public Criteria andMulticodeidGreaterThan(Long value) {
            addCriterion("MULTICODEID >", value, "multicodeid");
            return (Criteria) this;
        }

        public Criteria andMulticodeidGreaterThanOrEqualTo(Long value) {
            addCriterion("MULTICODEID >=", value, "multicodeid");
            return (Criteria) this;
        }

        public Criteria andMulticodeidLessThan(Long value) {
            addCriterion("MULTICODEID <", value, "multicodeid");
            return (Criteria) this;
        }

        public Criteria andMulticodeidLessThanOrEqualTo(Long value) {
            addCriterion("MULTICODEID <=", value, "multicodeid");
            return (Criteria) this;
        }

        public Criteria andMulticodeidIn(List<Long> values) {
            addCriterion("MULTICODEID in", values, "multicodeid");
            return (Criteria) this;
        }

        public Criteria andMulticodeidNotIn(List<Long> values) {
            addCriterion("MULTICODEID not in", values, "multicodeid");
            return (Criteria) this;
        }

        public Criteria andMulticodeidBetween(Long value1, Long value2) {
            addCriterion("MULTICODEID between", value1, value2, "multicodeid");
            return (Criteria) this;
        }

        public Criteria andMulticodeidNotBetween(Long value1, Long value2) {
            addCriterion("MULTICODEID not between", value1, value2, "multicodeid");
            return (Criteria) this;
        }

        public Criteria andTransactiondetailsidIsNull() {
            addCriterion("TRANSACTIONDETAILSID is null");
            return (Criteria) this;
        }

        public Criteria andTransactiondetailsidIsNotNull() {
            addCriterion("TRANSACTIONDETAILSID is not null");
            return (Criteria) this;
        }

        public Criteria andTransactiondetailsidEqualTo(Integer value) {
            addCriterion("TRANSACTIONDETAILSID =", value, "transactiondetailsid");
            return (Criteria) this;
        }

        public Criteria andTransactiondetailsidNotEqualTo(Integer value) {
            addCriterion("TRANSACTIONDETAILSID <>", value, "transactiondetailsid");
            return (Criteria) this;
        }

        public Criteria andTransactiondetailsidGreaterThan(Integer value) {
            addCriterion("TRANSACTIONDETAILSID >", value, "transactiondetailsid");
            return (Criteria) this;
        }

        public Criteria andTransactiondetailsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TRANSACTIONDETAILSID >=", value, "transactiondetailsid");
            return (Criteria) this;
        }

        public Criteria andTransactiondetailsidLessThan(Integer value) {
            addCriterion("TRANSACTIONDETAILSID <", value, "transactiondetailsid");
            return (Criteria) this;
        }

        public Criteria andTransactiondetailsidLessThanOrEqualTo(Integer value) {
            addCriterion("TRANSACTIONDETAILSID <=", value, "transactiondetailsid");
            return (Criteria) this;
        }

        public Criteria andTransactiondetailsidIn(List<Integer> values) {
            addCriterion("TRANSACTIONDETAILSID in", values, "transactiondetailsid");
            return (Criteria) this;
        }

        public Criteria andTransactiondetailsidNotIn(List<Integer> values) {
            addCriterion("TRANSACTIONDETAILSID not in", values, "transactiondetailsid");
            return (Criteria) this;
        }

        public Criteria andTransactiondetailsidBetween(Integer value1, Integer value2) {
            addCriterion("TRANSACTIONDETAILSID between", value1, value2, "transactiondetailsid");
            return (Criteria) this;
        }

        public Criteria andTransactiondetailsidNotBetween(Integer value1, Integer value2) {
            addCriterion("TRANSACTIONDETAILSID not between", value1, value2, "transactiondetailsid");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNull() {
            addCriterion("ORDERID is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("ORDERID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Long value) {
            addCriterion("ORDERID =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Long value) {
            addCriterion("ORDERID <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Long value) {
            addCriterion("ORDERID >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Long value) {
            addCriterion("ORDERID >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Long value) {
            addCriterion("ORDERID <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Long value) {
            addCriterion("ORDERID <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Long> values) {
            addCriterion("ORDERID in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Long> values) {
            addCriterion("ORDERID not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Long value1, Long value2) {
            addCriterion("ORDERID between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Long value1, Long value2) {
            addCriterion("ORDERID not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andItemidIsNull() {
            addCriterion("ITEMID is null");
            return (Criteria) this;
        }

        public Criteria andItemidIsNotNull() {
            addCriterion("ITEMID is not null");
            return (Criteria) this;
        }

        public Criteria andItemidEqualTo(Integer value) {
            addCriterion("ITEMID =", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotEqualTo(Integer value) {
            addCriterion("ITEMID <>", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidGreaterThan(Integer value) {
            addCriterion("ITEMID >", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ITEMID >=", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidLessThan(Integer value) {
            addCriterion("ITEMID <", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidLessThanOrEqualTo(Integer value) {
            addCriterion("ITEMID <=", value, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidIn(List<Integer> values) {
            addCriterion("ITEMID in", values, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotIn(List<Integer> values) {
            addCriterion("ITEMID not in", values, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidBetween(Integer value1, Integer value2) {
            addCriterion("ITEMID between", value1, value2, "itemid");
            return (Criteria) this;
        }

        public Criteria andItemidNotBetween(Integer value1, Integer value2) {
            addCriterion("ITEMID not between", value1, value2, "itemid");
            return (Criteria) this;
        }

        public Criteria andExceptiondescIsNull() {
            addCriterion("EXCEPTIONDESC is null");
            return (Criteria) this;
        }

        public Criteria andExceptiondescIsNotNull() {
            addCriterion("EXCEPTIONDESC is not null");
            return (Criteria) this;
        }

        public Criteria andExceptiondescEqualTo(String value) {
            addCriterion("EXCEPTIONDESC =", value, "exceptiondesc");
            return (Criteria) this;
        }

        public Criteria andExceptiondescNotEqualTo(String value) {
            addCriterion("EXCEPTIONDESC <>", value, "exceptiondesc");
            return (Criteria) this;
        }

        public Criteria andExceptiondescGreaterThan(String value) {
            addCriterion("EXCEPTIONDESC >", value, "exceptiondesc");
            return (Criteria) this;
        }

        public Criteria andExceptiondescGreaterThanOrEqualTo(String value) {
            addCriterion("EXCEPTIONDESC >=", value, "exceptiondesc");
            return (Criteria) this;
        }

        public Criteria andExceptiondescLessThan(String value) {
            addCriterion("EXCEPTIONDESC <", value, "exceptiondesc");
            return (Criteria) this;
        }

        public Criteria andExceptiondescLessThanOrEqualTo(String value) {
            addCriterion("EXCEPTIONDESC <=", value, "exceptiondesc");
            return (Criteria) this;
        }

        public Criteria andExceptiondescLike(String value) {
            addCriterion("EXCEPTIONDESC like", value, "exceptiondesc");
            return (Criteria) this;
        }

        public Criteria andExceptiondescNotLike(String value) {
            addCriterion("EXCEPTIONDESC not like", value, "exceptiondesc");
            return (Criteria) this;
        }

        public Criteria andExceptiondescIn(List<String> values) {
            addCriterion("EXCEPTIONDESC in", values, "exceptiondesc");
            return (Criteria) this;
        }

        public Criteria andExceptiondescNotIn(List<String> values) {
            addCriterion("EXCEPTIONDESC not in", values, "exceptiondesc");
            return (Criteria) this;
        }

        public Criteria andExceptiondescBetween(String value1, String value2) {
            addCriterion("EXCEPTIONDESC between", value1, value2, "exceptiondesc");
            return (Criteria) this;
        }

        public Criteria andExceptiondescNotBetween(String value1, String value2) {
            addCriterion("EXCEPTIONDESC not between", value1, value2, "exceptiondesc");
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