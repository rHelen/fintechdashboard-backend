package com.finsight.service;

import com.finsight.dto.DashboardSummaryResponse;
import com.finsight.dto.MonthlyFinancialResponse;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class DashboardService {

    public DashboardSummaryResponse getSummary() {
        return new DashboardSummaryResponse(
                new BigDecimal("248920"),
                new BigDecimal("84200"),
                new BigDecimal("164720"),
                new BigDecimal("23480")
        );
    }

    public List<MonthlyFinancialResponse> getMonthlyData() {
        return List.of(
                new MonthlyFinancialResponse("Jan", new BigDecimal("150000"), new BigDecimal("52000")),
                new MonthlyFinancialResponse("Feb", new BigDecimal("165000"), new BigDecimal("58000")),
                new MonthlyFinancialResponse("Mar", new BigDecimal("172000"), new BigDecimal("61000")),
                new MonthlyFinancialResponse("Apr", new BigDecimal("190000"), new BigDecimal("68000")),
                new MonthlyFinancialResponse("May", new BigDecimal("210000"), new BigDecimal("76000")),
                new MonthlyFinancialResponse("Jun", new BigDecimal("225000"), new BigDecimal("79000")),
                new MonthlyFinancialResponse("Jul", new BigDecimal("235000"), new BigDecimal("81000")),
                new MonthlyFinancialResponse("Aug", new BigDecimal("248920"), new BigDecimal("84200"))
        );
    }
}
