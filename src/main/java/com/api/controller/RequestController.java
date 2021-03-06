
package com.api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.model.Request;
import com.api.service.RequestService;

@RestController
public class RequestController {
	private RequestService service = new RequestService();
	
    @RequestMapping(value = "/Requests", method=RequestMethod.GET)
    public ResponseEntity<List<Request>> requestHistory() {
    	
        return new ResponseEntity<List<Request>>(service.getRequests(),HttpStatus.OK);
    }
}