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
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.*;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;


/**
 *
 * @author macbook
 */
public class ExportExc {
   
public void exportIncomeFlow(Double[][] flujo,Project p) throws IOException{
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
                hoja.setDisplayGridlines(false);
                for (int f = 0; f < flujo.length+1; f++) {
                    Row fila = hoja.createRow(f);
                    for (int c = 0; c < flujo[0].length+1; c++) {
                        Cell celda = fila.createCell(c);
                       
                        if (f == 0) {
                            if(c==0){
                            celda.setCellValue("TOTAL");
                            }
                            else{
                            Date d= new Date(p.Date.getYear(),p.Date.getMonth(),p.Date.getDay());
                            d.setMonth(p.Date.getMonth()+c-1);
                            
                            celda.setCellValue(meses[d.getMonth()]);
                            }
                        }
                        
                    }
                }
                int filaInicio = 1;
                for (int f = 0; f < flujo.length; f++) {
                    Row fila = hoja.createRow(filaInicio);
                    filaInicio++;
                    for (int c = 0; c < flujo[0].length+1; c++) {
                        if(c==0){
                          Double suma=0.0;
                        for (int a = 0; a < flujo[c].length+1; a++){
                        suma=suma+flujo[c][a];
                        
                        }
                        
                        }
                        else{
                        Cell celda = fila.createCell(c-1);
                        if (flujo[f][c] instanceof Double) {
                            celda.setCellValue(Double.parseDouble(flujo[f][c-1].toString()));
                            } else if (flujo[f][c-1] instanceof Double) {
                            celda.setCellValue(flujo[f][c-1]);
                        } else {
                            celda.setCellValue(String.valueOf(flujo[f][c-1]));
                        }
                        }
                    }
                }
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
}
