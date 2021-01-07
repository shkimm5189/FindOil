package com.oil.OilFinding.enumClass;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {
    GUEST("ROLE_GEUST" , "손님");


    private final String key;
    private final String title;
}
