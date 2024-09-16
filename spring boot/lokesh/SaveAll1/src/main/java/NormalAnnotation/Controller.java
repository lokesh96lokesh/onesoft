package NormalAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
	@Autowired
	Service s;
		
		@RequestMapping(value="/isplural/{num1}")
		public String isplural(@PathVariable String num1) {
			if (num1.endsWith("s")) {
				
				return " plural";
			}
			else {
				return "not a plural";
			}
		}
		@RequestMapping(value="/check")
		public String isplural(@RequestParam String name,@RequestParam String password) {
			if (name.equalsIgnoreCase("gokul")&&password.equalsIgnoreCase("01234")) {
				
				return " Access Granted";
			}
			else {
				return "Access Denined";
			}
		}
		@PostMapping("/Savepsdetials")
		public String saveIt(@RequestBody Entity1 e) {
			return s.saveIt(e);
		}
}