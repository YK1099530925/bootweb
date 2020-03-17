package com.example.bootweb.com.yk.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageIndex;

    protected Integer pageSize;

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ArticleExample() {
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

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
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

        public Criteria andArticleTitleIsNull() {
            addCriterion("article_title is null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIsNotNull() {
            addCriterion("article_title is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleEqualTo(String value) {
            addCriterion("article_title =", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotEqualTo(String value) {
            addCriterion("article_title <>", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThan(String value) {
            addCriterion("article_title >", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThanOrEqualTo(String value) {
            addCriterion("article_title >=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThan(String value) {
            addCriterion("article_title <", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThanOrEqualTo(String value) {
            addCriterion("article_title <=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLike(String value) {
            addCriterion("article_title like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotLike(String value) {
            addCriterion("article_title not like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIn(List<String> values) {
            addCriterion("article_title in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotIn(List<String> values) {
            addCriterion("article_title not in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleBetween(String value1, String value2) {
            addCriterion("article_title between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotBetween(String value1, String value2) {
            addCriterion("article_title not between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andAritcleSignIsNull() {
            addCriterion("aritcle_sign is null");
            return (Criteria) this;
        }

        public Criteria andAritcleSignIsNotNull() {
            addCriterion("aritcle_sign is not null");
            return (Criteria) this;
        }

        public Criteria andAritcleSignEqualTo(String value) {
            addCriterion("aritcle_sign =", value, "aritcleSign");
            return (Criteria) this;
        }

        public Criteria andAritcleSignNotEqualTo(String value) {
            addCriterion("aritcle_sign <>", value, "aritcleSign");
            return (Criteria) this;
        }

        public Criteria andAritcleSignGreaterThan(String value) {
            addCriterion("aritcle_sign >", value, "aritcleSign");
            return (Criteria) this;
        }

        public Criteria andAritcleSignGreaterThanOrEqualTo(String value) {
            addCriterion("aritcle_sign >=", value, "aritcleSign");
            return (Criteria) this;
        }

        public Criteria andAritcleSignLessThan(String value) {
            addCriterion("aritcle_sign <", value, "aritcleSign");
            return (Criteria) this;
        }

        public Criteria andAritcleSignLessThanOrEqualTo(String value) {
            addCriterion("aritcle_sign <=", value, "aritcleSign");
            return (Criteria) this;
        }

        public Criteria andAritcleSignLike(String value) {
            addCriterion("aritcle_sign like", value, "aritcleSign");
            return (Criteria) this;
        }

        public Criteria andAritcleSignNotLike(String value) {
            addCriterion("aritcle_sign not like", value, "aritcleSign");
            return (Criteria) this;
        }

        public Criteria andAritcleSignIn(List<String> values) {
            addCriterion("aritcle_sign in", values, "aritcleSign");
            return (Criteria) this;
        }

        public Criteria andAritcleSignNotIn(List<String> values) {
            addCriterion("aritcle_sign not in", values, "aritcleSign");
            return (Criteria) this;
        }

        public Criteria andAritcleSignBetween(String value1, String value2) {
            addCriterion("aritcle_sign between", value1, value2, "aritcleSign");
            return (Criteria) this;
        }

        public Criteria andAritcleSignNotBetween(String value1, String value2) {
            addCriterion("aritcle_sign not between", value1, value2, "aritcleSign");
            return (Criteria) this;
        }

        public Criteria andArticleContentIsNull() {
            addCriterion("article_content is null");
            return (Criteria) this;
        }

        public Criteria andArticleContentIsNotNull() {
            addCriterion("article_content is not null");
            return (Criteria) this;
        }

        public Criteria andArticleContentEqualTo(String value) {
            addCriterion("article_content =", value, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentNotEqualTo(String value) {
            addCriterion("article_content <>", value, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentGreaterThan(String value) {
            addCriterion("article_content >", value, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentGreaterThanOrEqualTo(String value) {
            addCriterion("article_content >=", value, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentLessThan(String value) {
            addCriterion("article_content <", value, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentLessThanOrEqualTo(String value) {
            addCriterion("article_content <=", value, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentLike(String value) {
            addCriterion("article_content like", value, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentNotLike(String value) {
            addCriterion("article_content not like", value, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentIn(List<String> values) {
            addCriterion("article_content in", values, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentNotIn(List<String> values) {
            addCriterion("article_content not in", values, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentBetween(String value1, String value2) {
            addCriterion("article_content between", value1, value2, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleContentNotBetween(String value1, String value2) {
            addCriterion("article_content not between", value1, value2, "articleContent");
            return (Criteria) this;
        }

        public Criteria andArticleTagsIsNull() {
            addCriterion("article_tags is null");
            return (Criteria) this;
        }

        public Criteria andArticleTagsIsNotNull() {
            addCriterion("article_tags is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTagsEqualTo(String value) {
            addCriterion("article_tags =", value, "articleTags");
            return (Criteria) this;
        }

        public Criteria andArticleTagsNotEqualTo(String value) {
            addCriterion("article_tags <>", value, "articleTags");
            return (Criteria) this;
        }

        public Criteria andArticleTagsGreaterThan(String value) {
            addCriterion("article_tags >", value, "articleTags");
            return (Criteria) this;
        }

        public Criteria andArticleTagsGreaterThanOrEqualTo(String value) {
            addCriterion("article_tags >=", value, "articleTags");
            return (Criteria) this;
        }

        public Criteria andArticleTagsLessThan(String value) {
            addCriterion("article_tags <", value, "articleTags");
            return (Criteria) this;
        }

        public Criteria andArticleTagsLessThanOrEqualTo(String value) {
            addCriterion("article_tags <=", value, "articleTags");
            return (Criteria) this;
        }

        public Criteria andArticleTagsLike(String value) {
            addCriterion("article_tags like", value, "articleTags");
            return (Criteria) this;
        }

        public Criteria andArticleTagsNotLike(String value) {
            addCriterion("article_tags not like", value, "articleTags");
            return (Criteria) this;
        }

        public Criteria andArticleTagsIn(List<String> values) {
            addCriterion("article_tags in", values, "articleTags");
            return (Criteria) this;
        }

        public Criteria andArticleTagsNotIn(List<String> values) {
            addCriterion("article_tags not in", values, "articleTags");
            return (Criteria) this;
        }

        public Criteria andArticleTagsBetween(String value1, String value2) {
            addCriterion("article_tags between", value1, value2, "articleTags");
            return (Criteria) this;
        }

        public Criteria andArticleTagsNotBetween(String value1, String value2) {
            addCriterion("article_tags not between", value1, value2, "articleTags");
            return (Criteria) this;
        }

        public Criteria andArticleTypeIsNull() {
            addCriterion("article_type is null");
            return (Criteria) this;
        }

        public Criteria andArticleTypeIsNotNull() {
            addCriterion("article_type is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTypeEqualTo(String value) {
            addCriterion("article_type =", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeNotEqualTo(String value) {
            addCriterion("article_type <>", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeGreaterThan(String value) {
            addCriterion("article_type >", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("article_type >=", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeLessThan(String value) {
            addCriterion("article_type <", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeLessThanOrEqualTo(String value) {
            addCriterion("article_type <=", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeLike(String value) {
            addCriterion("article_type like", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeNotLike(String value) {
            addCriterion("article_type not like", value, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeIn(List<String> values) {
            addCriterion("article_type in", values, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeNotIn(List<String> values) {
            addCriterion("article_type not in", values, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeBetween(String value1, String value2) {
            addCriterion("article_type between", value1, value2, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleTypeNotBetween(String value1, String value2) {
            addCriterion("article_type not between", value1, value2, "articleType");
            return (Criteria) this;
        }

        public Criteria andArticleCategoriesIsNull() {
            addCriterion("article_categories is null");
            return (Criteria) this;
        }

        public Criteria andArticleCategoriesIsNotNull() {
            addCriterion("article_categories is not null");
            return (Criteria) this;
        }

        public Criteria andArticleCategoriesEqualTo(String value) {
            addCriterion("article_categories =", value, "articleCategories");
            return (Criteria) this;
        }

        public Criteria andArticleCategoriesNotEqualTo(String value) {
            addCriterion("article_categories <>", value, "articleCategories");
            return (Criteria) this;
        }

        public Criteria andArticleCategoriesGreaterThan(String value) {
            addCriterion("article_categories >", value, "articleCategories");
            return (Criteria) this;
        }

        public Criteria andArticleCategoriesGreaterThanOrEqualTo(String value) {
            addCriterion("article_categories >=", value, "articleCategories");
            return (Criteria) this;
        }

        public Criteria andArticleCategoriesLessThan(String value) {
            addCriterion("article_categories <", value, "articleCategories");
            return (Criteria) this;
        }

        public Criteria andArticleCategoriesLessThanOrEqualTo(String value) {
            addCriterion("article_categories <=", value, "articleCategories");
            return (Criteria) this;
        }

        public Criteria andArticleCategoriesLike(String value) {
            addCriterion("article_categories like", value, "articleCategories");
            return (Criteria) this;
        }

        public Criteria andArticleCategoriesNotLike(String value) {
            addCriterion("article_categories not like", value, "articleCategories");
            return (Criteria) this;
        }

        public Criteria andArticleCategoriesIn(List<String> values) {
            addCriterion("article_categories in", values, "articleCategories");
            return (Criteria) this;
        }

        public Criteria andArticleCategoriesNotIn(List<String> values) {
            addCriterion("article_categories not in", values, "articleCategories");
            return (Criteria) this;
        }

        public Criteria andArticleCategoriesBetween(String value1, String value2) {
            addCriterion("article_categories between", value1, value2, "articleCategories");
            return (Criteria) this;
        }

        public Criteria andArticleCategoriesNotBetween(String value1, String value2) {
            addCriterion("article_categories not between", value1, value2, "articleCategories");
            return (Criteria) this;
        }

        public Criteria andPubPrivIsNull() {
            addCriterion("pub_priv is null");
            return (Criteria) this;
        }

        public Criteria andPubPrivIsNotNull() {
            addCriterion("pub_priv is not null");
            return (Criteria) this;
        }

        public Criteria andPubPrivEqualTo(Integer value) {
            addCriterion("pub_priv =", value, "pubPriv");
            return (Criteria) this;
        }

        public Criteria andPubPrivNotEqualTo(Integer value) {
            addCriterion("pub_priv <>", value, "pubPriv");
            return (Criteria) this;
        }

        public Criteria andPubPrivGreaterThan(Integer value) {
            addCriterion("pub_priv >", value, "pubPriv");
            return (Criteria) this;
        }

        public Criteria andPubPrivGreaterThanOrEqualTo(Integer value) {
            addCriterion("pub_priv >=", value, "pubPriv");
            return (Criteria) this;
        }

        public Criteria andPubPrivLessThan(Integer value) {
            addCriterion("pub_priv <", value, "pubPriv");
            return (Criteria) this;
        }

        public Criteria andPubPrivLessThanOrEqualTo(Integer value) {
            addCriterion("pub_priv <=", value, "pubPriv");
            return (Criteria) this;
        }

        public Criteria andPubPrivIn(List<Integer> values) {
            addCriterion("pub_priv in", values, "pubPriv");
            return (Criteria) this;
        }

        public Criteria andPubPrivNotIn(List<Integer> values) {
            addCriterion("pub_priv not in", values, "pubPriv");
            return (Criteria) this;
        }

        public Criteria andPubPrivBetween(Integer value1, Integer value2) {
            addCriterion("pub_priv between", value1, value2, "pubPriv");
            return (Criteria) this;
        }

        public Criteria andPubPrivNotBetween(Integer value1, Integer value2) {
            addCriterion("pub_priv not between", value1, value2, "pubPriv");
            return (Criteria) this;
        }

        public Criteria andPublishDateIsNull() {
            addCriterion("publish_date is null");
            return (Criteria) this;
        }

        public Criteria andPublishDateIsNotNull() {
            addCriterion("publish_date is not null");
            return (Criteria) this;
        }

        public Criteria andPublishDateEqualTo(Date value) {
            addCriterion("publish_date =", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotEqualTo(Date value) {
            addCriterion("publish_date <>", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateGreaterThan(Date value) {
            addCriterion("publish_date >", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateGreaterThanOrEqualTo(Date value) {
            addCriterion("publish_date >=", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateLessThan(Date value) {
            addCriterion("publish_date <", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateLessThanOrEqualTo(Date value) {
            addCriterion("publish_date <=", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateIn(List<Date> values) {
            addCriterion("publish_date in", values, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotIn(List<Date> values) {
            addCriterion("publish_date not in", values, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateBetween(Date value1, Date value2) {
            addCriterion("publish_date between", value1, value2, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotBetween(Date value1, Date value2) {
            addCriterion("publish_date not between", value1, value2, "publishDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andArticleUrlIsNull() {
            addCriterion("article_url is null");
            return (Criteria) this;
        }

        public Criteria andArticleUrlIsNotNull() {
            addCriterion("article_url is not null");
            return (Criteria) this;
        }

        public Criteria andArticleUrlEqualTo(String value) {
            addCriterion("article_url =", value, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlNotEqualTo(String value) {
            addCriterion("article_url <>", value, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlGreaterThan(String value) {
            addCriterion("article_url >", value, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlGreaterThanOrEqualTo(String value) {
            addCriterion("article_url >=", value, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlLessThan(String value) {
            addCriterion("article_url <", value, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlLessThanOrEqualTo(String value) {
            addCriterion("article_url <=", value, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlLike(String value) {
            addCriterion("article_url like", value, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlNotLike(String value) {
            addCriterion("article_url not like", value, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlIn(List<String> values) {
            addCriterion("article_url in", values, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlNotIn(List<String> values) {
            addCriterion("article_url not in", values, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlBetween(String value1, String value2) {
            addCriterion("article_url between", value1, value2, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleUrlNotBetween(String value1, String value2) {
            addCriterion("article_url not between", value1, value2, "articleUrl");
            return (Criteria) this;
        }

        public Criteria andArticleTabloidIsNull() {
            addCriterion("article_tabloid is null");
            return (Criteria) this;
        }

        public Criteria andArticleTabloidIsNotNull() {
            addCriterion("article_tabloid is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTabloidEqualTo(String value) {
            addCriterion("article_tabloid =", value, "articleTabloid");
            return (Criteria) this;
        }

        public Criteria andArticleTabloidNotEqualTo(String value) {
            addCriterion("article_tabloid <>", value, "articleTabloid");
            return (Criteria) this;
        }

        public Criteria andArticleTabloidGreaterThan(String value) {
            addCriterion("article_tabloid >", value, "articleTabloid");
            return (Criteria) this;
        }

        public Criteria andArticleTabloidGreaterThanOrEqualTo(String value) {
            addCriterion("article_tabloid >=", value, "articleTabloid");
            return (Criteria) this;
        }

        public Criteria andArticleTabloidLessThan(String value) {
            addCriterion("article_tabloid <", value, "articleTabloid");
            return (Criteria) this;
        }

        public Criteria andArticleTabloidLessThanOrEqualTo(String value) {
            addCriterion("article_tabloid <=", value, "articleTabloid");
            return (Criteria) this;
        }

        public Criteria andArticleTabloidLike(String value) {
            addCriterion("article_tabloid like", value, "articleTabloid");
            return (Criteria) this;
        }

        public Criteria andArticleTabloidNotLike(String value) {
            addCriterion("article_tabloid not like", value, "articleTabloid");
            return (Criteria) this;
        }

        public Criteria andArticleTabloidIn(List<String> values) {
            addCriterion("article_tabloid in", values, "articleTabloid");
            return (Criteria) this;
        }

        public Criteria andArticleTabloidNotIn(List<String> values) {
            addCriterion("article_tabloid not in", values, "articleTabloid");
            return (Criteria) this;
        }

        public Criteria andArticleTabloidBetween(String value1, String value2) {
            addCriterion("article_tabloid between", value1, value2, "articleTabloid");
            return (Criteria) this;
        }

        public Criteria andArticleTabloidNotBetween(String value1, String value2) {
            addCriterion("article_tabloid not between", value1, value2, "articleTabloid");
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

        public Criteria andLastArticleUuidIsNull() {
            addCriterion("last_article_uuid is null");
            return (Criteria) this;
        }

        public Criteria andLastArticleUuidIsNotNull() {
            addCriterion("last_article_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andLastArticleUuidEqualTo(String value) {
            addCriterion("last_article_uuid =", value, "lastArticleUuid");
            return (Criteria) this;
        }

        public Criteria andLastArticleUuidNotEqualTo(String value) {
            addCriterion("last_article_uuid <>", value, "lastArticleUuid");
            return (Criteria) this;
        }

        public Criteria andLastArticleUuidGreaterThan(String value) {
            addCriterion("last_article_uuid >", value, "lastArticleUuid");
            return (Criteria) this;
        }

        public Criteria andLastArticleUuidGreaterThanOrEqualTo(String value) {
            addCriterion("last_article_uuid >=", value, "lastArticleUuid");
            return (Criteria) this;
        }

        public Criteria andLastArticleUuidLessThan(String value) {
            addCriterion("last_article_uuid <", value, "lastArticleUuid");
            return (Criteria) this;
        }

        public Criteria andLastArticleUuidLessThanOrEqualTo(String value) {
            addCriterion("last_article_uuid <=", value, "lastArticleUuid");
            return (Criteria) this;
        }

        public Criteria andLastArticleUuidLike(String value) {
            addCriterion("last_article_uuid like", value, "lastArticleUuid");
            return (Criteria) this;
        }

        public Criteria andLastArticleUuidNotLike(String value) {
            addCriterion("last_article_uuid not like", value, "lastArticleUuid");
            return (Criteria) this;
        }

        public Criteria andLastArticleUuidIn(List<String> values) {
            addCriterion("last_article_uuid in", values, "lastArticleUuid");
            return (Criteria) this;
        }

        public Criteria andLastArticleUuidNotIn(List<String> values) {
            addCriterion("last_article_uuid not in", values, "lastArticleUuid");
            return (Criteria) this;
        }

        public Criteria andLastArticleUuidBetween(String value1, String value2) {
            addCriterion("last_article_uuid between", value1, value2, "lastArticleUuid");
            return (Criteria) this;
        }

        public Criteria andLastArticleUuidNotBetween(String value1, String value2) {
            addCriterion("last_article_uuid not between", value1, value2, "lastArticleUuid");
            return (Criteria) this;
        }

        public Criteria andNextArticleUuidIsNull() {
            addCriterion("next_article_uuid is null");
            return (Criteria) this;
        }

        public Criteria andNextArticleUuidIsNotNull() {
            addCriterion("next_article_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andNextArticleUuidEqualTo(String value) {
            addCriterion("next_article_uuid =", value, "nextArticleUuid");
            return (Criteria) this;
        }

        public Criteria andNextArticleUuidNotEqualTo(String value) {
            addCriterion("next_article_uuid <>", value, "nextArticleUuid");
            return (Criteria) this;
        }

        public Criteria andNextArticleUuidGreaterThan(String value) {
            addCriterion("next_article_uuid >", value, "nextArticleUuid");
            return (Criteria) this;
        }

        public Criteria andNextArticleUuidGreaterThanOrEqualTo(String value) {
            addCriterion("next_article_uuid >=", value, "nextArticleUuid");
            return (Criteria) this;
        }

        public Criteria andNextArticleUuidLessThan(String value) {
            addCriterion("next_article_uuid <", value, "nextArticleUuid");
            return (Criteria) this;
        }

        public Criteria andNextArticleUuidLessThanOrEqualTo(String value) {
            addCriterion("next_article_uuid <=", value, "nextArticleUuid");
            return (Criteria) this;
        }

        public Criteria andNextArticleUuidLike(String value) {
            addCriterion("next_article_uuid like", value, "nextArticleUuid");
            return (Criteria) this;
        }

        public Criteria andNextArticleUuidNotLike(String value) {
            addCriterion("next_article_uuid not like", value, "nextArticleUuid");
            return (Criteria) this;
        }

        public Criteria andNextArticleUuidIn(List<String> values) {
            addCriterion("next_article_uuid in", values, "nextArticleUuid");
            return (Criteria) this;
        }

        public Criteria andNextArticleUuidNotIn(List<String> values) {
            addCriterion("next_article_uuid not in", values, "nextArticleUuid");
            return (Criteria) this;
        }

        public Criteria andNextArticleUuidBetween(String value1, String value2) {
            addCriterion("next_article_uuid between", value1, value2, "nextArticleUuid");
            return (Criteria) this;
        }

        public Criteria andNextArticleUuidNotBetween(String value1, String value2) {
            addCriterion("next_article_uuid not between", value1, value2, "nextArticleUuid");
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