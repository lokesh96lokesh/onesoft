package Product;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService {
	@Autowired
	ProductDao pd;
	public  List<ProductEntity> findall( ) {
		return pd.findall();
	}
	public ProductEntity find( int a){
		return pd.find(a);
	}
	//public  ProductEntity a( int a){
		//return pd.a(a);
	//}

}
