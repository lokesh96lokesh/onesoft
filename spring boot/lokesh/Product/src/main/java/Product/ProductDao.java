package Product;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class ProductDao {
	@Autowired
	ProductRepository pr;
	public  List<ProductEntity> findall( ) {
		return pr.findAll();
	}
	
	public ProductEntity find( int a){
		return pr.findById(a).get();
	}
	//public  ProductEntity a( int a){
		//return pr.findById(a).get();
	//}

}
