package com.Mobileshop.http.presenter;


import com.Mobileshop.http.HttpMethods;
import com.Mobileshop.http.entity.CategoryEntity;
import rx.Observable;
import rx.Subscriber;

import java.util.List;

public class CategoryPresenter extends HttpMethods {

    public static void getTopList(Subscriber<List<CategoryEntity>> subscriber) {
        Observable<List<CategoryEntity>> observable = categoryService.getTopList()
                .map(new HttpMethods.HttpResultFunc<List<CategoryEntity>>());
        toSubscribe(observable, subscriber);
    }
    public static void getSecondList(Subscriber<List<CategoryEntity>> subscriber, int parentId) {
        Observable<List<CategoryEntity>> observable = categoryService.getSecondList(parentId)
                .map(new HttpMethods.HttpResultFunc<List<CategoryEntity>>());
        toSubscribe(observable, subscriber);
    }

}
