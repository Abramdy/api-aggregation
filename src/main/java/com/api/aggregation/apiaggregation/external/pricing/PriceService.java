package com.api.aggregation.apiaggregation.external.pricing;

import java.util.Map;

public interface PriceService {

    String validateInput(String queryParam);

    Map<String, Double> getPriceInfo(String priceInfo);
}
