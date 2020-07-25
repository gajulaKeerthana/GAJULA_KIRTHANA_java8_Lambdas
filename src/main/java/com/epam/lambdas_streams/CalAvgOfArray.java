package com.epam.lambdas_streams;

import java.util.*;
import java.util.stream.*;

public class CalAvgOfArray {
    public static void main(String args[])
    {
        IntStream Array = IntStream.of(8,45,6,2,34,12,98,26);

        OptionalDouble avg = Array.average();
        if(avg.isPresent()) {
            System.out.println(avg.getAsDouble() + "is the average");
        } else {
            System.out.println(-1);
        }
    }
}