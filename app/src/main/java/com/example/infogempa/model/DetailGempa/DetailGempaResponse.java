package com.example.infogempa.model.DetailGempa;

import com.google.gson.annotations.SerializedName;

public class DetailGempaResponse{

    @SerializedName("geometry")
    private Geometry geometry;

    @SerializedName("id")
    private String id;

    @SerializedName("type")
    private String type;

    @SerializedName("properties")
    private Properties properties;

    public Geometry getGeometry(){
        return geometry;
    }

    public String getId(){
        return id;
    }

    public String getType(){
        return type;
    }

    public Properties getProperties(){
        return properties;
    }
}