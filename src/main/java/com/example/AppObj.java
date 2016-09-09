package com.example;

public class AppObj {

  private final long id;
  private final String content;

  public AppObj(long id, String content) {
    this.id = id;
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }
}