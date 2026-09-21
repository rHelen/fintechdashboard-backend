package com.finsight.controller;

import com.finsight.dto.DashboardSummaryResponse;
import com.finsight.dto.MonthlyFinancialResponse;
import com.finsight.service.DashboardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {

    private final DashboardService dashboardService;

    public DashboardController(DashboardService dashboardService) {
        this.dashboardService = dashboardService;
    }

    @GetMapping("/summary")
    public ResponseEntity<DashboardSummaryResponse> getSummary() {
        return ResponseEntity.ok(dashboardService.getSummary());
    }

    @GetMapping("/monthly")
    public ResponseEntity<List<MonthlyFinancialResponse>> getMonthlyData() {
        return ResponseEntity.ok(dashboardService.getMonthlyData());
    }
}
