package com.example.bootweb.com.yk.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Article implements Serializable {
    private Integer id;

    private String articleUuid;

    private String author;

    private String originalAuthor;

    private String articleTitle;

    private String aritcleSign;

    private String articleContent;

    private String articleTags;

    private String articleType;

    private String articleCategories;

    private Integer pubPriv;

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date publishDate;

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date updateDate;

    private String articleUrl;

    private String articleTabloid;

    private Integer likes;

    private String lastArticleUuid;

    private String nextArticleUuid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArticleUuid() {
        return articleUuid;
    }

    public void setArticleUuid(String articleUuid) {
        this.articleUuid = articleUuid == null ? null : articleUuid.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getOriginalAuthor() {
        return originalAuthor;
    }

    public void setOriginalAuthor(String originalAuthor) {
        this.originalAuthor = originalAuthor == null ? null : originalAuthor.trim();
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    public String getAritcleSign() {
        return aritcleSign;
    }

    public void setAritcleSign(String aritcleSign) {
        this.aritcleSign = aritcleSign == null ? null : aritcleSign.trim();
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent == null ? null : articleContent.trim();
    }

    public String getArticleTags() {
        return articleTags;
    }

    public void setArticleTags(String articleTags) {
        this.articleTags = articleTags == null ? null : articleTags.trim();
    }

    public String getArticleType() {
        return articleType;
    }

    public void setArticleType(String articleType) {
        this.articleType = articleType == null ? null : articleType.trim();
    }

    public String getArticleCategories() {
        return articleCategories;
    }

    public void setArticleCategories(String articleCategories) {
        this.articleCategories = articleCategories == null ? null : articleCategories.trim();
    }

    public Integer getPubPriv() {
        return pubPriv;
    }

    public void setPubPriv(Integer pubPriv) {
        this.pubPriv = pubPriv;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getArticleUrl() {
        return articleUrl;
    }

    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl == null ? null : articleUrl.trim();
    }

    public String getArticleTabloid() {
        return articleTabloid;
    }

    public void setArticleTabloid(String articleTabloid) {
        this.articleTabloid = articleTabloid == null ? null : articleTabloid.trim();
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public String getLastArticleUuid() {
        return lastArticleUuid;
    }

    public void setLastArticleUuid(String lastArticleUuid) {
        this.lastArticleUuid = lastArticleUuid == null ? null : lastArticleUuid.trim();
    }

    public String getNextArticleUuid() {
        return nextArticleUuid;
    }

    public void setNextArticleUuid(String nextArticleUuid) {
        this.nextArticleUuid = nextArticleUuid == null ? null : nextArticleUuid.trim();
    }
}