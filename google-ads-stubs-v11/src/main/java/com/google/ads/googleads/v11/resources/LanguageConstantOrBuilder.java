// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/resources/language_constant.proto

package com.google.ads.googleads.v11.resources;

public interface LanguageConstantOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.resources.LanguageConstant)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the language constant.
   * Language constant resource names have the form:
   * `languageConstants/{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the language constant.
   * Language constant resource names have the form:
   * `languageConstants/{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the language constant.
   * </pre>
   *
   * <code>optional int64 id = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the language constant.
   * </pre>
   *
   * <code>optional int64 id = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Output only. The language code, for example, "en_US", "en_AU", "es", "fr", etc.
   * </pre>
   *
   * <code>optional string code = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the code field is set.
   */
  boolean hasCode();
  /**
   * <pre>
   * Output only. The language code, for example, "en_US", "en_AU", "es", "fr", etc.
   * </pre>
   *
   * <code>optional string code = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The code.
   */
  java.lang.String getCode();
  /**
   * <pre>
   * Output only. The language code, for example, "en_US", "en_AU", "es", "fr", etc.
   * </pre>
   *
   * <code>optional string code = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for code.
   */
  com.google.protobuf.ByteString
      getCodeBytes();

  /**
   * <pre>
   * Output only. The full name of the language in English, for example, "English (US)",
   * "Spanish", etc.
   * </pre>
   *
   * <code>optional string name = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Output only. The full name of the language in English, for example, "English (US)",
   * "Spanish", etc.
   * </pre>
   *
   * <code>optional string name = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The full name of the language in English, for example, "English (US)",
   * "Spanish", etc.
   * </pre>
   *
   * <code>optional string name = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. Whether the language is targetable.
   * </pre>
   *
   * <code>optional bool targetable = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the targetable field is set.
   */
  boolean hasTargetable();
  /**
   * <pre>
   * Output only. Whether the language is targetable.
   * </pre>
   *
   * <code>optional bool targetable = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The targetable.
   */
  boolean getTargetable();
}
