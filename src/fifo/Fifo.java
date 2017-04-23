package fifo;
import java.util.Scanner;
public class Fifo {
	

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args){
		
		 Lista list = new Lista();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ce doriti sa faceti?");
		System.out.println("\t1.Introduceti in stiva");
		System.out.println("\t2.Stergeti din stiva");
		System.out.println("\t3.Afisare");
		System.out.println("\t4.Iesiti\n");
		int  op = in.nextInt();
		 
		
		int stop=0;

	
	while((op !=4) && (stop==0)){
	
	switch (op){
	
	case 1 : {
		System.out.println("Ce val introduceti? \n");
		
		int val = in.nextInt(); 
		 
		list.adauga( val);
		System.out.println("Ai introdus un element de valoare "+ val);
		break;
		
			}
	case 2 : {
		
		list.sterge();
		break;
	}
	
	
	case 3:{
		list.afisare();
		break;
		
	}
	
	case 4:{
		stop=1;
		break;
	}
	
	default: {
		System.out.println("Aceasta nu este o optiune!");
		break;
	}
	


	
	}
	System.out.println("\nCe doriti sa faceti?");
	System.out.println("\t1.Introduceti in stiva");
	System.out.println("\t2.Stergeti din stiva");
	System.out.println("\t3.Afisare");
	System.out.println("\t4.Iesiti\n");
	op = in.nextInt();
	}
	
	
}
	
}


class Lista{
	Element prim, el, p;
	
	Lista(){
		
		this.prim = null;
	}
	
	void sterge()
	{
		if(prim==null){
			System.out.println("Stiva e goala, nu mai sunt elemente de sters!");
		}else{
		System.out.println("Ai scos din stiva elementul "+ this.prim.val );
		this.prim= this.prim.next; 
		}
		
	}
	
	void adauga(int val){
		
		el= new Element(val) ;
		
		el.next = prim;
		prim=el ;
		
		
		
	}
	
	void afisare(){
		
		p=prim;
		if (prim==null){
			System.out.println("Stiva e goala!");
		}else {
		System.out.println("Elementele sunt:\n");
		while(this.p!=null){
		System.out.printf("%d\n",this.p.val);
		this.p=this.p.next;
		}
		}
		
	}
}
	
	

class Element {
	
	Element next;
	int val ;
	
	Element(int val){
		this.val=val;
		
		
	}
}






