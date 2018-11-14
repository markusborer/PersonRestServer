package ch.adesso.personrestserver;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	@CrossOrigin
    @RequestMapping("/person")
    public List<Person> search(@RequestParam(value="name", defaultValue="") String name) {
		if ("error".equals(name)) {
			throw new RuntimeException("Illegal value");
		}
        int sleeptime = (4 - name.length()) * 250;
    	if (sleeptime > 0) {
	    	try {
				Thread.sleep(sleeptime);
	        } catch (InterruptedException e) {
	        }
    	}
        return Arrays.asList(new Person(1, name + "1", "Markus"), new Person(2, name + "2", "Christoph"), new Person(3, name + "3", "Heidi"));
    }

}
