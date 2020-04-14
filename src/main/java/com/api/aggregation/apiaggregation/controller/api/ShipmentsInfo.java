package com.api.aggregation.apiaggregation.controller.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ShipmentsInfo {

    Map<String, List<String>> shipmentInfo;
}
