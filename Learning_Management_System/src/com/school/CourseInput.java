/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school;

/**
 *
 * @author dell
 */
import java.io.*;
import java.util.*;
import java.nio.file.*;

public class CourseInput {

    public static String readFileAsString(String fileName) throws Exception {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }

    public static void main(String[] args) throws IOException, Exception {
        String data = readFileAsString("D:\\FWD\\sOFTWARE tESTING\\projectnew\\Sales_Invoice_Generator\\src\\com\\mycompany\\coursedata.xml");
        //  System.out.println(data);

        Scanner scanner = new Scanner(data);
        while (scanner.hasNext()) {
            data = scanner.nextLine().replace("<?xml version=\"1.0\" encoding=\"UTF-8\"?>", "");
            data = data.replace("<root>", "");
            data = data.replace("</root>", "");
            data = data.replace("<row>", "");
            data = data.replace("</row>", "");
            data = data.replace("</id>", ",");
            data = data.replace("<id>", "");
            data = data.replace("</CourseName>", ",");
            data = data.replace("<CourseName>", "");
            data = data.replace("</Instructor>", ",");
            data = data.replace("<Instructor>", "");
            data = data.replace("</CourseDuration>", ",");
            data = data.replace("<CourseDuration>", "");
            data = data.replace("</CourseTime>", ",");
            data = data.replace("<CourseTime>", "");
            data = data.replace("</Location>", ",");
            data = data.replace("<Location>", "");
            System.out.println(data);

        }
    }
}
