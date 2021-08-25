package io.codebyexample.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

  public static void hashMap() {
    Map<Integer,String>  map = new HashMap<>();
    map.put(1, "a");
    map.put(11111, "a1");
    map.put(2, "b");
    map.put(2222, "b2");
    map.put(3, "c");
    map.put(333, "c3");

    System.out.println("HashMap");
    for (Map.Entry<Integer,String> entry : map.entrySet()) {
      System.out.println("Entry <"+ entry.getKey() +"," + entry.getValue() +">");

    }
  }

  public static void linkedHashMap() {
    Map<Integer,String>  map = new LinkedHashMap<>();
    map.put(1, "a");
    map.put(11111, "a1");
    map.put(2, "b");
    map.put(2222, "b2");
    map.put(3, "c");
    map.put(333, "c3");

    System.out.println("LinkedHashMap");
    for (Map.Entry<Integer,String> entry : map.entrySet()) {
      System.out.println("Entry <"+ entry.getKey() +"," + entry.getValue() +">");

    }
  }

  public static void treeMap() {
    Map<Integer,String>  map = new TreeMap<>();
    map.put(1, "a");
    map.put(11111, "a1");
    map.put(2, "b");
    map.put(2222, "b2");
    map.put(3, "c");
    map.put(333, "c3");

    System.out.println("TreeMap");
    for (Map.Entry<Integer,String> entry : map.entrySet()) {
      System.out.println("Entry <"+ entry.getKey() +"," + entry.getValue() +">");

    }
  }

  public static void main(String[] args) {
    hashMap();
    linkedHashMap();
    treeMap();
  }
}
