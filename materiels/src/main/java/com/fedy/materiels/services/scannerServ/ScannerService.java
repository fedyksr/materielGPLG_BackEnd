package com.fedy.materiels.services.scannerServ;

import com.fedy.materiels.models.Scanner;

import java.util.List;

public interface ScannerService {
    Scanner saveScanner(Scanner scan);
    Scanner updateScanner(Scanner scan);
    void deleteScanner(Scanner scan);
    void deleteScannerById(int IdScanner);
    Scanner getScanner(int IdScanner);
    List<Scanner> getAllScanners();
}
