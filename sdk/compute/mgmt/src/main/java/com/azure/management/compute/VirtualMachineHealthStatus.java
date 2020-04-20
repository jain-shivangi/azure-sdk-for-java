// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The VirtualMachineHealthStatus model. */
@Immutable
public final class VirtualMachineHealthStatus {
    /*
     * The health status information for the VM.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private InstanceViewStatus status;

    /**
     * Get the status property: The health status information for the VM.
     *
     * @return the status value.
     */
    public InstanceViewStatus status() {
        return this.status;
    }
}
