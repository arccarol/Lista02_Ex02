package view;

import model.ILista;
import model.Lista;

public class Principal {
	
	public static void main(String[] args) {
		
		ILista listaA = new Lista();
		ILista listaB = new Lista();
		ILista listaI = new Lista();
		ILista listaU = new Lista();
		 try {
			 listaA.addFirst(3);
			 listaA.addLast(16);
			 listaA.add(5,1);
			 listaA.add(8,2);
			 listaA.add(12,3);
			 listaA.add(9,4);
			 listaA.add(7,5);
			 System.out.print("Lista A = ");
			 for(int i=0; i<7; i++) {
					 listaA.get(i);
					System.out.print(listaA.get(i) + " ");
			 }
			 System.out.println(" ");
			 System.out.print("Lista B = ");
			 listaB.addFirst(9);
			 listaB.addLast(7);
			 listaB.add(6,1);
			 listaB.add(2,2);
			 listaB.add(3,3);
		
			 for(int i=0; i<5; i++) {
					
					System.out.print(listaB.get(i)+" ");
					
			 }
			 System.out.println(" ");
			 System.out.print("Lista I = ");
		                 listaI.addFirst(3);
		                 listaI.add(9,1);
		                 listaI.addLast(7);
		                 for(int i=0; i<3; i++) {   
		              System.out.print(listaI.get(i)+ " ");
		                 }
		                 System.out.println(" ");
		    			 System.out.print("Lista U = ");
		    			 listaU.addFirst(3);
		    			 listaU.add(5,1);
		    			 listaU.add(8,2);
		    			 listaU.add(12,3);
		    			 listaU.add(9,4);
		    			 listaU.add(7,5);
		    			 listaU.add(16,6);
		    			 listaU.add(6,7);
		    			 listaU.addLast(2);
		    			 for(int i=0; i<9; i++) {   
				              System.out.print(listaU.get(i)+ " ");
		    			 }
		
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
	 
	}
}

