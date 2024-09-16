package personalDetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PsService {
	@Autowired
	PsDao pd;

	public String saveIt(PsEntity pe) {
		return pd.saveIt(pe);
	}

}
