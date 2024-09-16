package com.example.emp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GstService {
	@Autowired
	GstDao gd;
	public String disgst(List<GstEntity> gg) {
		return gd.disgst(gg);
	}
	public int getpercentage(int hsn) {
		
		return gd.getpercentage(hsn);
	}
	

}
