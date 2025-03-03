package com.luzianu;

public class UserVariable {
    public final static String MIN_STREAM_BPM = "minStreamBpm";
    public final static String MAX_STREAM_BPM = "maxStreamBpm";
    public final static String DELTA_VARIATION = "deltaVariation";
    public final static String BPM_CHANGE_THRESHOLD = "bpmChangeThreshold";
    public final static String BPM_COMPLEX_THRESHOLD = "bpmComplexThreshold";
    public final static String MIN_STREAM_PERCENTAGE = "minStreamPercentage";
    public final static String MAX_STREAM_PERCENTAGE = "maxStreamPercentage";
    public final static String MIN_STREAM_LENGTH_AT_LEAST = "minStreamLengthAtLeast";
    public final static String MAX_STREAM_LENGTH_ALL = "maxStreamLengthAll";
    public final static String PRINT_STREAMS = "printStreams";
    public final static String PRINT_STREAM_THRESHOLD = "printStreamThreshold";
    public final static String CUSTOM_COMPLEX = "customComplex";
    public final static String WEIGHT_CUSTOM = "weightCustom";
    public final static String CUSTOM_COMPLEX_MIN = "customComplexMin";
    public final static String CUSTOM_COMPLEX_MAX = "customComplexMax";
    public final static String WEIGHT_1 = "weight1";
    public final static String WEIGHT_1_5 = "weight1.5";
    public final static String WEIGHT_2 = "weight2";
    public final static String WEIGHT_3 = "weight3";
    public final static String WEIGHT_4 = "weight4";
    public final static String WEIGHT_5 = "weight5";
    public final static String WEIGHT_6 = "weight6";
    public final static String WEIGHT_7 = "weight7";
    public final static String WEIGHT_8 = "weight8";
    public final static String WEIGHT_9 = "weight9";
    public final static String WEIGHT_12 = "weight12";
    public final static String WEIGHT_16 = "weight16";
    public final static String BROADEN_SEARCH = "broadenSearch";

    public String name;
    public double value;
    public String description;
    public int orderInUi;
    public boolean isDouble;

    public UserVariable(String name, double value, String description, int orderInUi, boolean isDouble) {
        this.name = name;
        this.value = value;
        this.description = description;
        this.orderInUi = orderInUi;
        this.isDouble = isDouble;
    }

}




