package com.api.aggregation.apiaggregation.controller;

import com.api.aggregation.apiaggregation.controller.api.AggregationResponse;
import com.api.aggregation.apiaggregation.service.AggregationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class AggregationController {

    private final AggregationService aggregationService;

    @GetMapping(value = "/aggregation", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AggregationResponse> getAggregationsInfo(@RequestParam String pricing,
                                                                   @RequestParam String track,
                                                                   @RequestParam String shipments) {

        return this.aggregationService.getAggregationsInfo(pricing, track, shipments);

    }
}
