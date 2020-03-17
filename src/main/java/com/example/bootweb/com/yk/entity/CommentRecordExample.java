package com.example.bootweb.com.yk.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentRecordExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPIdIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(Long value) {
            addCriterion("p_id =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(Long value) {
            addCriterion("p_id <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(Long value) {
            addCriterion("p_id >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(Long value) {
            addCriterion("p_id >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(Long value) {
            addCriterion("p_id <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(Long value) {
            addCriterion("p_id <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<Long> values) {
            addCriterion("p_id in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<Long> values) {
            addCriterion("p_id not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(Long value1, Long value2) {
            addCriterion("p_id between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(Long value1, Long value2) {
            addCriterion("p_id not between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andArticleUuidIsNull() {
            addCriterion("article_uuid is null");
            return (Criteria) this;
        }

        public Criteria andArticleUuidIsNotNull() {
            addCriterion("article_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andArticleUuidEqualTo(String value) {
            addCriterion("article_uuid =", value, "articleUuid");
            return (Criteria) this;
        }

        public Criteria andArticleUuidNotEqualTo(String value) {
            addCriterion("article_uuid <>", value, "articleUuid");
            return (Criteria) this;
        }

        public Criteria andArticleUuidGreaterThan(String value) {
            addCriterion("article_uuid >", value, "articleUuid");
            return (Criteria) this;
        }

        public Criteria andArticleUuidGreaterThanOrEqualTo(String value) {
            addCriterion("article_uuid >=", value, "articleUuid");
            return (Criteria) this;
        }

        public Criteria andArticleUuidLessThan(String value) {
            addCriterion("article_uuid <", value, "articleUuid");
            return (Criteria) this;
        }

        public Criteria andArticleUuidLessThanOrEqualTo(String value) {
            addCriterion("article_uuid <=", value, "articleUuid");
            return (Criteria) this;
        }

        public Criteria andArticleUuidLike(String value) {
            addCriterion("article_uuid like", value, "articleUuid");
            return (Criteria) this;
        }

        public Criteria andArticleUuidNotLike(String value) {
            addCriterion("article_uuid not like", value, "articleUuid");
            return (Criteria) this;
        }

        public Criteria andArticleUuidIn(List<String> values) {
            addCriterion("article_uuid in", values, "articleUuid");
            return (Criteria) this;
        }

        public Criteria andArticleUuidNotIn(List<String> values) {
            addCriterion("article_uuid not in", values, "articleUuid");
            return (Criteria) this;
        }

        public Criteria andArticleUuidBetween(String value1, String value2) {
            addCriterion("article_uuid between", value1, value2, "articleUuid");
            return (Criteria) this;
        }

        public Criteria andArticleUuidNotBetween(String value1, String value2) {
            addCriterion("article_uuid not between", value1, value2, "articleUuid");
            return (Criteria) this;
        }

        public Criteria andOriginalAuthorIsNull() {
            addCriterion("original_author is null");
            return (Criteria) this;
        }

        public Criteria andOriginalAuthorIsNotNull() {
            addCriterion("original_author is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalAuthorEqualTo(String value) {
            addCriterion("original_author =", value, "originalAuthor");
            return (Criteria) this;
        }

        public Criteria andOriginalAuthorNotEqualTo(String value) {
            addCriterion("original_author <>", value, "originalAuthor");
            return (Criteria) this;
        }

        public Criteria andOriginalAuthorGreaterThan(String value) {
            addCriterion("original_author >", value, "originalAuthor");
            return (Criteria) this;
        }

        public Criteria andOriginalAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("original_author >=", value, "originalAuthor");
            return (Criteria) this;
        }

        public Criteria andOriginalAuthorLessThan(String value) {
            addCriterion("original_author <", value, "originalAuthor");
            return (Criteria) this;
        }

        public Criteria andOriginalAuthorLessThanOrEqualTo(String value) {
            addCriterion("original_author <=", value, "originalAuthor");
            return (Criteria) this;
        }

        public Criteria andOriginalAuthorLike(String value) {
            addCriterion("original_author like", value, "originalAuthor");
            return (Criteria) this;
        }

        public Criteria andOriginalAuthorNotLike(String value) {
            addCriterion("original_author not like", value, "originalAuthor");
            return (Criteria) this;
        }

        public Criteria andOriginalAuthorIn(List<String> values) {
            addCriterion("original_author in", values, "originalAuthor");
            return (Criteria) this;
        }

        public Criteria andOriginalAuthorNotIn(List<String> values) {
            addCriterion("original_author not in", values, "originalAuthor");
            return (Criteria) this;
        }

        public Criteria andOriginalAuthorBetween(String value1, String value2) {
            addCriterion("original_author between", value1, value2, "originalAuthor");
            return (Criteria) this;
        }

        public Criteria andOriginalAuthorNotBetween(String value1, String value2) {
            addCriterion("original_author not between", value1, value2, "originalAuthor");
            return (Criteria) this;
        }

        public Criteria andAnswererIdIsNull() {
            addCriterion("answerer_id is null");
            return (Criteria) this;
        }

        public Criteria andAnswererIdIsNotNull() {
            addCriterion("answerer_id is not null");
            return (Criteria) this;
        }

        public Criteria andAnswererIdEqualTo(Integer value) {
            addCriterion("answerer_id =", value, "answererId");
            return (Criteria) this;
        }

        public Criteria andAnswererIdNotEqualTo(Integer value) {
            addCriterion("answerer_id <>", value, "answererId");
            return (Criteria) this;
        }

        public Criteria andAnswererIdGreaterThan(Integer value) {
            addCriterion("answerer_id >", value, "answererId");
            return (Criteria) this;
        }

        public Criteria andAnswererIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("answerer_id >=", value, "answererId");
            return (Criteria) this;
        }

        public Criteria andAnswererIdLessThan(Integer value) {
            addCriterion("answerer_id <", value, "answererId");
            return (Criteria) this;
        }

        public Criteria andAnswererIdLessThanOrEqualTo(Integer value) {
            addCriterion("answerer_id <=", value, "answererId");
            return (Criteria) this;
        }

        public Criteria andAnswererIdIn(List<Integer> values) {
            addCriterion("answerer_id in", values, "answererId");
            return (Criteria) this;
        }

        public Criteria andAnswererIdNotIn(List<Integer> values) {
            addCriterion("answerer_id not in", values, "answererId");
            return (Criteria) this;
        }

        public Criteria andAnswererIdBetween(Integer value1, Integer value2) {
            addCriterion("answerer_id between", value1, value2, "answererId");
            return (Criteria) this;
        }

        public Criteria andAnswererIdNotBetween(Integer value1, Integer value2) {
            addCriterion("answerer_id not between", value1, value2, "answererId");
            return (Criteria) this;
        }

        public Criteria andRespondentIdIsNull() {
            addCriterion("respondent_id is null");
            return (Criteria) this;
        }

        public Criteria andRespondentIdIsNotNull() {
            addCriterion("respondent_id is not null");
            return (Criteria) this;
        }

        public Criteria andRespondentIdEqualTo(Integer value) {
            addCriterion("respondent_id =", value, "respondentId");
            return (Criteria) this;
        }

        public Criteria andRespondentIdNotEqualTo(Integer value) {
            addCriterion("respondent_id <>", value, "respondentId");
            return (Criteria) this;
        }

        public Criteria andRespondentIdGreaterThan(Integer value) {
            addCriterion("respondent_id >", value, "respondentId");
            return (Criteria) this;
        }

        public Criteria andRespondentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("respondent_id >=", value, "respondentId");
            return (Criteria) this;
        }

        public Criteria andRespondentIdLessThan(Integer value) {
            addCriterion("respondent_id <", value, "respondentId");
            return (Criteria) this;
        }

        public Criteria andRespondentIdLessThanOrEqualTo(Integer value) {
            addCriterion("respondent_id <=", value, "respondentId");
            return (Criteria) this;
        }

        public Criteria andRespondentIdIn(List<Integer> values) {
            addCriterion("respondent_id in", values, "respondentId");
            return (Criteria) this;
        }

        public Criteria andRespondentIdNotIn(List<Integer> values) {
            addCriterion("respondent_id not in", values, "respondentId");
            return (Criteria) this;
        }

        public Criteria andRespondentIdBetween(Integer value1, Integer value2) {
            addCriterion("respondent_id between", value1, value2, "respondentId");
            return (Criteria) this;
        }

        public Criteria andRespondentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("respondent_id not between", value1, value2, "respondentId");
            return (Criteria) this;
        }

        public Criteria andCommentDateIsNull() {
            addCriterion("comment_date is null");
            return (Criteria) this;
        }

        public Criteria andCommentDateIsNotNull() {
            addCriterion("comment_date is not null");
            return (Criteria) this;
        }

        public Criteria andCommentDateEqualTo(Date value) {
            addCriterion("comment_date =", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateNotEqualTo(Date value) {
            addCriterion("comment_date <>", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateGreaterThan(Date value) {
            addCriterion("comment_date >", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateGreaterThanOrEqualTo(Date value) {
            addCriterion("comment_date >=", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateLessThan(Date value) {
            addCriterion("comment_date <", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateLessThanOrEqualTo(Date value) {
            addCriterion("comment_date <=", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateIn(List<Date> values) {
            addCriterion("comment_date in", values, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateNotIn(List<Date> values) {
            addCriterion("comment_date not in", values, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateBetween(Date value1, Date value2) {
            addCriterion("comment_date between", value1, value2, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateNotBetween(Date value1, Date value2) {
            addCriterion("comment_date not between", value1, value2, "commentDate");
            return (Criteria) this;
        }

        public Criteria andLikesIsNull() {
            addCriterion("likes is null");
            return (Criteria) this;
        }

        public Criteria andLikesIsNotNull() {
            addCriterion("likes is not null");
            return (Criteria) this;
        }

        public Criteria andLikesEqualTo(Integer value) {
            addCriterion("likes =", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesNotEqualTo(Integer value) {
            addCriterion("likes <>", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesGreaterThan(Integer value) {
            addCriterion("likes >", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesGreaterThanOrEqualTo(Integer value) {
            addCriterion("likes >=", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesLessThan(Integer value) {
            addCriterion("likes <", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesLessThanOrEqualTo(Integer value) {
            addCriterion("likes <=", value, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesIn(List<Integer> values) {
            addCriterion("likes in", values, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesNotIn(List<Integer> values) {
            addCriterion("likes not in", values, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesBetween(Integer value1, Integer value2) {
            addCriterion("likes between", value1, value2, "likes");
            return (Criteria) this;
        }

        public Criteria andLikesNotBetween(Integer value1, Integer value2) {
            addCriterion("likes not between", value1, value2, "likes");
            return (Criteria) this;
        }

        public Criteria andCommentContentIsNull() {
            addCriterion("comment_content is null");
            return (Criteria) this;
        }

        public Criteria andCommentContentIsNotNull() {
            addCriterion("comment_content is not null");
            return (Criteria) this;
        }

        public Criteria andCommentContentEqualTo(String value) {
            addCriterion("comment_content =", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotEqualTo(String value) {
            addCriterion("comment_content <>", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentGreaterThan(String value) {
            addCriterion("comment_content >", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentGreaterThanOrEqualTo(String value) {
            addCriterion("comment_content >=", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLessThan(String value) {
            addCriterion("comment_content <", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLessThanOrEqualTo(String value) {
            addCriterion("comment_content <=", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLike(String value) {
            addCriterion("comment_content like", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotLike(String value) {
            addCriterion("comment_content not like", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentIn(List<String> values) {
            addCriterion("comment_content in", values, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotIn(List<String> values) {
            addCriterion("comment_content not in", values, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentBetween(String value1, String value2) {
            addCriterion("comment_content between", value1, value2, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotBetween(String value1, String value2) {
            addCriterion("comment_content not between", value1, value2, "commentContent");
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