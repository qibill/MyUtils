package com.biosan.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GroundTbDepartmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GroundTbDepartmentExample() {
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

        public Criteria andDepartmentidIsNull() {
            addCriterion("DEPARTMENTID is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNotNull() {
            addCriterion("DEPARTMENTID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidEqualTo(BigDecimal value) {
            addCriterion("DEPARTMENTID =", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotEqualTo(BigDecimal value) {
            addCriterion("DEPARTMENTID <>", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThan(BigDecimal value) {
            addCriterion("DEPARTMENTID >", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEPARTMENTID >=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThan(BigDecimal value) {
            addCriterion("DEPARTMENTID <", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEPARTMENTID <=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIn(List<BigDecimal> values) {
            addCriterion("DEPARTMENTID in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotIn(List<BigDecimal> values) {
            addCriterion("DEPARTMENTID not in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEPARTMENTID between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEPARTMENTID not between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNull() {
            addCriterion("AREAID is null");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNotNull() {
            addCriterion("AREAID is not null");
            return (Criteria) this;
        }

        public Criteria andAreaidEqualTo(BigDecimal value) {
            addCriterion("AREAID =", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotEqualTo(BigDecimal value) {
            addCriterion("AREAID <>", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThan(BigDecimal value) {
            addCriterion("AREAID >", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AREAID >=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThan(BigDecimal value) {
            addCriterion("AREAID <", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AREAID <=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidIn(List<BigDecimal> values) {
            addCriterion("AREAID in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotIn(List<BigDecimal> values) {
            addCriterion("AREAID not in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AREAID between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AREAID not between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIsNull() {
            addCriterion("DEPARTMENTNAME is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIsNotNull() {
            addCriterion("DEPARTMENTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameEqualTo(String value) {
            addCriterion("DEPARTMENTNAME =", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotEqualTo(String value) {
            addCriterion("DEPARTMENTNAME <>", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameGreaterThan(String value) {
            addCriterion("DEPARTMENTNAME >", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENTNAME >=", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLessThan(String value) {
            addCriterion("DEPARTMENTNAME <", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENTNAME <=", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameLike(String value) {
            addCriterion("DEPARTMENTNAME like", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotLike(String value) {
            addCriterion("DEPARTMENTNAME not like", value, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameIn(List<String> values) {
            addCriterion("DEPARTMENTNAME in", values, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotIn(List<String> values) {
            addCriterion("DEPARTMENTNAME not in", values, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameBetween(String value1, String value2) {
            addCriterion("DEPARTMENTNAME between", value1, value2, "departmentname");
            return (Criteria) this;
        }

        public Criteria andDepartmentnameNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENTNAME not between", value1, value2, "departmentname");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("TELEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("TELEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("TELEPHONE =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("TELEPHONE <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("TELEPHONE >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("TELEPHONE >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("TELEPHONE <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("TELEPHONE <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("TELEPHONE like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("TELEPHONE not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("TELEPHONE in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("TELEPHONE not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("TELEPHONE between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("TELEPHONE not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(BigDecimal value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(BigDecimal value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(BigDecimal value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(BigDecimal value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<BigDecimal> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<BigDecimal> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andDepartmentpidIsNull() {
            addCriterion("DEPARTMENTPID is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentpidIsNotNull() {
            addCriterion("DEPARTMENTPID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentpidEqualTo(BigDecimal value) {
            addCriterion("DEPARTMENTPID =", value, "departmentpid");
            return (Criteria) this;
        }

        public Criteria andDepartmentpidNotEqualTo(BigDecimal value) {
            addCriterion("DEPARTMENTPID <>", value, "departmentpid");
            return (Criteria) this;
        }

        public Criteria andDepartmentpidGreaterThan(BigDecimal value) {
            addCriterion("DEPARTMENTPID >", value, "departmentpid");
            return (Criteria) this;
        }

        public Criteria andDepartmentpidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEPARTMENTPID >=", value, "departmentpid");
            return (Criteria) this;
        }

        public Criteria andDepartmentpidLessThan(BigDecimal value) {
            addCriterion("DEPARTMENTPID <", value, "departmentpid");
            return (Criteria) this;
        }

        public Criteria andDepartmentpidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEPARTMENTPID <=", value, "departmentpid");
            return (Criteria) this;
        }

        public Criteria andDepartmentpidIn(List<BigDecimal> values) {
            addCriterion("DEPARTMENTPID in", values, "departmentpid");
            return (Criteria) this;
        }

        public Criteria andDepartmentpidNotIn(List<BigDecimal> values) {
            addCriterion("DEPARTMENTPID not in", values, "departmentpid");
            return (Criteria) this;
        }

        public Criteria andDepartmentpidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEPARTMENTPID between", value1, value2, "departmentpid");
            return (Criteria) this;
        }

        public Criteria andDepartmentpidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEPARTMENTPID not between", value1, value2, "departmentpid");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andDepartmenttypeIsNull() {
            addCriterion("DEPARTMENTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andDepartmenttypeIsNotNull() {
            addCriterion("DEPARTMENTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmenttypeEqualTo(String value) {
            addCriterion("DEPARTMENTTYPE =", value, "departmenttype");
            return (Criteria) this;
        }

        public Criteria andDepartmenttypeNotEqualTo(String value) {
            addCriterion("DEPARTMENTTYPE <>", value, "departmenttype");
            return (Criteria) this;
        }

        public Criteria andDepartmenttypeGreaterThan(String value) {
            addCriterion("DEPARTMENTTYPE >", value, "departmenttype");
            return (Criteria) this;
        }

        public Criteria andDepartmenttypeGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENTTYPE >=", value, "departmenttype");
            return (Criteria) this;
        }

        public Criteria andDepartmenttypeLessThan(String value) {
            addCriterion("DEPARTMENTTYPE <", value, "departmenttype");
            return (Criteria) this;
        }

        public Criteria andDepartmenttypeLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENTTYPE <=", value, "departmenttype");
            return (Criteria) this;
        }

        public Criteria andDepartmenttypeLike(String value) {
            addCriterion("DEPARTMENTTYPE like", value, "departmenttype");
            return (Criteria) this;
        }

        public Criteria andDepartmenttypeNotLike(String value) {
            addCriterion("DEPARTMENTTYPE not like", value, "departmenttype");
            return (Criteria) this;
        }

        public Criteria andDepartmenttypeIn(List<String> values) {
            addCriterion("DEPARTMENTTYPE in", values, "departmenttype");
            return (Criteria) this;
        }

        public Criteria andDepartmenttypeNotIn(List<String> values) {
            addCriterion("DEPARTMENTTYPE not in", values, "departmenttype");
            return (Criteria) this;
        }

        public Criteria andDepartmenttypeBetween(String value1, String value2) {
            addCriterion("DEPARTMENTTYPE between", value1, value2, "departmenttype");
            return (Criteria) this;
        }

        public Criteria andDepartmenttypeNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENTTYPE not between", value1, value2, "departmenttype");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("FLAG is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("FLAG =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("FLAG <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("FLAG >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("FLAG >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("FLAG <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("FLAG <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("FLAG like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("FLAG not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("FLAG in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("FLAG not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("FLAG between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("FLAG not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andDeliverydidIsNull() {
            addCriterion("DELIVERYDID is null");
            return (Criteria) this;
        }

        public Criteria andDeliverydidIsNotNull() {
            addCriterion("DELIVERYDID is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverydidEqualTo(BigDecimal value) {
            addCriterion("DELIVERYDID =", value, "deliverydid");
            return (Criteria) this;
        }

        public Criteria andDeliverydidNotEqualTo(BigDecimal value) {
            addCriterion("DELIVERYDID <>", value, "deliverydid");
            return (Criteria) this;
        }

        public Criteria andDeliverydidGreaterThan(BigDecimal value) {
            addCriterion("DELIVERYDID >", value, "deliverydid");
            return (Criteria) this;
        }

        public Criteria andDeliverydidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DELIVERYDID >=", value, "deliverydid");
            return (Criteria) this;
        }

        public Criteria andDeliverydidLessThan(BigDecimal value) {
            addCriterion("DELIVERYDID <", value, "deliverydid");
            return (Criteria) this;
        }

        public Criteria andDeliverydidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DELIVERYDID <=", value, "deliverydid");
            return (Criteria) this;
        }

        public Criteria andDeliverydidIn(List<BigDecimal> values) {
            addCriterion("DELIVERYDID in", values, "deliverydid");
            return (Criteria) this;
        }

        public Criteria andDeliverydidNotIn(List<BigDecimal> values) {
            addCriterion("DELIVERYDID not in", values, "deliverydid");
            return (Criteria) this;
        }

        public Criteria andDeliverydidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DELIVERYDID between", value1, value2, "deliverydid");
            return (Criteria) this;
        }

        public Criteria andDeliverydidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DELIVERYDID not between", value1, value2, "deliverydid");
            return (Criteria) this;
        }

        public Criteria andBloodcardnumIsNull() {
            addCriterion("BLOODCARDNUM is null");
            return (Criteria) this;
        }

        public Criteria andBloodcardnumIsNotNull() {
            addCriterion("BLOODCARDNUM is not null");
            return (Criteria) this;
        }

        public Criteria andBloodcardnumEqualTo(BigDecimal value) {
            addCriterion("BLOODCARDNUM =", value, "bloodcardnum");
            return (Criteria) this;
        }

        public Criteria andBloodcardnumNotEqualTo(BigDecimal value) {
            addCriterion("BLOODCARDNUM <>", value, "bloodcardnum");
            return (Criteria) this;
        }

        public Criteria andBloodcardnumGreaterThan(BigDecimal value) {
            addCriterion("BLOODCARDNUM >", value, "bloodcardnum");
            return (Criteria) this;
        }

        public Criteria andBloodcardnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BLOODCARDNUM >=", value, "bloodcardnum");
            return (Criteria) this;
        }

        public Criteria andBloodcardnumLessThan(BigDecimal value) {
            addCriterion("BLOODCARDNUM <", value, "bloodcardnum");
            return (Criteria) this;
        }

        public Criteria andBloodcardnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BLOODCARDNUM <=", value, "bloodcardnum");
            return (Criteria) this;
        }

        public Criteria andBloodcardnumIn(List<BigDecimal> values) {
            addCriterion("BLOODCARDNUM in", values, "bloodcardnum");
            return (Criteria) this;
        }

        public Criteria andBloodcardnumNotIn(List<BigDecimal> values) {
            addCriterion("BLOODCARDNUM not in", values, "bloodcardnum");
            return (Criteria) this;
        }

        public Criteria andBloodcardnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BLOODCARDNUM between", value1, value2, "bloodcardnum");
            return (Criteria) this;
        }

        public Criteria andBloodcardnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BLOODCARDNUM not between", value1, value2, "bloodcardnum");
            return (Criteria) this;
        }

        public Criteria andBcdepartmentpidIsNull() {
            addCriterion("BCDEPARTMENTPID is null");
            return (Criteria) this;
        }

        public Criteria andBcdepartmentpidIsNotNull() {
            addCriterion("BCDEPARTMENTPID is not null");
            return (Criteria) this;
        }

        public Criteria andBcdepartmentpidEqualTo(BigDecimal value) {
            addCriterion("BCDEPARTMENTPID =", value, "bcdepartmentpid");
            return (Criteria) this;
        }

        public Criteria andBcdepartmentpidNotEqualTo(BigDecimal value) {
            addCriterion("BCDEPARTMENTPID <>", value, "bcdepartmentpid");
            return (Criteria) this;
        }

        public Criteria andBcdepartmentpidGreaterThan(BigDecimal value) {
            addCriterion("BCDEPARTMENTPID >", value, "bcdepartmentpid");
            return (Criteria) this;
        }

        public Criteria andBcdepartmentpidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BCDEPARTMENTPID >=", value, "bcdepartmentpid");
            return (Criteria) this;
        }

        public Criteria andBcdepartmentpidLessThan(BigDecimal value) {
            addCriterion("BCDEPARTMENTPID <", value, "bcdepartmentpid");
            return (Criteria) this;
        }

        public Criteria andBcdepartmentpidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BCDEPARTMENTPID <=", value, "bcdepartmentpid");
            return (Criteria) this;
        }

        public Criteria andBcdepartmentpidIn(List<BigDecimal> values) {
            addCriterion("BCDEPARTMENTPID in", values, "bcdepartmentpid");
            return (Criteria) this;
        }

        public Criteria andBcdepartmentpidNotIn(List<BigDecimal> values) {
            addCriterion("BCDEPARTMENTPID not in", values, "bcdepartmentpid");
            return (Criteria) this;
        }

        public Criteria andBcdepartmentpidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BCDEPARTMENTPID between", value1, value2, "bcdepartmentpid");
            return (Criteria) this;
        }

        public Criteria andBcdepartmentpidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BCDEPARTMENTPID not between", value1, value2, "bcdepartmentpid");
            return (Criteria) this;
        }

        public Criteria andItemsIsNull() {
            addCriterion("ITEMS is null");
            return (Criteria) this;
        }

        public Criteria andItemsIsNotNull() {
            addCriterion("ITEMS is not null");
            return (Criteria) this;
        }

        public Criteria andItemsEqualTo(String value) {
            addCriterion("ITEMS =", value, "items");
            return (Criteria) this;
        }

        public Criteria andItemsNotEqualTo(String value) {
            addCriterion("ITEMS <>", value, "items");
            return (Criteria) this;
        }

        public Criteria andItemsGreaterThan(String value) {
            addCriterion("ITEMS >", value, "items");
            return (Criteria) this;
        }

        public Criteria andItemsGreaterThanOrEqualTo(String value) {
            addCriterion("ITEMS >=", value, "items");
            return (Criteria) this;
        }

        public Criteria andItemsLessThan(String value) {
            addCriterion("ITEMS <", value, "items");
            return (Criteria) this;
        }

        public Criteria andItemsLessThanOrEqualTo(String value) {
            addCriterion("ITEMS <=", value, "items");
            return (Criteria) this;
        }

        public Criteria andItemsLike(String value) {
            addCriterion("ITEMS like", value, "items");
            return (Criteria) this;
        }

        public Criteria andItemsNotLike(String value) {
            addCriterion("ITEMS not like", value, "items");
            return (Criteria) this;
        }

        public Criteria andItemsIn(List<String> values) {
            addCriterion("ITEMS in", values, "items");
            return (Criteria) this;
        }

        public Criteria andItemsNotIn(List<String> values) {
            addCriterion("ITEMS not in", values, "items");
            return (Criteria) this;
        }

        public Criteria andItemsBetween(String value1, String value2) {
            addCriterion("ITEMS between", value1, value2, "items");
            return (Criteria) this;
        }

        public Criteria andItemsNotBetween(String value1, String value2) {
            addCriterion("ITEMS not between", value1, value2, "items");
            return (Criteria) this;
        }

        public Criteria andPinyincodeIsNull() {
            addCriterion("PINYINCODE is null");
            return (Criteria) this;
        }

        public Criteria andPinyincodeIsNotNull() {
            addCriterion("PINYINCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPinyincodeEqualTo(String value) {
            addCriterion("PINYINCODE =", value, "pinyincode");
            return (Criteria) this;
        }

        public Criteria andPinyincodeNotEqualTo(String value) {
            addCriterion("PINYINCODE <>", value, "pinyincode");
            return (Criteria) this;
        }

        public Criteria andPinyincodeGreaterThan(String value) {
            addCriterion("PINYINCODE >", value, "pinyincode");
            return (Criteria) this;
        }

        public Criteria andPinyincodeGreaterThanOrEqualTo(String value) {
            addCriterion("PINYINCODE >=", value, "pinyincode");
            return (Criteria) this;
        }

        public Criteria andPinyincodeLessThan(String value) {
            addCriterion("PINYINCODE <", value, "pinyincode");
            return (Criteria) this;
        }

        public Criteria andPinyincodeLessThanOrEqualTo(String value) {
            addCriterion("PINYINCODE <=", value, "pinyincode");
            return (Criteria) this;
        }

        public Criteria andPinyincodeLike(String value) {
            addCriterion("PINYINCODE like", value, "pinyincode");
            return (Criteria) this;
        }

        public Criteria andPinyincodeNotLike(String value) {
            addCriterion("PINYINCODE not like", value, "pinyincode");
            return (Criteria) this;
        }

        public Criteria andPinyincodeIn(List<String> values) {
            addCriterion("PINYINCODE in", values, "pinyincode");
            return (Criteria) this;
        }

        public Criteria andPinyincodeNotIn(List<String> values) {
            addCriterion("PINYINCODE not in", values, "pinyincode");
            return (Criteria) this;
        }

        public Criteria andPinyincodeBetween(String value1, String value2) {
            addCriterion("PINYINCODE between", value1, value2, "pinyincode");
            return (Criteria) this;
        }

        public Criteria andPinyincodeNotBetween(String value1, String value2) {
            addCriterion("PINYINCODE not between", value1, value2, "pinyincode");
            return (Criteria) this;
        }

        public Criteria andFivecodeIsNull() {
            addCriterion("FIVECODE is null");
            return (Criteria) this;
        }

        public Criteria andFivecodeIsNotNull() {
            addCriterion("FIVECODE is not null");
            return (Criteria) this;
        }

        public Criteria andFivecodeEqualTo(String value) {
            addCriterion("FIVECODE =", value, "fivecode");
            return (Criteria) this;
        }

        public Criteria andFivecodeNotEqualTo(String value) {
            addCriterion("FIVECODE <>", value, "fivecode");
            return (Criteria) this;
        }

        public Criteria andFivecodeGreaterThan(String value) {
            addCriterion("FIVECODE >", value, "fivecode");
            return (Criteria) this;
        }

        public Criteria andFivecodeGreaterThanOrEqualTo(String value) {
            addCriterion("FIVECODE >=", value, "fivecode");
            return (Criteria) this;
        }

        public Criteria andFivecodeLessThan(String value) {
            addCriterion("FIVECODE <", value, "fivecode");
            return (Criteria) this;
        }

        public Criteria andFivecodeLessThanOrEqualTo(String value) {
            addCriterion("FIVECODE <=", value, "fivecode");
            return (Criteria) this;
        }

        public Criteria andFivecodeLike(String value) {
            addCriterion("FIVECODE like", value, "fivecode");
            return (Criteria) this;
        }

        public Criteria andFivecodeNotLike(String value) {
            addCriterion("FIVECODE not like", value, "fivecode");
            return (Criteria) this;
        }

        public Criteria andFivecodeIn(List<String> values) {
            addCriterion("FIVECODE in", values, "fivecode");
            return (Criteria) this;
        }

        public Criteria andFivecodeNotIn(List<String> values) {
            addCriterion("FIVECODE not in", values, "fivecode");
            return (Criteria) this;
        }

        public Criteria andFivecodeBetween(String value1, String value2) {
            addCriterion("FIVECODE between", value1, value2, "fivecode");
            return (Criteria) this;
        }

        public Criteria andFivecodeNotBetween(String value1, String value2) {
            addCriterion("FIVECODE not between", value1, value2, "fivecode");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNull() {
            addCriterion("POSTCODE is null");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNotNull() {
            addCriterion("POSTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPostcodeEqualTo(String value) {
            addCriterion("POSTCODE =", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotEqualTo(String value) {
            addCriterion("POSTCODE <>", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThan(String value) {
            addCriterion("POSTCODE >", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("POSTCODE >=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThan(String value) {
            addCriterion("POSTCODE <", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThanOrEqualTo(String value) {
            addCriterion("POSTCODE <=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLike(String value) {
            addCriterion("POSTCODE like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotLike(String value) {
            addCriterion("POSTCODE not like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeIn(List<String> values) {
            addCriterion("POSTCODE in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotIn(List<String> values) {
            addCriterion("POSTCODE not in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeBetween(String value1, String value2) {
            addCriterion("POSTCODE between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotBetween(String value1, String value2) {
            addCriterion("POSTCODE not between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andCodeWeixinIsNull() {
            addCriterion("CODE_WEIXIN is null");
            return (Criteria) this;
        }

        public Criteria andCodeWeixinIsNotNull() {
            addCriterion("CODE_WEIXIN is not null");
            return (Criteria) this;
        }

        public Criteria andCodeWeixinEqualTo(String value) {
            addCriterion("CODE_WEIXIN =", value, "codeWeixin");
            return (Criteria) this;
        }

        public Criteria andCodeWeixinNotEqualTo(String value) {
            addCriterion("CODE_WEIXIN <>", value, "codeWeixin");
            return (Criteria) this;
        }

        public Criteria andCodeWeixinGreaterThan(String value) {
            addCriterion("CODE_WEIXIN >", value, "codeWeixin");
            return (Criteria) this;
        }

        public Criteria andCodeWeixinGreaterThanOrEqualTo(String value) {
            addCriterion("CODE_WEIXIN >=", value, "codeWeixin");
            return (Criteria) this;
        }

        public Criteria andCodeWeixinLessThan(String value) {
            addCriterion("CODE_WEIXIN <", value, "codeWeixin");
            return (Criteria) this;
        }

        public Criteria andCodeWeixinLessThanOrEqualTo(String value) {
            addCriterion("CODE_WEIXIN <=", value, "codeWeixin");
            return (Criteria) this;
        }

        public Criteria andCodeWeixinLike(String value) {
            addCriterion("CODE_WEIXIN like", value, "codeWeixin");
            return (Criteria) this;
        }

        public Criteria andCodeWeixinNotLike(String value) {
            addCriterion("CODE_WEIXIN not like", value, "codeWeixin");
            return (Criteria) this;
        }

        public Criteria andCodeWeixinIn(List<String> values) {
            addCriterion("CODE_WEIXIN in", values, "codeWeixin");
            return (Criteria) this;
        }

        public Criteria andCodeWeixinNotIn(List<String> values) {
            addCriterion("CODE_WEIXIN not in", values, "codeWeixin");
            return (Criteria) this;
        }

        public Criteria andCodeWeixinBetween(String value1, String value2) {
            addCriterion("CODE_WEIXIN between", value1, value2, "codeWeixin");
            return (Criteria) this;
        }

        public Criteria andCodeWeixinNotBetween(String value1, String value2) {
            addCriterion("CODE_WEIXIN not between", value1, value2, "codeWeixin");
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