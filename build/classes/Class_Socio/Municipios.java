/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_Socio;

import javax.swing.JComboBox;

/**
 *
 * @author gabriel
 */
public class Municipios{
    
       public Municipios(){}
    
    
       public static void COMBOX(JComboBox dep,JComboBox mun,int i){   
           String CaribeNorte[]={"Bilwi","Bonanza","Mulukuku","Prinzapolka","Rosita","Siuna","Waslala","Waspan"};
           String CaribeSur[]={"Bluefields","Corn Island","Desembocadura de Rio Grande","El ayote","El tortuguero","Kunkra Hill","La cruz de Rio Grande","Laguna de Perlas","Muelle de los Buelles","Nueva Guinea","Paiwas","El rama"};
           String Boaco[]={"Boaco","Camoapa","San Lorenzo","San Jose de los remates","Santa Lucia","Teustepe"};
           String Carazo[]={"Diriamba","Dolores","El Rosario","Jinotepe","La conquista","La paz de Oriente","San Marcos","Santa Teresa"};
           String Chinandega[]={"Chichigalpa","Chinandega","Cinco Pinos","Corinto","El realejo","El viejo","Posoltega","San Francisco del Norte","San Pedro del Norte","Santo Tomas del Norte","Somotillo","Puerto Morazan","Villanueva"};
           String Chontales[]={"Acoyapa","Comalapa","San Francisco de Cuapa","El Coral","Juigalpa","La Libertad","San Pedro de Lovago","Santo Domingo","Santo Thomas","Villa Sandino"};
           String Estelí[]={"Condega","Estelí","La Trinidad","Pueblo Nuevo","San Juan de Limay","San Nicolas"};
           String Granada[]={"Diria","Diriomo","Granada","Nandaime"}; 
           String Jinotega[]={"El Cuá","Jinotega","La Concordia","San Jose de Bocay","San Rafael del Norte","San Sebastian de Yalí","Santa Maria de Pantasma","Wiwilí de Jinotega"};
           String Leon[]={"Achuapa","El Jicaral","El Sauce","La Paz Centro","Larreynaga","León","Nagarote","Quezalguaque","Santa Rosa del Peñón","Telica"};
           String Madriz[]={"Las Sabanas","Palacaguina","San Jose de Cusmapa","San Juan de Rio Coco","San Lucas","Somoto","Telpaneca","Totogalpa","Yalaguina"};
           String Managua[]={"Ciudad Sandino","El Crucero","Managua","Mateare","San Francisco Libre","San Rafael del Sur","Ticuantepe","Tipitapa","Villa el Carmen"};
           String Masaya[]={"Catarina","La concepcion","Masatepe","Masaya","Nandasmo","Nindiri","Niquinohomo","San Juan de Oriente","Tisma"};
           String Matagalpa[]={"Ciudad Dario","EL tuma-La Dalia","Esquipulas","Matagalpa","Matiguas","Muy Muy","Rancho Grande","Rio Blanco","San Dionisio","San Isidro","San Ramon","Sebaco","Terrabona"};
           String NuevaSegovia[]={"Ciudad Antigua","Dipilto","El jicaro","Guiguili","Jalapa","Macuelizo","Mozonte","Murra","Ocotal","Quilali","San Fernando","Santa Maria"};
           String RioSanJuan[]={"El Almendro","El Castillo","Morrito","San Carlos","San Juan del Norte","San Miguelito"};
           String Rivas[]={"Altagracia","Belen","Buenos Aires","Cardenas","Moyogalpa","Potosí","Rivas","San Jorge","San Juan del Sur","Tola"};
           switch(i){
           case 0:{
               mun.removeAllItems();
                  for(String j:CaribeNorte){
                      mun.addItem(j);
                  }
               break;
           }
           case 1:{
               mun.removeAllItems();
                  for(String j:CaribeSur){
                      mun.addItem(j);
                  }
               break;
           }
           case 2:{
               mun.removeAllItems();
                  for(String j:Boaco){
                      mun.addItem(j);
                  }
               break;
           }
           case 3:{
               mun.removeAllItems();
                  for(String j:Carazo){
                      mun.addItem(j);
                  }
               break;
           }
           
           case 4:{
               mun.removeAllItems();
                  for(String j:Chinandega){
                      mun.addItem(j);
                  }
               break;
           }
           case 5:{
               mun.removeAllItems();
                  for(String j:Chontales){
                      mun.addItem(j);
                  }
               break;
           }
           case 6:{
               mun.removeAllItems();
                  for(String j:Estelí){
                      mun.addItem(j);
                  }
               break;
           }
           
           case 7:{
               mun.removeAllItems();
                  for(String j:Granada){
                      mun.addItem(j);
                  }
               break;
           }
           case 8:{
               mun.removeAllItems();
                  for(String j:Jinotega){
                      mun.addItem(j);
                  }
               break;
           }
           case 9:{
               mun.removeAllItems();
                  for(String j:Leon){
                      mun.addItem(j);
                  }
               break;
           }
           case 10:{
               mun.removeAllItems();
                  for(String j:Madriz){
                      mun.addItem(j);
                  }
               break;
           }
           case 11:{
               mun.removeAllItems();
                  for(String j:Managua){
                      mun.addItem(j);
                  }
               break;
           }
           case 12:{
               mun.removeAllItems();
                  for(String j:Masaya){
                      mun.addItem(j);
                  }
               break;
           }
           case 13:{
               mun.removeAllItems();
                  for(String j:Matagalpa){
                      mun.addItem(j);
                  }
               break;
           }
           case 14:{
               mun.removeAllItems();
                  for(String j:NuevaSegovia){
                      mun.addItem(j);
                  }
               break;
           }
           case 15:{
               mun.removeAllItems();
                  for(String j:RioSanJuan){
                      mun.addItem(j);
                  }
               break;
           }
           case 16:{
                  mun.removeAllItems();
                  for(String j:Rivas){
                     mun.addItem(j);
                  }
               break;
           }
           
       }
    }
       
    /**
     *
     * @param combox_dep
     * @param combox_dep2
     */
    public static void addD(JComboBox combox_dep,JComboBox combox_dep2){
       String dep[]={"Caribe Norte","CaribeSur","Boaco","Carazo","Chinandega","Chontales","Estelí"
               ,"Granada","Jinotega","Leon","Madriz","Managua","Masaya","Matagalpa","Nueva Segovia","Rio San Juan","Rivas"};
        for(String i:dep){
            combox_dep.addItem(i);
            combox_dep2.addItem(i);
        }
        //System.out.println("Tam:"+combox_dep.getItemCount());
   }
       
    

}
