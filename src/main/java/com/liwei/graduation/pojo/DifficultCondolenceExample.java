package com.liwei.graduation.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DifficultCondolenceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DifficultCondolenceExample() {
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

        public Criteria andLeaderidIsNull() {
            addCriterion("leaderid is null");
            return (Criteria) this;
        }

        public Criteria andLeaderidIsNotNull() {
            addCriterion("leaderid is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderidEqualTo(String value) {
            addCriterion("leaderid =", value, "leaderid");
            return (Criteria) this;
        }

        public Criteria andLeaderidNotEqualTo(String value) {
            addCriterion("leaderid <>", value, "leaderid");
            return (Criteria) this;
        }

        public Criteria andLeaderidGreaterThan(String value) {
            addCriterion("leaderid >", value, "leaderid");
            return (Criteria) this;
        }

        public Criteria andLeaderidGreaterThanOrEqualTo(String value) {
            addCriterion("leaderid >=", value, "leaderid");
            return (Criteria) this;
        }

        public Criteria andLeaderidLessThan(String value) {
            addCriterion("leaderid <", value, "leaderid");
            return (Criteria) this;
        }

        public Criteria andLeaderidLessThanOrEqualTo(String value) {
            addCriterion("leaderid <=", value, "leaderid");
            return (Criteria) this;
        }

        public Criteria andLeaderidLike(String value) {
            addCriterion("leaderid like", value, "leaderid");
            return (Criteria) this;
        }

        public Criteria andLeaderidNotLike(String value) {
            addCriterion("leaderid not like", value, "leaderid");
            return (Criteria) this;
        }

        public Criteria andLeaderidIn(List<String> values) {
            addCriterion("leaderid in", values, "leaderid");
            return (Criteria) this;
        }

        public Criteria andLeaderidNotIn(List<String> values) {
            addCriterion("leaderid not in", values, "leaderid");
            return (Criteria) this;
        }

        public Criteria andLeaderidBetween(String value1, String value2) {
            addCriterion("leaderid between", value1, value2, "leaderid");
            return (Criteria) this;
        }

        public Criteria andLeaderidNotBetween(String value1, String value2) {
            addCriterion("leaderid not between", value1, value2, "leaderid");
            return (Criteria) this;
        }

        public Criteria andLeadernameIsNull() {
            addCriterion("leadername is null");
            return (Criteria) this;
        }

        public Criteria andLeadernameIsNotNull() {
            addCriterion("leadername is not null");
            return (Criteria) this;
        }

        public Criteria andLeadernameEqualTo(String value) {
            addCriterion("leadername =", value, "leadername");
            return (Criteria) this;
        }

        public Criteria andLeadernameNotEqualTo(String value) {
            addCriterion("leadername <>", value, "leadername");
            return (Criteria) this;
        }

        public Criteria andLeadernameGreaterThan(String value) {
            addCriterion("leadername >", value, "leadername");
            return (Criteria) this;
        }

        public Criteria andLeadernameGreaterThanOrEqualTo(String value) {
            addCriterion("leadername >=", value, "leadername");
            return (Criteria) this;
        }

        public Criteria andLeadernameLessThan(String value) {
            addCriterion("leadername <", value, "leadername");
            return (Criteria) this;
        }

        public Criteria andLeadernameLessThanOrEqualTo(String value) {
            addCriterion("leadername <=", value, "leadername");
            return (Criteria) this;
        }

        public Criteria andLeadernameLike(String value) {
            addCriterion("leadername like", value, "leadername");
            return (Criteria) this;
        }

        public Criteria andLeadernameNotLike(String value) {
            addCriterion("leadername not like", value, "leadername");
            return (Criteria) this;
        }

        public Criteria andLeadernameIn(List<String> values) {
            addCriterion("leadername in", values, "leadername");
            return (Criteria) this;
        }

        public Criteria andLeadernameNotIn(List<String> values) {
            addCriterion("leadername not in", values, "leadername");
            return (Criteria) this;
        }

        public Criteria andLeadernameBetween(String value1, String value2) {
            addCriterion("leadername between", value1, value2, "leadername");
            return (Criteria) this;
        }

        public Criteria andLeadernameNotBetween(String value1, String value2) {
            addCriterion("leadername not between", value1, value2, "leadername");
            return (Criteria) this;
        }

        public Criteria andCoodepartIsNull() {
            addCriterion("coodepart is null");
            return (Criteria) this;
        }

        public Criteria andCoodepartIsNotNull() {
            addCriterion("coodepart is not null");
            return (Criteria) this;
        }

        public Criteria andCoodepartEqualTo(String value) {
            addCriterion("coodepart =", value, "coodepart");
            return (Criteria) this;
        }

        public Criteria andCoodepartNotEqualTo(String value) {
            addCriterion("coodepart <>", value, "coodepart");
            return (Criteria) this;
        }

        public Criteria andCoodepartGreaterThan(String value) {
            addCriterion("coodepart >", value, "coodepart");
            return (Criteria) this;
        }

        public Criteria andCoodepartGreaterThanOrEqualTo(String value) {
            addCriterion("coodepart >=", value, "coodepart");
            return (Criteria) this;
        }

        public Criteria andCoodepartLessThan(String value) {
            addCriterion("coodepart <", value, "coodepart");
            return (Criteria) this;
        }

        public Criteria andCoodepartLessThanOrEqualTo(String value) {
            addCriterion("coodepart <=", value, "coodepart");
            return (Criteria) this;
        }

        public Criteria andCoodepartLike(String value) {
            addCriterion("coodepart like", value, "coodepart");
            return (Criteria) this;
        }

        public Criteria andCoodepartNotLike(String value) {
            addCriterion("coodepart not like", value, "coodepart");
            return (Criteria) this;
        }

        public Criteria andCoodepartIn(List<String> values) {
            addCriterion("coodepart in", values, "coodepart");
            return (Criteria) this;
        }

        public Criteria andCoodepartNotIn(List<String> values) {
            addCriterion("coodepart not in", values, "coodepart");
            return (Criteria) this;
        }

        public Criteria andCoodepartBetween(String value1, String value2) {
            addCriterion("coodepart between", value1, value2, "coodepart");
            return (Criteria) this;
        }

        public Criteria andCoodepartNotBetween(String value1, String value2) {
            addCriterion("coodepart not between", value1, value2, "coodepart");
            return (Criteria) this;
        }

        public Criteria andContacttelIsNull() {
            addCriterion("contacttel is null");
            return (Criteria) this;
        }

        public Criteria andContacttelIsNotNull() {
            addCriterion("contacttel is not null");
            return (Criteria) this;
        }

        public Criteria andContacttelEqualTo(String value) {
            addCriterion("contacttel =", value, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelNotEqualTo(String value) {
            addCriterion("contacttel <>", value, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelGreaterThan(String value) {
            addCriterion("contacttel >", value, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelGreaterThanOrEqualTo(String value) {
            addCriterion("contacttel >=", value, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelLessThan(String value) {
            addCriterion("contacttel <", value, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelLessThanOrEqualTo(String value) {
            addCriterion("contacttel <=", value, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelLike(String value) {
            addCriterion("contacttel like", value, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelNotLike(String value) {
            addCriterion("contacttel not like", value, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelIn(List<String> values) {
            addCriterion("contacttel in", values, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelNotIn(List<String> values) {
            addCriterion("contacttel not in", values, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelBetween(String value1, String value2) {
            addCriterion("contacttel between", value1, value2, "contacttel");
            return (Criteria) this;
        }

        public Criteria andContacttelNotBetween(String value1, String value2) {
            addCriterion("contacttel not between", value1, value2, "contacttel");
            return (Criteria) this;
        }

        public Criteria andConsolationdateIsNull() {
            addCriterion("consolationdate is null");
            return (Criteria) this;
        }

        public Criteria andConsolationdateIsNotNull() {
            addCriterion("consolationdate is not null");
            return (Criteria) this;
        }

        public Criteria andConsolationdateEqualTo(Date value) {
            addCriterion("consolationdate =", value, "consolationdate");
            return (Criteria) this;
        }

        public Criteria andConsolationdateNotEqualTo(Date value) {
            addCriterion("consolationdate <>", value, "consolationdate");
            return (Criteria) this;
        }

        public Criteria andConsolationdateGreaterThan(Date value) {
            addCriterion("consolationdate >", value, "consolationdate");
            return (Criteria) this;
        }

        public Criteria andConsolationdateGreaterThanOrEqualTo(Date value) {
            addCriterion("consolationdate >=", value, "consolationdate");
            return (Criteria) this;
        }

        public Criteria andConsolationdateLessThan(Date value) {
            addCriterion("consolationdate <", value, "consolationdate");
            return (Criteria) this;
        }

        public Criteria andConsolationdateLessThanOrEqualTo(Date value) {
            addCriterion("consolationdate <=", value, "consolationdate");
            return (Criteria) this;
        }

        public Criteria andConsolationdateIn(List<Date> values) {
            addCriterion("consolationdate in", values, "consolationdate");
            return (Criteria) this;
        }

        public Criteria andConsolationdateNotIn(List<Date> values) {
            addCriterion("consolationdate not in", values, "consolationdate");
            return (Criteria) this;
        }

        public Criteria andConsolationdateBetween(Date value1, Date value2) {
            addCriterion("consolationdate between", value1, value2, "consolationdate");
            return (Criteria) this;
        }

        public Criteria andConsolationdateNotBetween(Date value1, Date value2) {
            addCriterion("consolationdate not between", value1, value2, "consolationdate");
            return (Criteria) this;
        }

        public Criteria andDifficultpartyidIsNull() {
            addCriterion("difficultpartyid is null");
            return (Criteria) this;
        }

        public Criteria andDifficultpartyidIsNotNull() {
            addCriterion("difficultpartyid is not null");
            return (Criteria) this;
        }

        public Criteria andDifficultpartyidEqualTo(String value) {
            addCriterion("difficultpartyid =", value, "difficultpartyid");
            return (Criteria) this;
        }

        public Criteria andDifficultpartyidNotEqualTo(String value) {
            addCriterion("difficultpartyid <>", value, "difficultpartyid");
            return (Criteria) this;
        }

        public Criteria andDifficultpartyidGreaterThan(String value) {
            addCriterion("difficultpartyid >", value, "difficultpartyid");
            return (Criteria) this;
        }

        public Criteria andDifficultpartyidGreaterThanOrEqualTo(String value) {
            addCriterion("difficultpartyid >=", value, "difficultpartyid");
            return (Criteria) this;
        }

        public Criteria andDifficultpartyidLessThan(String value) {
            addCriterion("difficultpartyid <", value, "difficultpartyid");
            return (Criteria) this;
        }

        public Criteria andDifficultpartyidLessThanOrEqualTo(String value) {
            addCriterion("difficultpartyid <=", value, "difficultpartyid");
            return (Criteria) this;
        }

        public Criteria andDifficultpartyidLike(String value) {
            addCriterion("difficultpartyid like", value, "difficultpartyid");
            return (Criteria) this;
        }

        public Criteria andDifficultpartyidNotLike(String value) {
            addCriterion("difficultpartyid not like", value, "difficultpartyid");
            return (Criteria) this;
        }

        public Criteria andDifficultpartyidIn(List<String> values) {
            addCriterion("difficultpartyid in", values, "difficultpartyid");
            return (Criteria) this;
        }

        public Criteria andDifficultpartyidNotIn(List<String> values) {
            addCriterion("difficultpartyid not in", values, "difficultpartyid");
            return (Criteria) this;
        }

        public Criteria andDifficultpartyidBetween(String value1, String value2) {
            addCriterion("difficultpartyid between", value1, value2, "difficultpartyid");
            return (Criteria) this;
        }

        public Criteria andDifficultpartyidNotBetween(String value1, String value2) {
            addCriterion("difficultpartyid not between", value1, value2, "difficultpartyid");
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