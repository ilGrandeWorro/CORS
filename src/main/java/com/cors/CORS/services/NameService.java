package com.cors.CORS.services;

import org.springframework.stereotype.Service;

@Service
public class NameService {

    public String getReverseName(StringBuilder name) {
        return String.valueOf(name.reverse());
    }

    public String getNormalName(String name) {
        return name;
    }
}
