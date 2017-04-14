package com.rxing.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("compute-service")
public interface ComputeClient {

    @RequestMapping(method = RequestMethod.GET, value = "/add")
    Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
    
    @RequestMapping(method = RequestMethod.GET, value = "/sub")
    Integer sub(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);

    @RequestMapping(value="/scoreList",method=RequestMethod.GET)
    List<Object> getScoreList();
    
    @RequestMapping(value="/up",method=RequestMethod.GET)
    int updateScoreById(@RequestParam(value = "score") float score, @RequestParam(value = "id") Integer id);
    
}