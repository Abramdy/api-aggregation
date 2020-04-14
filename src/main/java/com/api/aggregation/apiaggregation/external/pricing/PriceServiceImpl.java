package com.api.aggregation.apiaggregation.external.pricing;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static com.api.aggregation.apiaggregation.consts.AppConsts.COMMA;

@Slf4j
@Service
public class PriceServiceImpl implements PriceService {

    private static final String SERVICE_URL = "http://localhost:8080/pricing?q=";

    private static final Set<String> ISO_COUNTRIES = new HashSet<>(Arrays.asList(Locale.getISOCountries()));

    @Autowired
    RestTemplate template;

    @Override
    public String validateInput(String queryParam) {

        List<String> countryCodesList = Arrays.asList(queryParam.split(COMMA));
        return countryCodesList.stream()
                .filter(countryCode -> countryCode.length() == 2)
                .filter(countryCode -> ISO_COUNTRIES.contains(countryCode))
                .collect(Collectors.joining(COMMA));
    }

    public Map<String, Double>  getPriceInfo(String priceInfo) {

        Map<String, Double> response = template.getForObject( SERVICE_URL + priceInfo, Map.class);
        return response;
    }
}
