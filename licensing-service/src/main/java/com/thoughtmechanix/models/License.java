package com.thoughtmechanix.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class License {
    private String id;
    private String organizationId;
    private String productName;
    private String licenseType;

    public License withId( final String id ) {
        this.id = id;
        return this;
    }

    public License withOrganizationId( final String organizationId ) {
        this.organizationId = organizationId;
        return this;
    }

    public License withProductName( final String productName ) {
        this.productName = productName;
        return this;
    }

    public License withLicenseType( final String licenseType ) {
        this.licenseType = licenseType;
        return this;
    }
}
