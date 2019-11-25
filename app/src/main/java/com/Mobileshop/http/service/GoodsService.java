package com.Mobileshop.http.service;


import com.Mobileshop.http.entity.GoodsEntity;
import com.Mobileshop.http.entity.HttpResult;
import retrofit2.http.*;
import rx.Observable;

import java.util.List;

public interface GoodsService {
    @FormUrlEncoded
    @POST("goods/find")
    Observable<HttpResult<List<GoodsEntity>>> listByKeywords(
            @Field("input") String keywords
    );

    @GET("goods/cat/{catId}")
    Observable<HttpResult<List<GoodsEntity>>> list(
            @Path("catId") int catId
    );
}
