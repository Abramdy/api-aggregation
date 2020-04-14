package com.api.aggregation.apiaggregation.service;

import com.api.aggregation.apiaggregation.controller.api.AggregationResponse;
import com.api.aggregation.apiaggregation.external.pricing.PriceService;
import com.api.aggregation.apiaggregation.external.shipments.ShipmentService;
import com.api.aggregation.apiaggregation.external.track.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AggregationServiceImpl implements AggregationService {

    private @Autowired PriceService priceService;
    private @Autowired ShipmentService shipmentService;
    private @Autowired TrackService trackService;

    @Override
    public ResponseEntity<AggregationResponse> getAggregationsInfo(final String pricing, final String track,
                                                                   final String shipments) {

        String validPriceInput = priceService.validateInput(pricing);
        Map<String, Double> priceInfo =  priceService.getPriceInfo(validPriceInput);

        String validShipmentInput = shipmentService.validateInput(shipments);
        Map<String, List<String>> shipmentInfo = shipmentService.getShipmentInfo(validShipmentInput);

        String validTrackInput = trackService.validateInput(track);
        Map<String, String> trackInfo = trackService.getTrackInfo(validTrackInput);

        AggregationResponse response = prepareResponse(priceInfo, shipmentInfo, trackInfo);

        return ResponseEntity.ok().body(response);

    }

    private AggregationResponse prepareResponse(final Map<String, Double> priceInfo,
                                                final Map<String, List<String>> shipmentInfo,
                                                final Map<String, String> trackInfo) {

        AggregationResponse response = new AggregationResponse();
        response.setPriceMap(priceInfo);
        response.setShipmentInfo(shipmentInfo);
        response.setTrackInfo(trackInfo);
        return response;
    }


}
