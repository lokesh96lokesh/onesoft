package personalDetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PsDao {
	@Autowired
	PsRepository pr;

	public String saveIt(PsEntity pe) {
		pr.save(pe);
		return "Saved";
	}

}
