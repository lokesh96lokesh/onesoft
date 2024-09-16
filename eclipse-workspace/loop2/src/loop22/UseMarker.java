package loop22;

public class UseMarker {
	public static void main(String[] args) {
		Marker marker=new Marker();
		marker.price=30;
		marker.size=5;
		marker.color="Black";
		marker.isRefillable=true;
		
		Marker marker1=new Marker();
		marker1.price=20;
		marker1.size=3;
		marker1.color="Blue";
		marker1.isRefillable=false;
		
		Marker marker2=new Marker();
		marker2.price=10;
		marker2.size=2;
		marker2.color="Red";
		marker2.isRefillable=true;
		
		Marker[] markers= {marker,marker1,marker2};
		for(int i=0;i<markers.length;i++) {
			System.out.println(markers[i].price+" "+markers[i].size+" "+markers[i].color+" "+markers[i].isRefillable) ;
		}
	}

}
