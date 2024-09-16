package NormalAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
@org.springframework.stereotype.Repository
public class Dao {
	@Autowired
	Repository r;

	public String saveIt(Entity1 e) {
		r.save(e);
		return "Saved";
	}

}
