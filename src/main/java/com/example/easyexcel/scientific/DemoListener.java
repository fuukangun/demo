package com.example.easyexcel.scientific;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

/**
 * @author ：fuukangun
 * @date ：Created in 2020/6/24 上午10:28
 * @description：
 * @modified By：
 * @version: 1.0.0
 */
public class DemoListener extends AnalysisEventListener<DemoData> {


    /**
     * When analysis one row trigger invoke function.
     *
     * @param data    one row value. Is is same as {@link AnalysisContext#readRowHolder()}
     * @param context
     */
    @Override
    public void invoke(DemoData data, AnalysisContext context) {
        System.out.println(data.toString());
    }

    /**
     * if have something to do after all analysis
     *
     * @param context
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {

    }
}
