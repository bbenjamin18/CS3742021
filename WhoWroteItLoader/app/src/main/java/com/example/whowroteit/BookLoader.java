package com.example.whowroteit;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

public class BookLoader extends AsyncTaskLoader<String> {

    private String mQueryString;

    @Nullable
    @Override
    public String loadInBackground(){
        return NetworkUtils.getBookInfo(mQueryString);
    }

    public BookLoader(@NonNull Context context){
        super(context);

    }

    @Override
    protected void onStartLoading(){
        super.onStartLoading();
        forceLoad();
    }

    BookLoader(Context context, String queryString){
        super(context);
        mQueryString = queryString;
    }
}