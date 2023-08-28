package io.github.gregiagu.oop;

import java.io.Serializable;

public class SimplePlainEasy implements Serializable {
    private boolean simple;
    private boolean plain;
    private boolean easy;

    public SimplePlainEasy() {
        this.simple = false;
        this.plain = false;
        this.easy = false;
    }

    public SimplePlainEasy(SimplePlainEasy spe) {
        this.simple = spe.isSimple();
        this.plain = spe.isPlain();
        this.easy = spe.isEasy();
    }

    public boolean isSimple() {
        return simple;
    }

    public void setSimple(boolean simple) {
        this.simple = simple;
    }

    public boolean isPlain() {
        return plain;
    }

    public void setPlain(boolean plain) {
        this.plain = plain;
    }

    public boolean isEasy() {
        return easy;
    }

    public void setEasy(boolean easy) {
        this.easy = easy;
    }
}
