/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodydatetimerfc1123;

import com.microsoft.rest.DateTimeRfc1123;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import fixtures.bodydatetimerfc1123.models.ErrorException;
import java.io.IOException;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.PUT;

/**
 * An instance of this class provides access to all the operations defined
 * in Datetimerfc1123.
 */
public interface Datetimerfc1123 {
    /**
     * The interface defining all the services for Datetimerfc1123 to be
     * used by Retrofit to perform actually REST calls.
     */
    interface Datetimerfc1123Service {
        @GET("/datetimerfc1123/null")
        Call<ResponseBody> getNull();

        @GET("/datetimerfc1123/invalid")
        Call<ResponseBody> getInvalid();

        @GET("/datetimerfc1123/overflow")
        Call<ResponseBody> getOverflow();

        @GET("/datetimerfc1123/underflow")
        Call<ResponseBody> getUnderflow();

        @PUT("/datetimerfc1123/max")
        Call<ResponseBody> putUtcMaxDateTime(@Body DateTimeRfc1123 datetimeBody);

        @GET("/datetimerfc1123/max/lowercase")
        Call<ResponseBody> getUtcLowercaseMaxDateTime();

        @GET("/datetimerfc1123/max/uppercase")
        Call<ResponseBody> getUtcUppercaseMaxDateTime();

        @PUT("/datetimerfc1123/min")
        Call<ResponseBody> putUtcMinDateTime(@Body DateTimeRfc1123 datetimeBody);

        @GET("/datetimerfc1123/min")
        Call<ResponseBody> getUtcMinDateTime();

    }
    /**
     * Get null datetime value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DateTimeRfc1123 object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<DateTimeRfc1123> getNull() throws ErrorException, IOException;

    /**
     * Get null datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getNullAsync(final ServiceCallback<DateTimeRfc1123> serviceCallback);

    /**
     * Get invalid datetime value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DateTimeRfc1123 object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<DateTimeRfc1123> getInvalid() throws ErrorException, IOException;

    /**
     * Get invalid datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getInvalidAsync(final ServiceCallback<DateTimeRfc1123> serviceCallback);

    /**
     * Get overflow datetime value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DateTimeRfc1123 object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<DateTimeRfc1123> getOverflow() throws ErrorException, IOException;

    /**
     * Get overflow datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getOverflowAsync(final ServiceCallback<DateTimeRfc1123> serviceCallback);

    /**
     * Get underflow datetime value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DateTimeRfc1123 object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<DateTimeRfc1123> getUnderflow() throws ErrorException, IOException;

    /**
     * Get underflow datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getUnderflowAsync(final ServiceCallback<DateTimeRfc1123> serviceCallback);

    /**
     * Put max datetime value Fri, 31 Dec 9999 23:59:59 GMT.
     *
     * @param datetimeBody the DateTimeRfc1123 value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putUtcMaxDateTime(DateTimeRfc1123 datetimeBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put max datetime value Fri, 31 Dec 9999 23:59:59 GMT.
     *
     * @param datetimeBody the DateTimeRfc1123 value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putUtcMaxDateTimeAsync(DateTimeRfc1123 datetimeBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get max datetime value fri, 31 dec 9999 23:59:59 gmt.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DateTimeRfc1123 object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<DateTimeRfc1123> getUtcLowercaseMaxDateTime() throws ErrorException, IOException;

    /**
     * Get max datetime value fri, 31 dec 9999 23:59:59 gmt.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getUtcLowercaseMaxDateTimeAsync(final ServiceCallback<DateTimeRfc1123> serviceCallback);

    /**
     * Get max datetime value FRI, 31 DEC 9999 23:59:59 GMT.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DateTimeRfc1123 object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<DateTimeRfc1123> getUtcUppercaseMaxDateTime() throws ErrorException, IOException;

    /**
     * Get max datetime value FRI, 31 DEC 9999 23:59:59 GMT.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getUtcUppercaseMaxDateTimeAsync(final ServiceCallback<DateTimeRfc1123> serviceCallback);

    /**
     * Put min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @param datetimeBody the DateTimeRfc1123 value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> putUtcMinDateTime(DateTimeRfc1123 datetimeBody) throws ErrorException, IOException, IllegalArgumentException;

    /**
     * Put min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @param datetimeBody the DateTimeRfc1123 value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> putUtcMinDateTimeAsync(DateTimeRfc1123 datetimeBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Get min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DateTimeRfc1123 object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<DateTimeRfc1123> getUtcMinDateTime() throws ErrorException, IOException;

    /**
     * Get min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getUtcMinDateTimeAsync(final ServiceCallback<DateTimeRfc1123> serviceCallback);

}
