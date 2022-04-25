package Resources;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class UserExcel {
    public  String name;
    public  String username;
    public  String password;
    public  String contact;
    public  String email;
    public  String orgMail;
    public  String date;
    public   void readCells()throws IOException {
        String excelFilePath = "src/main/resources/userSign.xlsx";
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);
        int rows = sheet.getLastRowNum();
        int cols = sheet.getRow(1).getLastCellNum();

        for (int i = 1; i <= rows; i++) {
            XSSFRow row = sheet.getRow(i);
            for (int j = 0; j < cols; j++) {
                XSSFCell cell = row.getCell(j);
                if (j == 0) {
                    name = cell.getStringCellValue();
                    System.out.println(name);
                }
                if (j == 1) {
                    username = cell.getStringCellValue();
                    System.out.println(username);
                }
                if (j == 2) {
                    password =  cell.getStringCellValue();
                    System.out.println(password);
                }
                if (j == 3) {
                    contact = cell.getStringCellValue();
                    System.out.println(contact);
                }
                if (j == 4) {
                    email =  cell.getStringCellValue();
                    System.out.println(email);
                }
                if (j == 5) {
                    orgMail =  cell.getStringCellValue();
                    System.out.println(orgMail);
                }
                if (j == 6) {
                    date =  cell.getStringCellValue();
                    System.out.println(date);
                }

            }
        }
    }
    public String getName()
    {
        return name;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public String getContact()
    {
        return contact;
    }
    public String getEmail(){
        return email;
    }
    public String getOrgMail(){
        return orgMail;
    }
    public  String getDate(){
        return  date;
    }
}

