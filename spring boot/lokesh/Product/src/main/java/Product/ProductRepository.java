package Product;


import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;


public interface ProductRepository extends JpaRepository<ProductEntity,Integer> {
	//@Query(value="select brand from product_table where price>? and price<?",nativeQuery=true)

	//public  MobileEntity val( int a); 

}
