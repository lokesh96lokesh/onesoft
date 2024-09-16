package com.example.emp;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GstDao {
	@Autowired
	GstRepo gr;
	public String disgst(List <GstEntity> gg) {
		gr.saveAll(gg);
		return "updated";
	}
	public int getpercentage(int hsn) {
		
		return gr.disgst(hsn);
	}

}
