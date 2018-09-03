package com.qibill.utils;

import java.io.IOException;
import java.nio.charset.Charset;

import com.qibill.csvreader.CsvReader;
import com.qibill.csvreader.CsvWriter;

public class CsvUtil {

    private CsvUtil() {
    }

    public static void read(){

        String filePath = "G:\\IdeaProjects\\MyUtils\\src\\test\\resources\\csv\\11128254.csv";

        try {
            // 创建CSV读对象
            CsvReader csvReader = new CsvReader(filePath);

           while (csvReader.readRecord()){
                // 读一整行
               System.out.println(csvReader.getRawRecord());
                // 读这行的某一列
//                System.out.println(csvReader.get("Link"));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String creatCsv(String filePath){

        try {
            // 创建CSV写对象
            CsvWriter csvWriter = new CsvWriter(filePath,'\t', Charset.forName("utf-8"));
            //CsvWriter csvWriter = new CsvWriter(filePath);

            // 写表头
            String[] headers = {"编号","姓名","年龄"};
            String[] content1 = {};
            String[] content = {"12365","张山","34"};
            csvWriter.writeRecord(headers);
            csvWriter.writeRecord(content1);
            csvWriter.writeRecord(content);
            csvWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return filePath + "=====创建成功";
    }

    public static void main(String[] args){
        read();
        creatCsv("D:\\1.csv");
    }
}
