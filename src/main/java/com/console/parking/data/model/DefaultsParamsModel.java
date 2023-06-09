package com.console.parking.data.model;

import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Data
public class DefaultsParamsModel {

    private Integer index;

    private Integer items;

    private String sort;

    private String direction;

    private Date startDate;

    private Date endDate;

    private String search;

    private Integer month;

    private Integer year;

    public DefaultsParamsModel(Map<String, Object> queryParams){
        this.setIndex(queryParams.containsKey("index") ? Integer.parseInt((String)queryParams.get("index")) : 0);
        this.setItems(queryParams.containsKey("items") ? Integer.parseInt((String) queryParams.get("items")) : 10);
        this.setSort(queryParams.containsKey("sort") ? (String) queryParams.get("sort") : "id");
        this.setDirection(queryParams.containsKey("direction") ? (String) queryParams.get("direction") : "DESC");
        this.setSearch(queryParams.containsKey("search") ? (String)queryParams.get("search") : null);
        this.setMonth(queryParams.containsKey("month") ? Integer.valueOf((String) queryParams.get("month")) : null);
        this.setYear(queryParams.containsKey("year") ? Integer.valueOf((String) queryParams.get("year")) : null);
        try{
            this.setStartDate(queryParams.containsKey("startDate") ? new SimpleDateFormat("MM/dd/yyyy").parse((String) queryParams.get("startDate")) : null);
            this.setEndDate(queryParams.containsKey("endDate") ? new SimpleDateFormat("MM/dd/yyyy").parse((String) queryParams.get("endDate")) : null);
        }catch (Exception e){
            this.setStartDate(null);
            this.setEndDate(null);
            e.printStackTrace();
        }
    }

}
