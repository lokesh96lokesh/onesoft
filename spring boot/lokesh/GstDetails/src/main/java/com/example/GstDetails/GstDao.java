package com.example.GstDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GstDao {
	@Autowired
	GstRepository gr;
	public int getGst(int a) {
		return gr.getGst(a);
	}

}
