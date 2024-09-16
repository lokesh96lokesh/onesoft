package com.example.GstDetails;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface GstRepository extends JpaRepository<GstEntity,Integer>{
	@Query(value="select percentage from gst_details where hsncode=?",nativeQuery=true)
	public int getGst(int a);

}
