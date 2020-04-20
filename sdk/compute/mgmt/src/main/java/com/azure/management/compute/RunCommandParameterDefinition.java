// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The RunCommandParameterDefinition model. */
@Fluent
public final class RunCommandParameterDefinition {
    /*
     * The run command parameter name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The run command parameter type.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /*
     * The run command parameter default value.
     */
    @JsonProperty(value = "defaultValue")
    private String defaultValue;

    /*
     * The run command parameter required.
     */
    @JsonProperty(value = "required")
    private Boolean required;

    /**
     * Get the name property: The run command parameter name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The run command parameter name.
     *
     * @param name the name value to set.
     * @return the RunCommandParameterDefinition object itself.
     */
    public RunCommandParameterDefinition withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The run command parameter type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The run command parameter type.
     *
     * @param type the type value to set.
     * @return the RunCommandParameterDefinition object itself.
     */
    public RunCommandParameterDefinition withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the defaultValue property: The run command parameter default value.
     *
     * @return the defaultValue value.
     */
    public String defaultValue() {
        return this.defaultValue;
    }

    /**
     * Set the defaultValue property: The run command parameter default value.
     *
     * @param defaultValue the defaultValue value to set.
     * @return the RunCommandParameterDefinition object itself.
     */
    public RunCommandParameterDefinition withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * Get the required property: The run command parameter required.
     *
     * @return the required value.
     */
    public Boolean required() {
        return this.required;
    }

    /**
     * Set the required property: The run command parameter required.
     *
     * @param required the required value to set.
     * @return the RunCommandParameterDefinition object itself.
     */
    public RunCommandParameterDefinition withRequired(Boolean required) {
        this.required = required;
        return this;
    }
}
