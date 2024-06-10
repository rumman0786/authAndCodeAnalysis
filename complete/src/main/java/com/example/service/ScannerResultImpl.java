package com.example.service;

import com.example.entity.ScannerResult;
import com.example.repository.ScannerRepository;
import org.springframework.stereotype.Service;

/**
 * @author rumman
 * @since 06/09,2024
 */
@Service
public class ScannerResultImpl implements ScannerResultService {

    private ScannerRepository scannerRepository;

    public ScannerResultImpl(ScannerRepository scannerRepository) {
        this.scannerRepository = scannerRepository;
    }

    @Override
    public void saveResult(ScannerResult result) {
        scannerRepository.save(result);
    }
}
