// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.dns;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The CaaRecord model. */
@Fluent
public final class CaaRecord {
    /*
     * The flags for this CAA record as an integer between 0 and 255.
     */
    @JsonProperty(value = "flags")
    private Integer flags;

    /*
     * The tag for this CAA record.
     */
    @JsonProperty(value = "tag")
    private String tag;

    /*
     * The value for this CAA record.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get the flags property: The flags for this CAA record as an integer between 0 and 255.
     *
     * @return the flags value.
     */
    public Integer flags() {
        return this.flags;
    }

    /**
     * Set the flags property: The flags for this CAA record as an integer between 0 and 255.
     *
     * @param flags the flags value to set.
     * @return the CaaRecord object itself.
     */
    public CaaRecord withFlags(Integer flags) {
        this.flags = flags;
        return this;
    }

    /**
     * Get the tag property: The tag for this CAA record.
     *
     * @return the tag value.
     */
    public String tag() {
        return this.tag;
    }

    /**
     * Set the tag property: The tag for this CAA record.
     *
     * @param tag the tag value to set.
     * @return the CaaRecord object itself.
     */
    public CaaRecord withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * Get the value property: The value for this CAA record.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The value for this CAA record.
     *
     * @param value the value value to set.
     * @return the CaaRecord object itself.
     */
    public CaaRecord withValue(String value) {
        this.value = value;
        return this;
    }
}
