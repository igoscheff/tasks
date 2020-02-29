package com.telran;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatedNumbers {

    public int getRepeatedNumbers(List<Integer> ints) {
        Map<Integer, Integer> qtyByNumber = new HashMap<>();
        for (int num : ints) {
            if (!qtyByNumber.containsKey(num)) {
                qtyByNumber.put(num, 1);
            } else {
                qtyByNumber.put(num, qtyByNumber.get(num) + 1);
            }
        }

        int res = 0;
        for (int key : qtyByNumber.keySet()) {
            if (qtyByNumber.get(key) > 1) {
                res++;
            }
        }
        return res;
    }

    public int getSingleNumber(List<Integer> ints) {
        Map<Integer, Integer> qtyByNumber = new HashMap<>();

        for (int num : ints) {
            if (!qtyByNumber.containsKey(num)) {
                qtyByNumber.put(num, 1);
            } else {
                qtyByNumber.put(num, qtyByNumber.get(num) + 1);
            }
        }

        for (int num : qtyByNumber.keySet()) {
            if (qtyByNumber.get(num) % 2 == 1)
                return num;
        }
        return 0;
    }

    public int getSingleNumberAdvanced(List<Integer> ints) {
        int res = 0;
        for (int num : ints) {
            res ^= num;
        }
        return res;
    }
}
