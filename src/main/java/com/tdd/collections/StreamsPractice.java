package com.tdd.collections;

import com.tdd.entity.Address;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsPractice {

    /**
     * TODO : use java 8 stream to implement this method
     * @param addresses
     * @return
     */
    public static List<String> countries(List<Address> addresses) {

        List<String> country=addresses.stream().map(obj -> obj.getCountry()).distinct().collect(Collectors.toList());
        return country;
    }

}
