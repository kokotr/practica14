


import java.awt.*;


import java.awt.event.*;


import javax.swing.*;



public class colores extends JFrame implements ActionListener{



private JLabel rojo,verde,azul;

private JComboBox red,green,blue;


private  JButton boton;

public colores(){



setLayout(null);

rojo=new JLabel("Rojo");

rojo.setBounds(10,10,100,30);

add(rojo);

red=new JComboBox();


red.setBounds(80,10,80,30);


for(int i=0;i<256;i++){


red.addItem(String.valueOf(i));


}



add(red);



//////////////////////////////////////7

verde=new JLabel("Verde");

verde.setBounds(10,50,100,30);

add(verde);

green=new JComboBox();


green.setBounds(80,50,80,30);


for(int i=0;i<256;i++){


green.addItem(String.valueOf(i));


}



add(green);





///////////////////////////////////////77


azul=new JLabel("Azul");

azul.setBounds(10,100,100,30);

add(azul);

blue=new JComboBox();


blue.setBounds(80,100,80,30);


for(int i=0;i<256;i++){


blue.addItem(String.valueOf(i));


}



add(blue);





boton=new JButton("click");

boton.setBounds(10,300,100,30);

boton.addActionListener(this);
add(boton);



//////////////////77



}



public void actionPerformed(ActionEvent s){



if(s.getSource()==boton){

String x=red.getSelectedItem().toString();

String y=green.getSelectedItem().toString();

String z=blue.getSelectedItem().toString();



int rojo1=Integer.parseInt(x);


int verde1=Integer.parseInt(y);


int azul1=Integer.parseInt(z);



getContentPane().setBackground(new Color(rojo1,verde1,azul1));




}









}

public static void main(String[]args){


colores uno=new colores();


uno.setSize(500,500);

uno.setTitle("esto e suna practica de java");


uno.setResizable(false);



uno.setLocationRelativeTo(null);


uno.setVisible(true);



uno.setDefaultCloseOperation(EXIT_ON_CLOSE);











}




}

