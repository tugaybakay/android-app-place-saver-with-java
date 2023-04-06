package com.tugaybakay.javamaps.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.tugaybakay.javamaps.model.Place;

import java.util.List;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;

@Dao
public interface PlaceDao {

    @Query("select * from place")
    Flowable<List<Place>> selectAll();

    @Insert
    Completable insert(Place place);
}
