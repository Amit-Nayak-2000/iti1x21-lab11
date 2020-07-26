public class Iterative {

	public static BitList complement( BitList in ) {
		BitList result = new BitList();
		Iterator itr = in.iterator();
		Iterator itri = result.iterator();

		while(itr.hasNext()){
			int element = itr.next();
			if(element == 0){
				itri.add(1);
			}
			else{
				itri.add(0);
			}
		}
		return result;
	}

	public static BitList or( BitList a, BitList b ) {
		int counterA = 0;
		int counterB = 0;
		Iterator itr = a.iterator();
		Iterator itri = b.iterator();
		while(itr.hasNext()){
			itr.next();
			counterA++;
		}
		if(counterA == 0){
			throw new IllegalArgumentException("lengths must be equal to each other and greater than 0");
		}
		while(itri.hasNext()){
			itri.next();
			counterB++;
		}
		if(counterB == 0){
			throw new IllegalArgumentException("lengths must be equal to each other and greater than 0");
		}
		if(counterB != counterA){
			throw new IllegalArgumentException("lengths must be equal to each other and greater than 0");
		}
		
		Iterator itra = a.iterator();
		Iterator itrb = b.iterator();
		BitList result = new BitList();
		Iterator itrr = result.iterator();

		while(itra.hasNext()){
			int anum = itra.next();
			int bnum = itrb.next();
			int c = anum + bnum;
			if(c == 2){
				c = c - 1;
			}
			itrr.add(c);
		}

		return result;
	}

	public static BitList and( BitList a, BitList b ) {
		int counterA = 0;
		int counterB = 0;
		Iterator itr = a.iterator();
		Iterator itri = b.iterator();
		while(itr.hasNext()){
			itr.next();
			counterA++;
		}
		if(counterA == 0){
			throw new IllegalArgumentException("lengths must be equal to each other and greater than 0");
		}
		while(itri.hasNext()){
			itri.next();
			counterB++;
		}
		if(counterB == 0){
			throw new IllegalArgumentException("lengths must be equal to each other and greater than 0");
		}
		if(counterB != counterA){
			throw new IllegalArgumentException("lengths must be equal to each other and greater than 0");
		}
		
		Iterator itra = a.iterator();
		Iterator itrb = b.iterator();
		BitList result = new BitList();
		Iterator itrr = result.iterator();

		while(itra.hasNext()){
			int anum = itra.next();
			int bnum = itrb.next();
			int c = anum * bnum;
			itrr.add(c);
		}

		return result;
	}

	public static BitList xor( BitList a, BitList b ) {
		int counterA = 0;
		int counterB = 0;
		Iterator itr = a.iterator();
		Iterator itri = b.iterator();
		while(itr.hasNext()){
			itr.next();
			counterA++;
		}
		if(counterA == 0){
			throw new IllegalArgumentException("lengths must be equal to each other and greater than 0");
		}
		while(itri.hasNext()){
			itri.next();
			counterB++;
		}
		if(counterB == 0){
			throw new IllegalArgumentException("lengths must be equal to each other and greater than 0");
		}
		if(counterB != counterA){
			throw new IllegalArgumentException("lengths must be equal to each other and greater than 0");
		}
		
		
		Iterator itra = a.iterator();
		Iterator itrb = b.iterator();
		BitList result = new BitList();
		Iterator itrr = result.iterator();

		while(itra.hasNext()){
			int anum = itra.next();
			int bnum = itrb.next();
			int c;
			if(anum == bnum){
				c = 0;
			}
			else{
				c = 1;
			}
			
			itrr.add(c);
		}

		return result;
	}
}
