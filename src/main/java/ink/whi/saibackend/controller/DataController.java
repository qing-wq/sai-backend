package ink.whi.saibackend.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import ink.whi.saibackend.mapper.StuMapper;
import ink.whi.saibackend.pojo.StuInfo;
import ink.whi.saibackend.service.StuService;
import jdk.nashorn.api.scripting.JSObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.transform.Source;
import java.io.IOException;

@RestController
public class DataController {

    @Autowired
    StuService service;

    @RequestMapping("/submit")
    public void submit(@RequestBody String json) throws IOException {
        StuInfo stuInfo = JSON.parseObject(json, StuInfo.class);
        service.saveStu(stuInfo);
    }

}