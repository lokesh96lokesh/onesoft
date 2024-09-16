
class Loop {
	public static void main(def args){
		def list = ["Lars", "Ben", "Jack"]
		// using a variable assignment
		list.each{x->println x
		}
		// using the it variable
		list.each{println it}
	}
}
