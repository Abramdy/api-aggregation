package com.api.aggregation.apiaggregation.controller.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PriceInfo {

    private Map<String, Double> priceMap;
}
