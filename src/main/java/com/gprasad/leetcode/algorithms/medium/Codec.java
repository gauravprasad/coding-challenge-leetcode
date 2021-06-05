package com.gprasad.leetcode.algorithms.medium;

import java.util.HashMap;
import java.util.Map;

public class Codec {
    private String random = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
    private Map<String, String> tinyUrlMap = new HashMap<>();
    private final String prefix = "http://tinyurl.com/";

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String key = prefix.concat(String.valueOf(longUrl.hashCode()));
        tinyUrlMap.put(key, longUrl);
        return key;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return tinyUrlMap.get(shortUrl);
    }

    /*private String getRandomString() {
        return IntStream.range(0, 8).mapToObj(x -> String.valueOf(random.charAt(new Random().ints(0, 61).findFirst().getAsInt()))).reduce((a, b) -> a + b).get();
    }*/
}
