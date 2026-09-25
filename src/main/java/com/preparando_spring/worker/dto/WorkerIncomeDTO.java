package com.preparando_spring.worker.dto;

public record WorkerIncomeDTO(
        String name,
        String department,
        Double income
) {
}
