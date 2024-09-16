package com.example.GstDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GstService {
	@Autowired
	GstDao gd;
	public int getGst(int a) {
		return gd.getGst(a);
	}

}
