package com.api.aggregation.apiaggregation.external.track;

import java.util.Map;

public interface TrackService {
    String validateInput(String queryParam);

    Map<String, String> getTrackInfo(String trackValue);
}
