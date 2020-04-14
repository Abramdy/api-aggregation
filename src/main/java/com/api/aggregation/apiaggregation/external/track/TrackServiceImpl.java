package com.api.aggregation.apiaggregation.external.track;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.api.aggregation.apiaggregation.consts.AppConsts.COMMA;

@Slf4j
@Service
public class TrackServiceImpl implements TrackService {

    private static final String SERVICE_URL = "http://localhost:8080/track?q=";

    @Autowired
    RestTemplate template;

    @Override
    public String validateInput(String queryParam) {

        List<String> orderNumbers = Arrays.asList(queryParam.split(COMMA));

        return orderNumbers.stream()
                .filter(orderNumber -> orderNumber.length() == 9)
                .collect(Collectors.joining(COMMA));
    }

    @Override
    public Map<String, String>  getTrackInfo(String trackValue) {

        Map<String, String> response = template.getForObject( SERVICE_URL + trackValue, Map.class);
        return response;
    }
}
