package com.nchu.learn.exl;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileWriter;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2018/4/11 11:27
 */
public class ReadExcelTest {
    @Test
    public void testReadExcel() throws Exception {
        String excelPath = "E:\\Code\\3.xlsx";
        String destFilePath = "E:\\Code\\3-ret.sql";
        XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(excelPath));

        XSSFSheet sheet = workbook.getSheetAt(0);
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int index = 1; index < sheet.getLastRowNum(); index++) {
            sb.append(String.format("INSERT INTO sm_fund_trade_temp(orderno) VALUES ('%s'); ",  sheet.getRow(index).getCell(0).getStringCellValue()));
            count++;
            if (count % 50 == 0) {
                sb.append("\n");
            }
        }

        FileWriter writer = new FileWriter(destFilePath);
        writer.write(sb.toString());
        writer.flush();
        writer.close();
    }
}
