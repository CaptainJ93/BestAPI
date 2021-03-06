package com.best1.api.entity.scm.supplier;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TscmSuppliercontractExample {
   
    protected String orderByClause;


    protected boolean distinct;


    protected List<Criteria> oredCriteria;

 
    public TscmSuppliercontractExample() {
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

        public Criteria andContractnoIsNull() {
            addCriterion("CONTRACTNO is null");
            return (Criteria) this;
        }

        public Criteria andContractnoIsNotNull() {
            addCriterion("CONTRACTNO is not null");
            return (Criteria) this;
        }

        public Criteria andContractnoEqualTo(Long value) {
            addCriterion("CONTRACTNO =", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoNotEqualTo(Long value) {
            addCriterion("CONTRACTNO <>", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoGreaterThan(Long value) {
            addCriterion("CONTRACTNO >", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoGreaterThanOrEqualTo(Long value) {
            addCriterion("CONTRACTNO >=", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoLessThan(Long value) {
            addCriterion("CONTRACTNO <", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoLessThanOrEqualTo(Long value) {
            addCriterion("CONTRACTNO <=", value, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoIn(List<Long> values) {
            addCriterion("CONTRACTNO in", values, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoNotIn(List<Long> values) {
            addCriterion("CONTRACTNO not in", values, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoBetween(Long value1, Long value2) {
            addCriterion("CONTRACTNO between", value1, value2, "contractno");
            return (Criteria) this;
        }

        public Criteria andContractnoNotBetween(Long value1, Long value2) {
            addCriterion("CONTRACTNO not between", value1, value2, "contractno");
            return (Criteria) this;
        }

        public Criteria andSupplieridIsNull() {
            addCriterion("SUPPLIERID is null");
            return (Criteria) this;
        }

        public Criteria andSupplieridIsNotNull() {
            addCriterion("SUPPLIERID is not null");
            return (Criteria) this;
        }

        public Criteria andSupplieridEqualTo(Long value) {
            addCriterion("SUPPLIERID =", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotEqualTo(Long value) {
            addCriterion("SUPPLIERID <>", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThan(Long value) {
            addCriterion("SUPPLIERID >", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridGreaterThanOrEqualTo(Long value) {
            addCriterion("SUPPLIERID >=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThan(Long value) {
            addCriterion("SUPPLIERID <", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridLessThanOrEqualTo(Long value) {
            addCriterion("SUPPLIERID <=", value, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridIn(List<Long> values) {
            addCriterion("SUPPLIERID in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotIn(List<Long> values) {
            addCriterion("SUPPLIERID not in", values, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridBetween(Long value1, Long value2) {
            addCriterion("SUPPLIERID between", value1, value2, "supplierid");
            return (Criteria) this;
        }

        public Criteria andSupplieridNotBetween(Long value1, Long value2) {
            addCriterion("SUPPLIERID not between", value1, value2, "supplierid");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andContractdateIsNull() {
            addCriterion("CONTRACTDATE is null");
            return (Criteria) this;
        }

        public Criteria andContractdateIsNotNull() {
            addCriterion("CONTRACTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andContractdateEqualTo(Date value) {
            addCriterion("CONTRACTDATE =", value, "contractdate");
            return (Criteria) this;
        }

        public Criteria andContractdateNotEqualTo(Date value) {
            addCriterion("CONTRACTDATE <>", value, "contractdate");
            return (Criteria) this;
        }

        public Criteria andContractdateGreaterThan(Date value) {
            addCriterion("CONTRACTDATE >", value, "contractdate");
            return (Criteria) this;
        }

        public Criteria andContractdateGreaterThanOrEqualTo(Date value) {
            addCriterion("CONTRACTDATE >=", value, "contractdate");
            return (Criteria) this;
        }

        public Criteria andContractdateLessThan(Date value) {
            addCriterion("CONTRACTDATE <", value, "contractdate");
            return (Criteria) this;
        }

        public Criteria andContractdateLessThanOrEqualTo(Date value) {
            addCriterion("CONTRACTDATE <=", value, "contractdate");
            return (Criteria) this;
        }

        public Criteria andContractdateIn(List<Date> values) {
            addCriterion("CONTRACTDATE in", values, "contractdate");
            return (Criteria) this;
        }

        public Criteria andContractdateNotIn(List<Date> values) {
            addCriterion("CONTRACTDATE not in", values, "contractdate");
            return (Criteria) this;
        }

        public Criteria andContractdateBetween(Date value1, Date value2) {
            addCriterion("CONTRACTDATE between", value1, value2, "contractdate");
            return (Criteria) this;
        }

        public Criteria andContractdateNotBetween(Date value1, Date value2) {
            addCriterion("CONTRACTDATE not between", value1, value2, "contractdate");
            return (Criteria) this;
        }

        public Criteria andPaymenttermsIsNull() {
            addCriterion("PAYMENTTERMS is null");
            return (Criteria) this;
        }

        public Criteria andPaymenttermsIsNotNull() {
            addCriterion("PAYMENTTERMS is not null");
            return (Criteria) this;
        }

        public Criteria andPaymenttermsEqualTo(Integer value) {
            addCriterion("PAYMENTTERMS =", value, "paymentterms");
            return (Criteria) this;
        }

        public Criteria andPaymenttermsNotEqualTo(Integer value) {
            addCriterion("PAYMENTTERMS <>", value, "paymentterms");
            return (Criteria) this;
        }

        public Criteria andPaymenttermsGreaterThan(Integer value) {
            addCriterion("PAYMENTTERMS >", value, "paymentterms");
            return (Criteria) this;
        }

        public Criteria andPaymenttermsGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAYMENTTERMS >=", value, "paymentterms");
            return (Criteria) this;
        }

        public Criteria andPaymenttermsLessThan(Integer value) {
            addCriterion("PAYMENTTERMS <", value, "paymentterms");
            return (Criteria) this;
        }

        public Criteria andPaymenttermsLessThanOrEqualTo(Integer value) {
            addCriterion("PAYMENTTERMS <=", value, "paymentterms");
            return (Criteria) this;
        }

        public Criteria andPaymenttermsIn(List<Integer> values) {
            addCriterion("PAYMENTTERMS in", values, "paymentterms");
            return (Criteria) this;
        }

        public Criteria andPaymenttermsNotIn(List<Integer> values) {
            addCriterion("PAYMENTTERMS not in", values, "paymentterms");
            return (Criteria) this;
        }

        public Criteria andPaymenttermsBetween(Integer value1, Integer value2) {
            addCriterion("PAYMENTTERMS between", value1, value2, "paymentterms");
            return (Criteria) this;
        }

        public Criteria andPaymenttermsNotBetween(Integer value1, Integer value2) {
            addCriterion("PAYMENTTERMS not between", value1, value2, "paymentterms");
            return (Criteria) this;
        }

        public Criteria andContractnameIsNull() {
            addCriterion("CONTRACTNAME is null");
            return (Criteria) this;
        }

        public Criteria andContractnameIsNotNull() {
            addCriterion("CONTRACTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andContractnameEqualTo(String value) {
            addCriterion("CONTRACTNAME =", value, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameNotEqualTo(String value) {
            addCriterion("CONTRACTNAME <>", value, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameGreaterThan(String value) {
            addCriterion("CONTRACTNAME >", value, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACTNAME >=", value, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameLessThan(String value) {
            addCriterion("CONTRACTNAME <", value, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameLessThanOrEqualTo(String value) {
            addCriterion("CONTRACTNAME <=", value, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameLike(String value) {
            addCriterion("CONTRACTNAME like", value, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameNotLike(String value) {
            addCriterion("CONTRACTNAME not like", value, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameIn(List<String> values) {
            addCriterion("CONTRACTNAME in", values, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameNotIn(List<String> values) {
            addCriterion("CONTRACTNAME not in", values, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameBetween(String value1, String value2) {
            addCriterion("CONTRACTNAME between", value1, value2, "contractname");
            return (Criteria) this;
        }

        public Criteria andContractnameNotBetween(String value1, String value2) {
            addCriterion("CONTRACTNAME not between", value1, value2, "contractname");
            return (Criteria) this;
        }

        public Criteria andSuppliercontractsignernameIsNull() {
            addCriterion("SUPPLIERCONTRACTSIGNERNAME is null");
            return (Criteria) this;
        }

        public Criteria andSuppliercontractsignernameIsNotNull() {
            addCriterion("SUPPLIERCONTRACTSIGNERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliercontractsignernameEqualTo(String value) {
            addCriterion("SUPPLIERCONTRACTSIGNERNAME =", value, "suppliercontractsignername");
            return (Criteria) this;
        }

        public Criteria andSuppliercontractsignernameNotEqualTo(String value) {
            addCriterion("SUPPLIERCONTRACTSIGNERNAME <>", value, "suppliercontractsignername");
            return (Criteria) this;
        }

        public Criteria andSuppliercontractsignernameGreaterThan(String value) {
            addCriterion("SUPPLIERCONTRACTSIGNERNAME >", value, "suppliercontractsignername");
            return (Criteria) this;
        }

        public Criteria andSuppliercontractsignernameGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIERCONTRACTSIGNERNAME >=", value, "suppliercontractsignername");
            return (Criteria) this;
        }

        public Criteria andSuppliercontractsignernameLessThan(String value) {
            addCriterion("SUPPLIERCONTRACTSIGNERNAME <", value, "suppliercontractsignername");
            return (Criteria) this;
        }

        public Criteria andSuppliercontractsignernameLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIERCONTRACTSIGNERNAME <=", value, "suppliercontractsignername");
            return (Criteria) this;
        }

        public Criteria andSuppliercontractsignernameLike(String value) {
            addCriterion("SUPPLIERCONTRACTSIGNERNAME like", value, "suppliercontractsignername");
            return (Criteria) this;
        }

        public Criteria andSuppliercontractsignernameNotLike(String value) {
            addCriterion("SUPPLIERCONTRACTSIGNERNAME not like", value, "suppliercontractsignername");
            return (Criteria) this;
        }

        public Criteria andSuppliercontractsignernameIn(List<String> values) {
            addCriterion("SUPPLIERCONTRACTSIGNERNAME in", values, "suppliercontractsignername");
            return (Criteria) this;
        }

        public Criteria andSuppliercontractsignernameNotIn(List<String> values) {
            addCriterion("SUPPLIERCONTRACTSIGNERNAME not in", values, "suppliercontractsignername");
            return (Criteria) this;
        }

        public Criteria andSuppliercontractsignernameBetween(String value1, String value2) {
            addCriterion("SUPPLIERCONTRACTSIGNERNAME between", value1, value2, "suppliercontractsignername");
            return (Criteria) this;
        }

        public Criteria andSuppliercontractsignernameNotBetween(String value1, String value2) {
            addCriterion("SUPPLIERCONTRACTSIGNERNAME not between", value1, value2, "suppliercontractsignername");
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

        public Criteria andNormaldeliveryIsNull() {
            addCriterion("NORMALDELIVERY is null");
            return (Criteria) this;
        }

        public Criteria andNormaldeliveryIsNotNull() {
            addCriterion("NORMALDELIVERY is not null");
            return (Criteria) this;
        }

        public Criteria andNormaldeliveryEqualTo(String value) {
            addCriterion("NORMALDELIVERY =", value, "normaldelivery");
            return (Criteria) this;
        }

        public Criteria andNormaldeliveryNotEqualTo(String value) {
            addCriterion("NORMALDELIVERY <>", value, "normaldelivery");
            return (Criteria) this;
        }

        public Criteria andNormaldeliveryGreaterThan(String value) {
            addCriterion("NORMALDELIVERY >", value, "normaldelivery");
            return (Criteria) this;
        }

        public Criteria andNormaldeliveryGreaterThanOrEqualTo(String value) {
            addCriterion("NORMALDELIVERY >=", value, "normaldelivery");
            return (Criteria) this;
        }

        public Criteria andNormaldeliveryLessThan(String value) {
            addCriterion("NORMALDELIVERY <", value, "normaldelivery");
            return (Criteria) this;
        }

        public Criteria andNormaldeliveryLessThanOrEqualTo(String value) {
            addCriterion("NORMALDELIVERY <=", value, "normaldelivery");
            return (Criteria) this;
        }

        public Criteria andNormaldeliveryLike(String value) {
            addCriterion("NORMALDELIVERY like", value, "normaldelivery");
            return (Criteria) this;
        }

        public Criteria andNormaldeliveryNotLike(String value) {
            addCriterion("NORMALDELIVERY not like", value, "normaldelivery");
            return (Criteria) this;
        }

        public Criteria andNormaldeliveryIn(List<String> values) {
            addCriterion("NORMALDELIVERY in", values, "normaldelivery");
            return (Criteria) this;
        }

        public Criteria andNormaldeliveryNotIn(List<String> values) {
            addCriterion("NORMALDELIVERY not in", values, "normaldelivery");
            return (Criteria) this;
        }

        public Criteria andNormaldeliveryBetween(String value1, String value2) {
            addCriterion("NORMALDELIVERY between", value1, value2, "normaldelivery");
            return (Criteria) this;
        }

        public Criteria andNormaldeliveryNotBetween(String value1, String value2) {
            addCriterion("NORMALDELIVERY not between", value1, value2, "normaldelivery");
            return (Criteria) this;
        }

        public Criteria andDirectdeliveryIsNull() {
            addCriterion("DIRECTDELIVERY is null");
            return (Criteria) this;
        }

        public Criteria andDirectdeliveryIsNotNull() {
            addCriterion("DIRECTDELIVERY is not null");
            return (Criteria) this;
        }

        public Criteria andDirectdeliveryEqualTo(String value) {
            addCriterion("DIRECTDELIVERY =", value, "directdelivery");
            return (Criteria) this;
        }

        public Criteria andDirectdeliveryNotEqualTo(String value) {
            addCriterion("DIRECTDELIVERY <>", value, "directdelivery");
            return (Criteria) this;
        }

        public Criteria andDirectdeliveryGreaterThan(String value) {
            addCriterion("DIRECTDELIVERY >", value, "directdelivery");
            return (Criteria) this;
        }

        public Criteria andDirectdeliveryGreaterThanOrEqualTo(String value) {
            addCriterion("DIRECTDELIVERY >=", value, "directdelivery");
            return (Criteria) this;
        }

        public Criteria andDirectdeliveryLessThan(String value) {
            addCriterion("DIRECTDELIVERY <", value, "directdelivery");
            return (Criteria) this;
        }

        public Criteria andDirectdeliveryLessThanOrEqualTo(String value) {
            addCriterion("DIRECTDELIVERY <=", value, "directdelivery");
            return (Criteria) this;
        }

        public Criteria andDirectdeliveryLike(String value) {
            addCriterion("DIRECTDELIVERY like", value, "directdelivery");
            return (Criteria) this;
        }

        public Criteria andDirectdeliveryNotLike(String value) {
            addCriterion("DIRECTDELIVERY not like", value, "directdelivery");
            return (Criteria) this;
        }

        public Criteria andDirectdeliveryIn(List<String> values) {
            addCriterion("DIRECTDELIVERY in", values, "directdelivery");
            return (Criteria) this;
        }

        public Criteria andDirectdeliveryNotIn(List<String> values) {
            addCriterion("DIRECTDELIVERY not in", values, "directdelivery");
            return (Criteria) this;
        }

        public Criteria andDirectdeliveryBetween(String value1, String value2) {
            addCriterion("DIRECTDELIVERY between", value1, value2, "directdelivery");
            return (Criteria) this;
        }

        public Criteria andDirectdeliveryNotBetween(String value1, String value2) {
            addCriterion("DIRECTDELIVERY not between", value1, value2, "directdelivery");
            return (Criteria) this;
        }

        public Criteria andSpecialdeliveryIsNull() {
            addCriterion("SPECIALDELIVERY is null");
            return (Criteria) this;
        }

        public Criteria andSpecialdeliveryIsNotNull() {
            addCriterion("SPECIALDELIVERY is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialdeliveryEqualTo(String value) {
            addCriterion("SPECIALDELIVERY =", value, "specialdelivery");
            return (Criteria) this;
        }

        public Criteria andSpecialdeliveryNotEqualTo(String value) {
            addCriterion("SPECIALDELIVERY <>", value, "specialdelivery");
            return (Criteria) this;
        }

        public Criteria andSpecialdeliveryGreaterThan(String value) {
            addCriterion("SPECIALDELIVERY >", value, "specialdelivery");
            return (Criteria) this;
        }

        public Criteria andSpecialdeliveryGreaterThanOrEqualTo(String value) {
            addCriterion("SPECIALDELIVERY >=", value, "specialdelivery");
            return (Criteria) this;
        }

        public Criteria andSpecialdeliveryLessThan(String value) {
            addCriterion("SPECIALDELIVERY <", value, "specialdelivery");
            return (Criteria) this;
        }

        public Criteria andSpecialdeliveryLessThanOrEqualTo(String value) {
            addCriterion("SPECIALDELIVERY <=", value, "specialdelivery");
            return (Criteria) this;
        }

        public Criteria andSpecialdeliveryLike(String value) {
            addCriterion("SPECIALDELIVERY like", value, "specialdelivery");
            return (Criteria) this;
        }

        public Criteria andSpecialdeliveryNotLike(String value) {
            addCriterion("SPECIALDELIVERY not like", value, "specialdelivery");
            return (Criteria) this;
        }

        public Criteria andSpecialdeliveryIn(List<String> values) {
            addCriterion("SPECIALDELIVERY in", values, "specialdelivery");
            return (Criteria) this;
        }

        public Criteria andSpecialdeliveryNotIn(List<String> values) {
            addCriterion("SPECIALDELIVERY not in", values, "specialdelivery");
            return (Criteria) this;
        }

        public Criteria andSpecialdeliveryBetween(String value1, String value2) {
            addCriterion("SPECIALDELIVERY between", value1, value2, "specialdelivery");
            return (Criteria) this;
        }

        public Criteria andSpecialdeliveryNotBetween(String value1, String value2) {
            addCriterion("SPECIALDELIVERY not between", value1, value2, "specialdelivery");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliveryIsNull() {
            addCriterion("OFFSHOREDELIVERY is null");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliveryIsNotNull() {
            addCriterion("OFFSHOREDELIVERY is not null");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliveryEqualTo(String value) {
            addCriterion("OFFSHOREDELIVERY =", value, "offshoredelivery");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliveryNotEqualTo(String value) {
            addCriterion("OFFSHOREDELIVERY <>", value, "offshoredelivery");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliveryGreaterThan(String value) {
            addCriterion("OFFSHOREDELIVERY >", value, "offshoredelivery");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliveryGreaterThanOrEqualTo(String value) {
            addCriterion("OFFSHOREDELIVERY >=", value, "offshoredelivery");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliveryLessThan(String value) {
            addCriterion("OFFSHOREDELIVERY <", value, "offshoredelivery");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliveryLessThanOrEqualTo(String value) {
            addCriterion("OFFSHOREDELIVERY <=", value, "offshoredelivery");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliveryLike(String value) {
            addCriterion("OFFSHOREDELIVERY like", value, "offshoredelivery");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliveryNotLike(String value) {
            addCriterion("OFFSHOREDELIVERY not like", value, "offshoredelivery");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliveryIn(List<String> values) {
            addCriterion("OFFSHOREDELIVERY in", values, "offshoredelivery");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliveryNotIn(List<String> values) {
            addCriterion("OFFSHOREDELIVERY not in", values, "offshoredelivery");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliveryBetween(String value1, String value2) {
            addCriterion("OFFSHOREDELIVERY between", value1, value2, "offshoredelivery");
            return (Criteria) this;
        }

        public Criteria andOffshoredeliveryNotBetween(String value1, String value2) {
            addCriterion("OFFSHOREDELIVERY not between", value1, value2, "offshoredelivery");
            return (Criteria) this;
        }

        public Criteria andPaymentdeliverytermsIsNull() {
            addCriterion("PAYMENTDELIVERYTERMS is null");
            return (Criteria) this;
        }

        public Criteria andPaymentdeliverytermsIsNotNull() {
            addCriterion("PAYMENTDELIVERYTERMS is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentdeliverytermsEqualTo(String value) {
            addCriterion("PAYMENTDELIVERYTERMS =", value, "paymentdeliveryterms");
            return (Criteria) this;
        }

        public Criteria andPaymentdeliverytermsNotEqualTo(String value) {
            addCriterion("PAYMENTDELIVERYTERMS <>", value, "paymentdeliveryterms");
            return (Criteria) this;
        }

        public Criteria andPaymentdeliverytermsGreaterThan(String value) {
            addCriterion("PAYMENTDELIVERYTERMS >", value, "paymentdeliveryterms");
            return (Criteria) this;
        }

        public Criteria andPaymentdeliverytermsGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENTDELIVERYTERMS >=", value, "paymentdeliveryterms");
            return (Criteria) this;
        }

        public Criteria andPaymentdeliverytermsLessThan(String value) {
            addCriterion("PAYMENTDELIVERYTERMS <", value, "paymentdeliveryterms");
            return (Criteria) this;
        }

        public Criteria andPaymentdeliverytermsLessThanOrEqualTo(String value) {
            addCriterion("PAYMENTDELIVERYTERMS <=", value, "paymentdeliveryterms");
            return (Criteria) this;
        }

        public Criteria andPaymentdeliverytermsLike(String value) {
            addCriterion("PAYMENTDELIVERYTERMS like", value, "paymentdeliveryterms");
            return (Criteria) this;
        }

        public Criteria andPaymentdeliverytermsNotLike(String value) {
            addCriterion("PAYMENTDELIVERYTERMS not like", value, "paymentdeliveryterms");
            return (Criteria) this;
        }

        public Criteria andPaymentdeliverytermsIn(List<String> values) {
            addCriterion("PAYMENTDELIVERYTERMS in", values, "paymentdeliveryterms");
            return (Criteria) this;
        }

        public Criteria andPaymentdeliverytermsNotIn(List<String> values) {
            addCriterion("PAYMENTDELIVERYTERMS not in", values, "paymentdeliveryterms");
            return (Criteria) this;
        }

        public Criteria andPaymentdeliverytermsBetween(String value1, String value2) {
            addCriterion("PAYMENTDELIVERYTERMS between", value1, value2, "paymentdeliveryterms");
            return (Criteria) this;
        }

        public Criteria andPaymentdeliverytermsNotBetween(String value1, String value2) {
            addCriterion("PAYMENTDELIVERYTERMS not between", value1, value2, "paymentdeliveryterms");
            return (Criteria) this;
        }

        public Criteria andRegistrationcertificateIsNull() {
            addCriterion("REGISTRATIONCERTIFICATE is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationcertificateIsNotNull() {
            addCriterion("REGISTRATIONCERTIFICATE is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationcertificateEqualTo(String value) {
            addCriterion("REGISTRATIONCERTIFICATE =", value, "registrationcertificate");
            return (Criteria) this;
        }

        public Criteria andRegistrationcertificateNotEqualTo(String value) {
            addCriterion("REGISTRATIONCERTIFICATE <>", value, "registrationcertificate");
            return (Criteria) this;
        }

        public Criteria andRegistrationcertificateGreaterThan(String value) {
            addCriterion("REGISTRATIONCERTIFICATE >", value, "registrationcertificate");
            return (Criteria) this;
        }

        public Criteria andRegistrationcertificateGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTRATIONCERTIFICATE >=", value, "registrationcertificate");
            return (Criteria) this;
        }

        public Criteria andRegistrationcertificateLessThan(String value) {
            addCriterion("REGISTRATIONCERTIFICATE <", value, "registrationcertificate");
            return (Criteria) this;
        }

        public Criteria andRegistrationcertificateLessThanOrEqualTo(String value) {
            addCriterion("REGISTRATIONCERTIFICATE <=", value, "registrationcertificate");
            return (Criteria) this;
        }

        public Criteria andRegistrationcertificateLike(String value) {
            addCriterion("REGISTRATIONCERTIFICATE like", value, "registrationcertificate");
            return (Criteria) this;
        }

        public Criteria andRegistrationcertificateNotLike(String value) {
            addCriterion("REGISTRATIONCERTIFICATE not like", value, "registrationcertificate");
            return (Criteria) this;
        }

        public Criteria andRegistrationcertificateIn(List<String> values) {
            addCriterion("REGISTRATIONCERTIFICATE in", values, "registrationcertificate");
            return (Criteria) this;
        }

        public Criteria andRegistrationcertificateNotIn(List<String> values) {
            addCriterion("REGISTRATIONCERTIFICATE not in", values, "registrationcertificate");
            return (Criteria) this;
        }

        public Criteria andRegistrationcertificateBetween(String value1, String value2) {
            addCriterion("REGISTRATIONCERTIFICATE between", value1, value2, "registrationcertificate");
            return (Criteria) this;
        }

        public Criteria andRegistrationcertificateNotBetween(String value1, String value2) {
            addCriterion("REGISTRATIONCERTIFICATE not between", value1, value2, "registrationcertificate");
            return (Criteria) this;
        }

        public Criteria andSuppliersurveyformIsNull() {
            addCriterion("SUPPLIERSURVEYFORM is null");
            return (Criteria) this;
        }

        public Criteria andSuppliersurveyformIsNotNull() {
            addCriterion("SUPPLIERSURVEYFORM is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliersurveyformEqualTo(String value) {
            addCriterion("SUPPLIERSURVEYFORM =", value, "suppliersurveyform");
            return (Criteria) this;
        }

        public Criteria andSuppliersurveyformNotEqualTo(String value) {
            addCriterion("SUPPLIERSURVEYFORM <>", value, "suppliersurveyform");
            return (Criteria) this;
        }

        public Criteria andSuppliersurveyformGreaterThan(String value) {
            addCriterion("SUPPLIERSURVEYFORM >", value, "suppliersurveyform");
            return (Criteria) this;
        }

        public Criteria andSuppliersurveyformGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIERSURVEYFORM >=", value, "suppliersurveyform");
            return (Criteria) this;
        }

        public Criteria andSuppliersurveyformLessThan(String value) {
            addCriterion("SUPPLIERSURVEYFORM <", value, "suppliersurveyform");
            return (Criteria) this;
        }

        public Criteria andSuppliersurveyformLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIERSURVEYFORM <=", value, "suppliersurveyform");
            return (Criteria) this;
        }

        public Criteria andSuppliersurveyformLike(String value) {
            addCriterion("SUPPLIERSURVEYFORM like", value, "suppliersurveyform");
            return (Criteria) this;
        }

        public Criteria andSuppliersurveyformNotLike(String value) {
            addCriterion("SUPPLIERSURVEYFORM not like", value, "suppliersurveyform");
            return (Criteria) this;
        }

        public Criteria andSuppliersurveyformIn(List<String> values) {
            addCriterion("SUPPLIERSURVEYFORM in", values, "suppliersurveyform");
            return (Criteria) this;
        }

        public Criteria andSuppliersurveyformNotIn(List<String> values) {
            addCriterion("SUPPLIERSURVEYFORM not in", values, "suppliersurveyform");
            return (Criteria) this;
        }

        public Criteria andSuppliersurveyformBetween(String value1, String value2) {
            addCriterion("SUPPLIERSURVEYFORM between", value1, value2, "suppliersurveyform");
            return (Criteria) this;
        }

        public Criteria andSuppliersurveyformNotBetween(String value1, String value2) {
            addCriterion("SUPPLIERSURVEYFORM not between", value1, value2, "suppliersurveyform");
            return (Criteria) this;
        }

        public Criteria andSupplierprofileIsNull() {
            addCriterion("SUPPLIERPROFILE is null");
            return (Criteria) this;
        }

        public Criteria andSupplierprofileIsNotNull() {
            addCriterion("SUPPLIERPROFILE is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierprofileEqualTo(String value) {
            addCriterion("SUPPLIERPROFILE =", value, "supplierprofile");
            return (Criteria) this;
        }

        public Criteria andSupplierprofileNotEqualTo(String value) {
            addCriterion("SUPPLIERPROFILE <>", value, "supplierprofile");
            return (Criteria) this;
        }

        public Criteria andSupplierprofileGreaterThan(String value) {
            addCriterion("SUPPLIERPROFILE >", value, "supplierprofile");
            return (Criteria) this;
        }

        public Criteria andSupplierprofileGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIERPROFILE >=", value, "supplierprofile");
            return (Criteria) this;
        }

        public Criteria andSupplierprofileLessThan(String value) {
            addCriterion("SUPPLIERPROFILE <", value, "supplierprofile");
            return (Criteria) this;
        }

        public Criteria andSupplierprofileLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIERPROFILE <=", value, "supplierprofile");
            return (Criteria) this;
        }

        public Criteria andSupplierprofileLike(String value) {
            addCriterion("SUPPLIERPROFILE like", value, "supplierprofile");
            return (Criteria) this;
        }

        public Criteria andSupplierprofileNotLike(String value) {
            addCriterion("SUPPLIERPROFILE not like", value, "supplierprofile");
            return (Criteria) this;
        }

        public Criteria andSupplierprofileIn(List<String> values) {
            addCriterion("SUPPLIERPROFILE in", values, "supplierprofile");
            return (Criteria) this;
        }

        public Criteria andSupplierprofileNotIn(List<String> values) {
            addCriterion("SUPPLIERPROFILE not in", values, "supplierprofile");
            return (Criteria) this;
        }

        public Criteria andSupplierprofileBetween(String value1, String value2) {
            addCriterion("SUPPLIERPROFILE between", value1, value2, "supplierprofile");
            return (Criteria) this;
        }

        public Criteria andSupplierprofileNotBetween(String value1, String value2) {
            addCriterion("SUPPLIERPROFILE not between", value1, value2, "supplierprofile");
            return (Criteria) this;
        }

        public Criteria andTaiwanidIsNull() {
            addCriterion("TAIWANID is null");
            return (Criteria) this;
        }

        public Criteria andTaiwanidIsNotNull() {
            addCriterion("TAIWANID is not null");
            return (Criteria) this;
        }

        public Criteria andTaiwanidEqualTo(String value) {
            addCriterion("TAIWANID =", value, "taiwanid");
            return (Criteria) this;
        }

        public Criteria andTaiwanidNotEqualTo(String value) {
            addCriterion("TAIWANID <>", value, "taiwanid");
            return (Criteria) this;
        }

        public Criteria andTaiwanidGreaterThan(String value) {
            addCriterion("TAIWANID >", value, "taiwanid");
            return (Criteria) this;
        }

        public Criteria andTaiwanidGreaterThanOrEqualTo(String value) {
            addCriterion("TAIWANID >=", value, "taiwanid");
            return (Criteria) this;
        }

        public Criteria andTaiwanidLessThan(String value) {
            addCriterion("TAIWANID <", value, "taiwanid");
            return (Criteria) this;
        }

        public Criteria andTaiwanidLessThanOrEqualTo(String value) {
            addCriterion("TAIWANID <=", value, "taiwanid");
            return (Criteria) this;
        }

        public Criteria andTaiwanidLike(String value) {
            addCriterion("TAIWANID like", value, "taiwanid");
            return (Criteria) this;
        }

        public Criteria andTaiwanidNotLike(String value) {
            addCriterion("TAIWANID not like", value, "taiwanid");
            return (Criteria) this;
        }

        public Criteria andTaiwanidIn(List<String> values) {
            addCriterion("TAIWANID in", values, "taiwanid");
            return (Criteria) this;
        }

        public Criteria andTaiwanidNotIn(List<String> values) {
            addCriterion("TAIWANID not in", values, "taiwanid");
            return (Criteria) this;
        }

        public Criteria andTaiwanidBetween(String value1, String value2) {
            addCriterion("TAIWANID between", value1, value2, "taiwanid");
            return (Criteria) this;
        }

        public Criteria andTaiwanidNotBetween(String value1, String value2) {
            addCriterion("TAIWANID not between", value1, value2, "taiwanid");
            return (Criteria) this;
        }

        public Criteria andForm401IsNull() {
            addCriterion("FORM401 is null");
            return (Criteria) this;
        }

        public Criteria andForm401IsNotNull() {
            addCriterion("FORM401 is not null");
            return (Criteria) this;
        }

        public Criteria andForm401EqualTo(String value) {
            addCriterion("FORM401 =", value, "form401");
            return (Criteria) this;
        }

        public Criteria andForm401NotEqualTo(String value) {
            addCriterion("FORM401 <>", value, "form401");
            return (Criteria) this;
        }

        public Criteria andForm401GreaterThan(String value) {
            addCriterion("FORM401 >", value, "form401");
            return (Criteria) this;
        }

        public Criteria andForm401GreaterThanOrEqualTo(String value) {
            addCriterion("FORM401 >=", value, "form401");
            return (Criteria) this;
        }

        public Criteria andForm401LessThan(String value) {
            addCriterion("FORM401 <", value, "form401");
            return (Criteria) this;
        }

        public Criteria andForm401LessThanOrEqualTo(String value) {
            addCriterion("FORM401 <=", value, "form401");
            return (Criteria) this;
        }

        public Criteria andForm401Like(String value) {
            addCriterion("FORM401 like", value, "form401");
            return (Criteria) this;
        }

        public Criteria andForm401NotLike(String value) {
            addCriterion("FORM401 not like", value, "form401");
            return (Criteria) this;
        }

        public Criteria andForm401In(List<String> values) {
            addCriterion("FORM401 in", values, "form401");
            return (Criteria) this;
        }

        public Criteria andForm401NotIn(List<String> values) {
            addCriterion("FORM401 not in", values, "form401");
            return (Criteria) this;
        }

        public Criteria andForm401Between(String value1, String value2) {
            addCriterion("FORM401 between", value1, value2, "form401");
            return (Criteria) this;
        }

        public Criteria andForm401NotBetween(String value1, String value2) {
            addCriterion("FORM401 not between", value1, value2, "form401");
            return (Criteria) this;
        }

        public Criteria andSupplierinfoinspmIsNull() {
            addCriterion("SUPPLIERINFOINSPM is null");
            return (Criteria) this;
        }

        public Criteria andSupplierinfoinspmIsNotNull() {
            addCriterion("SUPPLIERINFOINSPM is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierinfoinspmEqualTo(String value) {
            addCriterion("SUPPLIERINFOINSPM =", value, "supplierinfoinspm");
            return (Criteria) this;
        }

        public Criteria andSupplierinfoinspmNotEqualTo(String value) {
            addCriterion("SUPPLIERINFOINSPM <>", value, "supplierinfoinspm");
            return (Criteria) this;
        }

        public Criteria andSupplierinfoinspmGreaterThan(String value) {
            addCriterion("SUPPLIERINFOINSPM >", value, "supplierinfoinspm");
            return (Criteria) this;
        }

        public Criteria andSupplierinfoinspmGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIERINFOINSPM >=", value, "supplierinfoinspm");
            return (Criteria) this;
        }

        public Criteria andSupplierinfoinspmLessThan(String value) {
            addCriterion("SUPPLIERINFOINSPM <", value, "supplierinfoinspm");
            return (Criteria) this;
        }

        public Criteria andSupplierinfoinspmLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIERINFOINSPM <=", value, "supplierinfoinspm");
            return (Criteria) this;
        }

        public Criteria andSupplierinfoinspmLike(String value) {
            addCriterion("SUPPLIERINFOINSPM like", value, "supplierinfoinspm");
            return (Criteria) this;
        }

        public Criteria andSupplierinfoinspmNotLike(String value) {
            addCriterion("SUPPLIERINFOINSPM not like", value, "supplierinfoinspm");
            return (Criteria) this;
        }

        public Criteria andSupplierinfoinspmIn(List<String> values) {
            addCriterion("SUPPLIERINFOINSPM in", values, "supplierinfoinspm");
            return (Criteria) this;
        }

        public Criteria andSupplierinfoinspmNotIn(List<String> values) {
            addCriterion("SUPPLIERINFOINSPM not in", values, "supplierinfoinspm");
            return (Criteria) this;
        }

        public Criteria andSupplierinfoinspmBetween(String value1, String value2) {
            addCriterion("SUPPLIERINFOINSPM between", value1, value2, "supplierinfoinspm");
            return (Criteria) this;
        }

        public Criteria andSupplierinfoinspmNotBetween(String value1, String value2) {
            addCriterion("SUPPLIERINFOINSPM not between", value1, value2, "supplierinfoinspm");
            return (Criteria) this;
        }

        public Criteria andOthertermsIsNull() {
            addCriterion("OTHERTERMS is null");
            return (Criteria) this;
        }

        public Criteria andOthertermsIsNotNull() {
            addCriterion("OTHERTERMS is not null");
            return (Criteria) this;
        }

        public Criteria andOthertermsEqualTo(String value) {
            addCriterion("OTHERTERMS =", value, "otherterms");
            return (Criteria) this;
        }

        public Criteria andOthertermsNotEqualTo(String value) {
            addCriterion("OTHERTERMS <>", value, "otherterms");
            return (Criteria) this;
        }

        public Criteria andOthertermsGreaterThan(String value) {
            addCriterion("OTHERTERMS >", value, "otherterms");
            return (Criteria) this;
        }

        public Criteria andOthertermsGreaterThanOrEqualTo(String value) {
            addCriterion("OTHERTERMS >=", value, "otherterms");
            return (Criteria) this;
        }

        public Criteria andOthertermsLessThan(String value) {
            addCriterion("OTHERTERMS <", value, "otherterms");
            return (Criteria) this;
        }

        public Criteria andOthertermsLessThanOrEqualTo(String value) {
            addCriterion("OTHERTERMS <=", value, "otherterms");
            return (Criteria) this;
        }

        public Criteria andOthertermsLike(String value) {
            addCriterion("OTHERTERMS like", value, "otherterms");
            return (Criteria) this;
        }

        public Criteria andOthertermsNotLike(String value) {
            addCriterion("OTHERTERMS not like", value, "otherterms");
            return (Criteria) this;
        }

        public Criteria andOthertermsIn(List<String> values) {
            addCriterion("OTHERTERMS in", values, "otherterms");
            return (Criteria) this;
        }

        public Criteria andOthertermsNotIn(List<String> values) {
            addCriterion("OTHERTERMS not in", values, "otherterms");
            return (Criteria) this;
        }

        public Criteria andOthertermsBetween(String value1, String value2) {
            addCriterion("OTHERTERMS between", value1, value2, "otherterms");
            return (Criteria) this;
        }

        public Criteria andOthertermsNotBetween(String value1, String value2) {
            addCriterion("OTHERTERMS not between", value1, value2, "otherterms");
            return (Criteria) this;
        }

        public Criteria andMarketingfeeIsNull() {
            addCriterion("MARKETINGFEE is null");
            return (Criteria) this;
        }

        public Criteria andMarketingfeeIsNotNull() {
            addCriterion("MARKETINGFEE is not null");
            return (Criteria) this;
        }

        public Criteria andMarketingfeeEqualTo(String value) {
            addCriterion("MARKETINGFEE =", value, "marketingfee");
            return (Criteria) this;
        }

        public Criteria andMarketingfeeNotEqualTo(String value) {
            addCriterion("MARKETINGFEE <>", value, "marketingfee");
            return (Criteria) this;
        }

        public Criteria andMarketingfeeGreaterThan(String value) {
            addCriterion("MARKETINGFEE >", value, "marketingfee");
            return (Criteria) this;
        }

        public Criteria andMarketingfeeGreaterThanOrEqualTo(String value) {
            addCriterion("MARKETINGFEE >=", value, "marketingfee");
            return (Criteria) this;
        }

        public Criteria andMarketingfeeLessThan(String value) {
            addCriterion("MARKETINGFEE <", value, "marketingfee");
            return (Criteria) this;
        }

        public Criteria andMarketingfeeLessThanOrEqualTo(String value) {
            addCriterion("MARKETINGFEE <=", value, "marketingfee");
            return (Criteria) this;
        }

        public Criteria andMarketingfeeLike(String value) {
            addCriterion("MARKETINGFEE like", value, "marketingfee");
            return (Criteria) this;
        }

        public Criteria andMarketingfeeNotLike(String value) {
            addCriterion("MARKETINGFEE not like", value, "marketingfee");
            return (Criteria) this;
        }

        public Criteria andMarketingfeeIn(List<String> values) {
            addCriterion("MARKETINGFEE in", values, "marketingfee");
            return (Criteria) this;
        }

        public Criteria andMarketingfeeNotIn(List<String> values) {
            addCriterion("MARKETINGFEE not in", values, "marketingfee");
            return (Criteria) this;
        }

        public Criteria andMarketingfeeBetween(String value1, String value2) {
            addCriterion("MARKETINGFEE between", value1, value2, "marketingfee");
            return (Criteria) this;
        }

        public Criteria andMarketingfeeNotBetween(String value1, String value2) {
            addCriterion("MARKETINGFEE not between", value1, value2, "marketingfee");
            return (Criteria) this;
        }

        public Criteria andWarrantyflagIsNull() {
            addCriterion("WARRANTYFLAG is null");
            return (Criteria) this;
        }

        public Criteria andWarrantyflagIsNotNull() {
            addCriterion("WARRANTYFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andWarrantyflagEqualTo(Integer value) {
            addCriterion("WARRANTYFLAG =", value, "warrantyflag");
            return (Criteria) this;
        }

        public Criteria andWarrantyflagNotEqualTo(Integer value) {
            addCriterion("WARRANTYFLAG <>", value, "warrantyflag");
            return (Criteria) this;
        }

        public Criteria andWarrantyflagGreaterThan(Integer value) {
            addCriterion("WARRANTYFLAG >", value, "warrantyflag");
            return (Criteria) this;
        }

        public Criteria andWarrantyflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("WARRANTYFLAG >=", value, "warrantyflag");
            return (Criteria) this;
        }

        public Criteria andWarrantyflagLessThan(Integer value) {
            addCriterion("WARRANTYFLAG <", value, "warrantyflag");
            return (Criteria) this;
        }

        public Criteria andWarrantyflagLessThanOrEqualTo(Integer value) {
            addCriterion("WARRANTYFLAG <=", value, "warrantyflag");
            return (Criteria) this;
        }

        public Criteria andWarrantyflagIn(List<Integer> values) {
            addCriterion("WARRANTYFLAG in", values, "warrantyflag");
            return (Criteria) this;
        }

        public Criteria andWarrantyflagNotIn(List<Integer> values) {
            addCriterion("WARRANTYFLAG not in", values, "warrantyflag");
            return (Criteria) this;
        }

        public Criteria andWarrantyflagBetween(Integer value1, Integer value2) {
            addCriterion("WARRANTYFLAG between", value1, value2, "warrantyflag");
            return (Criteria) this;
        }

        public Criteria andWarrantyflagNotBetween(Integer value1, Integer value2) {
            addCriterion("WARRANTYFLAG not between", value1, value2, "warrantyflag");
            return (Criteria) this;
        }

        public Criteria andWarrantyhandindateIsNull() {
            addCriterion("WARRANTYHANDINDATE is null");
            return (Criteria) this;
        }

        public Criteria andWarrantyhandindateIsNotNull() {
            addCriterion("WARRANTYHANDINDATE is not null");
            return (Criteria) this;
        }

        public Criteria andWarrantyhandindateEqualTo(Date value) {
            addCriterion("WARRANTYHANDINDATE =", value, "warrantyhandindate");
            return (Criteria) this;
        }

        public Criteria andWarrantyhandindateNotEqualTo(Date value) {
            addCriterion("WARRANTYHANDINDATE <>", value, "warrantyhandindate");
            return (Criteria) this;
        }

        public Criteria andWarrantyhandindateGreaterThan(Date value) {
            addCriterion("WARRANTYHANDINDATE >", value, "warrantyhandindate");
            return (Criteria) this;
        }

        public Criteria andWarrantyhandindateGreaterThanOrEqualTo(Date value) {
            addCriterion("WARRANTYHANDINDATE >=", value, "warrantyhandindate");
            return (Criteria) this;
        }

        public Criteria andWarrantyhandindateLessThan(Date value) {
            addCriterion("WARRANTYHANDINDATE <", value, "warrantyhandindate");
            return (Criteria) this;
        }

        public Criteria andWarrantyhandindateLessThanOrEqualTo(Date value) {
            addCriterion("WARRANTYHANDINDATE <=", value, "warrantyhandindate");
            return (Criteria) this;
        }

        public Criteria andWarrantyhandindateIn(List<Date> values) {
            addCriterion("WARRANTYHANDINDATE in", values, "warrantyhandindate");
            return (Criteria) this;
        }

        public Criteria andWarrantyhandindateNotIn(List<Date> values) {
            addCriterion("WARRANTYHANDINDATE not in", values, "warrantyhandindate");
            return (Criteria) this;
        }

        public Criteria andWarrantyhandindateBetween(Date value1, Date value2) {
            addCriterion("WARRANTYHANDINDATE between", value1, value2, "warrantyhandindate");
            return (Criteria) this;
        }

        public Criteria andWarrantyhandindateNotBetween(Date value1, Date value2) {
            addCriterion("WARRANTYHANDINDATE not between", value1, value2, "warrantyhandindate");
            return (Criteria) this;
        }

        public Criteria andWarrantycanceldateIsNull() {
            addCriterion("WARRANTYCANCELDATE is null");
            return (Criteria) this;
        }

        public Criteria andWarrantycanceldateIsNotNull() {
            addCriterion("WARRANTYCANCELDATE is not null");
            return (Criteria) this;
        }

        public Criteria andWarrantycanceldateEqualTo(Date value) {
            addCriterion("WARRANTYCANCELDATE =", value, "warrantycanceldate");
            return (Criteria) this;
        }

        public Criteria andWarrantycanceldateNotEqualTo(Date value) {
            addCriterion("WARRANTYCANCELDATE <>", value, "warrantycanceldate");
            return (Criteria) this;
        }

        public Criteria andWarrantycanceldateGreaterThan(Date value) {
            addCriterion("WARRANTYCANCELDATE >", value, "warrantycanceldate");
            return (Criteria) this;
        }

        public Criteria andWarrantycanceldateGreaterThanOrEqualTo(Date value) {
            addCriterion("WARRANTYCANCELDATE >=", value, "warrantycanceldate");
            return (Criteria) this;
        }

        public Criteria andWarrantycanceldateLessThan(Date value) {
            addCriterion("WARRANTYCANCELDATE <", value, "warrantycanceldate");
            return (Criteria) this;
        }

        public Criteria andWarrantycanceldateLessThanOrEqualTo(Date value) {
            addCriterion("WARRANTYCANCELDATE <=", value, "warrantycanceldate");
            return (Criteria) this;
        }

        public Criteria andWarrantycanceldateIn(List<Date> values) {
            addCriterion("WARRANTYCANCELDATE in", values, "warrantycanceldate");
            return (Criteria) this;
        }

        public Criteria andWarrantycanceldateNotIn(List<Date> values) {
            addCriterion("WARRANTYCANCELDATE not in", values, "warrantycanceldate");
            return (Criteria) this;
        }

        public Criteria andWarrantycanceldateBetween(Date value1, Date value2) {
            addCriterion("WARRANTYCANCELDATE between", value1, value2, "warrantycanceldate");
            return (Criteria) this;
        }

        public Criteria andWarrantycanceldateNotBetween(Date value1, Date value2) {
            addCriterion("WARRANTYCANCELDATE not between", value1, value2, "warrantycanceldate");
            return (Criteria) this;
        }

        public Criteria andWarrantytitleIsNull() {
            addCriterion("WARRANTYTITLE is null");
            return (Criteria) this;
        }

        public Criteria andWarrantytitleIsNotNull() {
            addCriterion("WARRANTYTITLE is not null");
            return (Criteria) this;
        }

        public Criteria andWarrantytitleEqualTo(Integer value) {
            addCriterion("WARRANTYTITLE =", value, "warrantytitle");
            return (Criteria) this;
        }

        public Criteria andWarrantytitleNotEqualTo(Integer value) {
            addCriterion("WARRANTYTITLE <>", value, "warrantytitle");
            return (Criteria) this;
        }

        public Criteria andWarrantytitleGreaterThan(Integer value) {
            addCriterion("WARRANTYTITLE >", value, "warrantytitle");
            return (Criteria) this;
        }

        public Criteria andWarrantytitleGreaterThanOrEqualTo(Integer value) {
            addCriterion("WARRANTYTITLE >=", value, "warrantytitle");
            return (Criteria) this;
        }

        public Criteria andWarrantytitleLessThan(Integer value) {
            addCriterion("WARRANTYTITLE <", value, "warrantytitle");
            return (Criteria) this;
        }

        public Criteria andWarrantytitleLessThanOrEqualTo(Integer value) {
            addCriterion("WARRANTYTITLE <=", value, "warrantytitle");
            return (Criteria) this;
        }

        public Criteria andWarrantytitleIn(List<Integer> values) {
            addCriterion("WARRANTYTITLE in", values, "warrantytitle");
            return (Criteria) this;
        }

        public Criteria andWarrantytitleNotIn(List<Integer> values) {
            addCriterion("WARRANTYTITLE not in", values, "warrantytitle");
            return (Criteria) this;
        }

        public Criteria andWarrantytitleBetween(Integer value1, Integer value2) {
            addCriterion("WARRANTYTITLE between", value1, value2, "warrantytitle");
            return (Criteria) this;
        }

        public Criteria andWarrantytitleNotBetween(Integer value1, Integer value2) {
            addCriterion("WARRANTYTITLE not between", value1, value2, "warrantytitle");
            return (Criteria) this;
        }

        public Criteria andWarrantynoIsNull() {
            addCriterion("WARRANTYNO is null");
            return (Criteria) this;
        }

        public Criteria andWarrantynoIsNotNull() {
            addCriterion("WARRANTYNO is not null");
            return (Criteria) this;
        }

        public Criteria andWarrantynoEqualTo(String value) {
            addCriterion("WARRANTYNO =", value, "warrantyno");
            return (Criteria) this;
        }

        public Criteria andWarrantynoNotEqualTo(String value) {
            addCriterion("WARRANTYNO <>", value, "warrantyno");
            return (Criteria) this;
        }

        public Criteria andWarrantynoGreaterThan(String value) {
            addCriterion("WARRANTYNO >", value, "warrantyno");
            return (Criteria) this;
        }

        public Criteria andWarrantynoGreaterThanOrEqualTo(String value) {
            addCriterion("WARRANTYNO >=", value, "warrantyno");
            return (Criteria) this;
        }

        public Criteria andWarrantynoLessThan(String value) {
            addCriterion("WARRANTYNO <", value, "warrantyno");
            return (Criteria) this;
        }

        public Criteria andWarrantynoLessThanOrEqualTo(String value) {
            addCriterion("WARRANTYNO <=", value, "warrantyno");
            return (Criteria) this;
        }

        public Criteria andWarrantynoIn(List<String> values) {
            addCriterion("WARRANTYNO in", values, "warrantyno");
            return (Criteria) this;
        }

        public Criteria andWarrantynoNotIn(List<String> values) {
            addCriterion("WARRANTYNO not in", values, "warrantyno");
            return (Criteria) this;
        }

        public Criteria andWarrantynoBetween(String value1, String value2) {
            addCriterion("WARRANTYNO between", value1, value2, "warrantyno");
            return (Criteria) this;
        }

        public Criteria andWarrantynoNotBetween(String value1, String value2) {
            addCriterion("WARRANTYNO not between", value1, value2, "warrantyno");
            return (Criteria) this;
        }

        public Criteria andCertificateflagIsNull() {
            addCriterion("CERTIFICATEFLAG is null");
            return (Criteria) this;
        }

        public Criteria andCertificateflagIsNotNull() {
            addCriterion("CERTIFICATEFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateflagEqualTo(String value) {
            addCriterion("CERTIFICATEFLAG =", value, "certificateflag");
            return (Criteria) this;
        }

        public Criteria andCertificateflagNotEqualTo(String value) {
            addCriterion("CERTIFICATEFLAG <>", value, "certificateflag");
            return (Criteria) this;
        }

        public Criteria andCertificateflagGreaterThan(String value) {
            addCriterion("CERTIFICATEFLAG >", value, "certificateflag");
            return (Criteria) this;
        }

        public Criteria andCertificateflagGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATEFLAG >=", value, "certificateflag");
            return (Criteria) this;
        }

        public Criteria andCertificateflagLessThan(String value) {
            addCriterion("CERTIFICATEFLAG <", value, "certificateflag");
            return (Criteria) this;
        }

        public Criteria andCertificateflagLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATEFLAG <=", value, "certificateflag");
            return (Criteria) this;
        }

        public Criteria andCertificateflagLike(String value) {
            addCriterion("CERTIFICATEFLAG like", value, "certificateflag");
            return (Criteria) this;
        }

        public Criteria andCertificateflagNotLike(String value) {
            addCriterion("CERTIFICATEFLAG not like", value, "certificateflag");
            return (Criteria) this;
        }

        public Criteria andCertificateflagIn(List<String> values) {
            addCriterion("CERTIFICATEFLAG in", values, "certificateflag");
            return (Criteria) this;
        }

        public Criteria andCertificateflagNotIn(List<String> values) {
            addCriterion("CERTIFICATEFLAG not in", values, "certificateflag");
            return (Criteria) this;
        }

        public Criteria andCertificateflagBetween(String value1, String value2) {
            addCriterion("CERTIFICATEFLAG between", value1, value2, "certificateflag");
            return (Criteria) this;
        }

        public Criteria andCertificateflagNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATEFLAG not between", value1, value2, "certificateflag");
            return (Criteria) this;
        }

        public Criteria andCertificatefeedateIsNull() {
            addCriterion("CERTIFICATEFEEDATE is null");
            return (Criteria) this;
        }

        public Criteria andCertificatefeedateIsNotNull() {
            addCriterion("CERTIFICATEFEEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCertificatefeedateEqualTo(Date value) {
            addCriterion("CERTIFICATEFEEDATE =", value, "certificatefeedate");
            return (Criteria) this;
        }

        public Criteria andCertificatefeedateNotEqualTo(Date value) {
            addCriterion("CERTIFICATEFEEDATE <>", value, "certificatefeedate");
            return (Criteria) this;
        }

        public Criteria andCertificatefeedateGreaterThan(Date value) {
            addCriterion("CERTIFICATEFEEDATE >", value, "certificatefeedate");
            return (Criteria) this;
        }

        public Criteria andCertificatefeedateGreaterThanOrEqualTo(Date value) {
            addCriterion("CERTIFICATEFEEDATE >=", value, "certificatefeedate");
            return (Criteria) this;
        }

        public Criteria andCertificatefeedateLessThan(Date value) {
            addCriterion("CERTIFICATEFEEDATE <", value, "certificatefeedate");
            return (Criteria) this;
        }

        public Criteria andCertificatefeedateLessThanOrEqualTo(Date value) {
            addCriterion("CERTIFICATEFEEDATE <=", value, "certificatefeedate");
            return (Criteria) this;
        }

        public Criteria andCertificatefeedateIn(List<Date> values) {
            addCriterion("CERTIFICATEFEEDATE in", values, "certificatefeedate");
            return (Criteria) this;
        }

        public Criteria andCertificatefeedateNotIn(List<Date> values) {
            addCriterion("CERTIFICATEFEEDATE not in", values, "certificatefeedate");
            return (Criteria) this;
        }

        public Criteria andCertificatefeedateBetween(Date value1, Date value2) {
            addCriterion("CERTIFICATEFEEDATE between", value1, value2, "certificatefeedate");
            return (Criteria) this;
        }

        public Criteria andCertificatefeedateNotBetween(Date value1, Date value2) {
            addCriterion("CERTIFICATEFEEDATE not between", value1, value2, "certificatefeedate");
            return (Criteria) this;
        }

        public Criteria andCertificatevaliddatefromIsNull() {
            addCriterion("CERTIFICATEVALIDDATEFROM is null");
            return (Criteria) this;
        }

        public Criteria andCertificatevaliddatefromIsNotNull() {
            addCriterion("CERTIFICATEVALIDDATEFROM is not null");
            return (Criteria) this;
        }

        public Criteria andCertificatevaliddatefromEqualTo(Date value) {
            addCriterion("CERTIFICATEVALIDDATEFROM =", value, "certificatevaliddatefrom");
            return (Criteria) this;
        }

        public Criteria andCertificatevaliddatefromNotEqualTo(Date value) {
            addCriterion("CERTIFICATEVALIDDATEFROM <>", value, "certificatevaliddatefrom");
            return (Criteria) this;
        }

        public Criteria andCertificatevaliddatefromGreaterThan(Date value) {
            addCriterion("CERTIFICATEVALIDDATEFROM >", value, "certificatevaliddatefrom");
            return (Criteria) this;
        }

        public Criteria andCertificatevaliddatefromGreaterThanOrEqualTo(Date value) {
            addCriterion("CERTIFICATEVALIDDATEFROM >=", value, "certificatevaliddatefrom");
            return (Criteria) this;
        }

        public Criteria andCertificatevaliddatefromLessThan(Date value) {
            addCriterion("CERTIFICATEVALIDDATEFROM <", value, "certificatevaliddatefrom");
            return (Criteria) this;
        }

        public Criteria andCertificatevaliddatefromLessThanOrEqualTo(Date value) {
            addCriterion("CERTIFICATEVALIDDATEFROM <=", value, "certificatevaliddatefrom");
            return (Criteria) this;
        }

        public Criteria andCertificatevaliddatefromIn(List<Date> values) {
            addCriterion("CERTIFICATEVALIDDATEFROM in", values, "certificatevaliddatefrom");
            return (Criteria) this;
        }

        public Criteria andCertificatevaliddatefromNotIn(List<Date> values) {
            addCriterion("CERTIFICATEVALIDDATEFROM not in", values, "certificatevaliddatefrom");
            return (Criteria) this;
        }

        public Criteria andCertificatevaliddatefromBetween(Date value1, Date value2) {
            addCriterion("CERTIFICATEVALIDDATEFROM between", value1, value2, "certificatevaliddatefrom");
            return (Criteria) this;
        }

        public Criteria andCertificatevaliddatefromNotBetween(Date value1, Date value2) {
            addCriterion("CERTIFICATEVALIDDATEFROM not between", value1, value2, "certificatevaliddatefrom");
            return (Criteria) this;
        }

        public Criteria andCertificatevaliddatetoIsNull() {
            addCriterion("CERTIFICATEVALIDDATETO is null");
            return (Criteria) this;
        }

        public Criteria andCertificatevaliddatetoIsNotNull() {
            addCriterion("CERTIFICATEVALIDDATETO is not null");
            return (Criteria) this;
        }

        public Criteria andCertificatevaliddatetoEqualTo(Date value) {
            addCriterion("CERTIFICATEVALIDDATETO =", value, "certificatevaliddateto");
            return (Criteria) this;
        }

        public Criteria andCertificatevaliddatetoNotEqualTo(Date value) {
            addCriterion("CERTIFICATEVALIDDATETO <>", value, "certificatevaliddateto");
            return (Criteria) this;
        }

        public Criteria andCertificatevaliddatetoGreaterThan(Date value) {
            addCriterion("CERTIFICATEVALIDDATETO >", value, "certificatevaliddateto");
            return (Criteria) this;
        }

        public Criteria andCertificatevaliddatetoGreaterThanOrEqualTo(Date value) {
            addCriterion("CERTIFICATEVALIDDATETO >=", value, "certificatevaliddateto");
            return (Criteria) this;
        }

        public Criteria andCertificatevaliddatetoLessThan(Date value) {
            addCriterion("CERTIFICATEVALIDDATETO <", value, "certificatevaliddateto");
            return (Criteria) this;
        }

        public Criteria andCertificatevaliddatetoLessThanOrEqualTo(Date value) {
            addCriterion("CERTIFICATEVALIDDATETO <=", value, "certificatevaliddateto");
            return (Criteria) this;
        }

        public Criteria andCertificatevaliddatetoIn(List<Date> values) {
            addCriterion("CERTIFICATEVALIDDATETO in", values, "certificatevaliddateto");
            return (Criteria) this;
        }

        public Criteria andCertificatevaliddatetoNotIn(List<Date> values) {
            addCriterion("CERTIFICATEVALIDDATETO not in", values, "certificatevaliddateto");
            return (Criteria) this;
        }

        public Criteria andCertificatevaliddatetoBetween(Date value1, Date value2) {
            addCriterion("CERTIFICATEVALIDDATETO between", value1, value2, "certificatevaliddateto");
            return (Criteria) this;
        }

        public Criteria andCertificatevaliddatetoNotBetween(Date value1, Date value2) {
            addCriterion("CERTIFICATEVALIDDATETO not between", value1, value2, "certificatevaliddateto");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ET1_CHINA.TSCM_SUPPLIERCONTRACT
     *
     * @mbggenerated do_not_delete_during_merge Fri Oct 17 10:00:01 CST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ET1_CHINA.TSCM_SUPPLIERCONTRACT
     *
     * @mbggenerated Fri Oct 17 10:00:01 CST 2014
     */
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