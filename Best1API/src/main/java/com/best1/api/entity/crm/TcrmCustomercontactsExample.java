package com.best1.api.entity.crm;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TcrmCustomercontactsExample {
   
    protected String orderByClause;

   
    protected boolean distinct;

    
    protected List<Criteria> oredCriteria;

  
    public TcrmCustomercontactsExample() {
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

        public Criteria andCustomercontactsidIsNull() {
            addCriterion("CUSTOMERCONTACTSID is null");
            return (Criteria) this;
        }

        public Criteria andCustomercontactsidIsNotNull() {
            addCriterion("CUSTOMERCONTACTSID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomercontactsidEqualTo(Long value) {
            addCriterion("CUSTOMERCONTACTSID =", value, "customercontactsid");
            return (Criteria) this;
        }

        public Criteria andCustomercontactsidNotEqualTo(Long value) {
            addCriterion("CUSTOMERCONTACTSID <>", value, "customercontactsid");
            return (Criteria) this;
        }

        public Criteria andCustomercontactsidGreaterThan(Long value) {
            addCriterion("CUSTOMERCONTACTSID >", value, "customercontactsid");
            return (Criteria) this;
        }

        public Criteria andCustomercontactsidGreaterThanOrEqualTo(Long value) {
            addCriterion("CUSTOMERCONTACTSID >=", value, "customercontactsid");
            return (Criteria) this;
        }

        public Criteria andCustomercontactsidLessThan(Long value) {
            addCriterion("CUSTOMERCONTACTSID <", value, "customercontactsid");
            return (Criteria) this;
        }

        public Criteria andCustomercontactsidLessThanOrEqualTo(Long value) {
            addCriterion("CUSTOMERCONTACTSID <=", value, "customercontactsid");
            return (Criteria) this;
        }

        public Criteria andCustomercontactsidIn(List<Long> values) {
            addCriterion("CUSTOMERCONTACTSID in", values, "customercontactsid");
            return (Criteria) this;
        }

        public Criteria andCustomercontactsidNotIn(List<Long> values) {
            addCriterion("CUSTOMERCONTACTSID not in", values, "customercontactsid");
            return (Criteria) this;
        }

        public Criteria andCustomercontactsidBetween(Long value1, Long value2) {
            addCriterion("CUSTOMERCONTACTSID between", value1, value2, "customercontactsid");
            return (Criteria) this;
        }

        public Criteria andCustomercontactsidNotBetween(Long value1, Long value2) {
            addCriterion("CUSTOMERCONTACTSID not between", value1, value2, "customercontactsid");
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

        public Criteria andRelationshipIsNull() {
            addCriterion("RELATIONSHIP is null");
            return (Criteria) this;
        }

        public Criteria andRelationshipIsNotNull() {
            addCriterion("RELATIONSHIP is not null");
            return (Criteria) this;
        }

        public Criteria andRelationshipEqualTo(Integer value) {
            addCriterion("RELATIONSHIP =", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipNotEqualTo(Integer value) {
            addCriterion("RELATIONSHIP <>", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipGreaterThan(Integer value) {
            addCriterion("RELATIONSHIP >", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipGreaterThanOrEqualTo(Integer value) {
            addCriterion("RELATIONSHIP >=", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipLessThan(Integer value) {
            addCriterion("RELATIONSHIP <", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipLessThanOrEqualTo(Integer value) {
            addCriterion("RELATIONSHIP <=", value, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipIn(List<Integer> values) {
            addCriterion("RELATIONSHIP in", values, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipNotIn(List<Integer> values) {
            addCriterion("RELATIONSHIP not in", values, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipBetween(Integer value1, Integer value2) {
            addCriterion("RELATIONSHIP between", value1, value2, "relationship");
            return (Criteria) this;
        }

        public Criteria andRelationshipNotBetween(Integer value1, Integer value2) {
            addCriterion("RELATIONSHIP not between", value1, value2, "relationship");
            return (Criteria) this;
        }

        public Criteria andContacttypeIsNull() {
            addCriterion("CONTACTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andContacttypeIsNotNull() {
            addCriterion("CONTACTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andContacttypeEqualTo(Integer value) {
            addCriterion("CONTACTTYPE =", value, "contacttype");
            return (Criteria) this;
        }

        public Criteria andContacttypeNotEqualTo(Integer value) {
            addCriterion("CONTACTTYPE <>", value, "contacttype");
            return (Criteria) this;
        }

        public Criteria andContacttypeGreaterThan(Integer value) {
            addCriterion("CONTACTTYPE >", value, "contacttype");
            return (Criteria) this;
        }

        public Criteria andContacttypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CONTACTTYPE >=", value, "contacttype");
            return (Criteria) this;
        }

        public Criteria andContacttypeLessThan(Integer value) {
            addCriterion("CONTACTTYPE <", value, "contacttype");
            return (Criteria) this;
        }

        public Criteria andContacttypeLessThanOrEqualTo(Integer value) {
            addCriterion("CONTACTTYPE <=", value, "contacttype");
            return (Criteria) this;
        }

        public Criteria andContacttypeIn(List<Integer> values) {
            addCriterion("CONTACTTYPE in", values, "contacttype");
            return (Criteria) this;
        }

        public Criteria andContacttypeNotIn(List<Integer> values) {
            addCriterion("CONTACTTYPE not in", values, "contacttype");
            return (Criteria) this;
        }

        public Criteria andContacttypeBetween(Integer value1, Integer value2) {
            addCriterion("CONTACTTYPE between", value1, value2, "contacttype");
            return (Criteria) this;
        }

        public Criteria andContacttypeNotBetween(Integer value1, Integer value2) {
            addCriterion("CONTACTTYPE not between", value1, value2, "contacttype");
            return (Criteria) this;
        }

        public Criteria andContactnumberIsNull() {
            addCriterion("CONTACTNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andContactnumberIsNotNull() {
            addCriterion("CONTACTNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andContactnumberEqualTo(String value) {
            addCriterion("CONTACTNUMBER =", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberNotEqualTo(String value) {
            addCriterion("CONTACTNUMBER <>", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberGreaterThan(String value) {
            addCriterion("CONTACTNUMBER >", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTNUMBER >=", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberLessThan(String value) {
            addCriterion("CONTACTNUMBER <", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberLessThanOrEqualTo(String value) {
            addCriterion("CONTACTNUMBER <=", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberLike(String value) {
            addCriterion("CONTACTNUMBER like", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberNotLike(String value) {
            addCriterion("CONTACTNUMBER not like", value, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberIn(List<String> values) {
            addCriterion("CONTACTNUMBER in", values, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberNotIn(List<String> values) {
            addCriterion("CONTACTNUMBER not in", values, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberBetween(String value1, String value2) {
            addCriterion("CONTACTNUMBER between", value1, value2, "contactnumber");
            return (Criteria) this;
        }

        public Criteria andContactnumberNotBetween(String value1, String value2) {
            addCriterion("CONTACTNUMBER not between", value1, value2, "contactnumber");
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