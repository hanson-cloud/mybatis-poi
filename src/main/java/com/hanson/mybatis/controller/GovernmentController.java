package com.hanson.mybatis.controller;


import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.enmus.ExcelType;
import com.hanson.mybatis.bean.Government;
import com.hanson.mybatis.service.GovernmentService;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
import java.util.List;

/**
 * <p>
 * 政企客户主表 前端控制器
 * </p>
 *
 * @author hanson
 * @since 2019-10-18
 */
@Controller
@RequestMapping("/mybatis/government")
public class GovernmentController {

    protected static final String HSSF = ".xls";
    protected static final String XSSF = ".xlsx";
    private static final String DISPOSITION_FORMAT = "attachment; filename=\"%s\"; filename*=utf-8''%s";
    @Autowired
    GovernmentService service;

    @RequestMapping("07")
    public void toHtmlOf07Base(HttpServletRequest request,HttpServletResponse response) throws Exception {
        List<Government> governments=service.doSearch();
        ExportParams params = new ExportParams("政企客户", "政企客户",ExcelType.HSSF);
        params.setFreezeCol(2);
        params.setCreateHeadRows(true);
        Workbook workbook = ExcelExportUtil.exportExcel(params,
                Government.class, governments);
        out(workbook,"政企客户",request,response);
    }

    public void out(Workbook workbook, String codedFileName, HttpServletRequest request,
                    HttpServletResponse response) throws Exception {
        if (workbook instanceof HSSFWorkbook) {
            codedFileName += HSSF;
        } else {
            codedFileName += XSSF;
        }
        response.setContentType("multipart/form-data");
        response.setContentType("text/html;application/vnd.ms-excel");
        // 用工具类生成符合RFC 5987标准的文件名header, 去掉UA判断
        response.setHeader("content-disposition", String.format(DISPOSITION_FORMAT, URLEncoder.encode(codedFileName, "UTF-8"), URLEncoder.encode(codedFileName, "UTF-8")));
        ServletOutputStream out = response.getOutputStream();
        workbook.write(out);
        out.flush();
    }

}
