package org.sky.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@author lilg
 *@date 2023/2/24
 */
@RestController
@RequestMapping("/api/start/demo")
public class StartDemoController {

	@GetMapping("/getDemo/{id}")
	public void getDemo(@PathVariable String id) {
		System.out.println(id);
	}
}
