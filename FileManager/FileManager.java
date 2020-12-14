/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileManager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FileManager {
    
    private String FilePath = "";
    public FileManager(String PathOfFile){
        this.FilePath = PathOfFile;        
    }
    
    public String[] ReadFile() throws IOException{
        
        File f = new File(this.FilePath);
        if(!f.exists()){
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, "فایل " + this.FilePath + " وجود ندارد");  
            String[] EmptyArray = {""};
            return EmptyArray;            
        }
        
        int CountLines = CountLines();
        if(CountLines == 0){
            String[] EmptyArray = {""};
            return EmptyArray;
        }
            
        FileReader fr = null;
        BufferedReader bf = null;
        String[] Result = new String[CountLines];
        try {
            fr = new FileReader(this.FilePath);
            bf = new BufferedReader(fr);            
            for(int i = 0; i < CountLines; i++)
                Result[i] = bf.readLine();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);           
        } finally {
                bf.close();
                fr.close();                
        }
        return Result;
    }
    
    public int CountLines() throws IOException
    {
        File f = new File(this.FilePath);
        if(!f.exists()){
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, "فایل " + this.FilePath + " وجود ندارد");  
            return 0;            
        }
        
        int count = 0;
        FileReader fr = null;
        BufferedReader bf = null;
        try {
            fr = new FileReader(this.FilePath);
            bf = new BufferedReader(fr);            
            while(bf.readLine() != null)
                count++;
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
                bf.close();
                fr.close();                
        }
        return count;
    }
    
    public void Clear(){
        
        File f = new File(this.FilePath);
        if(!f.exists())
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, "فایل " + this.FilePath + " وجود ندارد");         
                
        try {
            FileWriter fw = new FileWriter(this.FilePath, false);
            PrintWriter pw = new PrintWriter(fw, false);
            pw.flush();
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean IsEmpty() throws IOException{
        
        File f = new File(this.FilePath);
        if(!f.exists()){
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, "فایل " + this.FilePath + " وجود ندارد");  
            return true;            
        }
        
        BufferedReader br = null;
        String result = " ";
        try {
            File file = new File(this.FilePath);
            br = new BufferedReader(new FileReader(file));
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                result = br.readLine();
                if(result == null)
                    return true;
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
            }
            return result.length() <= 5;
        }
    }
    
    public void FileWriter(String Data, boolean AppendValue) throws IOException{
        
        File f = new File(this.FilePath);
        if(!f.exists()){
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, "فایل " + this.FilePath + " وجود ندارد");  
            return;
        }
        
        FileWriter fw = new FileWriter(this.FilePath, AppendValue);
        PrintWriter pw = new PrintWriter(fw);        
        pw.println(Data);
        pw.close();
        fw.close();
    }
    
}
