package com.example.animegirls.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.animegirls.services.model.AnimeGirl;
import com.example.animegirls.services.repository.AnimeGirlRepository;

import java.util.ArrayList;

public class MainViewModel extends ViewModel {

    public MutableLiveData<ArrayList<AnimeGirl>> getRepositoryGirls(){

        return AnimeGirlRepository.getInstance().getTheGirls();

    }

}
