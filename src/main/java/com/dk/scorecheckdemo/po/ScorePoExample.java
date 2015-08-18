package com.dk.scorecheckdemo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ScorePoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScorePoExample() {
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

        public Criteria andScIdIsNull() {
            addCriterion("sc_id is null");
            return (Criteria) this;
        }

        public Criteria andScIdIsNotNull() {
            addCriterion("sc_id is not null");
            return (Criteria) this;
        }

        public Criteria andScIdEqualTo(String value) {
            addCriterion("sc_id =", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotEqualTo(String value) {
            addCriterion("sc_id <>", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdGreaterThan(String value) {
            addCriterion("sc_id >", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdGreaterThanOrEqualTo(String value) {
            addCriterion("sc_id >=", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdLessThan(String value) {
            addCriterion("sc_id <", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdLessThanOrEqualTo(String value) {
            addCriterion("sc_id <=", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdLike(String value) {
            addCriterion("sc_id like", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotLike(String value) {
            addCriterion("sc_id not like", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdIn(List<String> values) {
            addCriterion("sc_id in", values, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotIn(List<String> values) {
            addCriterion("sc_id not in", values, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdBetween(String value1, String value2) {
            addCriterion("sc_id between", value1, value2, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotBetween(String value1, String value2) {
            addCriterion("sc_id not between", value1, value2, "scId");
            return (Criteria) this;
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

        public Criteria andCsIdIsNull() {
            addCriterion("cs_id is null");
            return (Criteria) this;
        }

        public Criteria andCsIdIsNotNull() {
            addCriterion("cs_id is not null");
            return (Criteria) this;
        }

        public Criteria andCsIdEqualTo(String value) {
            addCriterion("cs_id =", value, "csId");
            return (Criteria) this;
        }

        public Criteria andCsIdNotEqualTo(String value) {
            addCriterion("cs_id <>", value, "csId");
            return (Criteria) this;
        }

        public Criteria andCsIdGreaterThan(String value) {
            addCriterion("cs_id >", value, "csId");
            return (Criteria) this;
        }

        public Criteria andCsIdGreaterThanOrEqualTo(String value) {
            addCriterion("cs_id >=", value, "csId");
            return (Criteria) this;
        }

        public Criteria andCsIdLessThan(String value) {
            addCriterion("cs_id <", value, "csId");
            return (Criteria) this;
        }

        public Criteria andCsIdLessThanOrEqualTo(String value) {
            addCriterion("cs_id <=", value, "csId");
            return (Criteria) this;
        }

        public Criteria andCsIdLike(String value) {
            addCriterion("cs_id like", value, "csId");
            return (Criteria) this;
        }

        public Criteria andCsIdNotLike(String value) {
            addCriterion("cs_id not like", value, "csId");
            return (Criteria) this;
        }

        public Criteria andCsIdIn(List<String> values) {
            addCriterion("cs_id in", values, "csId");
            return (Criteria) this;
        }

        public Criteria andCsIdNotIn(List<String> values) {
            addCriterion("cs_id not in", values, "csId");
            return (Criteria) this;
        }

        public Criteria andCsIdBetween(String value1, String value2) {
            addCriterion("cs_id between", value1, value2, "csId");
            return (Criteria) this;
        }

        public Criteria andCsIdNotBetween(String value1, String value2) {
            addCriterion("cs_id not between", value1, value2, "csId");
            return (Criteria) this;
        }

        public Criteria andScNameIsNull() {
            addCriterion("sc_name is null");
            return (Criteria) this;
        }

        public Criteria andScNameIsNotNull() {
            addCriterion("sc_name is not null");
            return (Criteria) this;
        }

        public Criteria andScNameEqualTo(String value) {
            addCriterion("sc_name =", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameNotEqualTo(String value) {
            addCriterion("sc_name <>", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameGreaterThan(String value) {
            addCriterion("sc_name >", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameGreaterThanOrEqualTo(String value) {
            addCriterion("sc_name >=", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameLessThan(String value) {
            addCriterion("sc_name <", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameLessThanOrEqualTo(String value) {
            addCriterion("sc_name <=", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameLike(String value) {
            addCriterion("sc_name like", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameNotLike(String value) {
            addCriterion("sc_name not like", value, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameIn(List<String> values) {
            addCriterion("sc_name in", values, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameNotIn(List<String> values) {
            addCriterion("sc_name not in", values, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameBetween(String value1, String value2) {
            addCriterion("sc_name between", value1, value2, "scName");
            return (Criteria) this;
        }

        public Criteria andScNameNotBetween(String value1, String value2) {
            addCriterion("sc_name not between", value1, value2, "scName");
            return (Criteria) this;
        }

        public Criteria andScDateIsNull() {
            addCriterion("sc_date is null");
            return (Criteria) this;
        }

        public Criteria andScDateIsNotNull() {
            addCriterion("sc_date is not null");
            return (Criteria) this;
        }

        public Criteria andScDateEqualTo(Date value) {
            addCriterionForJDBCDate("sc_date =", value, "scDate");
            return (Criteria) this;
        }

        public Criteria andScDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("sc_date <>", value, "scDate");
            return (Criteria) this;
        }

        public Criteria andScDateGreaterThan(Date value) {
            addCriterionForJDBCDate("sc_date >", value, "scDate");
            return (Criteria) this;
        }

        public Criteria andScDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sc_date >=", value, "scDate");
            return (Criteria) this;
        }

        public Criteria andScDateLessThan(Date value) {
            addCriterionForJDBCDate("sc_date <", value, "scDate");
            return (Criteria) this;
        }

        public Criteria andScDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sc_date <=", value, "scDate");
            return (Criteria) this;
        }

        public Criteria andScDateIn(List<Date> values) {
            addCriterionForJDBCDate("sc_date in", values, "scDate");
            return (Criteria) this;
        }

        public Criteria andScDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("sc_date not in", values, "scDate");
            return (Criteria) this;
        }

        public Criteria andScDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sc_date between", value1, value2, "scDate");
            return (Criteria) this;
        }

        public Criteria andScDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sc_date not between", value1, value2, "scDate");
            return (Criteria) this;
        }

        public Criteria andScScoreIsNull() {
            addCriterion("sc_score is null");
            return (Criteria) this;
        }

        public Criteria andScScoreIsNotNull() {
            addCriterion("sc_score is not null");
            return (Criteria) this;
        }

        public Criteria andScScoreEqualTo(Double value) {
            addCriterion("sc_score =", value, "scScore");
            return (Criteria) this;
        }

        public Criteria andScScoreNotEqualTo(Double value) {
            addCriterion("sc_score <>", value, "scScore");
            return (Criteria) this;
        }

        public Criteria andScScoreGreaterThan(Double value) {
            addCriterion("sc_score >", value, "scScore");
            return (Criteria) this;
        }

        public Criteria andScScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("sc_score >=", value, "scScore");
            return (Criteria) this;
        }

        public Criteria andScScoreLessThan(Double value) {
            addCriterion("sc_score <", value, "scScore");
            return (Criteria) this;
        }

        public Criteria andScScoreLessThanOrEqualTo(Double value) {
            addCriterion("sc_score <=", value, "scScore");
            return (Criteria) this;
        }

        public Criteria andScScoreIn(List<Double> values) {
            addCriterion("sc_score in", values, "scScore");
            return (Criteria) this;
        }

        public Criteria andScScoreNotIn(List<Double> values) {
            addCriterion("sc_score not in", values, "scScore");
            return (Criteria) this;
        }

        public Criteria andScScoreBetween(Double value1, Double value2) {
            addCriterion("sc_score between", value1, value2, "scScore");
            return (Criteria) this;
        }

        public Criteria andScScoreNotBetween(Double value1, Double value2) {
            addCriterion("sc_score not between", value1, value2, "scScore");
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