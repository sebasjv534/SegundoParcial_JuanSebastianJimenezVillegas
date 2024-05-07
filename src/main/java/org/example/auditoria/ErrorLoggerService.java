/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.auditoria;

/**
 *
 * @author sala8
 */
public class ErrorLoggerService {
    private ErrorLoggerStrategy errorLoggerStrategy;

    public ErrorLoggerService(ErrorLoggerStrategy errorLoggerStrategy) {
        this.errorLoggerStrategy = errorLoggerStrategy;
    }

    public void logError(Error error) {
        errorLoggerStrategy.logError(error);
    }
}
