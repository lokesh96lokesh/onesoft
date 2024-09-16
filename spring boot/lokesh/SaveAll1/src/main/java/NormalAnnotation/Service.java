package NormalAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service

public class Service {
	
		@Autowired
		Dao d;


	public String saveIt(Entity1 e) {
	
		return d.saveIt(e);	}
}

