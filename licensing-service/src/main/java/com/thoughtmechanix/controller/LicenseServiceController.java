package com.thoughtmechanix.controller;

import com.thoughtmechanix.models.License;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/organizations/{organizationId}/licenses")
public class LicenseServiceController {

    @GetMapping("/{licenseId}")
    public ResponseEntity<License> getLicense(
            @PathVariable("organizationId") String organizationId,
            @PathVariable("licenseId") String licenseId
    ) {
        License license = new License()
                .withId(licenseId)
                .withOrganizationId(organizationId)
                .withLicenseType("Seat")
                .withProductName("Telco");
        return ResponseEntity.ok(license);
    }
}
