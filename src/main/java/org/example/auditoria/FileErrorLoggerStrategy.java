/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.auditoria;

import org.example.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 *
 * @author sala8
 */
@Component
public class FileErrorLoggerStrategy implements ErrorLoggerStrategy {
    private static final Logger logger = LoggerFactory.getLogger(FileErrorLoggerStrategy.class);

    @Override
    public void logError(Error error, User user) {
        logger.error("Error occurred for user: {}, error: {}", user, error);
        // Aquí puedes implementar la lógica para registrar el error en un archivo
    }
}
