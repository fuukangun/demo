package com.example.easyexcel.scientific;

import com.alibaba.excel.EasyExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author ：fuukangun
 * @date ：Created in 2020/6/24 上午10:24
 * @description：
 * @modified By：
 * @version: 1.0.0
 */
public class ExcelReadMain {

    public static void main(String[] args) throws Exception {

        String path = ExcelReadMain.class.getResource("/").getPath() + "demo.xlsx";
        File file = new File(path);
        InputStream inputStream = new FileInputStream(file);

        EasyExcel.read(inputStream, DemoData.class, new DemoListener()).sheet().autoTrim(Boolean.TRUE).doRead();
    }
}
