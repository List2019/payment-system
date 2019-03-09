package com.epam.demo.service;

import com.epam.demo.dto.Logger;
import com.epam.demo.repository.LoggerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoggerService implements ILoggerService{

    @Autowired
    private LoggerRepository loggerRepository;

    public List<Logger> getAllLog() {
        return loggerRepository.getAllLogs();
    }
}
