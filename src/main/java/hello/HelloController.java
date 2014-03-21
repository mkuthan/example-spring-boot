package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@Autowired
	private HelloRepository repository;

	@RequestMapping("/")
	public Iterable<HelloEntity> index() {
		return repository.findAll();
	}

}