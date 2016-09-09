package com.example;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppObjController {

  private static final String template = "Hello, %s!";
  //private final AtomicLong counter = new AtomicLong();

  @RequestMapping("/hey")
  public AppObj getAppObj(@RequestParam(value="name", required=false, defaultValue="World") String name) {
    return new AppObj(1L,
        String.format(template, name));
  }
}