package com.ks.ny.service;

import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface ExcelService {
    Map excelParse(MultipartFile file) throws IOException;

}
