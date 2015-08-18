package com.dk.scorecheckdemo.po;

import java.util.ArrayList;
import java.util.List;

public class PositionPoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PositionPoExample() {
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

        public Criteria andPsnIdIsNull() {
            addCriterion("psn_id is null");
            return (Criteria) this;
        }

        public Criteria andPsnIdIsNotNull() {
            addCriterion("psn_id is not null");
            return (Criteria) this;
        }

        public Criteria andPsnIdEqualTo(String value) {
            addCriterion("psn_id =", value, "psnId");
            return (Criteria) this;
        }

        public Criteria andPsnIdNotEqualTo(String value) {
            addCriterion("psn_id <>", value, "psnId");
            return (Criteria) this;
        }

        public Criteria andPsnIdGreaterThan(String value) {
            addCriterion("psn_id >", value, "psnId");
            return (Criteria) this;
        }

        public Criteria andPsnIdGreaterThanOrEqualTo(String value) {
            addCriterion("psn_id >=", value, "psnId");
            return (Criteria) this;
        }

        public Criteria andPsnIdLessThan(String value) {
            addCriterion("psn_id <", value, "psnId");
            return (Criteria) this;
        }

        public Criteria andPsnIdLessThanOrEqualTo(String value) {
            addCriterion("psn_id <=", value, "psnId");
            return (Criteria) this;
        }

        public Criteria andPsnIdLike(String value) {
            addCriterion("psn_id like", value, "psnId");
            return (Criteria) this;
        }

        public Criteria andPsnIdNotLike(String value) {
            addCriterion("psn_id not like", value, "psnId");
            return (Criteria) this;
        }

        public Criteria andPsnIdIn(List<String> values) {
            addCriterion("psn_id in", values, "psnId");
            return (Criteria) this;
        }

        public Criteria andPsnIdNotIn(List<String> values) {
            addCriterion("psn_id not in", values, "psnId");
            return (Criteria) this;
        }

        public Criteria andPsnIdBetween(String value1, String value2) {
            addCriterion("psn_id between", value1, value2, "psnId");
            return (Criteria) this;
        }

        public Criteria andPsnIdNotBetween(String value1, String value2) {
            addCriterion("psn_id not between", value1, value2, "psnId");
            return (Criteria) this;
        }

        public Criteria andPsnNameIsNull() {
            addCriterion("psn_name is null");
            return (Criteria) this;
        }

        public Criteria andPsnNameIsNotNull() {
            addCriterion("psn_name is not null");
            return (Criteria) this;
        }

        public Criteria andPsnNameEqualTo(String value) {
            addCriterion("psn_name =", value, "psnName");
            return (Criteria) this;
        }

        public Criteria andPsnNameNotEqualTo(String value) {
            addCriterion("psn_name <>", value, "psnName");
            return (Criteria) this;
        }

        public Criteria andPsnNameGreaterThan(String value) {
            addCriterion("psn_name >", value, "psnName");
            return (Criteria) this;
        }

        public Criteria andPsnNameGreaterThanOrEqualTo(String value) {
            addCriterion("psn_name >=", value, "psnName");
            return (Criteria) this;
        }

        public Criteria andPsnNameLessThan(String value) {
            addCriterion("psn_name <", value, "psnName");
            return (Criteria) this;
        }

        public Criteria andPsnNameLessThanOrEqualTo(String value) {
            addCriterion("psn_name <=", value, "psnName");
            return (Criteria) this;
        }

        public Criteria andPsnNameLike(String value) {
            addCriterion("psn_name like", value, "psnName");
            return (Criteria) this;
        }

        public Criteria andPsnNameNotLike(String value) {
            addCriterion("psn_name not like", value, "psnName");
            return (Criteria) this;
        }

        public Criteria andPsnNameIn(List<String> values) {
            addCriterion("psn_name in", values, "psnName");
            return (Criteria) this;
        }

        public Criteria andPsnNameNotIn(List<String> values) {
            addCriterion("psn_name not in", values, "psnName");
            return (Criteria) this;
        }

        public Criteria andPsnNameBetween(String value1, String value2) {
            addCriterion("psn_name between", value1, value2, "psnName");
            return (Criteria) this;
        }

        public Criteria andPsnNameNotBetween(String value1, String value2) {
            addCriterion("psn_name not between", value1, value2, "psnName");
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