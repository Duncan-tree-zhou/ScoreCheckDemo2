package com.dk.scorecheckdemo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LoginlogPoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoginlogPoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andLlidIsNull() {
            addCriterion("llid is null");
            return (Criteria) this;
        }

        public Criteria andLlidIsNotNull() {
            addCriterion("llid is not null");
            return (Criteria) this;
        }

        public Criteria andLlidEqualTo(String value) {
            addCriterion("llid =", value, "llid");
            return (Criteria) this;
        }

        public Criteria andLlidNotEqualTo(String value) {
            addCriterion("llid <>", value, "llid");
            return (Criteria) this;
        }

        public Criteria andLlidGreaterThan(String value) {
            addCriterion("llid >", value, "llid");
            return (Criteria) this;
        }

        public Criteria andLlidGreaterThanOrEqualTo(String value) {
            addCriterion("llid >=", value, "llid");
            return (Criteria) this;
        }

        public Criteria andLlidLessThan(String value) {
            addCriterion("llid <", value, "llid");
            return (Criteria) this;
        }

        public Criteria andLlidLessThanOrEqualTo(String value) {
            addCriterion("llid <=", value, "llid");
            return (Criteria) this;
        }

        public Criteria andLlidLike(String value) {
            addCriterion("llid like", value, "llid");
            return (Criteria) this;
        }

        public Criteria andLlidNotLike(String value) {
            addCriterion("llid not like", value, "llid");
            return (Criteria) this;
        }

        public Criteria andLlidIn(List<String> values) {
            addCriterion("llid in", values, "llid");
            return (Criteria) this;
        }

        public Criteria andLlidNotIn(List<String> values) {
            addCriterion("llid not in", values, "llid");
            return (Criteria) this;
        }

        public Criteria andLlidBetween(String value1, String value2) {
            addCriterion("llid between", value1, value2, "llid");
            return (Criteria) this;
        }

        public Criteria andLlidNotBetween(String value1, String value2) {
            addCriterion("llid not between", value1, value2, "llid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("uid like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("uid not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUipIsNull() {
            addCriterion("uip is null");
            return (Criteria) this;
        }

        public Criteria andUipIsNotNull() {
            addCriterion("uip is not null");
            return (Criteria) this;
        }

        public Criteria andUipEqualTo(String value) {
            addCriterion("uip =", value, "uip");
            return (Criteria) this;
        }

        public Criteria andUipNotEqualTo(String value) {
            addCriterion("uip <>", value, "uip");
            return (Criteria) this;
        }

        public Criteria andUipGreaterThan(String value) {
            addCriterion("uip >", value, "uip");
            return (Criteria) this;
        }

        public Criteria andUipGreaterThanOrEqualTo(String value) {
            addCriterion("uip >=", value, "uip");
            return (Criteria) this;
        }

        public Criteria andUipLessThan(String value) {
            addCriterion("uip <", value, "uip");
            return (Criteria) this;
        }

        public Criteria andUipLessThanOrEqualTo(String value) {
            addCriterion("uip <=", value, "uip");
            return (Criteria) this;
        }

        public Criteria andUipLike(String value) {
            addCriterion("uip like", value, "uip");
            return (Criteria) this;
        }

        public Criteria andUipNotLike(String value) {
            addCriterion("uip not like", value, "uip");
            return (Criteria) this;
        }

        public Criteria andUipIn(List<String> values) {
            addCriterion("uip in", values, "uip");
            return (Criteria) this;
        }

        public Criteria andUipNotIn(List<String> values) {
            addCriterion("uip not in", values, "uip");
            return (Criteria) this;
        }

        public Criteria andUipBetween(String value1, String value2) {
            addCriterion("uip between", value1, value2, "uip");
            return (Criteria) this;
        }

        public Criteria andUipNotBetween(String value1, String value2) {
            addCriterion("uip not between", value1, value2, "uip");
            return (Criteria) this;
        }

        public Criteria andLogindateIsNull() {
            addCriterion("loginDate is null");
            return (Criteria) this;
        }

        public Criteria andLogindateIsNotNull() {
            addCriterion("loginDate is not null");
            return (Criteria) this;
        }

        public Criteria andLogindateEqualTo(Date value) {
            addCriterionForJDBCDate("loginDate =", value, "logindate");
            return (Criteria) this;
        }

        public Criteria andLogindateNotEqualTo(Date value) {
            addCriterionForJDBCDate("loginDate <>", value, "logindate");
            return (Criteria) this;
        }

        public Criteria andLogindateGreaterThan(Date value) {
            addCriterionForJDBCDate("loginDate >", value, "logindate");
            return (Criteria) this;
        }

        public Criteria andLogindateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("loginDate >=", value, "logindate");
            return (Criteria) this;
        }

        public Criteria andLogindateLessThan(Date value) {
            addCriterionForJDBCDate("loginDate <", value, "logindate");
            return (Criteria) this;
        }

        public Criteria andLogindateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("loginDate <=", value, "logindate");
            return (Criteria) this;
        }

        public Criteria andLogindateIn(List<Date> values) {
            addCriterionForJDBCDate("loginDate in", values, "logindate");
            return (Criteria) this;
        }

        public Criteria andLogindateNotIn(List<Date> values) {
            addCriterionForJDBCDate("loginDate not in", values, "logindate");
            return (Criteria) this;
        }

        public Criteria andLogindateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("loginDate between", value1, value2, "logindate");
            return (Criteria) this;
        }

        public Criteria andLogindateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("loginDate not between", value1, value2, "logindate");
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