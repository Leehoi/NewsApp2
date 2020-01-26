/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.newsapp;

/**
 * An {@link News} object contains information related to a single earthquake.
 */
public class News {

    /** Title of the news */
    private String mTitle;

    /** References of the news */
    private String mAuthor;

    /** Publication date of the news */
    private String mPublicationDate;

    /** Website URL of the news */
    private String mUrl;

    /**
     * Constructs a new {@link News} object.
     *

     * @param webTitle is the title of the news.
     * @param author is the author of the news.
     * @param webPublicationDate is the publication time of the news.
     * @param webUrl is the website URL to find more information about the news.
     */
    public News(String webTitle, String author, String webPublicationDate, String webUrl) {
        mTitle = webTitle;
        mAuthor = author;
        mPublicationDate = webPublicationDate;
        mUrl = webUrl;
    }

    /**
     * Returns the title of the news.
     */
    public String getWebTitle() {
        return mTitle;
    }

    /**
     * Returns the author of the news.
     */
    public String getAuthor() {
        return mAuthor;
    }

    /**
     * Returns the publication time of the news.
     */
    public String getPublicationDate() {
        return mPublicationDate;
    }

    /**
     * Returns the website URL to find more information about the news.
     */
    public String getUrl() {
        return mUrl;
    }
}
