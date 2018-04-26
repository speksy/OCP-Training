package com.speksy.ocp.chapter1.advancedClassesDesign.nestedClasses.memberInnerClasses.anonymousInnerClasses;

public class AnonInner {
    abstract class SaleTodayOnly {
        abstract int dollarsOff();
    }

    interface SaleTodayOnlyI {
        int dollarsOff();
    }
    public int admission(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly() {
            @Override
            int dollarsOff() {
                return 3;
            }
        };
        return basePrice - sale.dollarsOff();
    }

    public int admissionI(int basePrice) {
        SaleTodayOnlyI sale = new SaleTodayOnlyI() {
            // method should have public modifier because interfaces requires it
            @Override
            public int dollarsOff() {
                return 3;
            }
        };
        return basePrice - sale.dollarsOff();
    }

    public int pay(){
        return admission(5, new SaleTodayOnly(){
           public int dollarsOff(){
             return 3;
           }
        });
    }

    public int admission(int basePrice, SaleTodayOnly sale){
        return basePrice - sale.dollarsOff();
    }
}
