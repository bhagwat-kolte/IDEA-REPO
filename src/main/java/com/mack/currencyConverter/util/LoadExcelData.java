package com.mack.currencyConverter.util;

/**
 * @author Bhagwat Kolte
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.mack.currencyConverter.data.Currency;
import com.mack.currencyConverter.data.Rates;
import com.mack.currencyConverter.repo.CurrencyRepository;
import com.mack.currencyConverter.repo.RatesRepository;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;

public class LoadExcelData {

    public List<Currency> readExcelData() throws IOException {

        List<Currency> currencyBeans = new ArrayList<>();
        FileInputStream fis=new FileInputStream(new File("D:\\currencies.xlsx"));

        XSSFWorkbook wb=new XSSFWorkbook(fis);

        XSSFSheet sheet=wb.getSheetAt(0);
        FormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator();
        int i = 0, j = 0;
        for(Row row: sheet)
        {
            Currency currencyBean = new Currency();
            j = 0;
            for(Cell cell: row)    //iteration over cell using for each loop
            {
                if( j == 0){
                    currencyBean.setCurrencyID((long) (100 + i));
                    currencyBean.setCountryCode(cell.getStringCellValue());
                } else if (j == 1) {
                    currencyBean.setCountryName(cell.getStringCellValue());
                } else if (j == 2) {
                    currencyBean.setCurrencyName(cell.getStringCellValue());
                } else if (j == 3) {
                    currencyBean.setCurrencyCode(cell.getStringCellValue());
                }
                j++;
            }
            currencyBeans.add(currencyBean);
            i++;
        }
        return currencyBeans;
    }


    public List<Rates> readExcelDataForExchangeRates(List<Currency> currency) throws IOException {


        List<Rates> rates = new ArrayList<>();

        FileInputStream fis=new FileInputStream(new File("D:\\downloaded.xlsx"));

        XSSFWorkbook wb=new XSSFWorkbook(fis);

        XSSFSheet sheet=wb.getSheetAt(0);
        FormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator();
        int i = 0, j = 0, k = 1;
        for(Row row: sheet)
        {
            Rates rateBean = new Rates();
            j = 0;
            Boolean flag = false;
            for(Cell cell: row)    //iteration over cell using for each loop
            {
                if( j == 0){
                    for (Currency curr : currency) {
                        if (curr.getCurrencyCode().equalsIgnoreCase(cell.getStringCellValue())) {
                            rateBean.setRateID((long) (100 + k));
                            rateBean.setCurrencyID(curr.getCurrencyID());
                            flag = true;
                            k++;
                        }
                    }
                } else if (j == 1) {
                    if (flag)
                        rateBean.setRate("" + cell.getNumericCellValue());
                }
                j++;
            }
            if(flag){
                rates.add(rateBean);
            }
            i++;
        }
        return rates;
    }

}
