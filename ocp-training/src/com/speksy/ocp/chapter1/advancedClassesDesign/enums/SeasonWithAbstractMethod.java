package com.speksy.ocp.chapter1.advancedClassesDesign.enums;

public enum SeasonWithAbstractMethod {
    WINTER {
        public void printHours() {
            System.out.println("9am-3pm");
        }
    }, SPRING {
        public void printHours() {
            System.out.println("9am-5pm");
        }
    }, SUMMER {
        public void printHours() {
            System.out.println("9am-7pm");
        }
    }, FALL {
        public void printHours() {
            System.out.println("9am-3pm");
        }
    };

    public abstract void printHours();
}
