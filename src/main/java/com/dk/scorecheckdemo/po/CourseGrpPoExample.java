package com.dk.scorecheckdemo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CourseGrpPoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseGrpPoExample() {
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

        public Criteria andCosgIdIsNull() {
            addCriterion("cosg_id is null");
            return (Criteria) this;
        }

        public Criteria andCosgIdIsNotNull() {
            addCriterion("cosg_id is not null");
            return (Criteria) this;
        }

        public Criteria andCosgIdEqualTo(String value) {
            addCriterion("cosg_id =", value, "cosgId");
            return (Criteria) this;
        }

        public Criteria andCosgIdNotEqualTo(String value) {
            addCriterion("cosg_id <>", value, "cosgId");
            return (Criteria) this;
        }

        public Criteria andCosgIdGreaterThan(String value) {
            addCriterion("cosg_id >", value, "cosgId");
            return (Criteria) this;
        }

        public Criteria andCosgIdGreaterThanOrEqualTo(String value) {
            addCriterion("cosg_id >=", value, "cosgId");
            return (Criteria) this;
        }

        public Criteria andCosgIdLessThan(String value) {
            addCriterion("cosg_id <", value, "cosgId");
            return (Criteria) this;
        }

        public Criteria andCosgIdLessThanOrEqualTo(String value) {
            addCriterion("cosg_id <=", value, "cosgId");
            return (Criteria) this;
        }

        public Criteria andCosgIdLike(String value) {
            addCriterion("cosg_id like", value, "cosgId");
            return (Criteria) this;
        }

        public Criteria andCosgIdNotLike(String value) {
            addCriterion("cosg_id not like", value, "cosgId");
            return (Criteria) this;
        }

        public Criteria andCosgIdIn(List<String> values) {
            addCriterion("cosg_id in", values, "cosgId");
            return (Criteria) this;
        }

        public Criteria andCosgIdNotIn(List<String> values) {
            addCriterion("cosg_id not in", values, "cosgId");
            return (Criteria) this;
        }

        public Criteria andCosgIdBetween(String value1, String value2) {
            addCriterion("cosg_id between", value1, value2, "cosgId");
            return (Criteria) this;
        }

        public Criteria andCosgIdNotBetween(String value1, String value2) {
            addCriterion("cosg_id not between", value1, value2, "cosgId");
            return (Criteria) this;
        }

        public Criteria andCosgNameIsNull() {
            addCriterion("cosg_name is null");
            return (Criteria) this;
        }

        public Criteria andCosgNameIsNotNull() {
            addCriterion("cosg_name is not null");
            return (Criteria) this;
        }

        public Criteria andCosgNameEqualTo(String value) {
            addCriterion("cosg_name =", value, "cosgName");
            return (Criteria) this;
        }

        public Criteria andCosgNameNotEqualTo(String value) {
            addCriterion("cosg_name <>", value, "cosgName");
            return (Criteria) this;
        }

        public Criteria andCosgNameGreaterThan(String value) {
            addCriterion("cosg_name >", value, "cosgName");
            return (Criteria) this;
        }

        public Criteria andCosgNameGreaterThanOrEqualTo(String value) {
            addCriterion("cosg_name >=", value, "cosgName");
            return (Criteria) this;
        }

        public Criteria andCosgNameLessThan(String value) {
            addCriterion("cosg_name <", value, "cosgName");
            return (Criteria) this;
        }

        public Criteria andCosgNameLessThanOrEqualTo(String value) {
            addCriterion("cosg_name <=", value, "cosgName");
            return (Criteria) this;
        }

        public Criteria andCosgNameLike(String value) {
            addCriterion("cosg_name like", value, "cosgName");
            return (Criteria) this;
        }

        public Criteria andCosgNameNotLike(String value) {
            addCriterion("cosg_name not like", value, "cosgName");
            return (Criteria) this;
        }

        public Criteria andCosgNameIn(List<String> values) {
            addCriterion("cosg_name in", values, "cosgName");
            return (Criteria) this;
        }

        public Criteria andCosgNameNotIn(List<String> values) {
            addCriterion("cosg_name not in", values, "cosgName");
            return (Criteria) this;
        }

        public Criteria andCosgNameBetween(String value1, String value2) {
            addCriterion("cosg_name between", value1, value2, "cosgName");
            return (Criteria) this;
        }

        public Criteria andCosgNameNotBetween(String value1, String value2) {
            addCriterion("cosg_name not between", value1, value2, "cosgName");
            return (Criteria) this;
        }

        public Criteria andCosStartIsNull() {
            addCriterion("cos_start is null");
            return (Criteria) this;
        }

        public Criteria andCosStartIsNotNull() {
            addCriterion("cos_start is not null");
            return (Criteria) this;
        }

        public Criteria andCosStartEqualTo(Date value) {
            addCriterionForJDBCDate("cos_start =", value, "cosStart");
            return (Criteria) this;
        }

        public Criteria andCosStartNotEqualTo(Date value) {
            addCriterionForJDBCDate("cos_start <>", value, "cosStart");
            return (Criteria) this;
        }

        public Criteria andCosStartGreaterThan(Date value) {
            addCriterionForJDBCDate("cos_start >", value, "cosStart");
            return (Criteria) this;
        }

        public Criteria andCosStartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cos_start >=", value, "cosStart");
            return (Criteria) this;
        }

        public Criteria andCosStartLessThan(Date value) {
            addCriterionForJDBCDate("cos_start <", value, "cosStart");
            return (Criteria) this;
        }

        public Criteria andCosStartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cos_start <=", value, "cosStart");
            return (Criteria) this;
        }

        public Criteria andCosStartIn(List<Date> values) {
            addCriterionForJDBCDate("cos_start in", values, "cosStart");
            return (Criteria) this;
        }

        public Criteria andCosStartNotIn(List<Date> values) {
            addCriterionForJDBCDate("cos_start not in", values, "cosStart");
            return (Criteria) this;
        }

        public Criteria andCosStartBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cos_start between", value1, value2, "cosStart");
            return (Criteria) this;
        }

        public Criteria andCosStartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cos_start not between", value1, value2, "cosStart");
            return (Criteria) this;
        }

        public Criteria andCosEndIsNull() {
            addCriterion("cos_end is null");
            return (Criteria) this;
        }

        public Criteria andCosEndIsNotNull() {
            addCriterion("cos_end is not null");
            return (Criteria) this;
        }

        public Criteria andCosEndEqualTo(Date value) {
            addCriterionForJDBCDate("cos_end =", value, "cosEnd");
            return (Criteria) this;
        }

        public Criteria andCosEndNotEqualTo(Date value) {
            addCriterionForJDBCDate("cos_end <>", value, "cosEnd");
            return (Criteria) this;
        }

        public Criteria andCosEndGreaterThan(Date value) {
            addCriterionForJDBCDate("cos_end >", value, "cosEnd");
            return (Criteria) this;
        }

        public Criteria andCosEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cos_end >=", value, "cosEnd");
            return (Criteria) this;
        }

        public Criteria andCosEndLessThan(Date value) {
            addCriterionForJDBCDate("cos_end <", value, "cosEnd");
            return (Criteria) this;
        }

        public Criteria andCosEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cos_end <=", value, "cosEnd");
            return (Criteria) this;
        }

        public Criteria andCosEndIn(List<Date> values) {
            addCriterionForJDBCDate("cos_end in", values, "cosEnd");
            return (Criteria) this;
        }

        public Criteria andCosEndNotIn(List<Date> values) {
            addCriterionForJDBCDate("cos_end not in", values, "cosEnd");
            return (Criteria) this;
        }

        public Criteria andCosEndBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cos_end between", value1, value2, "cosEnd");
            return (Criteria) this;
        }

        public Criteria andCosEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cos_end not between", value1, value2, "cosEnd");
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