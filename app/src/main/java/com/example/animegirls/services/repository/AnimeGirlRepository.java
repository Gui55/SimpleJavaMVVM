package com.example.animegirls.services.repository;

import androidx.lifecycle.MutableLiveData;

import com.example.animegirls.services.model.AnimeGirl;

import java.util.ArrayList;

public class AnimeGirlRepository {

    static AnimeGirlRepository INSTANCE;

    public static AnimeGirlRepository getInstance(){

        if(INSTANCE==null){
            INSTANCE = new AnimeGirlRepository();
        }

        return INSTANCE;

    }

    public MutableLiveData<ArrayList<AnimeGirl>> getTheGirls(){

        ArrayList<AnimeGirl> girlArrayList = new ArrayList<>();

        girlArrayList.add(new AnimeGirl("Sakura", "Naruto"));
        girlArrayList.add(new AnimeGirl("Emilia", "Re: Zero"));
        girlArrayList.add(new AnimeGirl("Misty", "Pokemon"));

        MutableLiveData<ArrayList<AnimeGirl>> girlsLiveData = new MutableLiveData<>();

        girlsLiveData.setValue(girlArrayList);

        return girlsLiveData;
    }

}
