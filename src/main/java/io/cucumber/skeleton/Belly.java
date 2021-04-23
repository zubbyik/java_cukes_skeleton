package io.cucumber.skeleton;

public class Belly {
    int belly_size;
    public void eat(int cukes) {
        belly_size += cukes;
    }

    public int grow(){
        return belly_size;
    }
}
