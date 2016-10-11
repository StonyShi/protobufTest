package com.stone;

import com.google.protobuf.InvalidProtocolBufferException;
import com.stone.entity.SearchRequestOuterClass;

/**
 * <p>Created with IntelliJ IDEA. </p>
 * <p>User: Stony </p>
 * <p>Date: 2016/8/30 </p>
 * <p>Time: 11:34 </p>
 * <p>Version: 1.0.0 </p>
 */
public class SearchRequestTest {
    public static void main(String[] args) throws InvalidProtocolBufferException {
        SearchRequestOuterClass.SearchRequest searchRequest =
                SearchRequestOuterClass.SearchRequest.newBuilder()
                        .setCorpus(SearchRequestOuterClass.SearchRequest.Corpus.NEWS)
                        .setQuery("Blue")
                        .setPageNumber(1)
                        .setResultPerPage(10)
                        .build();

        System.out.println("---------------------");
        System.out.println(searchRequest.toByteArray());

        System.out.println("---------------------");
        System.out.println(SearchRequestOuterClass.SearchRequest.parseFrom(searchRequest.toByteArray()));

    }
}
