package com.example.infogempa.model.DetailGempa;

import com.google.gson.annotations.SerializedName;

public class Properties{

    @SerializedName("dmin")
    private Object dmin;

    @SerializedName("code")
    private String code;

    @SerializedName("sources")
    private String sources;

    @SerializedName("tz")
    private Object tz;

    @SerializedName("mmi")
    private Object mmi;

    @SerializedName("type")
    private String type;

    @SerializedName("title")
    private String title;

    @SerializedName("magType")
    private String magType;

    @SerializedName("nst")
    private int nst;

    @SerializedName("products")
    private Products products;

    @SerializedName("sig")
    private int sig;

    @SerializedName("tsunami")
    private String tsunami;

    @SerializedName("mag")
    private String mag;

    @SerializedName("alert")
    private Object alert;

    @SerializedName("gap")
    private int gap;

    @SerializedName("rms")
    private Object rms;

    @SerializedName("place")
    private String place;

    @SerializedName("net")
    private String net;

    @SerializedName("types")
    private String types;

    @SerializedName("felt")
    private int felt;

    @SerializedName("cdi")
    private int cdi;

    @SerializedName("url")
    private String url;

    @SerializedName("ids")
    private String ids;

    @SerializedName("time")
    private String time;

    @SerializedName("updated")
    private long updated;

    @SerializedName("status")
    private String status;

    @SerializedName("magnitude-type")
    private String magnitudeType;

    @SerializedName("origin-source")
    private String originSource;

    @SerializedName("quakeml-magnitude-publicid")
    private String quakemlMagnitudePublicid;

    @SerializedName("latitude")
    private String latitude;

    @SerializedName("magnitude-num-stations-used")
    private String magnitudeNumStationsUsed;

    @SerializedName("magnitude-source")
    private String magnitudeSource;

    @SerializedName("eventtime")
    private String eventtime;

    @SerializedName("eventsource")
    private String eventsource;

    @SerializedName("latitude-error")
    private String latitudeError;

    @SerializedName("pdl-client-version")
    private String pdlClientVersion;

    @SerializedName("standard-error")
    private String standardError;

    @SerializedName("eventParametersPublicID")
    private String eventParametersPublicID;

    @SerializedName("horizontal-error")
    private String horizontalError;

    @SerializedName("error-ellipse-azimuth")
    private String errorEllipseAzimuth;

    @SerializedName("eventsourcecode")
    private String eventsourcecode;

    @SerializedName("magnitude")
    private String magnitude;

    @SerializedName("longitude-error")
    private String longitudeError;

    @SerializedName("longitude")
    private String longitude;

    @SerializedName("minimum-distance")
    private String minimumDistance;

    @SerializedName("azimuthal-gap")
    private String azimuthalGap;

    @SerializedName("event-type")
    private String eventType;

    @SerializedName("quakeml-origin-publicid")
    private String quakemlOriginPublicid;

    @SerializedName("error-ellipse-minor")
    private String errorEllipseMinor;

    @SerializedName("depth-type")
    private String depthType;

    @SerializedName("error-ellipse-intermediate")
    private String errorEllipseIntermediate;

    @SerializedName("error-ellipse-major")
    private String errorEllipseMajor;

    @SerializedName("error-ellipse-rotation")
    private String errorEllipseRotation;

    @SerializedName("review-status")
    private String reviewStatus;

    @SerializedName("num-phases-used")
    private String numPhasesUsed;

    @SerializedName("num-stations-used")
    private String numStationsUsed;

    @SerializedName("quakeml-publicid")
    private String quakemlPublicid;

    @SerializedName("vertical-error")
    private String verticalError;

    @SerializedName("eventtime-error")
    private String eventtimeError;

    @SerializedName("depth")
    private String depth;

    @SerializedName("evaluation-status")
    private String evaluationStatus;

    @SerializedName("magnitude-error")
    private String magnitudeError;

    @SerializedName("error-ellipse-plunge")
    private String errorEllipsePlunge;

    @SerializedName("maxmmi")
    private String maxmmi;

    @SerializedName("num-responses")
    private String numResponses;

    @SerializedName("numResp")
    private String numResp;

    public Object getDmin(){
        return dmin;
    }

    public String getCode(){
        return code;
    }

    public String getSources(){
        return sources;
    }

    public Object getTz(){
        return tz;
    }

    public Object getMmi(){
        return mmi;
    }

    public String getType(){
        return type;
    }

    public String getTitle(){
        return title;
    }

    public String getMagType(){
        return magType;
    }

    public int getNst(){
        return nst;
    }

    public Products getProducts(){
        return products;
    }

    public int getSig(){
        return sig;
    }

    public void setTsunami(String tsunami){
        this.tsunami = tsunami;
    }

    public String getTsunami(){
        return tsunami;
    }

    public void setMag(String mag){
        this.mag = mag;
    }

    public String getMag(){
        return mag;
    }

    public Object getAlert(){
        return alert;
    }

    public int getGap(){
        return gap;
    }

    public Object getRms(){
        return rms;
    }

    public String getPlace(){
        return place;
    }

    public String getNet(){
        return net;
    }

    public String getTypes(){
        return types;
    }

    public int getFelt(){
        return felt;
    }

    public int getCdi(){
        return cdi;
    }

    public String getUrl(){
        return url;
    }

    public String getIds(){
        return ids;
    }

    public void setTime(String time){
        this.time = time;
    }

    public String getTime(){
        return time;
    }

    public long getUpdated(){
        return updated;
    }

    public String getStatus(){
        return status;
    }

    public String getMagnitudeType(){
        return magnitudeType;
    }

    public String getOriginSource(){
        return originSource;
    }

    public String getQuakemlMagnitudePublicid(){
        return quakemlMagnitudePublicid;
    }

    public String getLatitude(){
        return latitude;
    }

    public String getMagnitudeNumStationsUsed(){
        return magnitudeNumStationsUsed;
    }

    public String getMagnitudeSource(){
        return magnitudeSource;
    }

    public String getEventtime(){
        return eventtime;
    }

    public String getEventsource(){
        return eventsource;
    }

    public String getLatitudeError(){
        return latitudeError;
    }

    public String getPdlClientVersion(){
        return pdlClientVersion;
    }

    public String getStandardError(){
        return standardError;
    }

    public String getEventParametersPublicID(){
        return eventParametersPublicID;
    }

    public String getHorizontalError(){
        return horizontalError;
    }

    public String getErrorEllipseAzimuth(){
        return errorEllipseAzimuth;
    }

    public String getEventsourcecode(){
        return eventsourcecode;
    }

    public String getMagnitude(){
        return magnitude;
    }

    public String getLongitudeError(){
        return longitudeError;
    }

    public String getLongitude(){
        return longitude;
    }

    public String getMinimumDistance(){
        return minimumDistance;
    }

    public String getAzimuthalGap(){
        return azimuthalGap;
    }

    public String getEventType(){
        return eventType;
    }

    public String getQuakemlOriginPublicid(){
        return quakemlOriginPublicid;
    }

    public String getErrorEllipseMinor(){
        return errorEllipseMinor;
    }

    public String getDepthType(){
        return depthType;
    }

    public String getErrorEllipseIntermediate(){
        return errorEllipseIntermediate;
    }

    public String getErrorEllipseMajor(){
        return errorEllipseMajor;
    }

    public String getErrorEllipseRotation(){
        return errorEllipseRotation;
    }

    public String getReviewStatus(){
        return reviewStatus;
    }

    public String getNumPhasesUsed(){
        return numPhasesUsed;
    }

    public String getNumStationsUsed(){
        return numStationsUsed;
    }

    public String getQuakemlPublicid(){
        return quakemlPublicid;
    }

    public String getVerticalError(){
        return verticalError;
    }

    public String getEventtimeError(){
        return eventtimeError;
    }

    public String getDepth(){
        return depth;
    }

    public String getEvaluationStatus(){
        return evaluationStatus;
    }

    public String getMagnitudeError(){
        return magnitudeError;
    }

    public String getErrorEllipsePlunge(){
        return errorEllipsePlunge;
    }

    public String getMaxmmi(){
        return maxmmi;
    }

    public String getNumResponses(){
        return numResponses;
    }

    public String getNumResp(){
        return numResp;
    }
}