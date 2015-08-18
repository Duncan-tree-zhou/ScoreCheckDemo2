package com.dk.scorecheckdemo.po;

import java.util.ArrayList;
import java.util.List;

public class StudentPoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentPoExample() {
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

        public Criteria andStIdIsNull() {
            addCriterion("st_id is null");
            return (Criteria) this;
        }

        public Criteria andStIdIsNotNull() {
            addCriterion("st_id is not null");
            return (Criteria) this;
        }

        public Criteria andStIdEqualTo(String value) {
            addCriterion("st_id =", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotEqualTo(String value) {
            addCriterion("st_id <>", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdGreaterThan(String value) {
            addCriterion("st_id >", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdGreaterThanOrEqualTo(String value) {
            addCriterion("st_id >=", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdLessThan(String value) {
            addCriterion("st_id <", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdLessThanOrEqualTo(String value) {
            addCriterion("st_id <=", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdLike(String value) {
            addCriterion("st_id like", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotLike(String value) {
            addCriterion("st_id not like", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdIn(List<String> values) {
            addCriterion("st_id in", values, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotIn(List<String> values) {
            addCriterion("st_id not in", values, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdBetween(String value1, String value2) {
            addCriterion("st_id between", value1, value2, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotBetween(String value1, String value2) {
            addCriterion("st_id not between", value1, value2, "stId");
            return (Criteria) this;
        }

        public Criteria andStNameIsNull() {
            addCriterion("st_name is null");
            return (Criteria) this;
        }

        public Criteria andStNameIsNotNull() {
            addCriterion("st_name is not null");
            return (Criteria) this;
        }

        public Criteria andStNameEqualTo(String value) {
            addCriterion("st_name =", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameNotEqualTo(String value) {
            addCriterion("st_name <>", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameGreaterThan(String value) {
            addCriterion("st_name >", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameGreaterThanOrEqualTo(String value) {
            addCriterion("st_name >=", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameLessThan(String value) {
            addCriterion("st_name <", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameLessThanOrEqualTo(String value) {
            addCriterion("st_name <=", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameLike(String value) {
            addCriterion("st_name like", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameNotLike(String value) {
            addCriterion("st_name not like", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameIn(List<String> values) {
            addCriterion("st_name in", values, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameNotIn(List<String> values) {
            addCriterion("st_name not in", values, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameBetween(String value1, String value2) {
            addCriterion("st_name between", value1, value2, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameNotBetween(String value1, String value2) {
            addCriterion("st_name not between", value1, value2, "stName");
            return (Criteria) this;
        }

        public Criteria andStGenderIsNull() {
            addCriterion("st_gender is null");
            return (Criteria) this;
        }

        public Criteria andStGenderIsNotNull() {
            addCriterion("st_gender is not null");
            return (Criteria) this;
        }

        public Criteria andStGenderEqualTo(String value) {
            addCriterion("st_gender =", value, "stGender");
            return (Criteria) this;
        }

        public Criteria andStGenderNotEqualTo(String value) {
            addCriterion("st_gender <>", value, "stGender");
            return (Criteria) this;
        }

        public Criteria andStGenderGreaterThan(String value) {
            addCriterion("st_gender >", value, "stGender");
            return (Criteria) this;
        }

        public Criteria andStGenderGreaterThanOrEqualTo(String value) {
            addCriterion("st_gender >=", value, "stGender");
            return (Criteria) this;
        }

        public Criteria andStGenderLessThan(String value) {
            addCriterion("st_gender <", value, "stGender");
            return (Criteria) this;
        }

        public Criteria andStGenderLessThanOrEqualTo(String value) {
            addCriterion("st_gender <=", value, "stGender");
            return (Criteria) this;
        }

        public Criteria andStGenderLike(String value) {
            addCriterion("st_gender like", value, "stGender");
            return (Criteria) this;
        }

        public Criteria andStGenderNotLike(String value) {
            addCriterion("st_gender not like", value, "stGender");
            return (Criteria) this;
        }

        public Criteria andStGenderIn(List<String> values) {
            addCriterion("st_gender in", values, "stGender");
            return (Criteria) this;
        }

        public Criteria andStGenderNotIn(List<String> values) {
            addCriterion("st_gender not in", values, "stGender");
            return (Criteria) this;
        }

        public Criteria andStGenderBetween(String value1, String value2) {
            addCriterion("st_gender between", value1, value2, "stGender");
            return (Criteria) this;
        }

        public Criteria andStGenderNotBetween(String value1, String value2) {
            addCriterion("st_gender not between", value1, value2, "stGender");
            return (Criteria) this;
        }

        public Criteria andStParentNameIsNull() {
            addCriterion("st_parent_name is null");
            return (Criteria) this;
        }

        public Criteria andStParentNameIsNotNull() {
            addCriterion("st_parent_name is not null");
            return (Criteria) this;
        }

        public Criteria andStParentNameEqualTo(String value) {
            addCriterion("st_parent_name =", value, "stParentName");
            return (Criteria) this;
        }

        public Criteria andStParentNameNotEqualTo(String value) {
            addCriterion("st_parent_name <>", value, "stParentName");
            return (Criteria) this;
        }

        public Criteria andStParentNameGreaterThan(String value) {
            addCriterion("st_parent_name >", value, "stParentName");
            return (Criteria) this;
        }

        public Criteria andStParentNameGreaterThanOrEqualTo(String value) {
            addCriterion("st_parent_name >=", value, "stParentName");
            return (Criteria) this;
        }

        public Criteria andStParentNameLessThan(String value) {
            addCriterion("st_parent_name <", value, "stParentName");
            return (Criteria) this;
        }

        public Criteria andStParentNameLessThanOrEqualTo(String value) {
            addCriterion("st_parent_name <=", value, "stParentName");
            return (Criteria) this;
        }

        public Criteria andStParentNameLike(String value) {
            addCriterion("st_parent_name like", value, "stParentName");
            return (Criteria) this;
        }

        public Criteria andStParentNameNotLike(String value) {
            addCriterion("st_parent_name not like", value, "stParentName");
            return (Criteria) this;
        }

        public Criteria andStParentNameIn(List<String> values) {
            addCriterion("st_parent_name in", values, "stParentName");
            return (Criteria) this;
        }

        public Criteria andStParentNameNotIn(List<String> values) {
            addCriterion("st_parent_name not in", values, "stParentName");
            return (Criteria) this;
        }

        public Criteria andStParentNameBetween(String value1, String value2) {
            addCriterion("st_parent_name between", value1, value2, "stParentName");
            return (Criteria) this;
        }

        public Criteria andStParentNameNotBetween(String value1, String value2) {
            addCriterion("st_parent_name not between", value1, value2, "stParentName");
            return (Criteria) this;
        }

        public Criteria andStContactIsNull() {
            addCriterion("st_contact is null");
            return (Criteria) this;
        }

        public Criteria andStContactIsNotNull() {
            addCriterion("st_contact is not null");
            return (Criteria) this;
        }

        public Criteria andStContactEqualTo(String value) {
            addCriterion("st_contact =", value, "stContact");
            return (Criteria) this;
        }

        public Criteria andStContactNotEqualTo(String value) {
            addCriterion("st_contact <>", value, "stContact");
            return (Criteria) this;
        }

        public Criteria andStContactGreaterThan(String value) {
            addCriterion("st_contact >", value, "stContact");
            return (Criteria) this;
        }

        public Criteria andStContactGreaterThanOrEqualTo(String value) {
            addCriterion("st_contact >=", value, "stContact");
            return (Criteria) this;
        }

        public Criteria andStContactLessThan(String value) {
            addCriterion("st_contact <", value, "stContact");
            return (Criteria) this;
        }

        public Criteria andStContactLessThanOrEqualTo(String value) {
            addCriterion("st_contact <=", value, "stContact");
            return (Criteria) this;
        }

        public Criteria andStContactLike(String value) {
            addCriterion("st_contact like", value, "stContact");
            return (Criteria) this;
        }

        public Criteria andStContactNotLike(String value) {
            addCriterion("st_contact not like", value, "stContact");
            return (Criteria) this;
        }

        public Criteria andStContactIn(List<String> values) {
            addCriterion("st_contact in", values, "stContact");
            return (Criteria) this;
        }

        public Criteria andStContactNotIn(List<String> values) {
            addCriterion("st_contact not in", values, "stContact");
            return (Criteria) this;
        }

        public Criteria andStContactBetween(String value1, String value2) {
            addCriterion("st_contact between", value1, value2, "stContact");
            return (Criteria) this;
        }

        public Criteria andStContactNotBetween(String value1, String value2) {
            addCriterion("st_contact not between", value1, value2, "stContact");
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