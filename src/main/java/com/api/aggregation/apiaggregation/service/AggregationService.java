package com.api.aggregation.apiaggregation.service;

import com.api.aggregation.apiaggregation.controller.api.AggregationResponse;
import org.springframework.http.ResponseEntity;

public interface AggregationService {

    ResponseEntity<AggregationResponse> getAggregationsInfo(String pricing, String track, String shipments);
}
