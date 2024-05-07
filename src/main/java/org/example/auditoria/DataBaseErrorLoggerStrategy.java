/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.auditoria;

import org.example.domain.User;
import org.springframework.stereotype.Component;

@Component
public class DataBaseErrorLoggerStrategy implements ErrorLoggerStrategy {
    @Override
    public void logError(Error error, User user) {
        throw new UnsupportedOperationException("No se ha implementado la funcionalidad para almacenar los datos: " + error.toString());
    }
}
