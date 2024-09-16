package personalDetail;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@Repository
@RestController
public class PsController {
	@Autowired
	PsRepository pr;
	@Autowired
	PsService ps;
	
	@GetMapping(value="/getall")
	ResponseEntity<List<PsEntity>> getall() {
		List<PsEntity>a=pr.psDetail();
		return ResponseEntity.ok().body(a);
	}
	

	@PostMapping("/Savepsdetials")
	public String saveIt(@RequestBody PsEntity pe) {
		return ps.saveIt(pe);
	}

}
