package com.biosan.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GroundTbDepartmentCompareExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GroundTbDepartmentCompareExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andHosnameOldIsNull() {
            addCriterion("HOSNAME_OLD is null");
            return (Criteria) this;
        }

        public Criteria andHosnameOldIsNotNull() {
            addCriterion("HOSNAME_OLD is not null");
            return (Criteria) this;
        }

        public Criteria andHosnameOldEqualTo(String value) {
            addCriterion("HOSNAME_OLD =", value, "hosnameOld");
            return (Criteria) this;
        }

        public Criteria andHosnameOldNotEqualTo(String value) {
            addCriterion("HOSNAME_OLD <>", value, "hosnameOld");
            return (Criteria) this;
        }

        public Criteria andHosnameOldGreaterThan(String value) {
            addCriterion("HOSNAME_OLD >", value, "hosnameOld");
            return (Criteria) this;
        }

        public Criteria andHosnameOldGreaterThanOrEqualTo(String value) {
            addCriterion("HOSNAME_OLD >=", value, "hosnameOld");
            return (Criteria) this;
        }

        public Criteria andHosnameOldLessThan(String value) {
            addCriterion("HOSNAME_OLD <", value, "hosnameOld");
            return (Criteria) this;
        }

        public Criteria andHosnameOldLessThanOrEqualTo(String value) {
            addCriterion("HOSNAME_OLD <=", value, "hosnameOld");
            return (Criteria) this;
        }

        public Criteria andHosnameOldLike(String value) {
            addCriterion("HOSNAME_OLD like", value, "hosnameOld");
            return (Criteria) this;
        }

        public Criteria andHosnameOldNotLike(String value) {
            addCriterion("HOSNAME_OLD not like", value, "hosnameOld");
            return (Criteria) this;
        }

        public Criteria andHosnameOldIn(List<String> values) {
            addCriterion("HOSNAME_OLD in", values, "hosnameOld");
            return (Criteria) this;
        }

        public Criteria andHosnameOldNotIn(List<String> values) {
            addCriterion("HOSNAME_OLD not in", values, "hosnameOld");
            return (Criteria) this;
        }

        public Criteria andHosnameOldBetween(String value1, String value2) {
            addCriterion("HOSNAME_OLD between", value1, value2, "hosnameOld");
            return (Criteria) this;
        }

        public Criteria andHosnameOldNotBetween(String value1, String value2) {
            addCriterion("HOSNAME_OLD not between", value1, value2, "hosnameOld");
            return (Criteria) this;
        }

        public Criteria andHoscodeOldIsNull() {
            addCriterion("HOSCODE_OLD is null");
            return (Criteria) this;
        }

        public Criteria andHoscodeOldIsNotNull() {
            addCriterion("HOSCODE_OLD is not null");
            return (Criteria) this;
        }

        public Criteria andHoscodeOldEqualTo(String value) {
            addCriterion("HOSCODE_OLD =", value, "hoscodeOld");
            return (Criteria) this;
        }

        public Criteria andHoscodeOldNotEqualTo(String value) {
            addCriterion("HOSCODE_OLD <>", value, "hoscodeOld");
            return (Criteria) this;
        }

        public Criteria andHoscodeOldGreaterThan(String value) {
            addCriterion("HOSCODE_OLD >", value, "hoscodeOld");
            return (Criteria) this;
        }

        public Criteria andHoscodeOldGreaterThanOrEqualTo(String value) {
            addCriterion("HOSCODE_OLD >=", value, "hoscodeOld");
            return (Criteria) this;
        }

        public Criteria andHoscodeOldLessThan(String value) {
            addCriterion("HOSCODE_OLD <", value, "hoscodeOld");
            return (Criteria) this;
        }

        public Criteria andHoscodeOldLessThanOrEqualTo(String value) {
            addCriterion("HOSCODE_OLD <=", value, "hoscodeOld");
            return (Criteria) this;
        }

        public Criteria andHoscodeOldLike(String value) {
            addCriterion("HOSCODE_OLD like", value, "hoscodeOld");
            return (Criteria) this;
        }

        public Criteria andHoscodeOldNotLike(String value) {
            addCriterion("HOSCODE_OLD not like", value, "hoscodeOld");
            return (Criteria) this;
        }

        public Criteria andHoscodeOldIn(List<String> values) {
            addCriterion("HOSCODE_OLD in", values, "hoscodeOld");
            return (Criteria) this;
        }

        public Criteria andHoscodeOldNotIn(List<String> values) {
            addCriterion("HOSCODE_OLD not in", values, "hoscodeOld");
            return (Criteria) this;
        }

        public Criteria andHoscodeOldBetween(String value1, String value2) {
            addCriterion("HOSCODE_OLD between", value1, value2, "hoscodeOld");
            return (Criteria) this;
        }

        public Criteria andHoscodeOldNotBetween(String value1, String value2) {
            addCriterion("HOSCODE_OLD not between", value1, value2, "hoscodeOld");
            return (Criteria) this;
        }

        public Criteria andHoscodeNewIsNull() {
            addCriterion("HOSCODE_NEW is null");
            return (Criteria) this;
        }

        public Criteria andHoscodeNewIsNotNull() {
            addCriterion("HOSCODE_NEW is not null");
            return (Criteria) this;
        }

        public Criteria andHoscodeNewEqualTo(String value) {
            addCriterion("HOSCODE_NEW =", value, "hoscodeNew");
            return (Criteria) this;
        }

        public Criteria andHoscodeNewNotEqualTo(String value) {
            addCriterion("HOSCODE_NEW <>", value, "hoscodeNew");
            return (Criteria) this;
        }

        public Criteria andHoscodeNewGreaterThan(String value) {
            addCriterion("HOSCODE_NEW >", value, "hoscodeNew");
            return (Criteria) this;
        }

        public Criteria andHoscodeNewGreaterThanOrEqualTo(String value) {
            addCriterion("HOSCODE_NEW >=", value, "hoscodeNew");
            return (Criteria) this;
        }

        public Criteria andHoscodeNewLessThan(String value) {
            addCriterion("HOSCODE_NEW <", value, "hoscodeNew");
            return (Criteria) this;
        }

        public Criteria andHoscodeNewLessThanOrEqualTo(String value) {
            addCriterion("HOSCODE_NEW <=", value, "hoscodeNew");
            return (Criteria) this;
        }

        public Criteria andHoscodeNewLike(String value) {
            addCriterion("HOSCODE_NEW like", value, "hoscodeNew");
            return (Criteria) this;
        }

        public Criteria andHoscodeNewNotLike(String value) {
            addCriterion("HOSCODE_NEW not like", value, "hoscodeNew");
            return (Criteria) this;
        }

        public Criteria andHoscodeNewIn(List<String> values) {
            addCriterion("HOSCODE_NEW in", values, "hoscodeNew");
            return (Criteria) this;
        }

        public Criteria andHoscodeNewNotIn(List<String> values) {
            addCriterion("HOSCODE_NEW not in", values, "hoscodeNew");
            return (Criteria) this;
        }

        public Criteria andHoscodeNewBetween(String value1, String value2) {
            addCriterion("HOSCODE_NEW between", value1, value2, "hoscodeNew");
            return (Criteria) this;
        }

        public Criteria andHoscodeNewNotBetween(String value1, String value2) {
            addCriterion("HOSCODE_NEW not between", value1, value2, "hoscodeNew");
            return (Criteria) this;
        }

        public Criteria andHosnameNewIsNull() {
            addCriterion("HOSNAME_NEW is null");
            return (Criteria) this;
        }

        public Criteria andHosnameNewIsNotNull() {
            addCriterion("HOSNAME_NEW is not null");
            return (Criteria) this;
        }

        public Criteria andHosnameNewEqualTo(String value) {
            addCriterion("HOSNAME_NEW =", value, "hosnameNew");
            return (Criteria) this;
        }

        public Criteria andHosnameNewNotEqualTo(String value) {
            addCriterion("HOSNAME_NEW <>", value, "hosnameNew");
            return (Criteria) this;
        }

        public Criteria andHosnameNewGreaterThan(String value) {
            addCriterion("HOSNAME_NEW >", value, "hosnameNew");
            return (Criteria) this;
        }

        public Criteria andHosnameNewGreaterThanOrEqualTo(String value) {
            addCriterion("HOSNAME_NEW >=", value, "hosnameNew");
            return (Criteria) this;
        }

        public Criteria andHosnameNewLessThan(String value) {
            addCriterion("HOSNAME_NEW <", value, "hosnameNew");
            return (Criteria) this;
        }

        public Criteria andHosnameNewLessThanOrEqualTo(String value) {
            addCriterion("HOSNAME_NEW <=", value, "hosnameNew");
            return (Criteria) this;
        }

        public Criteria andHosnameNewLike(String value) {
            addCriterion("HOSNAME_NEW like", value, "hosnameNew");
            return (Criteria) this;
        }

        public Criteria andHosnameNewNotLike(String value) {
            addCriterion("HOSNAME_NEW not like", value, "hosnameNew");
            return (Criteria) this;
        }

        public Criteria andHosnameNewIn(List<String> values) {
            addCriterion("HOSNAME_NEW in", values, "hosnameNew");
            return (Criteria) this;
        }

        public Criteria andHosnameNewNotIn(List<String> values) {
            addCriterion("HOSNAME_NEW not in", values, "hosnameNew");
            return (Criteria) this;
        }

        public Criteria andHosnameNewBetween(String value1, String value2) {
            addCriterion("HOSNAME_NEW between", value1, value2, "hosnameNew");
            return (Criteria) this;
        }

        public Criteria andHosnameNewNotBetween(String value1, String value2) {
            addCriterion("HOSNAME_NEW not between", value1, value2, "hosnameNew");
            return (Criteria) this;
        }

        public Criteria andAdddateIsNull() {
            addCriterion("ADDDATE is null");
            return (Criteria) this;
        }

        public Criteria andAdddateIsNotNull() {
            addCriterion("ADDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andAdddateEqualTo(Date value) {
            addCriterionForJDBCDate("ADDDATE =", value, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ADDDATE <>", value, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateGreaterThan(Date value) {
            addCriterionForJDBCDate("ADDDATE >", value, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ADDDATE >=", value, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateLessThan(Date value) {
            addCriterionForJDBCDate("ADDDATE <", value, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ADDDATE <=", value, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateIn(List<Date> values) {
            addCriterionForJDBCDate("ADDDATE in", values, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ADDDATE not in", values, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ADDDATE between", value1, value2, "adddate");
            return (Criteria) this;
        }

        public Criteria andAdddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ADDDATE not between", value1, value2, "adddate");
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