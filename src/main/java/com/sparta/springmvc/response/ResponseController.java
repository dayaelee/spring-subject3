package com.sparta.springmvc.response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/response")
public class ResponseController {
    // Content-Type: text/heml
    // Response Body
    // {"name": "Robbie", "age":95}


    @GetMapping("/json/string")
    @ResponseBody
    public String helloStringJson() {
        return "{\"name\":\"Robbie\",\"age\":95}";
    }

    // Content-Type: appllication/json
    // Response Body
    // {"name": "dylee", "age":62}


    @GetMapping("/json/class")
    @ResponseBody
    public Star helloClassJson(){
        return new Star("dylee", 62);
    }


}
