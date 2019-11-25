package com.Mobileshop.http.service;


import com.Mobileshop.http.entity.CategoryEntity;
import com.Mobileshop.http.entity.HttpResult;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

import java.util.List;

public interface CategoryService {

    @GET("cat/show")
    Observable<HttpResult<List<CategoryEntity>>> getTopList();

    @GET("cat/show/{parentId}")
    Observable<HttpResult<List<CategoryEntity>>> getSecondList(
            @Path("parentId") int parentId
    );
}
