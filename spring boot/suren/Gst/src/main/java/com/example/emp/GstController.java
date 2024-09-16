package com.example.emp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GstController {
	@Autowired
	GstService sg;
	@PostMapping(value="/display")
	public String disgst(@RequestBody List<GstEntity> gg) {
		return sg.disgst(gg);
	}
	@GetMapping(value="showdis/{hsn}")
	public int getpercentage(@PathVariable int hsn) {
		return sg.getpercentage(hsn);
	}
	
			
			
	

}
