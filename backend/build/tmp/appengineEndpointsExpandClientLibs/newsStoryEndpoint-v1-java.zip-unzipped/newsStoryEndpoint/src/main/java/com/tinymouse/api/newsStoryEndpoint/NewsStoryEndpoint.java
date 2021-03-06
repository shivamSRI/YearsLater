/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2015-03-26 20:30:19 UTC)
 * on 2015-04-20 at 17:12:15 UTC 
 * Modify at your own risk.
 */

package com.tinymouse.api.newsStoryEndpoint;

/**
 * Service definition for NewsStoryEndpoint (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link NewsStoryEndpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class NewsStoryEndpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.20.0 of the newsStoryEndpoint library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://myApplicationId.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "newsStoryEndpoint/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public NewsStoryEndpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  NewsStoryEndpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "insertNewsStory".
   *
   * This request holds the parameters needed by the newsStoryEndpoint server.  After setting any
   * optional parameters, call the {@link InsertNewsStory#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.tinymouse.api.newsStoryEndpoint.model.NewsStory}
   * @return the request
   */
  public InsertNewsStory insertNewsStory(com.tinymouse.api.newsStoryEndpoint.model.NewsStory content) throws java.io.IOException {
    InsertNewsStory result = new InsertNewsStory(content);
    initialize(result);
    return result;
  }

  public class InsertNewsStory extends NewsStoryEndpointRequest<com.tinymouse.api.newsStoryEndpoint.model.NewsStory> {

    private static final String REST_PATH = "newsstory";

    /**
     * Create a request for the method "insertNewsStory".
     *
     * This request holds the parameters needed by the the newsStoryEndpoint server.  After setting
     * any optional parameters, call the {@link InsertNewsStory#execute()} method to invoke the remote
     * operation. <p> {@link InsertNewsStory#initialize(com.google.api.client.googleapis.services.Abst
     * ractGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param content the {@link com.tinymouse.api.newsStoryEndpoint.model.NewsStory}
     * @since 1.13
     */
    protected InsertNewsStory(com.tinymouse.api.newsStoryEndpoint.model.NewsStory content) {
      super(NewsStoryEndpoint.this, "POST", REST_PATH, content, com.tinymouse.api.newsStoryEndpoint.model.NewsStory.class);
    }

    @Override
    public InsertNewsStory setAlt(java.lang.String alt) {
      return (InsertNewsStory) super.setAlt(alt);
    }

    @Override
    public InsertNewsStory setFields(java.lang.String fields) {
      return (InsertNewsStory) super.setFields(fields);
    }

    @Override
    public InsertNewsStory setKey(java.lang.String key) {
      return (InsertNewsStory) super.setKey(key);
    }

    @Override
    public InsertNewsStory setOauthToken(java.lang.String oauthToken) {
      return (InsertNewsStory) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertNewsStory setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertNewsStory) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertNewsStory setQuotaUser(java.lang.String quotaUser) {
      return (InsertNewsStory) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertNewsStory setUserIp(java.lang.String userIp) {
      return (InsertNewsStory) super.setUserIp(userIp);
    }

    @Override
    public InsertNewsStory set(String parameterName, Object value) {
      return (InsertNewsStory) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listNewsStory".
   *
   * This request holds the parameters needed by the newsStoryEndpoint server.  After setting any
   * optional parameters, call the {@link ListNewsStory#execute()} method to invoke the remote
   * operation.
   *
   * @return the request
   */
  public ListNewsStory listNewsStory() throws java.io.IOException {
    ListNewsStory result = new ListNewsStory();
    initialize(result);
    return result;
  }

  public class ListNewsStory extends NewsStoryEndpointRequest<com.tinymouse.api.newsStoryEndpoint.model.CollectionResponseNewsStory> {

    private static final String REST_PATH = "newsstory";

    /**
     * Create a request for the method "listNewsStory".
     *
     * This request holds the parameters needed by the the newsStoryEndpoint server.  After setting
     * any optional parameters, call the {@link ListNewsStory#execute()} method to invoke the remote
     * operation. <p> {@link ListNewsStory#initialize(com.google.api.client.googleapis.services.Abstra
     * ctGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @since 1.13
     */
    protected ListNewsStory() {
      super(NewsStoryEndpoint.this, "GET", REST_PATH, null, com.tinymouse.api.newsStoryEndpoint.model.CollectionResponseNewsStory.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public ListNewsStory setAlt(java.lang.String alt) {
      return (ListNewsStory) super.setAlt(alt);
    }

    @Override
    public ListNewsStory setFields(java.lang.String fields) {
      return (ListNewsStory) super.setFields(fields);
    }

    @Override
    public ListNewsStory setKey(java.lang.String key) {
      return (ListNewsStory) super.setKey(key);
    }

    @Override
    public ListNewsStory setOauthToken(java.lang.String oauthToken) {
      return (ListNewsStory) super.setOauthToken(oauthToken);
    }

    @Override
    public ListNewsStory setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListNewsStory) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListNewsStory setQuotaUser(java.lang.String quotaUser) {
      return (ListNewsStory) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListNewsStory setUserIp(java.lang.String userIp) {
      return (ListNewsStory) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Integer count;

    /**

     */
    public java.lang.Integer getCount() {
      return count;
    }

    public ListNewsStory setCount(java.lang.Integer count) {
      this.count = count;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListNewsStory setCursor(java.lang.String cursor) {
      this.cursor = cursor;
      return this;
    }

    @Override
    public ListNewsStory set(String parameterName, Object value) {
      return (ListNewsStory) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removeNewsStory".
   *
   * This request holds the parameters needed by the newsStoryEndpoint server.  After setting any
   * optional parameters, call the {@link RemoveNewsStory#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   */
  public RemoveNewsStory removeNewsStory(java.lang.Long id) throws java.io.IOException {
    RemoveNewsStory result = new RemoveNewsStory(id);
    initialize(result);
    return result;
  }

  public class RemoveNewsStory extends NewsStoryEndpointRequest<Void> {

    private static final String REST_PATH = "newsstory/{id}";

    /**
     * Create a request for the method "removeNewsStory".
     *
     * This request holds the parameters needed by the the newsStoryEndpoint server.  After setting
     * any optional parameters, call the {@link RemoveNewsStory#execute()} method to invoke the remote
     * operation. <p> {@link RemoveNewsStory#initialize(com.google.api.client.googleapis.services.Abst
     * ractGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected RemoveNewsStory(java.lang.Long id) {
      super(NewsStoryEndpoint.this, "DELETE", REST_PATH, null, Void.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public RemoveNewsStory setAlt(java.lang.String alt) {
      return (RemoveNewsStory) super.setAlt(alt);
    }

    @Override
    public RemoveNewsStory setFields(java.lang.String fields) {
      return (RemoveNewsStory) super.setFields(fields);
    }

    @Override
    public RemoveNewsStory setKey(java.lang.String key) {
      return (RemoveNewsStory) super.setKey(key);
    }

    @Override
    public RemoveNewsStory setOauthToken(java.lang.String oauthToken) {
      return (RemoveNewsStory) super.setOauthToken(oauthToken);
    }

    @Override
    public RemoveNewsStory setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemoveNewsStory) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemoveNewsStory setQuotaUser(java.lang.String quotaUser) {
      return (RemoveNewsStory) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemoveNewsStory setUserIp(java.lang.String userIp) {
      return (RemoveNewsStory) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public RemoveNewsStory setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public RemoveNewsStory set(String parameterName, Object value) {
      return (RemoveNewsStory) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateNewsStory".
   *
   * This request holds the parameters needed by the newsStoryEndpoint server.  After setting any
   * optional parameters, call the {@link UpdateNewsStory#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.tinymouse.api.newsStoryEndpoint.model.NewsStory}
   * @return the request
   */
  public UpdateNewsStory updateNewsStory(com.tinymouse.api.newsStoryEndpoint.model.NewsStory content) throws java.io.IOException {
    UpdateNewsStory result = new UpdateNewsStory(content);
    initialize(result);
    return result;
  }

  public class UpdateNewsStory extends NewsStoryEndpointRequest<com.tinymouse.api.newsStoryEndpoint.model.NewsStory> {

    private static final String REST_PATH = "newsstory";

    /**
     * Create a request for the method "updateNewsStory".
     *
     * This request holds the parameters needed by the the newsStoryEndpoint server.  After setting
     * any optional parameters, call the {@link UpdateNewsStory#execute()} method to invoke the remote
     * operation. <p> {@link UpdateNewsStory#initialize(com.google.api.client.googleapis.services.Abst
     * ractGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param content the {@link com.tinymouse.api.newsStoryEndpoint.model.NewsStory}
     * @since 1.13
     */
    protected UpdateNewsStory(com.tinymouse.api.newsStoryEndpoint.model.NewsStory content) {
      super(NewsStoryEndpoint.this, "PUT", REST_PATH, content, com.tinymouse.api.newsStoryEndpoint.model.NewsStory.class);
    }

    @Override
    public UpdateNewsStory setAlt(java.lang.String alt) {
      return (UpdateNewsStory) super.setAlt(alt);
    }

    @Override
    public UpdateNewsStory setFields(java.lang.String fields) {
      return (UpdateNewsStory) super.setFields(fields);
    }

    @Override
    public UpdateNewsStory setKey(java.lang.String key) {
      return (UpdateNewsStory) super.setKey(key);
    }

    @Override
    public UpdateNewsStory setOauthToken(java.lang.String oauthToken) {
      return (UpdateNewsStory) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateNewsStory setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateNewsStory) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateNewsStory setQuotaUser(java.lang.String quotaUser) {
      return (UpdateNewsStory) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateNewsStory setUserIp(java.lang.String userIp) {
      return (UpdateNewsStory) super.setUserIp(userIp);
    }

    @Override
    public UpdateNewsStory set(String parameterName, Object value) {
      return (UpdateNewsStory) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link NewsStoryEndpoint}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link NewsStoryEndpoint}. */
    @Override
    public NewsStoryEndpoint build() {
      return new NewsStoryEndpoint(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link NewsStoryEndpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setNewsStoryEndpointRequestInitializer(
        NewsStoryEndpointRequestInitializer newsstoryendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(newsstoryendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
