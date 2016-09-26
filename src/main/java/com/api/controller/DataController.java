package com.api.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.model.Data;
import com.api.model.Request;
import com.api.service.DataService;
import com.api.service.RequestService;

@RestController
public class DataController {
	private DataService serviceD = new DataService();
	private RequestService serviceR = new RequestService();
	@CrossOrigin
	@RequestMapping(value="/Data", method=RequestMethod.GET)
	public ResponseEntity<List<Data>> getData(HttpServletRequest infoReq){
		
		Request request = new Request(infoReq.getRemoteAddr(), infoReq.getHeader("User-Agent"), infoReq.getProtocol(), infoReq.getMethod(), "", "");
    	serviceR.persistRequest(request);
    	
		return new ResponseEntity<List<Data>>(serviceD.getData(), HttpStatus.OK);
	}
	
	@CrossOrigin
	@RequestMapping(value="/Data", method=RequestMethod.PUT)
	public void putData(@RequestBody String info, HttpServletRequest infoReq){
		Data data = new Data(info);
		
		Request request = new Request(infoReq.getRemoteAddr(), infoReq.getHeader("User-Agent"), infoReq.getProtocol(), infoReq.getMethod(), "", info);
    	serviceR.persistRequest(request);
		
		serviceD.persistData(data);
		
	}
}
