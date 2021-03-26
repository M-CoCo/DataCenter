package com.nmgepic.datacenter.model;

import java.util.ArrayList;
import java.util.List;

public class QuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andOptionAIsNull() {
            addCriterion("option_A is null");
            return (Criteria) this;
        }

        public Criteria andOptionAIsNotNull() {
            addCriterion("option_A is not null");
            return (Criteria) this;
        }

        public Criteria andOptionAEqualTo(String value) {
            addCriterion("option_A =", value, "optionA");
            return (Criteria) this;
        }

        public Criteria andOptionANotEqualTo(String value) {
            addCriterion("option_A <>", value, "optionA");
            return (Criteria) this;
        }

        public Criteria andOptionAGreaterThan(String value) {
            addCriterion("option_A >", value, "optionA");
            return (Criteria) this;
        }

        public Criteria andOptionAGreaterThanOrEqualTo(String value) {
            addCriterion("option_A >=", value, "optionA");
            return (Criteria) this;
        }

        public Criteria andOptionALessThan(String value) {
            addCriterion("option_A <", value, "optionA");
            return (Criteria) this;
        }

        public Criteria andOptionALessThanOrEqualTo(String value) {
            addCriterion("option_A <=", value, "optionA");
            return (Criteria) this;
        }

        public Criteria andOptionALike(String value) {
            addCriterion("option_A like", value, "optionA");
            return (Criteria) this;
        }

        public Criteria andOptionANotLike(String value) {
            addCriterion("option_A not like", value, "optionA");
            return (Criteria) this;
        }

        public Criteria andOptionAIn(List<String> values) {
            addCriterion("option_A in", values, "optionA");
            return (Criteria) this;
        }

        public Criteria andOptionANotIn(List<String> values) {
            addCriterion("option_A not in", values, "optionA");
            return (Criteria) this;
        }

        public Criteria andOptionABetween(String value1, String value2) {
            addCriterion("option_A between", value1, value2, "optionA");
            return (Criteria) this;
        }

        public Criteria andOptionANotBetween(String value1, String value2) {
            addCriterion("option_A not between", value1, value2, "optionA");
            return (Criteria) this;
        }

        public Criteria andOptionBIsNull() {
            addCriterion("option_B is null");
            return (Criteria) this;
        }

        public Criteria andOptionBIsNotNull() {
            addCriterion("option_B is not null");
            return (Criteria) this;
        }

        public Criteria andOptionBEqualTo(String value) {
            addCriterion("option_B =", value, "optionB");
            return (Criteria) this;
        }

        public Criteria andOptionBNotEqualTo(String value) {
            addCriterion("option_B <>", value, "optionB");
            return (Criteria) this;
        }

        public Criteria andOptionBGreaterThan(String value) {
            addCriterion("option_B >", value, "optionB");
            return (Criteria) this;
        }

        public Criteria andOptionBGreaterThanOrEqualTo(String value) {
            addCriterion("option_B >=", value, "optionB");
            return (Criteria) this;
        }

        public Criteria andOptionBLessThan(String value) {
            addCriterion("option_B <", value, "optionB");
            return (Criteria) this;
        }

        public Criteria andOptionBLessThanOrEqualTo(String value) {
            addCriterion("option_B <=", value, "optionB");
            return (Criteria) this;
        }

        public Criteria andOptionBLike(String value) {
            addCriterion("option_B like", value, "optionB");
            return (Criteria) this;
        }

        public Criteria andOptionBNotLike(String value) {
            addCriterion("option_B not like", value, "optionB");
            return (Criteria) this;
        }

        public Criteria andOptionBIn(List<String> values) {
            addCriterion("option_B in", values, "optionB");
            return (Criteria) this;
        }

        public Criteria andOptionBNotIn(List<String> values) {
            addCriterion("option_B not in", values, "optionB");
            return (Criteria) this;
        }

        public Criteria andOptionBBetween(String value1, String value2) {
            addCriterion("option_B between", value1, value2, "optionB");
            return (Criteria) this;
        }

        public Criteria andOptionBNotBetween(String value1, String value2) {
            addCriterion("option_B not between", value1, value2, "optionB");
            return (Criteria) this;
        }

        public Criteria andOptionCIsNull() {
            addCriterion("option_C is null");
            return (Criteria) this;
        }

        public Criteria andOptionCIsNotNull() {
            addCriterion("option_C is not null");
            return (Criteria) this;
        }

        public Criteria andOptionCEqualTo(String value) {
            addCriterion("option_C =", value, "optionC");
            return (Criteria) this;
        }

        public Criteria andOptionCNotEqualTo(String value) {
            addCriterion("option_C <>", value, "optionC");
            return (Criteria) this;
        }

        public Criteria andOptionCGreaterThan(String value) {
            addCriterion("option_C >", value, "optionC");
            return (Criteria) this;
        }

        public Criteria andOptionCGreaterThanOrEqualTo(String value) {
            addCriterion("option_C >=", value, "optionC");
            return (Criteria) this;
        }

        public Criteria andOptionCLessThan(String value) {
            addCriterion("option_C <", value, "optionC");
            return (Criteria) this;
        }

        public Criteria andOptionCLessThanOrEqualTo(String value) {
            addCriterion("option_C <=", value, "optionC");
            return (Criteria) this;
        }

        public Criteria andOptionCLike(String value) {
            addCriterion("option_C like", value, "optionC");
            return (Criteria) this;
        }

        public Criteria andOptionCNotLike(String value) {
            addCriterion("option_C not like", value, "optionC");
            return (Criteria) this;
        }

        public Criteria andOptionCIn(List<String> values) {
            addCriterion("option_C in", values, "optionC");
            return (Criteria) this;
        }

        public Criteria andOptionCNotIn(List<String> values) {
            addCriterion("option_C not in", values, "optionC");
            return (Criteria) this;
        }

        public Criteria andOptionCBetween(String value1, String value2) {
            addCriterion("option_C between", value1, value2, "optionC");
            return (Criteria) this;
        }

        public Criteria andOptionCNotBetween(String value1, String value2) {
            addCriterion("option_C not between", value1, value2, "optionC");
            return (Criteria) this;
        }

        public Criteria andOptionDIsNull() {
            addCriterion("option_D is null");
            return (Criteria) this;
        }

        public Criteria andOptionDIsNotNull() {
            addCriterion("option_D is not null");
            return (Criteria) this;
        }

        public Criteria andOptionDEqualTo(String value) {
            addCriterion("option_D =", value, "optionD");
            return (Criteria) this;
        }

        public Criteria andOptionDNotEqualTo(String value) {
            addCriterion("option_D <>", value, "optionD");
            return (Criteria) this;
        }

        public Criteria andOptionDGreaterThan(String value) {
            addCriterion("option_D >", value, "optionD");
            return (Criteria) this;
        }

        public Criteria andOptionDGreaterThanOrEqualTo(String value) {
            addCriterion("option_D >=", value, "optionD");
            return (Criteria) this;
        }

        public Criteria andOptionDLessThan(String value) {
            addCriterion("option_D <", value, "optionD");
            return (Criteria) this;
        }

        public Criteria andOptionDLessThanOrEqualTo(String value) {
            addCriterion("option_D <=", value, "optionD");
            return (Criteria) this;
        }

        public Criteria andOptionDLike(String value) {
            addCriterion("option_D like", value, "optionD");
            return (Criteria) this;
        }

        public Criteria andOptionDNotLike(String value) {
            addCriterion("option_D not like", value, "optionD");
            return (Criteria) this;
        }

        public Criteria andOptionDIn(List<String> values) {
            addCriterion("option_D in", values, "optionD");
            return (Criteria) this;
        }

        public Criteria andOptionDNotIn(List<String> values) {
            addCriterion("option_D not in", values, "optionD");
            return (Criteria) this;
        }

        public Criteria andOptionDBetween(String value1, String value2) {
            addCriterion("option_D between", value1, value2, "optionD");
            return (Criteria) this;
        }

        public Criteria andOptionDNotBetween(String value1, String value2) {
            addCriterion("option_D not between", value1, value2, "optionD");
            return (Criteria) this;
        }

        public Criteria andExplainAIsNull() {
            addCriterion("explain_A is null");
            return (Criteria) this;
        }

        public Criteria andExplainAIsNotNull() {
            addCriterion("explain_A is not null");
            return (Criteria) this;
        }

        public Criteria andExplainAEqualTo(String value) {
            addCriterion("explain_A =", value, "explainA");
            return (Criteria) this;
        }

        public Criteria andExplainANotEqualTo(String value) {
            addCriterion("explain_A <>", value, "explainA");
            return (Criteria) this;
        }

        public Criteria andExplainAGreaterThan(String value) {
            addCriterion("explain_A >", value, "explainA");
            return (Criteria) this;
        }

        public Criteria andExplainAGreaterThanOrEqualTo(String value) {
            addCriterion("explain_A >=", value, "explainA");
            return (Criteria) this;
        }

        public Criteria andExplainALessThan(String value) {
            addCriterion("explain_A <", value, "explainA");
            return (Criteria) this;
        }

        public Criteria andExplainALessThanOrEqualTo(String value) {
            addCriterion("explain_A <=", value, "explainA");
            return (Criteria) this;
        }

        public Criteria andExplainALike(String value) {
            addCriterion("explain_A like", value, "explainA");
            return (Criteria) this;
        }

        public Criteria andExplainANotLike(String value) {
            addCriterion("explain_A not like", value, "explainA");
            return (Criteria) this;
        }

        public Criteria andExplainAIn(List<String> values) {
            addCriterion("explain_A in", values, "explainA");
            return (Criteria) this;
        }

        public Criteria andExplainANotIn(List<String> values) {
            addCriterion("explain_A not in", values, "explainA");
            return (Criteria) this;
        }

        public Criteria andExplainABetween(String value1, String value2) {
            addCriterion("explain_A between", value1, value2, "explainA");
            return (Criteria) this;
        }

        public Criteria andExplainANotBetween(String value1, String value2) {
            addCriterion("explain_A not between", value1, value2, "explainA");
            return (Criteria) this;
        }

        public Criteria andExplainBIsNull() {
            addCriterion("explain_B is null");
            return (Criteria) this;
        }

        public Criteria andExplainBIsNotNull() {
            addCriterion("explain_B is not null");
            return (Criteria) this;
        }

        public Criteria andExplainBEqualTo(String value) {
            addCriterion("explain_B =", value, "explainB");
            return (Criteria) this;
        }

        public Criteria andExplainBNotEqualTo(String value) {
            addCriterion("explain_B <>", value, "explainB");
            return (Criteria) this;
        }

        public Criteria andExplainBGreaterThan(String value) {
            addCriterion("explain_B >", value, "explainB");
            return (Criteria) this;
        }

        public Criteria andExplainBGreaterThanOrEqualTo(String value) {
            addCriterion("explain_B >=", value, "explainB");
            return (Criteria) this;
        }

        public Criteria andExplainBLessThan(String value) {
            addCriterion("explain_B <", value, "explainB");
            return (Criteria) this;
        }

        public Criteria andExplainBLessThanOrEqualTo(String value) {
            addCriterion("explain_B <=", value, "explainB");
            return (Criteria) this;
        }

        public Criteria andExplainBLike(String value) {
            addCriterion("explain_B like", value, "explainB");
            return (Criteria) this;
        }

        public Criteria andExplainBNotLike(String value) {
            addCriterion("explain_B not like", value, "explainB");
            return (Criteria) this;
        }

        public Criteria andExplainBIn(List<String> values) {
            addCriterion("explain_B in", values, "explainB");
            return (Criteria) this;
        }

        public Criteria andExplainBNotIn(List<String> values) {
            addCriterion("explain_B not in", values, "explainB");
            return (Criteria) this;
        }

        public Criteria andExplainBBetween(String value1, String value2) {
            addCriterion("explain_B between", value1, value2, "explainB");
            return (Criteria) this;
        }

        public Criteria andExplainBNotBetween(String value1, String value2) {
            addCriterion("explain_B not between", value1, value2, "explainB");
            return (Criteria) this;
        }

        public Criteria andExplainCIsNull() {
            addCriterion("explain_C is null");
            return (Criteria) this;
        }

        public Criteria andExplainCIsNotNull() {
            addCriterion("explain_C is not null");
            return (Criteria) this;
        }

        public Criteria andExplainCEqualTo(String value) {
            addCriterion("explain_C =", value, "explainC");
            return (Criteria) this;
        }

        public Criteria andExplainCNotEqualTo(String value) {
            addCriterion("explain_C <>", value, "explainC");
            return (Criteria) this;
        }

        public Criteria andExplainCGreaterThan(String value) {
            addCriterion("explain_C >", value, "explainC");
            return (Criteria) this;
        }

        public Criteria andExplainCGreaterThanOrEqualTo(String value) {
            addCriterion("explain_C >=", value, "explainC");
            return (Criteria) this;
        }

        public Criteria andExplainCLessThan(String value) {
            addCriterion("explain_C <", value, "explainC");
            return (Criteria) this;
        }

        public Criteria andExplainCLessThanOrEqualTo(String value) {
            addCriterion("explain_C <=", value, "explainC");
            return (Criteria) this;
        }

        public Criteria andExplainCLike(String value) {
            addCriterion("explain_C like", value, "explainC");
            return (Criteria) this;
        }

        public Criteria andExplainCNotLike(String value) {
            addCriterion("explain_C not like", value, "explainC");
            return (Criteria) this;
        }

        public Criteria andExplainCIn(List<String> values) {
            addCriterion("explain_C in", values, "explainC");
            return (Criteria) this;
        }

        public Criteria andExplainCNotIn(List<String> values) {
            addCriterion("explain_C not in", values, "explainC");
            return (Criteria) this;
        }

        public Criteria andExplainCBetween(String value1, String value2) {
            addCriterion("explain_C between", value1, value2, "explainC");
            return (Criteria) this;
        }

        public Criteria andExplainCNotBetween(String value1, String value2) {
            addCriterion("explain_C not between", value1, value2, "explainC");
            return (Criteria) this;
        }

        public Criteria andExplainDIsNull() {
            addCriterion("explain_D is null");
            return (Criteria) this;
        }

        public Criteria andExplainDIsNotNull() {
            addCriterion("explain_D is not null");
            return (Criteria) this;
        }

        public Criteria andExplainDEqualTo(String value) {
            addCriterion("explain_D =", value, "explainD");
            return (Criteria) this;
        }

        public Criteria andExplainDNotEqualTo(String value) {
            addCriterion("explain_D <>", value, "explainD");
            return (Criteria) this;
        }

        public Criteria andExplainDGreaterThan(String value) {
            addCriterion("explain_D >", value, "explainD");
            return (Criteria) this;
        }

        public Criteria andExplainDGreaterThanOrEqualTo(String value) {
            addCriterion("explain_D >=", value, "explainD");
            return (Criteria) this;
        }

        public Criteria andExplainDLessThan(String value) {
            addCriterion("explain_D <", value, "explainD");
            return (Criteria) this;
        }

        public Criteria andExplainDLessThanOrEqualTo(String value) {
            addCriterion("explain_D <=", value, "explainD");
            return (Criteria) this;
        }

        public Criteria andExplainDLike(String value) {
            addCriterion("explain_D like", value, "explainD");
            return (Criteria) this;
        }

        public Criteria andExplainDNotLike(String value) {
            addCriterion("explain_D not like", value, "explainD");
            return (Criteria) this;
        }

        public Criteria andExplainDIn(List<String> values) {
            addCriterion("explain_D in", values, "explainD");
            return (Criteria) this;
        }

        public Criteria andExplainDNotIn(List<String> values) {
            addCriterion("explain_D not in", values, "explainD");
            return (Criteria) this;
        }

        public Criteria andExplainDBetween(String value1, String value2) {
            addCriterion("explain_D between", value1, value2, "explainD");
            return (Criteria) this;
        }

        public Criteria andExplainDNotBetween(String value1, String value2) {
            addCriterion("explain_D not between", value1, value2, "explainD");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNull() {
            addCriterion("answer is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNotNull() {
            addCriterion("answer is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerEqualTo(String value) {
            addCriterion("answer =", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotEqualTo(String value) {
            addCriterion("answer <>", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThan(String value) {
            addCriterion("answer >", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("answer >=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThan(String value) {
            addCriterion("answer <", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThanOrEqualTo(String value) {
            addCriterion("answer <=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLike(String value) {
            addCriterion("answer like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotLike(String value) {
            addCriterion("answer not like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerIn(List<String> values) {
            addCriterion("answer in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotIn(List<String> values) {
            addCriterion("answer not in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerBetween(String value1, String value2) {
            addCriterion("answer between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotBetween(String value1, String value2) {
            addCriterion("answer not between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTopicTypeIsNull() {
            addCriterion("topic_type is null");
            return (Criteria) this;
        }

        public Criteria andTopicTypeIsNotNull() {
            addCriterion("topic_type is not null");
            return (Criteria) this;
        }

        public Criteria andTopicTypeEqualTo(Integer value) {
            addCriterion("topic_type =", value, "topicType");
            return (Criteria) this;
        }

        public Criteria andTopicTypeNotEqualTo(Integer value) {
            addCriterion("topic_type <>", value, "topicType");
            return (Criteria) this;
        }

        public Criteria andTopicTypeGreaterThan(Integer value) {
            addCriterion("topic_type >", value, "topicType");
            return (Criteria) this;
        }

        public Criteria andTopicTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("topic_type >=", value, "topicType");
            return (Criteria) this;
        }

        public Criteria andTopicTypeLessThan(Integer value) {
            addCriterion("topic_type <", value, "topicType");
            return (Criteria) this;
        }

        public Criteria andTopicTypeLessThanOrEqualTo(Integer value) {
            addCriterion("topic_type <=", value, "topicType");
            return (Criteria) this;
        }

        public Criteria andTopicTypeIn(List<Integer> values) {
            addCriterion("topic_type in", values, "topicType");
            return (Criteria) this;
        }

        public Criteria andTopicTypeNotIn(List<Integer> values) {
            addCriterion("topic_type not in", values, "topicType");
            return (Criteria) this;
        }

        public Criteria andTopicTypeBetween(Integer value1, Integer value2) {
            addCriterion("topic_type between", value1, value2, "topicType");
            return (Criteria) this;
        }

        public Criteria andTopicTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("topic_type not between", value1, value2, "topicType");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(Integer value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(Integer value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(Integer value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(Integer value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(Integer value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<Integer> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<Integer> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(Integer value1, Integer value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("grade not between", value1, value2, "grade");
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