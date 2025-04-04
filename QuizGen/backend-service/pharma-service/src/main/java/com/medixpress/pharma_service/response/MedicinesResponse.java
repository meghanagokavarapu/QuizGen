package com.medixpress.pharma_service.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MedicinesResponse {

    private List<Medicine> pharmacyMedicines = new ArrayList<>();

}
