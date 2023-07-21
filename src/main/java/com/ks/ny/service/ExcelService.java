package com.ks.ny.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ExcelService {
    List excelParse(MultipartFile file) throws IOException;

}
