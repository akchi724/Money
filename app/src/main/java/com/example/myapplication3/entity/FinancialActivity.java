package com.example.myapplication3.entity;

import java.math.BigDecimal;
import java.util.Date;

public class FinancialActivity {
    public double sum;
    public String name;
    public String category;
    public boolean isIncome; //Является ли доходом
    public String frequency; //Частота финансовой активности
    public FrequencyEntity frequencyEntity;

    public FinancialActivity(double sum, String name, boolean isIncome, String frequency, FrequencyEntity frequencyEntity) {
        this.sum = sum;
        this.name = name;
        this.isIncome = isIncome;
        this.frequency = frequency;
        this.frequencyEntity = frequencyEntity;
    }
}
