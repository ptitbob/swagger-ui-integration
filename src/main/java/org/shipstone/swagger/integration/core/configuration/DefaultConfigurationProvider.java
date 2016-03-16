package org.shipstone.swagger.integration.core.configuration;

/**
 * @author francois
 */
public interface DefaultConfigurationProvider {

  public static final String DEFAULT_API_DOC_PATH = "/api-docs";
  public static final String DEFAULT_REST_APPLICATION_ROOT = "/api";
  public static final String DEFAULT_SYSTEM_SWAGGERUI_PROPERTIES = "swaggerui.properties";
  public static final String DEFAULT_SWAGGER_CONFIGURATION_FILE = "swagger-project.properties";
  public static final String DEFAULT_SWAGGER_UI_INDEX = "inside-docs/index.html";
  public static final String DEFAULT_HOST = "localhost:8080";

  public static final String EMPTY = "";

  /**
   * Provide default configuration with default values
   * @return default configuration
   */
  default Configuration getDefaultConfiguration() {
    return new Configuration(DEFAULT_SWAGGER_CONFIGURATION_FILE, null, DEFAULT_HOST, null, DEFAULT_REST_APPLICATION_ROOT, null, DEFAULT_API_DOC_PATH, DEFAULT_SWAGGER_UI_INDEX, true);
  }

}