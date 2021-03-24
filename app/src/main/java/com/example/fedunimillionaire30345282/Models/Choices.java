package com.example.fedunimillionaire30345282.Models;

public class Choices {
    private String Option;
    private String Value;

    public Choices(String option, String value) {
        this.Option = option;
        this.Value = value;
    }

    public String getOption() {
        return Option;
    }

    public String getValue() {
        return Value;
    }

    public void setOption(String option) {
        Option = option;
    }

    public void setValue(String value) {
        Value = value;
    }
}
