package com.fedy.materiels.services.scannerServ;

import com.fedy.materiels.models.Scanner;
import com.fedy.materiels.repositorys.ScannerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ScannerServiceImpl implements ScannerService{

    @Autowired
    ScannerRepo scannerRepo;

    @Override
    public Scanner saveScanner(Scanner scan) {
        return scannerRepo.save(scan);
    }

    @Override
    public Scanner updateScanner(Scanner scan) {
        return scannerRepo.save(scan);
    }

    @Override
    public void deleteScanner(Scanner scan) {
        scannerRepo.delete(scan);
    }

    @Override
    public void deleteScannerById(int IdScanner) {
        scannerRepo.deleteById(IdScanner);
    }

    @Override
    public Scanner getScanner(int IdScanner) {
        return scannerRepo.findById(IdScanner).orElse(null);
    }

    @Override
    public List<Scanner> getAllScanners() {
        List<Scanner> listScanner=scannerRepo.findAll();
        return listScanner;
    }
}
