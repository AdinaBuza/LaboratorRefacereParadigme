package lab8;

import lab7.Student;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentExcelManager {

    public void exportaStudenti(List<Student> lista, String numeFisier) throws IOException {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Studenti");

        Row header = sheet.createRow(0);
        header.createCell(0).setCellValue("ID");
        header.createCell(1).setCellValue("Prenume");
        header.createCell(2).setCellValue("Nume");
        header.createCell(3).setCellValue("Grupa");

        int rowIdx = 1;
        for (Student s : lista) {
            Row row = sheet.createRow(rowIdx++);
            row.createCell(0).setCellValue(s.getNumarMatricol());
            row.createCell(1).setCellValue(s.getPrenume());
            row.createCell(2).setCellValue(s.getNume());
            row.createCell(3).setCellValue(s.getFormatieDeStudiu());
        }

        try (FileOutputStream fos = new FileOutputStream(numeFisier)) {
            workbook.write(fos);
        }
        workbook.close();
    }

    public List<Student> importaStudenti(String numeFisier) throws IOException {
        List<Student> lista = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(numeFisier);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);

            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                if (row == null) continue;

                int id = (int) row.getCell(0).getNumericCellValue();
                String prenume = row.getCell(1).getStringCellValue();
                String nume = row.getCell(2).getStringCellValue();
                String grupa = row.getCell(3).getStringCellValue();

                lista.add(new Student(id, prenume, nume, grupa, 0.0f));
            }
        }
        return lista;
    }
}