package com.tugaybakay.maps.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "place")
public class Place{
    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name="name")
    public String name;

    @ColumnInfo(name="latitute")
    public double latitute;

    @ColumnInfo(name="longitute")
    public double longitute;

    public Place(String name, double latitute ,double longitute){
        this.name=name;
        this.latitute=latitute;
        this.longitute=longitute;
    }
}
