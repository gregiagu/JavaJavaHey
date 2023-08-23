package io.github.gregiagu.oop;

public class EnclosingClass {
    public static class StaticNestedClass {
        public String run() {
            return "Running a nested class";
        }
    }
    public class InnerClass {
        public boolean isRunning() {
            return true;
        }
    }
}
