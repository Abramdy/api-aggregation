package com.api.aggregation.apiaggregation.external.shipments;

import java.util.List;
import java.util.Map;

public interface ShipmentService {

    String validateInput(String queryParam);

    Map<String, List<String>> getShipmentInfo(String shipmentInfo);
}
