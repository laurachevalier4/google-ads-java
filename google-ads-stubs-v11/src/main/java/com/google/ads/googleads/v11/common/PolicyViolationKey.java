// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/common/policy.proto

package com.google.ads.googleads.v11.common;

/**
 * <pre>
 * Key of the violation. The key is used for referring to a violation
 * when filing an exemption request.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.common.PolicyViolationKey}
 */
public final class PolicyViolationKey extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.common.PolicyViolationKey)
    PolicyViolationKeyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PolicyViolationKey.newBuilder() to construct.
  private PolicyViolationKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PolicyViolationKey() {
    policyName_ = "";
    violatingText_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PolicyViolationKey();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PolicyViolationKey(
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
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000001;
            policyName_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000002;
            violatingText_ = s;
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
    return com.google.ads.googleads.v11.common.PolicyProto.internal_static_google_ads_googleads_v11_common_PolicyViolationKey_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.common.PolicyProto.internal_static_google_ads_googleads_v11_common_PolicyViolationKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.common.PolicyViolationKey.class, com.google.ads.googleads.v11.common.PolicyViolationKey.Builder.class);
  }

  private int bitField0_;
  public static final int POLICY_NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object policyName_;
  /**
   * <pre>
   * Unique ID of the violated policy.
   * </pre>
   *
   * <code>optional string policy_name = 3;</code>
   * @return Whether the policyName field is set.
   */
  @java.lang.Override
  public boolean hasPolicyName() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Unique ID of the violated policy.
   * </pre>
   *
   * <code>optional string policy_name = 3;</code>
   * @return The policyName.
   */
  @java.lang.Override
  public java.lang.String getPolicyName() {
    java.lang.Object ref = policyName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      policyName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Unique ID of the violated policy.
   * </pre>
   *
   * <code>optional string policy_name = 3;</code>
   * @return The bytes for policyName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPolicyNameBytes() {
    java.lang.Object ref = policyName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      policyName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VIOLATING_TEXT_FIELD_NUMBER = 4;
  private volatile java.lang.Object violatingText_;
  /**
   * <pre>
   * The text that violates the policy if specified.
   * Otherwise, refers to the policy in general
   * (for example, when requesting to be exempt from the whole policy).
   * If not specified for criterion exemptions, the whole policy is implied.
   * Must be specified for ad exemptions.
   * </pre>
   *
   * <code>optional string violating_text = 4;</code>
   * @return Whether the violatingText field is set.
   */
  @java.lang.Override
  public boolean hasViolatingText() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The text that violates the policy if specified.
   * Otherwise, refers to the policy in general
   * (for example, when requesting to be exempt from the whole policy).
   * If not specified for criterion exemptions, the whole policy is implied.
   * Must be specified for ad exemptions.
   * </pre>
   *
   * <code>optional string violating_text = 4;</code>
   * @return The violatingText.
   */
  @java.lang.Override
  public java.lang.String getViolatingText() {
    java.lang.Object ref = violatingText_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      violatingText_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The text that violates the policy if specified.
   * Otherwise, refers to the policy in general
   * (for example, when requesting to be exempt from the whole policy).
   * If not specified for criterion exemptions, the whole policy is implied.
   * Must be specified for ad exemptions.
   * </pre>
   *
   * <code>optional string violating_text = 4;</code>
   * @return The bytes for violatingText.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getViolatingTextBytes() {
    java.lang.Object ref = violatingText_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      violatingText_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, policyName_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, violatingText_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, policyName_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, violatingText_);
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
    if (!(obj instanceof com.google.ads.googleads.v11.common.PolicyViolationKey)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.common.PolicyViolationKey other = (com.google.ads.googleads.v11.common.PolicyViolationKey) obj;

    if (hasPolicyName() != other.hasPolicyName()) return false;
    if (hasPolicyName()) {
      if (!getPolicyName()
          .equals(other.getPolicyName())) return false;
    }
    if (hasViolatingText() != other.hasViolatingText()) return false;
    if (hasViolatingText()) {
      if (!getViolatingText()
          .equals(other.getViolatingText())) return false;
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
    if (hasPolicyName()) {
      hash = (37 * hash) + POLICY_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getPolicyName().hashCode();
    }
    if (hasViolatingText()) {
      hash = (37 * hash) + VIOLATING_TEXT_FIELD_NUMBER;
      hash = (53 * hash) + getViolatingText().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v11.common.PolicyViolationKey parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.PolicyViolationKey parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.PolicyViolationKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.PolicyViolationKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.PolicyViolationKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.PolicyViolationKey parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.PolicyViolationKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.PolicyViolationKey parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.PolicyViolationKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.PolicyViolationKey parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.PolicyViolationKey parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.PolicyViolationKey parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v11.common.PolicyViolationKey prototype) {
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
   * Key of the violation. The key is used for referring to a violation
   * when filing an exemption request.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.common.PolicyViolationKey}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.common.PolicyViolationKey)
      com.google.ads.googleads.v11.common.PolicyViolationKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.common.PolicyProto.internal_static_google_ads_googleads_v11_common_PolicyViolationKey_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.common.PolicyProto.internal_static_google_ads_googleads_v11_common_PolicyViolationKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.common.PolicyViolationKey.class, com.google.ads.googleads.v11.common.PolicyViolationKey.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.common.PolicyViolationKey.newBuilder()
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
      policyName_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      violatingText_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v11.common.PolicyProto.internal_static_google_ads_googleads_v11_common_PolicyViolationKey_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.PolicyViolationKey getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.common.PolicyViolationKey.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.PolicyViolationKey build() {
      com.google.ads.googleads.v11.common.PolicyViolationKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.PolicyViolationKey buildPartial() {
      com.google.ads.googleads.v11.common.PolicyViolationKey result = new com.google.ads.googleads.v11.common.PolicyViolationKey(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.policyName_ = policyName_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.violatingText_ = violatingText_;
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
      if (other instanceof com.google.ads.googleads.v11.common.PolicyViolationKey) {
        return mergeFrom((com.google.ads.googleads.v11.common.PolicyViolationKey)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.common.PolicyViolationKey other) {
      if (other == com.google.ads.googleads.v11.common.PolicyViolationKey.getDefaultInstance()) return this;
      if (other.hasPolicyName()) {
        bitField0_ |= 0x00000001;
        policyName_ = other.policyName_;
        onChanged();
      }
      if (other.hasViolatingText()) {
        bitField0_ |= 0x00000002;
        violatingText_ = other.violatingText_;
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
      com.google.ads.googleads.v11.common.PolicyViolationKey parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v11.common.PolicyViolationKey) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object policyName_ = "";
    /**
     * <pre>
     * Unique ID of the violated policy.
     * </pre>
     *
     * <code>optional string policy_name = 3;</code>
     * @return Whether the policyName field is set.
     */
    public boolean hasPolicyName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Unique ID of the violated policy.
     * </pre>
     *
     * <code>optional string policy_name = 3;</code>
     * @return The policyName.
     */
    public java.lang.String getPolicyName() {
      java.lang.Object ref = policyName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        policyName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Unique ID of the violated policy.
     * </pre>
     *
     * <code>optional string policy_name = 3;</code>
     * @return The bytes for policyName.
     */
    public com.google.protobuf.ByteString
        getPolicyNameBytes() {
      java.lang.Object ref = policyName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        policyName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Unique ID of the violated policy.
     * </pre>
     *
     * <code>optional string policy_name = 3;</code>
     * @param value The policyName to set.
     * @return This builder for chaining.
     */
    public Builder setPolicyName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      policyName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Unique ID of the violated policy.
     * </pre>
     *
     * <code>optional string policy_name = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPolicyName() {
      bitField0_ = (bitField0_ & ~0x00000001);
      policyName_ = getDefaultInstance().getPolicyName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Unique ID of the violated policy.
     * </pre>
     *
     * <code>optional string policy_name = 3;</code>
     * @param value The bytes for policyName to set.
     * @return This builder for chaining.
     */
    public Builder setPolicyNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      policyName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object violatingText_ = "";
    /**
     * <pre>
     * The text that violates the policy if specified.
     * Otherwise, refers to the policy in general
     * (for example, when requesting to be exempt from the whole policy).
     * If not specified for criterion exemptions, the whole policy is implied.
     * Must be specified for ad exemptions.
     * </pre>
     *
     * <code>optional string violating_text = 4;</code>
     * @return Whether the violatingText field is set.
     */
    public boolean hasViolatingText() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The text that violates the policy if specified.
     * Otherwise, refers to the policy in general
     * (for example, when requesting to be exempt from the whole policy).
     * If not specified for criterion exemptions, the whole policy is implied.
     * Must be specified for ad exemptions.
     * </pre>
     *
     * <code>optional string violating_text = 4;</code>
     * @return The violatingText.
     */
    public java.lang.String getViolatingText() {
      java.lang.Object ref = violatingText_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        violatingText_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The text that violates the policy if specified.
     * Otherwise, refers to the policy in general
     * (for example, when requesting to be exempt from the whole policy).
     * If not specified for criterion exemptions, the whole policy is implied.
     * Must be specified for ad exemptions.
     * </pre>
     *
     * <code>optional string violating_text = 4;</code>
     * @return The bytes for violatingText.
     */
    public com.google.protobuf.ByteString
        getViolatingTextBytes() {
      java.lang.Object ref = violatingText_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        violatingText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The text that violates the policy if specified.
     * Otherwise, refers to the policy in general
     * (for example, when requesting to be exempt from the whole policy).
     * If not specified for criterion exemptions, the whole policy is implied.
     * Must be specified for ad exemptions.
     * </pre>
     *
     * <code>optional string violating_text = 4;</code>
     * @param value The violatingText to set.
     * @return This builder for chaining.
     */
    public Builder setViolatingText(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      violatingText_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The text that violates the policy if specified.
     * Otherwise, refers to the policy in general
     * (for example, when requesting to be exempt from the whole policy).
     * If not specified for criterion exemptions, the whole policy is implied.
     * Must be specified for ad exemptions.
     * </pre>
     *
     * <code>optional string violating_text = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearViolatingText() {
      bitField0_ = (bitField0_ & ~0x00000002);
      violatingText_ = getDefaultInstance().getViolatingText();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The text that violates the policy if specified.
     * Otherwise, refers to the policy in general
     * (for example, when requesting to be exempt from the whole policy).
     * If not specified for criterion exemptions, the whole policy is implied.
     * Must be specified for ad exemptions.
     * </pre>
     *
     * <code>optional string violating_text = 4;</code>
     * @param value The bytes for violatingText to set.
     * @return This builder for chaining.
     */
    public Builder setViolatingTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000002;
      violatingText_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.common.PolicyViolationKey)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.common.PolicyViolationKey)
  private static final com.google.ads.googleads.v11.common.PolicyViolationKey DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.common.PolicyViolationKey();
  }

  public static com.google.ads.googleads.v11.common.PolicyViolationKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PolicyViolationKey>
      PARSER = new com.google.protobuf.AbstractParser<PolicyViolationKey>() {
    @java.lang.Override
    public PolicyViolationKey parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PolicyViolationKey(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PolicyViolationKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PolicyViolationKey> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.common.PolicyViolationKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

