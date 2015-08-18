package com.dk.scorecheckdemo.po;

import java.util.ArrayList;
import java.util.List;

public class TeacjerPoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacjerPoExample() {
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

        public Criteria andTchIdIsNull() {
            addCriterion("tch_id is null");
            return (Criteria) this;
        }

        public Criteria andTchIdIsNotNull() {
            addCriterion("tch_id is not null");
            return (Criteria) this;
        }

        public Criteria andTchIdEqualTo(String value) {
            addCriterion("tch_id =", value, "tchId");
            return (Criteria) this;
        }

        public Criteria andTchIdNotEqualTo(String value) {
            addCriterion("tch_id <>", value, "tchId");
            return (Criteria) this;
        }

        public Criteria andTchIdGreaterThan(String value) {
            addCriterion("tch_id >", value, "tchId");
            return (Criteria) this;
        }

        public Criteria andTchIdGreaterThanOrEqualTo(String value) {
            addCriterion("tch_id >=", value, "tchId");
            return (Criteria) this;
        }

        public Criteria andTchIdLessThan(String value) {
            addCriterion("tch_id <", value, "tchId");
            return (Criteria) this;
        }

        public Criteria andTchIdLessThanOrEqualTo(String value) {
            addCriterion("tch_id <=", value, "tchId");
            return (Criteria) this;
        }

        public Criteria andTchIdLike(String value) {
            addCriterion("tch_id like", value, "tchId");
            return (Criteria) this;
        }

        public Criteria andTchIdNotLike(String value) {
            addCriterion("tch_id not like", value, "tchId");
            return (Criteria) this;
        }

        public Criteria andTchIdIn(List<String> values) {
            addCriterion("tch_id in", values, "tchId");
            return (Criteria) this;
        }

        public Criteria andTchIdNotIn(List<String> values) {
            addCriterion("tch_id not in", values, "tchId");
            return (Criteria) this;
        }

        public Criteria andTchIdBetween(String value1, String value2) {
            addCriterion("tch_id between", value1, value2, "tchId");
            return (Criteria) this;
        }

        public Criteria andTchIdNotBetween(String value1, String value2) {
            addCriterion("tch_id not between", value1, value2, "tchId");
            return (Criteria) this;
        }

        public Criteria andTchNameIsNull() {
            addCriterion("tch_name is null");
            return (Criteria) this;
        }

        public Criteria andTchNameIsNotNull() {
            addCriterion("tch_name is not null");
            return (Criteria) this;
        }

        public Criteria andTchNameEqualTo(String value) {
            addCriterion("tch_name =", value, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameNotEqualTo(String value) {
            addCriterion("tch_name <>", value, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameGreaterThan(String value) {
            addCriterion("tch_name >", value, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameGreaterThanOrEqualTo(String value) {
            addCriterion("tch_name >=", value, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameLessThan(String value) {
            addCriterion("tch_name <", value, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameLessThanOrEqualTo(String value) {
            addCriterion("tch_name <=", value, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameLike(String value) {
            addCriterion("tch_name like", value, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameNotLike(String value) {
            addCriterion("tch_name not like", value, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameIn(List<String> values) {
            addCriterion("tch_name in", values, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameNotIn(List<String> values) {
            addCriterion("tch_name not in", values, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameBetween(String value1, String value2) {
            addCriterion("tch_name between", value1, value2, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchNameNotBetween(String value1, String value2) {
            addCriterion("tch_name not between", value1, value2, "tchName");
            return (Criteria) this;
        }

        public Criteria andTchGenderIsNull() {
            addCriterion("tch_gender is null");
            return (Criteria) this;
        }

        public Criteria andTchGenderIsNotNull() {
            addCriterion("tch_gender is not null");
            return (Criteria) this;
        }

        public Criteria andTchGenderEqualTo(String value) {
            addCriterion("tch_gender =", value, "tchGender");
            return (Criteria) this;
        }

        public Criteria andTchGenderNotEqualTo(String value) {
            addCriterion("tch_gender <>", value, "tchGender");
            return (Criteria) this;
        }

        public Criteria andTchGenderGreaterThan(String value) {
            addCriterion("tch_gender >", value, "tchGender");
            return (Criteria) this;
        }

        public Criteria andTchGenderGreaterThanOrEqualTo(String value) {
            addCriterion("tch_gender >=", value, "tchGender");
            return (Criteria) this;
        }

        public Criteria andTchGenderLessThan(String value) {
            addCriterion("tch_gender <", value, "tchGender");
            return (Criteria) this;
        }

        public Criteria andTchGenderLessThanOrEqualTo(String value) {
            addCriterion("tch_gender <=", value, "tchGender");
            return (Criteria) this;
        }

        public Criteria andTchGenderLike(String value) {
            addCriterion("tch_gender like", value, "tchGender");
            return (Criteria) this;
        }

        public Criteria andTchGenderNotLike(String value) {
            addCriterion("tch_gender not like", value, "tchGender");
            return (Criteria) this;
        }

        public Criteria andTchGenderIn(List<String> values) {
            addCriterion("tch_gender in", values, "tchGender");
            return (Criteria) this;
        }

        public Criteria andTchGenderNotIn(List<String> values) {
            addCriterion("tch_gender not in", values, "tchGender");
            return (Criteria) this;
        }

        public Criteria andTchGenderBetween(String value1, String value2) {
            addCriterion("tch_gender between", value1, value2, "tchGender");
            return (Criteria) this;
        }

        public Criteria andTchGenderNotBetween(String value1, String value2) {
            addCriterion("tch_gender not between", value1, value2, "tchGender");
            return (Criteria) this;
        }

        public Criteria andTchGroupIsNull() {
            addCriterion("tch_group is null");
            return (Criteria) this;
        }

        public Criteria andTchGroupIsNotNull() {
            addCriterion("tch_group is not null");
            return (Criteria) this;
        }

        public Criteria andTchGroupEqualTo(String value) {
            addCriterion("tch_group =", value, "tchGroup");
            return (Criteria) this;
        }

        public Criteria andTchGroupNotEqualTo(String value) {
            addCriterion("tch_group <>", value, "tchGroup");
            return (Criteria) this;
        }

        public Criteria andTchGroupGreaterThan(String value) {
            addCriterion("tch_group >", value, "tchGroup");
            return (Criteria) this;
        }

        public Criteria andTchGroupGreaterThanOrEqualTo(String value) {
            addCriterion("tch_group >=", value, "tchGroup");
            return (Criteria) this;
        }

        public Criteria andTchGroupLessThan(String value) {
            addCriterion("tch_group <", value, "tchGroup");
            return (Criteria) this;
        }

        public Criteria andTchGroupLessThanOrEqualTo(String value) {
            addCriterion("tch_group <=", value, "tchGroup");
            return (Criteria) this;
        }

        public Criteria andTchGroupLike(String value) {
            addCriterion("tch_group like", value, "tchGroup");
            return (Criteria) this;
        }

        public Criteria andTchGroupNotLike(String value) {
            addCriterion("tch_group not like", value, "tchGroup");
            return (Criteria) this;
        }

        public Criteria andTchGroupIn(List<String> values) {
            addCriterion("tch_group in", values, "tchGroup");
            return (Criteria) this;
        }

        public Criteria andTchGroupNotIn(List<String> values) {
            addCriterion("tch_group not in", values, "tchGroup");
            return (Criteria) this;
        }

        public Criteria andTchGroupBetween(String value1, String value2) {
            addCriterion("tch_group between", value1, value2, "tchGroup");
            return (Criteria) this;
        }

        public Criteria andTchGroupNotBetween(String value1, String value2) {
            addCriterion("tch_group not between", value1, value2, "tchGroup");
            return (Criteria) this;
        }

        public Criteria andTchContactIsNull() {
            addCriterion("tch_contact is null");
            return (Criteria) this;
        }

        public Criteria andTchContactIsNotNull() {
            addCriterion("tch_contact is not null");
            return (Criteria) this;
        }

        public Criteria andTchContactEqualTo(String value) {
            addCriterion("tch_contact =", value, "tchContact");
            return (Criteria) this;
        }

        public Criteria andTchContactNotEqualTo(String value) {
            addCriterion("tch_contact <>", value, "tchContact");
            return (Criteria) this;
        }

        public Criteria andTchContactGreaterThan(String value) {
            addCriterion("tch_contact >", value, "tchContact");
            return (Criteria) this;
        }

        public Criteria andTchContactGreaterThanOrEqualTo(String value) {
            addCriterion("tch_contact >=", value, "tchContact");
            return (Criteria) this;
        }

        public Criteria andTchContactLessThan(String value) {
            addCriterion("tch_contact <", value, "tchContact");
            return (Criteria) this;
        }

        public Criteria andTchContactLessThanOrEqualTo(String value) {
            addCriterion("tch_contact <=", value, "tchContact");
            return (Criteria) this;
        }

        public Criteria andTchContactLike(String value) {
            addCriterion("tch_contact like", value, "tchContact");
            return (Criteria) this;
        }

        public Criteria andTchContactNotLike(String value) {
            addCriterion("tch_contact not like", value, "tchContact");
            return (Criteria) this;
        }

        public Criteria andTchContactIn(List<String> values) {
            addCriterion("tch_contact in", values, "tchContact");
            return (Criteria) this;
        }

        public Criteria andTchContactNotIn(List<String> values) {
            addCriterion("tch_contact not in", values, "tchContact");
            return (Criteria) this;
        }

        public Criteria andTchContactBetween(String value1, String value2) {
            addCriterion("tch_contact between", value1, value2, "tchContact");
            return (Criteria) this;
        }

        public Criteria andTchContactNotBetween(String value1, String value2) {
            addCriterion("tch_contact not between", value1, value2, "tchContact");
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