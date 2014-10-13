package com.zhou;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleController {

   @RequestMapping(value = "/hello", method = RequestMethod.GET)
   @ResponseBody
   public HelloObj hello() {
      return new HelloObj("world");
   }
}
