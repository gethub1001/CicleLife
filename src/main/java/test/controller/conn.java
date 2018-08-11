package test.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import test.services.TestServicesInterFace;

import java.util.logging.Logger;

@Controller
@RequestMapping("test")
public class conn {
     @Autowired
    private TestServicesInterFace   testServicesInterFace;

    @RequestMapping("/")
    public @ResponseBody
    String run(){
        return "Hello world!!!";
    }

    @RequestMapping("index")
    public String eee(){
        return "index";
    }
    @RequestMapping("/num")
    @ResponseBody
    public int home(){
        int i=testServicesInterFace.testInterface();
        return i;
    }
}
