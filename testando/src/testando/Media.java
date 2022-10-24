package testando;

import javax.swing.JOptionPane;

public class Media {
	
	 public static void main(String args[])  {

	        int nota1, nota2, nota3, nota4, media;
	        
	        String msnota1, msnota2, msnota3, msnota4;

	        msnota1 = JOptionPane.showInputDialog("Entre com a primeira nota");
	        msnota2 = JOptionPane.showInputDialog("Entre com a segunda nota");
	        msnota3 = JOptionPane.showInputDialog("Entre com a terceira nota ");
	        msnota4 = JOptionPane.showInputDialog("Entre com a quarta nota");


	        nota1= Integer.parseInt(msnota1);
	        nota2= Integer.parseInt(msnota2);
	        nota3= Integer.parseInt(msnota3);
	        nota4= Integer.parseInt(msnota4);


	        media =(nota1 + nota2 + nota3 + nota4) / 4;
	        JOptionPane.showMessageDialog(null, "O Total " + media, ".", JOptionPane.PLAIN_MESSAGE);
	        System.out.println("Total  =" + media);
	        System.exit(0);
	                }

}
