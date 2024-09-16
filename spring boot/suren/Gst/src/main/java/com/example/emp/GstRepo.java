package com.example.emp;
import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface GstRepo extends JpaRepository<GstEntity, Integer> {
@Query(value="select percentage from Gst_Entity where hsn=?",nativeQuery=true)
public int disgst(int percentage);
}
