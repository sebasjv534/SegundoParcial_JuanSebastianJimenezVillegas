/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.auditoria;

import org.example.domain.User;
import org.example.exception.ErrorLoggerException;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sala8
 */
@Service
public class ErrorLoggerService {
private final Map<User, Integer> errorCountMap = new HashMap<>();
    private final ErrorLoggerStrategy errorLoggerStrategy;

    public ErrorLoggerService(ErrorLoggerStrategy errorLoggerStrategy) {
        this.errorLoggerStrategy = errorLoggerStrategy;
    }

    public void logError(Error error, User user) {
        int errorCount = errorCountMap.getOrDefault(user, 0);
        errorCountMap.put(user, errorCount + 1);

        if (errorCount >= 2) {
            errorLoggerStrategy.logError(error, user);
            errorCountMap.remove(user);
        } else {
            throw new ErrorLoggerException("Error occurred, but not logged yet. Error count: " + errorCount);
        }
    }
}
