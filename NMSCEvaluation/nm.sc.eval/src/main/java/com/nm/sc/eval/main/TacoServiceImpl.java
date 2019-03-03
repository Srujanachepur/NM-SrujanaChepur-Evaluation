package com.nm.sc.eval.main;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TacoServiceImpl implements TacoService {

	public String tacoContributorRetrieve() {
		RestTemplate restTemplate = new RestTemplate();
		String tacoContributorString = restTemplate.getForObject("http://taco-randomizer.herokuapp.com/contributions/", String.class);
		return tacoContributorString;

	}

}
