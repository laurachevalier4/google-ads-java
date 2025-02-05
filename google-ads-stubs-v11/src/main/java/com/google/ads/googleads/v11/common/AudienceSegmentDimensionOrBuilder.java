// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/common/audiences.proto

package com.google.ads.googleads.v11.common;

public interface AudienceSegmentDimensionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v11.common.AudienceSegmentDimension)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Included audience segments. Users are included if they belong to at least
   * one segment.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AudienceSegment segments = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v11.common.AudienceSegment> 
      getSegmentsList();
  /**
   * <pre>
   * Included audience segments. Users are included if they belong to at least
   * one segment.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AudienceSegment segments = 1;</code>
   */
  com.google.ads.googleads.v11.common.AudienceSegment getSegments(int index);
  /**
   * <pre>
   * Included audience segments. Users are included if they belong to at least
   * one segment.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AudienceSegment segments = 1;</code>
   */
  int getSegmentsCount();
  /**
   * <pre>
   * Included audience segments. Users are included if they belong to at least
   * one segment.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AudienceSegment segments = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v11.common.AudienceSegmentOrBuilder> 
      getSegmentsOrBuilderList();
  /**
   * <pre>
   * Included audience segments. Users are included if they belong to at least
   * one segment.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v11.common.AudienceSegment segments = 1;</code>
   */
  com.google.ads.googleads.v11.common.AudienceSegmentOrBuilder getSegmentsOrBuilder(
      int index);
}
