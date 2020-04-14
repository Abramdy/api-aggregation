package com.api.aggregation.apiaggregation.consts;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.regex.Pattern;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AppConsts {

    public static final String COMMA = ",";

    public static final Pattern NINE_DIGIT_NUMBER_PATTERN = Pattern.compile("[0-9]{9}");
}
