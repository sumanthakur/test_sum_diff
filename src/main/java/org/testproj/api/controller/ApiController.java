package org.testproj.api.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.testproj.api.models.Operand;
import org.testproj.api.models.OperationResult;
import org.testproj.api.services.ApiService;

@RestController
@RequestMapping
@Validated
public class ApiController {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	ApiService apiService;
	
	@PostMapping("/api/add")
	public OperationResult add(@Valid @RequestBody Operand op) throws Exception {
			log.info("adding");
			return apiService.sum(op);
	}

	@PostMapping("/api/diff")
	public OperationResult diff(@Valid @RequestBody Operand op) throws Exception {
			log.info("subtracting");
			return apiService.diff(op);
	}
}
