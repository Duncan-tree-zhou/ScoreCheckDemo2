package com.dk.scorecheckdemo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserPoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserPoExample() {
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

        public Criteria andUnameIsNull() {
            addCriterion("uname is null");
            return (Criteria) this;
        }

        public Criteria andUnameIsNotNull() {
            addCriterion("uname is not null");
            return (Criteria) this;
        }

        public Criteria andUnameEqualTo(String value) {
            addCriterion("uname =", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotEqualTo(String value) {
            addCriterion("uname <>", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThan(String value) {
            addCriterion("uname >", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThanOrEqualTo(String value) {
            addCriterion("uname >=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThan(String value) {
            addCriterion("uname <", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThanOrEqualTo(String value) {
            addCriterion("uname <=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLike(String value) {
            addCriterion("uname like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotLike(String value) {
            addCriterion("uname not like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameIn(List<String> values) {
            addCriterion("uname in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotIn(List<String> values) {
            addCriterion("uname not in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameBetween(String value1, String value2) {
            addCriterion("uname between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotBetween(String value1, String value2) {
            addCriterion("uname not between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUpasswordIsNull() {
            addCriterion("upassword is null");
            return (Criteria) this;
        }

        public Criteria andUpasswordIsNotNull() {
            addCriterion("upassword is not null");
            return (Criteria) this;
        }

        public Criteria andUpasswordEqualTo(String value) {
            addCriterion("upassword =", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotEqualTo(String value) {
            addCriterion("upassword <>", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordGreaterThan(String value) {
            addCriterion("upassword >", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("upassword >=", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLessThan(String value) {
            addCriterion("upassword <", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLessThanOrEqualTo(String value) {
            addCriterion("upassword <=", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLike(String value) {
            addCriterion("upassword like", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotLike(String value) {
            addCriterion("upassword not like", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordIn(List<String> values) {
            addCriterion("upassword in", values, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotIn(List<String> values) {
            addCriterion("upassword not in", values, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordBetween(String value1, String value2) {
            addCriterion("upassword between", value1, value2, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotBetween(String value1, String value2) {
            addCriterion("upassword not between", value1, value2, "upassword");
            return (Criteria) this;
        }

        public Criteria andUprivilegeIsNull() {
            addCriterion("uprivilege is null");
            return (Criteria) this;
        }

        public Criteria andUprivilegeIsNotNull() {
            addCriterion("uprivilege is not null");
            return (Criteria) this;
        }

        public Criteria andUprivilegeEqualTo(Integer value) {
            addCriterion("uprivilege =", value, "uprivilege");
            return (Criteria) this;
        }

        public Criteria andUprivilegeNotEqualTo(Integer value) {
            addCriterion("uprivilege <>", value, "uprivilege");
            return (Criteria) this;
        }

        public Criteria andUprivilegeGreaterThan(Integer value) {
            addCriterion("uprivilege >", value, "uprivilege");
            return (Criteria) this;
        }

        public Criteria andUprivilegeGreaterThanOrEqualTo(Integer value) {
            addCriterion("uprivilege >=", value, "uprivilege");
            return (Criteria) this;
        }

        public Criteria andUprivilegeLessThan(Integer value) {
            addCriterion("uprivilege <", value, "uprivilege");
            return (Criteria) this;
        }

        public Criteria andUprivilegeLessThanOrEqualTo(Integer value) {
            addCriterion("uprivilege <=", value, "uprivilege");
            return (Criteria) this;
        }

        public Criteria andUprivilegeIn(List<Integer> values) {
            addCriterion("uprivilege in", values, "uprivilege");
            return (Criteria) this;
        }

        public Criteria andUprivilegeNotIn(List<Integer> values) {
            addCriterion("uprivilege not in", values, "uprivilege");
            return (Criteria) this;
        }

        public Criteria andUprivilegeBetween(Integer value1, Integer value2) {
            addCriterion("uprivilege between", value1, value2, "uprivilege");
            return (Criteria) this;
        }

        public Criteria andUprivilegeNotBetween(Integer value1, Integer value2) {
            addCriterion("uprivilege not between", value1, value2, "uprivilege");
            return (Criteria) this;
        }

        public Criteria andUFnIdIsNull() {
            addCriterion("u_fn_id is null");
            return (Criteria) this;
        }

        public Criteria andUFnIdIsNotNull() {
            addCriterion("u_fn_id is not null");
            return (Criteria) this;
        }

        public Criteria andUFnIdEqualTo(String value) {
            addCriterion("u_fn_id =", value, "uFnId");
            return (Criteria) this;
        }

        public Criteria andUFnIdNotEqualTo(String value) {
            addCriterion("u_fn_id <>", value, "uFnId");
            return (Criteria) this;
        }

        public Criteria andUFnIdGreaterThan(String value) {
            addCriterion("u_fn_id >", value, "uFnId");
            return (Criteria) this;
        }

        public Criteria andUFnIdGreaterThanOrEqualTo(String value) {
            addCriterion("u_fn_id >=", value, "uFnId");
            return (Criteria) this;
        }

        public Criteria andUFnIdLessThan(String value) {
            addCriterion("u_fn_id <", value, "uFnId");
            return (Criteria) this;
        }

        public Criteria andUFnIdLessThanOrEqualTo(String value) {
            addCriterion("u_fn_id <=", value, "uFnId");
            return (Criteria) this;
        }

        public Criteria andUFnIdLike(String value) {
            addCriterion("u_fn_id like", value, "uFnId");
            return (Criteria) this;
        }

        public Criteria andUFnIdNotLike(String value) {
            addCriterion("u_fn_id not like", value, "uFnId");
            return (Criteria) this;
        }

        public Criteria andUFnIdIn(List<String> values) {
            addCriterion("u_fn_id in", values, "uFnId");
            return (Criteria) this;
        }

        public Criteria andUFnIdNotIn(List<String> values) {
            addCriterion("u_fn_id not in", values, "uFnId");
            return (Criteria) this;
        }

        public Criteria andUFnIdBetween(String value1, String value2) {
            addCriterion("u_fn_id between", value1, value2, "uFnId");
            return (Criteria) this;
        }

        public Criteria andUFnIdNotBetween(String value1, String value2) {
            addCriterion("u_fn_id not between", value1, value2, "uFnId");
            return (Criteria) this;
        }

        public Criteria andLogCountIsNull() {
            addCriterion("log_count is null");
            return (Criteria) this;
        }

        public Criteria andLogCountIsNotNull() {
            addCriterion("log_count is not null");
            return (Criteria) this;
        }

        public Criteria andLogCountEqualTo(Integer value) {
            addCriterion("log_count =", value, "logCount");
            return (Criteria) this;
        }

        public Criteria andLogCountNotEqualTo(Integer value) {
            addCriterion("log_count <>", value, "logCount");
            return (Criteria) this;
        }

        public Criteria andLogCountGreaterThan(Integer value) {
            addCriterion("log_count >", value, "logCount");
            return (Criteria) this;
        }

        public Criteria andLogCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("log_count >=", value, "logCount");
            return (Criteria) this;
        }

        public Criteria andLogCountLessThan(Integer value) {
            addCriterion("log_count <", value, "logCount");
            return (Criteria) this;
        }

        public Criteria andLogCountLessThanOrEqualTo(Integer value) {
            addCriterion("log_count <=", value, "logCount");
            return (Criteria) this;
        }

        public Criteria andLogCountIn(List<Integer> values) {
            addCriterion("log_count in", values, "logCount");
            return (Criteria) this;
        }

        public Criteria andLogCountNotIn(List<Integer> values) {
            addCriterion("log_count not in", values, "logCount");
            return (Criteria) this;
        }

        public Criteria andLogCountBetween(Integer value1, Integer value2) {
            addCriterion("log_count between", value1, value2, "logCount");
            return (Criteria) this;
        }

        public Criteria andLogCountNotBetween(Integer value1, Integer value2) {
            addCriterion("log_count not between", value1, value2, "logCount");
            return (Criteria) this;
        }

        public Criteria andLastVisitIsNull() {
            addCriterion("last_visit is null");
            return (Criteria) this;
        }

        public Criteria andLastVisitIsNotNull() {
            addCriterion("last_visit is not null");
            return (Criteria) this;
        }

        public Criteria andLastVisitEqualTo(Date value) {
            addCriterion("last_visit =", value, "lastVisit");
            return (Criteria) this;
        }

        public Criteria andLastVisitNotEqualTo(Date value) {
            addCriterion("last_visit <>", value, "lastVisit");
            return (Criteria) this;
        }

        public Criteria andLastVisitGreaterThan(Date value) {
            addCriterion("last_visit >", value, "lastVisit");
            return (Criteria) this;
        }

        public Criteria andLastVisitGreaterThanOrEqualTo(Date value) {
            addCriterion("last_visit >=", value, "lastVisit");
            return (Criteria) this;
        }

        public Criteria andLastVisitLessThan(Date value) {
            addCriterion("last_visit <", value, "lastVisit");
            return (Criteria) this;
        }

        public Criteria andLastVisitLessThanOrEqualTo(Date value) {
            addCriterion("last_visit <=", value, "lastVisit");
            return (Criteria) this;
        }

        public Criteria andLastVisitIn(List<Date> values) {
            addCriterion("last_visit in", values, "lastVisit");
            return (Criteria) this;
        }

        public Criteria andLastVisitNotIn(List<Date> values) {
            addCriterion("last_visit not in", values, "lastVisit");
            return (Criteria) this;
        }

        public Criteria andLastVisitBetween(Date value1, Date value2) {
            addCriterion("last_visit between", value1, value2, "lastVisit");
            return (Criteria) this;
        }

        public Criteria andLastVisitNotBetween(Date value1, Date value2) {
            addCriterion("last_visit not between", value1, value2, "lastVisit");
            return (Criteria) this;
        }

        public Criteria andLastIpIsNull() {
            addCriterion("last_ip is null");
            return (Criteria) this;
        }

        public Criteria andLastIpIsNotNull() {
            addCriterion("last_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLastIpEqualTo(String value) {
            addCriterion("last_ip =", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpNotEqualTo(String value) {
            addCriterion("last_ip <>", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpGreaterThan(String value) {
            addCriterion("last_ip >", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpGreaterThanOrEqualTo(String value) {
            addCriterion("last_ip >=", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpLessThan(String value) {
            addCriterion("last_ip <", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpLessThanOrEqualTo(String value) {
            addCriterion("last_ip <=", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpLike(String value) {
            addCriterion("last_ip like", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpNotLike(String value) {
            addCriterion("last_ip not like", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpIn(List<String> values) {
            addCriterion("last_ip in", values, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpNotIn(List<String> values) {
            addCriterion("last_ip not in", values, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpBetween(String value1, String value2) {
            addCriterion("last_ip between", value1, value2, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpNotBetween(String value1, String value2) {
            addCriterion("last_ip not between", value1, value2, "lastIp");
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