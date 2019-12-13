/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adicionales;

import Classes.Flujo;
import Classes.Project;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.*;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;


/**
 *
 * @author macbook
 */
public class ExportExc {
   
public void exportIncomeFlow(Double[][] flujo,Double[][] flujoOtros,Project p) throws IOException{//flujo[3][x], flujoOtros[8],x
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de excel", "xls");
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Guardar archivo");
        chooser.setAcceptAllFileFilterUsed(false);
                if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            String ruta = chooser.getSelectedFile().toString().concat(".xls");
            try {
                File archivoXLS = new File(ruta);
                if (archivoXLS.exists()) {
                    archivoXLS.delete();
                }
                archivoXLS.createNewFile();
                Workbook libro = new HSSFWorkbook();
                FileOutputStream archivo = new FileOutputStream(archivoXLS);
                Sheet hoja = libro.createSheet("Hoja 1");
                hoja.setDisplayGridlines(true);
                for (int f = 0; f < flujo[0].length+2; f++) {//filas
                    Row fila = hoja.createRow(f);
                    for (int c = 0; c < flujo.length+3; c++) {//columnas
                       
                       
                        if (f == 0) {
                         Cell celda = fila.createCell(c);    
                          
                           if(c>2){
                            Date d= new Date(p.Date.getYear(),p.Date.getMonth(),p.Date.getDay());
                            d.setYear(p.Date.getYear()+c-3);
                            celda.setCellValue(d.getYear() +1900);
                           }
                        }
                        else if(f==1){
                            Cell celda = fila.createCell(c);
                            if(c==2){
                            celda.setCellValue("Total");
                            }
                            else if(c>2){
                             Date d= new Date(p.Date.getYear(),p.Date.getMonth(),p.Date.getDay());
                            d.setMonth(p.Date.getMonth()+c-3);
                            celda.setCellValue(meses[d.getMonth()]);
                            }
                        }
                       
                        
                    }
                }
                int filaInicio = 2;
                for (int f = 0; f < flujo[0].length+11; f++) {//filas
                    Row fila = hoja.createRow(filaInicio);
                    filaInicio++;
                    for (int c = 0; c < flujo.length+3; c++) {//columnas
                        if(c==1){
                        Cell celda = fila.createCell(c);
                        if(f==0){
                        celda.setCellValue("Total ingresos");
                        }
                        else if(f==1){
                        celda.setCellValue("Ingresos por venta");
                        }
                        else if(f==2){
                        celda.setCellValue("Anticipo");
                        }
                        else if(f==3){
                        celda.setCellValue("Mensualidades");
                        }
                        else if(f==4){
                        celda.setCellValue("Saldos");
                        }
                        else if(f==5){
                        celda.setCellValue("Otros ingresos");
                        }
                        else if(f==6){
                        celda.setCellValue("Inversionista 1 (Efectivo)");
                        }
                        else if(f==7){
                        celda.setCellValue("Inversionista 1 (Aportación)");
                        }
                        else if(f==8){
                        celda.setCellValue("Inversionista 1 (Especie)");
                        }
                        else if(f==9){
                        celda.setCellValue("Inversionista 2");
                        }
                        else if(f==10){
                        celda.setCellValue("Inversionista 3");
                        }
                        else if(f==11){
                        celda.setCellValue("Prestamista 1");
                        }
                        else if(f==12){
                        celda.setCellValue("Prestamista 2");
                        }
                        else if(f==13){
                        celda.setCellValue("Crédito Bancario");
                        }
                        
                        
                        }
                        if(c==2){
                            if(f==0){
                            Cell celda = fila.createCell(c);
                            Double suma=0.0;
                            Double suma1=0.0;
                            Double suma2=0.0;
                            for (int j = 0; j < flujo[0].length; j++) {
                                for(int k=0;k<flujo.length;k++){
                                    suma1=suma1+flujo[k][j];
                                }       
                            }
                            for (int j = 0; j < flujoOtros[0].length; j++) {
                                for(int k=0;k<flujoOtros.length;k++){
                                    suma2=suma2+flujoOtros[k][j];
                                }       
                            }
                            suma=suma1+suma2;
                             
                            if (suma instanceof Double) {
                            celda.setCellValue(Double.parseDouble(suma.toString()));
                            } else if (suma instanceof Double) {
                            celda.setCellValue(suma);
                            } else {
                            celda.setCellValue(String.valueOf(suma));
                            }
                            }
                            
                            
                            else if(f==1){
                           Cell celda = fila.createCell(c);
                            Double suma=0.0;
                            for (int j = 0; j < flujo[0].length; j++) {
                                for(int k=0;k<flujo.length;k++){
                                    suma=suma+flujo[k][j];
                                }
                            
                            
                            }
                            if (suma instanceof Double) {
                            celda.setCellValue(Double.parseDouble(suma.toString()));
                            } else if (suma instanceof Double) {
                            celda.setCellValue(suma);
                            } else {
                            celda.setCellValue(String.valueOf(suma));
                            }
                         
                            
                            }
                            else if(f>1&&f<5){
                            Cell celda = fila.createCell(c);
                            Double suma=0.0;
                            for (int j = 0; j < flujo.length; j++) {//columnas
                            suma=suma+flujo[j][f-2];
                         
                            }
                        
                                if (suma instanceof Double) {
                                celda.setCellValue(Double.parseDouble(suma.toString()));
                                } else if (suma instanceof Double) {
                                celda.setCellValue(suma);
                                } else {
                                celda.setCellValue(String.valueOf(suma));
                                }
                            }
                            else if(f==5){
                            Cell celda = fila.createCell(c);
                            Double suma=0.0;
                             for (int j = 0; j < flujoOtros[0].length; j++) {
                                for(int k=0;k<flujoOtros.length;k++){
                                    suma=suma+flujoOtros[k][j];
                                }       
                            }
                            if (suma instanceof Double) {
                                celda.setCellValue(Double.parseDouble(suma.toString()));
                                } else if (suma instanceof Double) {
                                celda.setCellValue(suma);
                                } else {
                                celda.setCellValue(String.valueOf(suma));
                                }
                            }
                            else if(f>5){
                            Cell celda = fila.createCell(c);
                            Double suma=0.0;
                            for (int j = 0; j < flujoOtros.length; j++) {
                            suma=suma+flujoOtros[j][f-6];
                         
                            }
                            if (suma instanceof Double) {
                                celda.setCellValue(Double.parseDouble(suma.toString()));
                                } else if (suma instanceof Double) {
                                celda.setCellValue(suma);
                                } else {
                                celda.setCellValue(String.valueOf(suma));
                                }
                            }
                        }
                        else if(c>2){
                               if(f==0){
                                Cell celda = fila.createCell(c);
                                Double suma=0.0;
                                for (int j = 0; j < flujo[0].length; j++) {//fila
                                suma=suma+flujo[c-3][j];
                                }
                                for (int j = 0; j < flujoOtros[0].length; j++) {//fila
                                suma=suma+flujoOtros[c-3][j];
                                }
                            
                                if (suma instanceof Double) {
                                celda.setCellValue(Double.parseDouble(suma.toString()));
                                } else if (suma instanceof Double) {
                                celda.setCellValue(suma);
                                } else {
                                celda.setCellValue(String.valueOf(suma));
                                }
                                }
                            else if(f==1){
                            Cell celda = fila.createCell(c);
                            Double suma=0.0;
                            for (int j = 0; j < flujo[0].length; j++) {//fila
                            suma=suma+flujo[c-3][j];
                            }
                            
                            
                            if (suma instanceof Double) {
                                celda.setCellValue(Double.parseDouble(suma.toString()));
                                } else if (suma instanceof Double) {
                                celda.setCellValue(suma);
                                } else {
                                celda.setCellValue(String.valueOf(suma));
                                }
                            
                            
                        }
                        if(f==5){
                        Cell celda = fila.createCell(c);
                            Double suma=0.0;
                            for (int j = 0; j < flujoOtros[0].length; j++) {//fila
                            suma=suma+flujoOtros[c-3][j];
                            }
                            
                            
                            if (suma instanceof Double) {
                                celda.setCellValue(Double.parseDouble(suma.toString()));
                                } else if (suma instanceof Double) {
                                celda.setCellValue(suma);
                                } else {
                                celda.setCellValue(String.valueOf(suma));
                                }
                        }
                        if(f>1&&f<5){
                            Cell celda = fila.createCell(c);
                            if (flujo[c-3][f-2] instanceof Double) {
                            celda.setCellValue(Double.parseDouble(flujo[c-3][f-2].toString()));
                            } else if (flujo[c-3][f-2] instanceof Double) {
                            celda.setCellValue(flujo[c-3][f-2]);
                            } else {
                            celda.setCellValue(String.valueOf(flujo[f-2][c-3]));
                            }
                            }
                        else if(f>5){
                            Cell celda = fila.createCell(c);
                            if (flujoOtros[c-3][f-6] instanceof Double) {
                            celda.setCellValue(Double.parseDouble(flujoOtros[c-3][f-6].toString()));
                            } else if (flujoOtros[c-3][f-6] instanceof Double) {
                            celda.setCellValue(flujoOtros[c-3][f-6]);
                            } else {
                            celda.setCellValue(String.valueOf(flujoOtros[c-3][f-6]));
                            }
                        }
                        }
                    }
                }
                
                hoja.setColumnWidth(1, 8000);
                libro.write(archivo);
                archivo.close();
                Desktop.getDesktop().open(archivoXLS);
            }
            catch (IOException | NumberFormatException e) {
                throw e;
            }
        }
}
public void exportarExcel(JTable t) throws IOException {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de excel", "xls");
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Guardar archivo");
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            String ruta = chooser.getSelectedFile().toString().concat(".xls");
            try {
                File archivoXLS = new File(ruta);
                if (archivoXLS.exists()) {
                    archivoXLS.delete();
                }
                archivoXLS.createNewFile();
                Workbook libro = new HSSFWorkbook();
                FileOutputStream archivo = new FileOutputStream(archivoXLS);
                Sheet hoja = libro.createSheet("Hoja 1");
                hoja.setDisplayGridlines(false);
                for (int f = 0; f < t.getRowCount(); f++) {
                    Row fila = hoja.createRow(f);
                    for (int c = 0; c < t.getColumnCount(); c++) {
                        Cell celda = fila.createCell(c);
                        if (f == 0) {
                            celda.setCellValue(t.getColumnName(c));
                        }
                    }
                }
                int filaInicio = 1;
                for (int f = 0; f < t.getRowCount(); f++) {
                    Row fila = hoja.createRow(filaInicio);
                    filaInicio++;
                    for (int c = 0; c < t.getColumnCount(); c++) {
                        Cell celda = fila.createCell(c);
                        if (t.getValueAt(f, c) instanceof Double) {
                            celda.setCellValue(Double.parseDouble(t.getValueAt(f, c).toString()));
                        } else if (t.getValueAt(f, c) instanceof Float) {
                            celda.setCellValue(Float.parseFloat((String) t.getValueAt(f, c)));
                        } else {
                            celda.setCellValue(String.valueOf(t.getValueAt(f, c)));
                        }
                    }
                }
                libro.write(archivo);
                archivo.close();
                Desktop.getDesktop().open(archivoXLS);
            } catch (IOException | NumberFormatException e) {
                throw e;
            }
        }
    }
public void exportarExcel(JTable t,JTable t2) throws IOException {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de excel", "xls");
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Guardar archivo");
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            String ruta = chooser.getSelectedFile().toString().concat(".xls");
            try {
                File archivoXLS = new File(ruta);
                if (archivoXLS.exists()) {
                    archivoXLS.delete();
                }
                archivoXLS.createNewFile();
                Workbook libro = new HSSFWorkbook();
                FileOutputStream archivo = new FileOutputStream(archivoXLS);
                Sheet hoja = libro.createSheet("Hoja 1");
                hoja.setDisplayGridlines(false);
                for (int f = 0; f < t.getRowCount(); f++) {
                    Row fila = hoja.createRow(f);
                    for (int c = 0; c < t.getColumnCount()+1; c++) {
                         Cell celda = fila.createCell(c);
                        if(c==0){
                               celda.setCellValue(t2.getColumnName(0));
                        }
                        else{
                         if (f == 0) {
                            celda.setCellValue(t.getColumnName(c-1));
                        }    
                        }
                       
                       
                    }
                }
                int filaInicio = 1;
                for (int f = 0; f < t.getRowCount(); f++) {
                    Row fila = hoja.createRow(filaInicio);
                    filaInicio++;
                    for (int c = 0; c < t.getColumnCount()+1; c++) {
                        Cell celda = fila.createCell(c);
                        if(c==0){
                         if (t2.getValueAt(f, 0) instanceof Double) {
                            celda.setCellValue(Double.parseDouble(t2.getValueAt(f, 0).toString()));
                        } else if (t2.getValueAt(f, 0) instanceof Float) {
                            celda.setCellValue(Float.parseFloat((String) t2.getValueAt(f, 0)));
                        } else {
                            celda.setCellValue(String.valueOf(t2.getValueAt(f, 0)));
                        }   
                       }
                        else{
                        if (t.getValueAt(f, c-1) instanceof Double) {
                            celda.setCellValue(Double.parseDouble(t.getValueAt(f, c-1).toString()));
                        } else if (t.getValueAt(f, c-1) instanceof Float) {
                            celda.setCellValue(Float.parseFloat((String) t.getValueAt(f, c-1)));
                        } else {
                            celda.setCellValue(String.valueOf(t.getValueAt(f, c-1)));
                        }}
                    }
                }
                libro.write(archivo);
                archivo.close();
                Desktop.getDesktop().open(archivoXLS);
            } catch (IOException | NumberFormatException e) {
                throw e;
            }
        }
    }
public void colorCeldas(HSSFWorkbook hssfWorkbook, int fila) {
 HSSFSheet mySheet = hssfWorkbook.getSheetAt(0);
 
 // Creamos el estilo de celda del color ROJO
 HSSFCellStyle styleGroup3 = hssfWorkbook.createCellStyle();
 styleGroup3.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
 styleGroup3.setFillForegroundColor(HSSFColor.RED.index);
 
 // Creamos el estilo de celda del color AMARILLO
 HSSFCellStyle styleGroup2 = hssfWorkbook.createCellStyle();
 styleGroup2.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
 styleGroup2.setFillForegroundColor(HSSFColor.YELLOW.index);
 
 // Creamos el estilo de celda del color VERDE
 HSSFCellStyle styleGroup1 = hssfWorkbook.createCellStyle();
 styleGroup1.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
 styleGroup1.setFillForegroundColor(HSSFColor.GREEN.index);
 
  
 // Recorrer cada columna del excel
 // Comenzamos en 1 porque la 0 es el header del excel
 
}
}
