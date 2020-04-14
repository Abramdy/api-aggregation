package com.api.aggregation.apiaggregation.controller.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrackInfo {

    public enum TrackStatus {
        NEW, IN, TRANSIT, COLLECTING, COLLECTED, DELIVERING, DELIVERED;
    }

    private Map<String, String> trackInfo;
}
