package com.ks.ny.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface ExcelService {
    String excelParse(MultipartFile file) throws IOException;
}
