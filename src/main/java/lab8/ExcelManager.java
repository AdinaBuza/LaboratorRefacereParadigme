package lab8;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelManager {

    public void citesteSiAfiseaza(String fileName) throws IOException {
        try (FileInputStream fis = new FileInputStream(fileName);
             Workbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheetAt(0);
            DataFormatter formatter = new DataFormatter();

            for (Row row : sheet) {
                for (Cell cell : row) {
                    String value = formatter.formatCellValue(cell);
                    System.out.printf("%-15s", value);
                }
                System.out.println();
            }
        }
    }

    public void genereazaFisierMediaManual(String inputFile, String outputFile) throws IOException {
        try (FileInputStream fis = new FileInputStream(inputFile);
             Workbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheetAt(0);
            Row header = sheet.getRow(0);
            header.createCell(6).setCellValue("Media (Calculata Java)");

            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                if (row == null) continue;
                double suma = 0;
                int count = 0;
                for (int j = 3; j <= 5; j++) {
                    Cell c = row.getCell(j);
                    if (c != null && c.getCellType() == CellType.NUMERIC) {
                        suma += c.getNumericCellValue();
                        count++;
                    }
                }
                double media = (count > 0) ? (suma / count) : 0;
                row.createCell(6).setCellValue(media);
            }
            try (FileOutputStream fos = new FileOutputStream(outputFile)) {
                workbook.write(fos);
            }
        }
    }

    public void genereazaFisierMediaFormula(String inputFile, String outputFile) throws IOException {
        try (FileInputStream fis = new FileInputStream(inputFile);
             Workbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheetAt(0);
            Row header = sheet.getRow(0);
            header.createCell(6).setCellValue("Media (Formula Excel)");

            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                if (row == null) continue;
                Cell formulaCell = row.createCell(6);
                int rowNum = i + 1;

                formulaCell.setCellFormula("AVERAGE(D" + rowNum + ":F" + rowNum + ")");
            }
            try (FileOutputStream fos = new FileOutputStream(outputFile)) {
                workbook.write(fos);
            }
        }
    }
}