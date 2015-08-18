package com.dk.scorecheckdemo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CoursePoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CoursePoExample() {
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

        public Criteria andCosIdIsNull() {
            addCriterion("cos_id is null");
            return (Criteria) this;
        }

        public Criteria andCosIdIsNotNull() {
            addCriterion("cos_id is not null");
            return (Criteria) this;
        }

        public Criteria andCosIdEqualTo(String value) {
            addCriterion("cos_id =", value, "cosId");
            return (Criteria) this;
        }

        public Criteria andCosIdNotEqualTo(String value) {
            addCriterion("cos_id <>", value, "cosId");
            return (Criteria) this;
        }

        public Criteria andCosIdGreaterThan(String value) {
            addCriterion("cos_id >", value, "cosId");
            return (Criteria) this;
        }

        public Criteria andCosIdGreaterThanOrEqualTo(String value) {
            addCriterion("cos_id >=", value, "cosId");
            return (Criteria) this;
        }

        public Criteria andCosIdLessThan(String value) {
            addCriterion("cos_id <", value, "cosId");
            return (Criteria) this;
        }

        public Criteria andCosIdLessThanOrEqualTo(String value) {
            addCriterion("cos_id <=", value, "cosId");
            return (Criteria) this;
        }

        public Criteria andCosIdLike(String value) {
            addCriterion("cos_id like", value, "cosId");
            return (Criteria) this;
        }

        public Criteria andCosIdNotLike(String value) {
            addCriterion("cos_id not like", value, "cosId");
            return (Criteria) this;
        }

        public Criteria andCosIdIn(List<String> values) {
            addCriterion("cos_id in", values, "cosId");
            return (Criteria) this;
        }

        public Criteria andCosIdNotIn(List<String> values) {
            addCriterion("cos_id not in", values, "cosId");
            return (Criteria) this;
        }

        public Criteria andCosIdBetween(String value1, String value2) {
            addCriterion("cos_id between", value1, value2, "cosId");
            return (Criteria) this;
        }

        public Criteria andCosIdNotBetween(String value1, String value2) {
            addCriterion("cos_id not between", value1, value2, "cosId");
            return (Criteria) this;
        }

        public Criteria andCosNameIsNull() {
            addCriterion("cos_name is null");
            return (Criteria) this;
        }

        public Criteria andCosNameIsNotNull() {
            addCriterion("cos_name is not null");
            return (Criteria) this;
        }

        public Criteria andCosNameEqualTo(String value) {
            addCriterion("cos_name =", value, "cosName");
            return (Criteria) this;
        }

        public Criteria andCosNameNotEqualTo(String value) {
            addCriterion("cos_name <>", value, "cosName");
            return (Criteria) this;
        }

        public Criteria andCosNameGreaterThan(String value) {
            addCriterion("cos_name >", value, "cosName");
            return (Criteria) this;
        }

        public Criteria andCosNameGreaterThanOrEqualTo(String value) {
            addCriterion("cos_name >=", value, "cosName");
            return (Criteria) this;
        }

        public Criteria andCosNameLessThan(String value) {
            addCriterion("cos_name <", value, "cosName");
            return (Criteria) this;
        }

        public Criteria andCosNameLessThanOrEqualTo(String value) {
            addCriterion("cos_name <=", value, "cosName");
            return (Criteria) this;
        }

        public Criteria andCosNameLike(String value) {
            addCriterion("cos_name like", value, "cosName");
            return (Criteria) this;
        }

        public Criteria andCosNameNotLike(String value) {
            addCriterion("cos_name not like", value, "cosName");
            return (Criteria) this;
        }

        public Criteria andCosNameIn(List<String> values) {
            addCriterion("cos_name in", values, "cosName");
            return (Criteria) this;
        }

        public Criteria andCosNameNotIn(List<String> values) {
            addCriterion("cos_name not in", values, "cosName");
            return (Criteria) this;
        }

        public Criteria andCosNameBetween(String value1, String value2) {
            addCriterion("cos_name between", value1, value2, "cosName");
            return (Criteria) this;
        }

        public Criteria andCosNameNotBetween(String value1, String value2) {
            addCriterion("cos_name not between", value1, value2, "cosName");
            return (Criteria) this;
        }

        public Criteria andCosTypeIsNull() {
            addCriterion("cos_type is null");
            return (Criteria) this;
        }

        public Criteria andCosTypeIsNotNull() {
            addCriterion("cos_type is not null");
            return (Criteria) this;
        }

        public Criteria andCosTypeEqualTo(String value) {
            addCriterion("cos_type =", value, "cosType");
            return (Criteria) this;
        }

        public Criteria andCosTypeNotEqualTo(String value) {
            addCriterion("cos_type <>", value, "cosType");
            return (Criteria) this;
        }

        public Criteria andCosTypeGreaterThan(String value) {
            addCriterion("cos_type >", value, "cosType");
            return (Criteria) this;
        }

        public Criteria andCosTypeGreaterThanOrEqualTo(String value) {
            addCriterion("cos_type >=", value, "cosType");
            return (Criteria) this;
        }

        public Criteria andCosTypeLessThan(String value) {
            addCriterion("cos_type <", value, "cosType");
            return (Criteria) this;
        }

        public Criteria andCosTypeLessThanOrEqualTo(String value) {
            addCriterion("cos_type <=", value, "cosType");
            return (Criteria) this;
        }

        public Criteria andCosTypeLike(String value) {
            addCriterion("cos_type like", value, "cosType");
            return (Criteria) this;
        }

        public Criteria andCosTypeNotLike(String value) {
            addCriterion("cos_type not like", value, "cosType");
            return (Criteria) this;
        }

        public Criteria andCosTypeIn(List<String> values) {
            addCriterion("cos_type in", values, "cosType");
            return (Criteria) this;
        }

        public Criteria andCosTypeNotIn(List<String> values) {
            addCriterion("cos_type not in", values, "cosType");
            return (Criteria) this;
        }

        public Criteria andCosTypeBetween(String value1, String value2) {
            addCriterion("cos_type between", value1, value2, "cosType");
            return (Criteria) this;
        }

        public Criteria andCosTypeNotBetween(String value1, String value2) {
            addCriterion("cos_type not between", value1, value2, "cosType");
            return (Criteria) this;
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

        public Criteria andCosCreditIsNull() {
            addCriterion("cos_credit is null");
            return (Criteria) this;
        }

        public Criteria andCosCreditIsNotNull() {
            addCriterion("cos_credit is not null");
            return (Criteria) this;
        }

        public Criteria andCosCreditEqualTo(Double value) {
            addCriterion("cos_credit =", value, "cosCredit");
            return (Criteria) this;
        }

        public Criteria andCosCreditNotEqualTo(Double value) {
            addCriterion("cos_credit <>", value, "cosCredit");
            return (Criteria) this;
        }

        public Criteria andCosCreditGreaterThan(Double value) {
            addCriterion("cos_credit >", value, "cosCredit");
            return (Criteria) this;
        }

        public Criteria andCosCreditGreaterThanOrEqualTo(Double value) {
            addCriterion("cos_credit >=", value, "cosCredit");
            return (Criteria) this;
        }

        public Criteria andCosCreditLessThan(Double value) {
            addCriterion("cos_credit <", value, "cosCredit");
            return (Criteria) this;
        }

        public Criteria andCosCreditLessThanOrEqualTo(Double value) {
            addCriterion("cos_credit <=", value, "cosCredit");
            return (Criteria) this;
        }

        public Criteria andCosCreditIn(List<Double> values) {
            addCriterion("cos_credit in", values, "cosCredit");
            return (Criteria) this;
        }

        public Criteria andCosCreditNotIn(List<Double> values) {
            addCriterion("cos_credit not in", values, "cosCredit");
            return (Criteria) this;
        }

        public Criteria andCosCreditBetween(Double value1, Double value2) {
            addCriterion("cos_credit between", value1, value2, "cosCredit");
            return (Criteria) this;
        }

        public Criteria andCosCreditNotBetween(Double value1, Double value2) {
            addCriterion("cos_credit not between", value1, value2, "cosCredit");
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