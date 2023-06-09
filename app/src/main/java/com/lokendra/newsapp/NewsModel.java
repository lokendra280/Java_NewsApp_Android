package com.lokendra.newsapp;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class NewsModel {
    private  int totalResults;
    private  String status;
    private ArrayList<Articles> articles;

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setArticles(ArrayList<Articles> articles) {
        this.articles = articles;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public String getStatus() {
        return status;
    }

    public ArrayList<Articles> getArticles() {
        return articles;
    }

    public NewsModel(int totalResults, String status, ArrayList<Articles> articles) {
        this.totalResults = totalResults;
        this.status = status;
        this.articles = articles;
    }
}
