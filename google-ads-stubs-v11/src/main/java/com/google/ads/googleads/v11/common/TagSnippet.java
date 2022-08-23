// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/common/tag_snippet.proto

package com.google.ads.googleads.v11.common;

/**
 * <pre>
 * The site tag and event snippet pair for a TrackingCodeType.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.common.TagSnippet}
 */
public final class TagSnippet extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.common.TagSnippet)
    TagSnippetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TagSnippet.newBuilder() to construct.
  private TagSnippet(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TagSnippet() {
    type_ = 0;
    pageFormat_ = 0;
    globalSiteTag_ = "";
    eventSnippet_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TagSnippet();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TagSnippet(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            pageFormat_ = rawValue;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000001;
            globalSiteTag_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000002;
            eventSnippet_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v11.common.TagSnippetProto.internal_static_google_ads_googleads_v11_common_TagSnippet_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.common.TagSnippetProto.internal_static_google_ads_googleads_v11_common_TagSnippet_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.common.TagSnippet.class, com.google.ads.googleads.v11.common.TagSnippet.Builder.class);
  }

  private int bitField0_;
  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <pre>
   * The type of the generated tag snippets for tracking conversions.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.TrackingCodeTypeEnum.TrackingCodeType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * The type of the generated tag snippets for tracking conversions.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.TrackingCodeTypeEnum.TrackingCodeType type = 1;</code>
   * @return The type.
   */
  @java.lang.Override public com.google.ads.googleads.v11.enums.TrackingCodeTypeEnum.TrackingCodeType getType() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v11.enums.TrackingCodeTypeEnum.TrackingCodeType result = com.google.ads.googleads.v11.enums.TrackingCodeTypeEnum.TrackingCodeType.valueOf(type_);
    return result == null ? com.google.ads.googleads.v11.enums.TrackingCodeTypeEnum.TrackingCodeType.UNRECOGNIZED : result;
  }

  public static final int PAGE_FORMAT_FIELD_NUMBER = 2;
  private int pageFormat_;
  /**
   * <pre>
   * The format of the web page where the tracking tag and snippet will be
   * installed, for example, HTML.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.TrackingCodePageFormatEnum.TrackingCodePageFormat page_format = 2;</code>
   * @return The enum numeric value on the wire for pageFormat.
   */
  @java.lang.Override public int getPageFormatValue() {
    return pageFormat_;
  }
  /**
   * <pre>
   * The format of the web page where the tracking tag and snippet will be
   * installed, for example, HTML.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.enums.TrackingCodePageFormatEnum.TrackingCodePageFormat page_format = 2;</code>
   * @return The pageFormat.
   */
  @java.lang.Override public com.google.ads.googleads.v11.enums.TrackingCodePageFormatEnum.TrackingCodePageFormat getPageFormat() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v11.enums.TrackingCodePageFormatEnum.TrackingCodePageFormat result = com.google.ads.googleads.v11.enums.TrackingCodePageFormatEnum.TrackingCodePageFormat.valueOf(pageFormat_);
    return result == null ? com.google.ads.googleads.v11.enums.TrackingCodePageFormatEnum.TrackingCodePageFormat.UNRECOGNIZED : result;
  }

  public static final int GLOBAL_SITE_TAG_FIELD_NUMBER = 5;
  private volatile java.lang.Object globalSiteTag_;
  /**
   * <pre>
   * The site tag that adds visitors to your basic remarketing lists and sets
   * new cookies on your domain.
   * </pre>
   *
   * <code>optional string global_site_tag = 5;</code>
   * @return Whether the globalSiteTag field is set.
   */
  @java.lang.Override
  public boolean hasGlobalSiteTag() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The site tag that adds visitors to your basic remarketing lists and sets
   * new cookies on your domain.
   * </pre>
   *
   * <code>optional string global_site_tag = 5;</code>
   * @return The globalSiteTag.
   */
  @java.lang.Override
  public java.lang.String getGlobalSiteTag() {
    java.lang.Object ref = globalSiteTag_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      globalSiteTag_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The site tag that adds visitors to your basic remarketing lists and sets
   * new cookies on your domain.
   * </pre>
   *
   * <code>optional string global_site_tag = 5;</code>
   * @return The bytes for globalSiteTag.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getGlobalSiteTagBytes() {
    java.lang.Object ref = globalSiteTag_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      globalSiteTag_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EVENT_SNIPPET_FIELD_NUMBER = 6;
  private volatile java.lang.Object eventSnippet_;
  /**
   * <pre>
   * The event snippet that works with the site tag to track actions that
   * should be counted as conversions.
   * </pre>
   *
   * <code>optional string event_snippet = 6;</code>
   * @return Whether the eventSnippet field is set.
   */
  @java.lang.Override
  public boolean hasEventSnippet() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The event snippet that works with the site tag to track actions that
   * should be counted as conversions.
   * </pre>
   *
   * <code>optional string event_snippet = 6;</code>
   * @return The eventSnippet.
   */
  @java.lang.Override
  public java.lang.String getEventSnippet() {
    java.lang.Object ref = eventSnippet_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      eventSnippet_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The event snippet that works with the site tag to track actions that
   * should be counted as conversions.
   * </pre>
   *
   * <code>optional string event_snippet = 6;</code>
   * @return The bytes for eventSnippet.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEventSnippetBytes() {
    java.lang.Object ref = eventSnippet_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      eventSnippet_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (type_ != com.google.ads.googleads.v11.enums.TrackingCodeTypeEnum.TrackingCodeType.UNSPECIFIED.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (pageFormat_ != com.google.ads.googleads.v11.enums.TrackingCodePageFormatEnum.TrackingCodePageFormat.UNSPECIFIED.getNumber()) {
      output.writeEnum(2, pageFormat_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, globalSiteTag_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, eventSnippet_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != com.google.ads.googleads.v11.enums.TrackingCodeTypeEnum.TrackingCodeType.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (pageFormat_ != com.google.ads.googleads.v11.enums.TrackingCodePageFormatEnum.TrackingCodePageFormat.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, pageFormat_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, globalSiteTag_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, eventSnippet_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v11.common.TagSnippet)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.common.TagSnippet other = (com.google.ads.googleads.v11.common.TagSnippet) obj;

    if (type_ != other.type_) return false;
    if (pageFormat_ != other.pageFormat_) return false;
    if (hasGlobalSiteTag() != other.hasGlobalSiteTag()) return false;
    if (hasGlobalSiteTag()) {
      if (!getGlobalSiteTag()
          .equals(other.getGlobalSiteTag())) return false;
    }
    if (hasEventSnippet() != other.hasEventSnippet()) return false;
    if (hasEventSnippet()) {
      if (!getEventSnippet()
          .equals(other.getEventSnippet())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + PAGE_FORMAT_FIELD_NUMBER;
    hash = (53 * hash) + pageFormat_;
    if (hasGlobalSiteTag()) {
      hash = (37 * hash) + GLOBAL_SITE_TAG_FIELD_NUMBER;
      hash = (53 * hash) + getGlobalSiteTag().hashCode();
    }
    if (hasEventSnippet()) {
      hash = (37 * hash) + EVENT_SNIPPET_FIELD_NUMBER;
      hash = (53 * hash) + getEventSnippet().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v11.common.TagSnippet parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.TagSnippet parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.TagSnippet parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.TagSnippet parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.TagSnippet parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.TagSnippet parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.TagSnippet parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.TagSnippet parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.TagSnippet parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.TagSnippet parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.TagSnippet parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.TagSnippet parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.ads.googleads.v11.common.TagSnippet prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * The site tag and event snippet pair for a TrackingCodeType.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.common.TagSnippet}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.common.TagSnippet)
      com.google.ads.googleads.v11.common.TagSnippetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.common.TagSnippetProto.internal_static_google_ads_googleads_v11_common_TagSnippet_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.common.TagSnippetProto.internal_static_google_ads_googleads_v11_common_TagSnippet_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.common.TagSnippet.class, com.google.ads.googleads.v11.common.TagSnippet.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.common.TagSnippet.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      type_ = 0;

      pageFormat_ = 0;

      globalSiteTag_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      eventSnippet_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v11.common.TagSnippetProto.internal_static_google_ads_googleads_v11_common_TagSnippet_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.TagSnippet getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.common.TagSnippet.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.TagSnippet build() {
      com.google.ads.googleads.v11.common.TagSnippet result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.TagSnippet buildPartial() {
      com.google.ads.googleads.v11.common.TagSnippet result = new com.google.ads.googleads.v11.common.TagSnippet(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.type_ = type_;
      result.pageFormat_ = pageFormat_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.globalSiteTag_ = globalSiteTag_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.eventSnippet_ = eventSnippet_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v11.common.TagSnippet) {
        return mergeFrom((com.google.ads.googleads.v11.common.TagSnippet)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.common.TagSnippet other) {
      if (other == com.google.ads.googleads.v11.common.TagSnippet.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.pageFormat_ != 0) {
        setPageFormatValue(other.getPageFormatValue());
      }
      if (other.hasGlobalSiteTag()) {
        bitField0_ |= 0x00000001;
        globalSiteTag_ = other.globalSiteTag_;
        onChanged();
      }
      if (other.hasEventSnippet()) {
        bitField0_ |= 0x00000002;
        eventSnippet_ = other.eventSnippet_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.ads.googleads.v11.common.TagSnippet parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v11.common.TagSnippet) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int type_ = 0;
    /**
     * <pre>
     * The type of the generated tag snippets for tracking conversions.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.TrackingCodeTypeEnum.TrackingCodeType type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * The type of the generated tag snippets for tracking conversions.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.TrackingCodeTypeEnum.TrackingCodeType type = 1;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of the generated tag snippets for tracking conversions.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.TrackingCodeTypeEnum.TrackingCodeType type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public com.google.ads.googleads.v11.enums.TrackingCodeTypeEnum.TrackingCodeType getType() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v11.enums.TrackingCodeTypeEnum.TrackingCodeType result = com.google.ads.googleads.v11.enums.TrackingCodeTypeEnum.TrackingCodeType.valueOf(type_);
      return result == null ? com.google.ads.googleads.v11.enums.TrackingCodeTypeEnum.TrackingCodeType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The type of the generated tag snippets for tracking conversions.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.TrackingCodeTypeEnum.TrackingCodeType type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.google.ads.googleads.v11.enums.TrackingCodeTypeEnum.TrackingCodeType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of the generated tag snippets for tracking conversions.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.TrackingCodeTypeEnum.TrackingCodeType type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private int pageFormat_ = 0;
    /**
     * <pre>
     * The format of the web page where the tracking tag and snippet will be
     * installed, for example, HTML.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.TrackingCodePageFormatEnum.TrackingCodePageFormat page_format = 2;</code>
     * @return The enum numeric value on the wire for pageFormat.
     */
    @java.lang.Override public int getPageFormatValue() {
      return pageFormat_;
    }
    /**
     * <pre>
     * The format of the web page where the tracking tag and snippet will be
     * installed, for example, HTML.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.TrackingCodePageFormatEnum.TrackingCodePageFormat page_format = 2;</code>
     * @param value The enum numeric value on the wire for pageFormat to set.
     * @return This builder for chaining.
     */
    public Builder setPageFormatValue(int value) {
      
      pageFormat_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The format of the web page where the tracking tag and snippet will be
     * installed, for example, HTML.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.TrackingCodePageFormatEnum.TrackingCodePageFormat page_format = 2;</code>
     * @return The pageFormat.
     */
    @java.lang.Override
    public com.google.ads.googleads.v11.enums.TrackingCodePageFormatEnum.TrackingCodePageFormat getPageFormat() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v11.enums.TrackingCodePageFormatEnum.TrackingCodePageFormat result = com.google.ads.googleads.v11.enums.TrackingCodePageFormatEnum.TrackingCodePageFormat.valueOf(pageFormat_);
      return result == null ? com.google.ads.googleads.v11.enums.TrackingCodePageFormatEnum.TrackingCodePageFormat.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The format of the web page where the tracking tag and snippet will be
     * installed, for example, HTML.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.TrackingCodePageFormatEnum.TrackingCodePageFormat page_format = 2;</code>
     * @param value The pageFormat to set.
     * @return This builder for chaining.
     */
    public Builder setPageFormat(com.google.ads.googleads.v11.enums.TrackingCodePageFormatEnum.TrackingCodePageFormat value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      pageFormat_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The format of the web page where the tracking tag and snippet will be
     * installed, for example, HTML.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.enums.TrackingCodePageFormatEnum.TrackingCodePageFormat page_format = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPageFormat() {
      
      pageFormat_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object globalSiteTag_ = "";
    /**
     * <pre>
     * The site tag that adds visitors to your basic remarketing lists and sets
     * new cookies on your domain.
     * </pre>
     *
     * <code>optional string global_site_tag = 5;</code>
     * @return Whether the globalSiteTag field is set.
     */
    public boolean hasGlobalSiteTag() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The site tag that adds visitors to your basic remarketing lists and sets
     * new cookies on your domain.
     * </pre>
     *
     * <code>optional string global_site_tag = 5;</code>
     * @return The globalSiteTag.
     */
    public java.lang.String getGlobalSiteTag() {
      java.lang.Object ref = globalSiteTag_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        globalSiteTag_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The site tag that adds visitors to your basic remarketing lists and sets
     * new cookies on your domain.
     * </pre>
     *
     * <code>optional string global_site_tag = 5;</code>
     * @return The bytes for globalSiteTag.
     */
    public com.google.protobuf.ByteString
        getGlobalSiteTagBytes() {
      java.lang.Object ref = globalSiteTag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        globalSiteTag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The site tag that adds visitors to your basic remarketing lists and sets
     * new cookies on your domain.
     * </pre>
     *
     * <code>optional string global_site_tag = 5;</code>
     * @param value The globalSiteTag to set.
     * @return This builder for chaining.
     */
    public Builder setGlobalSiteTag(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      globalSiteTag_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The site tag that adds visitors to your basic remarketing lists and sets
     * new cookies on your domain.
     * </pre>
     *
     * <code>optional string global_site_tag = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearGlobalSiteTag() {
      bitField0_ = (bitField0_ & ~0x00000001);
      globalSiteTag_ = getDefaultInstance().getGlobalSiteTag();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The site tag that adds visitors to your basic remarketing lists and sets
     * new cookies on your domain.
     * </pre>
     *
     * <code>optional string global_site_tag = 5;</code>
     * @param value The bytes for globalSiteTag to set.
     * @return This builder for chaining.
     */
    public Builder setGlobalSiteTagBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      globalSiteTag_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object eventSnippet_ = "";
    /**
     * <pre>
     * The event snippet that works with the site tag to track actions that
     * should be counted as conversions.
     * </pre>
     *
     * <code>optional string event_snippet = 6;</code>
     * @return Whether the eventSnippet field is set.
     */
    public boolean hasEventSnippet() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The event snippet that works with the site tag to track actions that
     * should be counted as conversions.
     * </pre>
     *
     * <code>optional string event_snippet = 6;</code>
     * @return The eventSnippet.
     */
    public java.lang.String getEventSnippet() {
      java.lang.Object ref = eventSnippet_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        eventSnippet_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The event snippet that works with the site tag to track actions that
     * should be counted as conversions.
     * </pre>
     *
     * <code>optional string event_snippet = 6;</code>
     * @return The bytes for eventSnippet.
     */
    public com.google.protobuf.ByteString
        getEventSnippetBytes() {
      java.lang.Object ref = eventSnippet_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        eventSnippet_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The event snippet that works with the site tag to track actions that
     * should be counted as conversions.
     * </pre>
     *
     * <code>optional string event_snippet = 6;</code>
     * @param value The eventSnippet to set.
     * @return This builder for chaining.
     */
    public Builder setEventSnippet(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      eventSnippet_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The event snippet that works with the site tag to track actions that
     * should be counted as conversions.
     * </pre>
     *
     * <code>optional string event_snippet = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearEventSnippet() {
      bitField0_ = (bitField0_ & ~0x00000002);
      eventSnippet_ = getDefaultInstance().getEventSnippet();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The event snippet that works with the site tag to track actions that
     * should be counted as conversions.
     * </pre>
     *
     * <code>optional string event_snippet = 6;</code>
     * @param value The bytes for eventSnippet to set.
     * @return This builder for chaining.
     */
    public Builder setEventSnippetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000002;
      eventSnippet_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.common.TagSnippet)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.common.TagSnippet)
  private static final com.google.ads.googleads.v11.common.TagSnippet DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.common.TagSnippet();
  }

  public static com.google.ads.googleads.v11.common.TagSnippet getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TagSnippet>
      PARSER = new com.google.protobuf.AbstractParser<TagSnippet>() {
    @java.lang.Override
    public TagSnippet parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TagSnippet(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TagSnippet> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TagSnippet> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.common.TagSnippet getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

