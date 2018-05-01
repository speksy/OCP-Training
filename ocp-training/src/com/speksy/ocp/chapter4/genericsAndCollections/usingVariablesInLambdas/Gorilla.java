package com.speksy.ocp.chapter4.genericsAndCollections.usingVariablesInLambdas;

interface Gorilla {
    String move();
}

class GorillaFamily {
    String walk = "walk";

    void everyOnePlay(boolean baby) {
        String approach = "amble";
        // aproach = "run";

        play(() -> walk);
        play(() -> baby ? "hitch a ride" : "run");
        play(() -> approach);
    }

    void play(Gorilla g) {
        System.out.println(g.move());
    }
}
