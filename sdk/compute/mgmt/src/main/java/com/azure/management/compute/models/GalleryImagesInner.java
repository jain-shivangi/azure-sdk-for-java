// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.models;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.polling.AsyncPollResponse;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in GalleryImages. */
public final class GalleryImagesInner {
    /** The proxy service used to perform REST calls. */
    private final GalleryImagesService service;

    /** The service client containing this operation class. */
    private final ComputeManagementClientImpl client;

    /**
     * Initializes an instance of GalleryImagesInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    GalleryImagesInner(ComputeManagementClientImpl client) {
        this.service =
            RestProxy.create(GalleryImagesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ComputeManagementClientGalleryImages to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ComputeManagementCli")
    private interface GalleryImagesService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute"
                + "/galleries/{galleryName}/images/{galleryImageName}")
        @ExpectedResponses({200, 201, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(
            @HostParam("$host") String host,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("galleryName") String galleryName,
            @PathParam("galleryImageName") String galleryImageName,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") GalleryImageInner galleryImage,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute"
                + "/galleries/{galleryName}/images/{galleryImageName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<GalleryImageInner>> get(
            @HostParam("$host") String host,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("galleryName") String galleryName,
            @PathParam("galleryImageName") String galleryImageName,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json;q=0.9", "Content-Type: application/json"})
        @Delete(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute"
                + "/galleries/{galleryName}/images/{galleryImageName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> delete(
            @HostParam("$host") String host,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("galleryName") String galleryName,
            @PathParam("galleryImageName") String galleryImageName,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute"
                + "/galleries/{galleryName}/images")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<GalleryImageListInner>> listByGallery(
            @HostParam("$host") String host,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("galleryName") String galleryName,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute"
                + "/galleries/{galleryName}/images/{galleryImageName}")
        @ExpectedResponses({200, 201, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<GalleryImageInner>> beginCreateOrUpdate(
            @HostParam("$host") String host,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("galleryName") String galleryName,
            @PathParam("galleryImageName") String galleryImageName,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") GalleryImageInner galleryImage,
            Context context);

        @Headers({"Accept: application/json;q=0.9", "Content-Type: application/json"})
        @Delete(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute"
                + "/galleries/{galleryName}/images/{galleryImageName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginDelete(
            @HostParam("$host") String host,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("galleryName") String galleryName,
            @PathParam("galleryImageName") String galleryImageName,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<GalleryImageListInner>> listByGalleryNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);
    }

    /**
     * Create or update a gallery Image Definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be created.
     * @param galleryImageName The name of the gallery Image Definition to be created or updated. The allowed characters
     *     are alphabets and numbers with dots, dashes, and periods allowed in the middle. The maximum length is 80
     *     characters.
     * @param galleryImage Specifies information about the gallery Image Definition that you want to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Image Definition that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String galleryName, String galleryImageName, GalleryImageInner galleryImage) {
        final String apiVersion = "2019-03-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .createOrUpdate(
                            this.client.getHost(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            galleryName,
                            galleryImageName,
                            apiVersion,
                            galleryImage,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Create or update a gallery Image Definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be created.
     * @param galleryImageName The name of the gallery Image Definition to be created or updated. The allowed characters
     *     are alphabets and numbers with dots, dashes, and periods allowed in the middle. The maximum length is 80
     *     characters.
     * @param galleryImage Specifies information about the gallery Image Definition that you want to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Image Definition that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<GalleryImageInner> createOrUpdateAsync(
        String resourceGroupName, String galleryName, String galleryImageName, GalleryImageInner galleryImage) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> mono =
            createOrUpdateWithResponseAsync(resourceGroupName, galleryName, galleryImageName, galleryImage);
        return this
            .client
            .<GalleryImageInner, GalleryImageInner>getLroResultAsync(
                mono, this.client.getHttpPipeline(), GalleryImageInner.class, GalleryImageInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Create or update a gallery Image Definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be created.
     * @param galleryImageName The name of the gallery Image Definition to be created or updated. The allowed characters
     *     are alphabets and numbers with dots, dashes, and periods allowed in the middle. The maximum length is 80
     *     characters.
     * @param galleryImage Specifies information about the gallery Image Definition that you want to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Image Definition that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public GalleryImageInner createOrUpdate(
        String resourceGroupName, String galleryName, String galleryImageName, GalleryImageInner galleryImage) {
        return createOrUpdateAsync(resourceGroupName, galleryName, galleryImageName, galleryImage).block();
    }

    /**
     * Retrieves information about a gallery Image Definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery from which the Image Definitions are to be retrieved.
     * @param galleryImageName The name of the gallery Image Definition to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Image Definition that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<GalleryImageInner>> getWithResponseAsync(
        String resourceGroupName, String galleryName, String galleryImageName) {
        final String apiVersion = "2019-03-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getHost(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            galleryName,
                            galleryImageName,
                            apiVersion,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Retrieves information about a gallery Image Definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery from which the Image Definitions are to be retrieved.
     * @param galleryImageName The name of the gallery Image Definition to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Image Definition that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<GalleryImageInner> getAsync(String resourceGroupName, String galleryName, String galleryImageName) {
        return getWithResponseAsync(resourceGroupName, galleryName, galleryImageName)
            .flatMap(
                (SimpleResponse<GalleryImageInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Retrieves information about a gallery Image Definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery from which the Image Definitions are to be retrieved.
     * @param galleryImageName The name of the gallery Image Definition to be retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Image Definition that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public GalleryImageInner get(String resourceGroupName, String galleryName, String galleryImageName) {
        return getAsync(resourceGroupName, galleryName, galleryImageName).block();
    }

    /**
     * Delete a gallery image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be deleted.
     * @param galleryImageName The name of the gallery Image Definition to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> deleteWithResponseAsync(
        String resourceGroupName, String galleryName, String galleryImageName) {
        final String apiVersion = "2019-03-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .delete(
                            this.client.getHost(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            galleryName,
                            galleryImageName,
                            apiVersion,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Delete a gallery image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be deleted.
     * @param galleryImageName The name of the gallery Image Definition to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String galleryName, String galleryImageName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> mono =
            deleteWithResponseAsync(resourceGroupName, galleryName, galleryImageName);
        return this
            .client
            .<Void, Void>getLroResultAsync(mono, this.client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Delete a gallery image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be deleted.
     * @param galleryImageName The name of the gallery Image Definition to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String galleryName, String galleryImageName) {
        deleteAsync(resourceGroupName, galleryName, galleryImageName).block();
    }

    /**
     * List gallery Image Definitions in a gallery.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery from which Image Definitions are to be listed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Gallery Images operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<GalleryImageInner>> listByGallerySinglePageAsync(
        String resourceGroupName, String galleryName) {
        final String apiVersion = "2019-03-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByGallery(
                            this.client.getHost(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            galleryName,
                            apiVersion,
                            context))
            .<PagedResponse<GalleryImageInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * List gallery Image Definitions in a gallery.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery from which Image Definitions are to be listed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Gallery Images operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<GalleryImageInner> listByGalleryAsync(String resourceGroupName, String galleryName) {
        return new PagedFlux<>(
            () -> listByGallerySinglePageAsync(resourceGroupName, galleryName),
            nextLink -> listByGalleryNextSinglePageAsync(nextLink));
    }

    /**
     * List gallery Image Definitions in a gallery.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery from which Image Definitions are to be listed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Gallery Images operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<GalleryImageInner> listByGallery(String resourceGroupName, String galleryName) {
        return new PagedIterable<>(listByGalleryAsync(resourceGroupName, galleryName));
    }

    /**
     * Create or update a gallery Image Definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be created.
     * @param galleryImageName The name of the gallery Image Definition to be created or updated. The allowed characters
     *     are alphabets and numbers with dots, dashes, and periods allowed in the middle. The maximum length is 80
     *     characters.
     * @param galleryImage Specifies information about the gallery Image Definition that you want to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Image Definition that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<GalleryImageInner>> beginCreateOrUpdateWithResponseAsync(
        String resourceGroupName, String galleryName, String galleryImageName, GalleryImageInner galleryImage) {
        final String apiVersion = "2019-03-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .beginCreateOrUpdate(
                            this.client.getHost(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            galleryName,
                            galleryImageName,
                            apiVersion,
                            galleryImage,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Create or update a gallery Image Definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be created.
     * @param galleryImageName The name of the gallery Image Definition to be created or updated. The allowed characters
     *     are alphabets and numbers with dots, dashes, and periods allowed in the middle. The maximum length is 80
     *     characters.
     * @param galleryImage Specifies information about the gallery Image Definition that you want to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Image Definition that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<GalleryImageInner> beginCreateOrUpdateAsync(
        String resourceGroupName, String galleryName, String galleryImageName, GalleryImageInner galleryImage) {
        return beginCreateOrUpdateWithResponseAsync(resourceGroupName, galleryName, galleryImageName, galleryImage)
            .flatMap(
                (SimpleResponse<GalleryImageInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Create or update a gallery Image Definition.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be created.
     * @param galleryImageName The name of the gallery Image Definition to be created or updated. The allowed characters
     *     are alphabets and numbers with dots, dashes, and periods allowed in the middle. The maximum length is 80
     *     characters.
     * @param galleryImage Specifies information about the gallery Image Definition that you want to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the gallery Image Definition that you want to create or update.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public GalleryImageInner beginCreateOrUpdate(
        String resourceGroupName, String galleryName, String galleryImageName, GalleryImageInner galleryImage) {
        return beginCreateOrUpdateAsync(resourceGroupName, galleryName, galleryImageName, galleryImage).block();
    }

    /**
     * Delete a gallery image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be deleted.
     * @param galleryImageName The name of the gallery Image Definition to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithResponseAsync(
        String resourceGroupName, String galleryName, String galleryImageName) {
        final String apiVersion = "2019-03-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .beginDelete(
                            this.client.getHost(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            galleryName,
                            galleryImageName,
                            apiVersion,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Delete a gallery image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be deleted.
     * @param galleryImageName The name of the gallery Image Definition to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteAsync(String resourceGroupName, String galleryName, String galleryImageName) {
        return beginDeleteWithResponseAsync(resourceGroupName, galleryName, galleryImageName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Delete a gallery image.
     *
     * @param resourceGroupName The name of the resource group.
     * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be deleted.
     * @param galleryImageName The name of the gallery Image Definition to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDelete(String resourceGroupName, String galleryName, String galleryImageName) {
        beginDeleteAsync(resourceGroupName, galleryName, galleryImageName).block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Gallery Images operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<GalleryImageInner>> listByGalleryNextSinglePageAsync(String nextLink) {
        return FluxUtil
            .withContext(context -> service.listByGalleryNext(nextLink, context))
            .<PagedResponse<GalleryImageInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }
}
