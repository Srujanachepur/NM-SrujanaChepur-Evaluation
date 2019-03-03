package com.nm.sc.eval.main;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin(maxAge = -1)
@RestController
@RequestMapping("/TacoContributorResponse")

public class TacoController {

	private org.slf4j.Logger log = LoggerFactory.getLogger(TacoController.class);

	@Autowired
	private TacoService tacoService;

	@GetMapping(path = {"/result"})
	public String tacoControllerRetrieve() {
		return tacoService.tacoContributorRetrieve();
	}
}
