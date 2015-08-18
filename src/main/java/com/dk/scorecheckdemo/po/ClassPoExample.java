package com.dk.scorecheckdemo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ClassPoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassPoExample() {
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

        public Criteria andClsIdIsNull() {
            addCriterion("cls_id is null");
            return (Criteria) this;
        }

        public Criteria andClsIdIsNotNull() {
            addCriterion("cls_id is not null");
            return (Criteria) this;
        }

        public Criteria andClsIdEqualTo(String value) {
            addCriterion("cls_id =", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdNotEqualTo(String value) {
            addCriterion("cls_id <>", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdGreaterThan(String value) {
            addCriterion("cls_id >", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdGreaterThanOrEqualTo(String value) {
            addCriterion("cls_id >=", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdLessThan(String value) {
            addCriterion("cls_id <", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdLessThanOrEqualTo(String value) {
            addCriterion("cls_id <=", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdLike(String value) {
            addCriterion("cls_id like", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdNotLike(String value) {
            addCriterion("cls_id not like", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdIn(List<String> values) {
            addCriterion("cls_id in", values, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdNotIn(List<String> values) {
            addCriterion("cls_id not in", values, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdBetween(String value1, String value2) {
            addCriterion("cls_id between", value1, value2, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdNotBetween(String value1, String value2) {
            addCriterion("cls_id not between", value1, value2, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsStartIsNull() {
            addCriterion("cls_start is null");
            return (Criteria) this;
        }

        public Criteria andClsStartIsNotNull() {
            addCriterion("cls_start is not null");
            return (Criteria) this;
        }

        public Criteria andClsStartEqualTo(Date value) {
            addCriterionForJDBCDate("cls_start =", value, "clsStart");
            return (Criteria) this;
        }

        public Criteria andClsStartNotEqualTo(Date value) {
            addCriterionForJDBCDate("cls_start <>", value, "clsStart");
            return (Criteria) this;
        }

        public Criteria andClsStartGreaterThan(Date value) {
            addCriterionForJDBCDate("cls_start >", value, "clsStart");
            return (Criteria) this;
        }

        public Criteria andClsStartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cls_start >=", value, "clsStart");
            return (Criteria) this;
        }

        public Criteria andClsStartLessThan(Date value) {
            addCriterionForJDBCDate("cls_start <", value, "clsStart");
            return (Criteria) this;
        }

        public Criteria andClsStartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cls_start <=", value, "clsStart");
            return (Criteria) this;
        }

        public Criteria andClsStartIn(List<Date> values) {
            addCriterionForJDBCDate("cls_start in", values, "clsStart");
            return (Criteria) this;
        }

        public Criteria andClsStartNotIn(List<Date> values) {
            addCriterionForJDBCDate("cls_start not in", values, "clsStart");
            return (Criteria) this;
        }

        public Criteria andClsStartBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cls_start between", value1, value2, "clsStart");
            return (Criteria) this;
        }

        public Criteria andClsStartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cls_start not between", value1, value2, "clsStart");
            return (Criteria) this;
        }

        public Criteria andClsEndIsNull() {
            addCriterion("cls_end is null");
            return (Criteria) this;
        }

        public Criteria andClsEndIsNotNull() {
            addCriterion("cls_end is not null");
            return (Criteria) this;
        }

        public Criteria andClsEndEqualTo(Date value) {
            addCriterionForJDBCDate("cls_end =", value, "clsEnd");
            return (Criteria) this;
        }

        public Criteria andClsEndNotEqualTo(Date value) {
            addCriterionForJDBCDate("cls_end <>", value, "clsEnd");
            return (Criteria) this;
        }

        public Criteria andClsEndGreaterThan(Date value) {
            addCriterionForJDBCDate("cls_end >", value, "clsEnd");
            return (Criteria) this;
        }

        public Criteria andClsEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cls_end >=", value, "clsEnd");
            return (Criteria) this;
        }

        public Criteria andClsEndLessThan(Date value) {
            addCriterionForJDBCDate("cls_end <", value, "clsEnd");
            return (Criteria) this;
        }

        public Criteria andClsEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cls_end <=", value, "clsEnd");
            return (Criteria) this;
        }

        public Criteria andClsEndIn(List<Date> values) {
            addCriterionForJDBCDate("cls_end in", values, "clsEnd");
            return (Criteria) this;
        }

        public Criteria andClsEndNotIn(List<Date> values) {
            addCriterionForJDBCDate("cls_end not in", values, "clsEnd");
            return (Criteria) this;
        }

        public Criteria andClsEndBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cls_end between", value1, value2, "clsEnd");
            return (Criteria) this;
        }

        public Criteria andClsEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cls_end not between", value1, value2, "clsEnd");
            return (Criteria) this;
        }

        public Criteria andClsTypeIsNull() {
            addCriterion("cls_type is null");
            return (Criteria) this;
        }

        public Criteria andClsTypeIsNotNull() {
            addCriterion("cls_type is not null");
            return (Criteria) this;
        }

        public Criteria andClsTypeEqualTo(String value) {
            addCriterion("cls_type =", value, "clsType");
            return (Criteria) this;
        }

        public Criteria andClsTypeNotEqualTo(String value) {
            addCriterion("cls_type <>", value, "clsType");
            return (Criteria) this;
        }

        public Criteria andClsTypeGreaterThan(String value) {
            addCriterion("cls_type >", value, "clsType");
            return (Criteria) this;
        }

        public Criteria andClsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("cls_type >=", value, "clsType");
            return (Criteria) this;
        }

        public Criteria andClsTypeLessThan(String value) {
            addCriterion("cls_type <", value, "clsType");
            return (Criteria) this;
        }

        public Criteria andClsTypeLessThanOrEqualTo(String value) {
            addCriterion("cls_type <=", value, "clsType");
            return (Criteria) this;
        }

        public Criteria andClsTypeLike(String value) {
            addCriterion("cls_type like", value, "clsType");
            return (Criteria) this;
        }

        public Criteria andClsTypeNotLike(String value) {
            addCriterion("cls_type not like", value, "clsType");
            return (Criteria) this;
        }

        public Criteria andClsTypeIn(List<String> values) {
            addCriterion("cls_type in", values, "clsType");
            return (Criteria) this;
        }

        public Criteria andClsTypeNotIn(List<String> values) {
            addCriterion("cls_type not in", values, "clsType");
            return (Criteria) this;
        }

        public Criteria andClsTypeBetween(String value1, String value2) {
            addCriterion("cls_type between", value1, value2, "clsType");
            return (Criteria) this;
        }

        public Criteria andClsTypeNotBetween(String value1, String value2) {
            addCriterion("cls_type not between", value1, value2, "clsType");
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