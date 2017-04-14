package com.rxing.web;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rxing.service.ComputeClient;

@RestController
public class ConsumerController {
	 private static final Logger logger =LogManager.getLogger(ConsumerController.class);
    @Autowired
    ComputeClient computeClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        return computeClient.add(50, 20);
    }
    
    @RequestMapping(value = "/sub", method = RequestMethod.GET)
    public Integer sub() {
        return computeClient.sub(50, 20);
    }
    @RequestMapping(value="/scoreList",method=RequestMethod.GET)
    public List<Object> getScoreList(){
    	logger.info("结果："+computeClient.getScoreList());
    	return computeClient.getScoreList();
    }
    
    @RequestMapping(value="/up",method=RequestMethod.GET)
    int updateScoreById(){
    	
    	return computeClient.updateScoreById(56.2f,3);
    }
}