package com.Mobileshop.http.presenter;


import com.Mobileshop.http.HttpMethods;
import com.Mobileshop.http.entity.GoodsEntity;
import rx.Observable;
import rx.Subscriber;

import java.util.List;

public class GoodsPresenter extends HttpMethods {
    public static void listByKeywords(Subscriber<List<GoodsEntity>> subscriber, String keywords){

        Observable<List<GoodsEntity>> observable = goodsService.listByKeywords(keywords)
                .map(new HttpMethods.HttpResultFunc<List<GoodsEntity>>());
        toSubscribe(observable, subscriber);
    }

    public static void list(Subscriber<List<GoodsEntity>> subscriber, int catId){
        Observable<List<GoodsEntity>> observable = goodsService.list(catId)
                .map(new HttpMethods.HttpResultFunc<List<GoodsEntity>>());
        toSubscribe(observable, subscriber);
    }
}
