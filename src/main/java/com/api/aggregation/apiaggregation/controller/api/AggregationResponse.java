package com.api.aggregation.apiaggregation.controller.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@NoArgsConstructor
@Data
public class AggregationResponse {

    @JsonProperty(value = "pricing")
    private Map<String, Double> priceMap;

    @JsonProperty(value = "shipments")
    Map<String, List<String>> shipmentInfo;

    @JsonProperty(value = "track")
    private Map<String, String> trackInfo;

}
