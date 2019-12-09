package app.controller;

import app.Service.CalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
public class CalcController {
   private CalcService calcService ;

    public CalcController(@Autowired CalcService calcService){
        this.calcService=calcService;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/calc/")
    public String plus(@PathParam("x") int x, @PathParam ("y") int y, @PathParam("op") String op) {
        return calcService.calc(x,y,op);
    }

}
