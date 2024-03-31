package main.java;

public class Main {
    public static void main(String[] args) {
        TestArrayToMap testArrayToMap = new TestArrayToMap();
        Object array[] = new Object[]{"test", 1, 3, "test", 1};

        System.out.println(testArrayToMap.arrayToMap(array));
    }
}
