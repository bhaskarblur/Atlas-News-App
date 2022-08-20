package com.papersstudio.atlas.Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class newsModel {

    public class newsListModel{
        @SerializedName("status")
        private String status;
        private List<articlesList> newsList;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public List<articlesList> getNewsList() {
            return newsList;
        }

        public void setNewsList(List<articlesList> newsList) {
            this.newsList = newsList;
        }

        public class articlesList{
            @SerializedName("source")
            private List<sourceModel> sourceList;
            private String author;
            private String title;
            private String description;

            public List<sourceModel> getSourceList() {
                return sourceList;
            }

            public void setSourceList(List<sourceModel> sourceList) {
                this.sourceList = sourceList;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getUrlToImage() {
                return urlToImage;
            }

            public void setUrlToImage(String urlToImage) {
                this.urlToImage = urlToImage;
            }

            public String getPublishedAt() {
                return publishedAt;
            }

            public void setPublishedAt(String publishedAt) {
                this.publishedAt = publishedAt;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            private String url;
            private String urlToImage;
            private String publishedAt;
            private String content;


            public class sourceModel {
                private String id;
                private String name;
            }
        }
    }



}
