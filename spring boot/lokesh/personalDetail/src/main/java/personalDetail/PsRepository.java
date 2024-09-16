package personalDetail;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PsRepository extends JpaRepository<PsEntity, Integer> {
	
	@Query(value="select * from ps_table",nativeQuery=true)
	public List<PsEntity> psDetail(); 

}
