package com.github.bingoohuang.solr.resp.bin;

import com.google.gson.GsonBuilder;
import org.apache.solr.client.solrj.impl.BinaryResponseParser;

import java.io.FileInputStream;

public class Parser {
  public static void main(String[] args) throws Exception {
    var is = new FileInputStream(args[0]);
    var parser = new BinaryResponseParser();
    var entries = parser.processResponse(is, "UTF-8");
    var gson = new GsonBuilder().setPrettyPrinting().create();
    var json = gson.toJson(entries);
    System.out.println(json);
  }
}
