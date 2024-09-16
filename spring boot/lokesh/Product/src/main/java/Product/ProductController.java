package Product;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
		@Autowired
		ProductService ps;
		@GetMapping ("/GetAllDetials")
		public  List <ProductEntity> findall(){
			return ps.findall();
		}
		@GetMapping ("/findbyid/{a}")
		public ProductEntity find(@PathVariable int a){
			return ps.find(a);
		}
		//@GetMapping ("/findbyid/{a}")
		//public  ProductEntity a( int a){
			//return pd.a(a);
		//}
		

}


