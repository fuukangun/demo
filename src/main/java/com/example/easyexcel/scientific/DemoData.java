package com.example.easyexcel.scientific;

import com.alibaba.excel.annotation.ExcelProperty;

/**
 * @author ：fuukangun
 * @date ：Created in 2020/6/24 上午10:29
 * @description：
 * @modified By：
 * @version: 1.0.0
 */
public class DemoData {

    @ExcelProperty("billNo")
    private String billNO;

    @ExcelProperty("otherNo")
    private String otherNo;


    public String getBillNO() {
        return billNO;
    }

    public void setBillNO(String billNO) {
        this.billNO = billNO;
    }

    public String getOtherNo() {
        return otherNo;
    }

    public void setOtherNo(String otherNo) {
        this.otherNo = otherNo;
    }

    @Override
    public String toString() {
        return "DemoData{" +
                "billNO='" + billNO + '\'' +
                ", otherNo='" + otherNo + '\'' +
                '}';
    }
}
