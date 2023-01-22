/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school;

/**
 *
 * @author dell
 */import java.io.*;
import java.util.*;
import java.nio.file.*;
public class StudentInput {
     public static String readFileAsString(String fileName)throws Exception
  {
    String data = "";
    data = new String(Files.readAllBytes(Paths.get(fileName)));
    return data;
  }
 
  public static void main(String[] args) throws Exception
  {
    String data = readFileAsString("D:\\FWD\\sOFTWARE tESTING\\projectnew\\Learning_Management_System\\src\\com\\school\\student-data.txt");
    System.out.println(data);
    Scanner scanner = new Scanner(data);
     while(scanner.hasNext()){
          data= scanner.nextLine().replace("#","                    ");
          data= data.replace("$","              \n");
         String [] newdata = data.split("              \n");
          for (int i=0;i<= newdata.length;i++){
                     System.out.println(" "+newdata[i]);
          }
         //System.out.print(data);
        
     }
    
}}
