// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v11/common/user_lists.proto

package com.google.ads.googleads.v11.common;

/**
 * <pre>
 * Flexible rule that wraps the common rule and a lookback window.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v11.common.FlexibleRuleOperandInfo}
 */
public final class FlexibleRuleOperandInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v11.common.FlexibleRuleOperandInfo)
    FlexibleRuleOperandInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FlexibleRuleOperandInfo.newBuilder() to construct.
  private FlexibleRuleOperandInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FlexibleRuleOperandInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FlexibleRuleOperandInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FlexibleRuleOperandInfo(
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
          case 10: {
            com.google.ads.googleads.v11.common.UserListRuleInfo.Builder subBuilder = null;
            if (rule_ != null) {
              subBuilder = rule_.toBuilder();
            }
            rule_ = input.readMessage(com.google.ads.googleads.v11.common.UserListRuleInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(rule_);
              rule_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {
            bitField0_ |= 0x00000001;
            lookbackWindowDays_ = input.readInt64();
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
    return com.google.ads.googleads.v11.common.UserListsProto.internal_static_google_ads_googleads_v11_common_FlexibleRuleOperandInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v11.common.UserListsProto.internal_static_google_ads_googleads_v11_common_FlexibleRuleOperandInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v11.common.FlexibleRuleOperandInfo.class, com.google.ads.googleads.v11.common.FlexibleRuleOperandInfo.Builder.class);
  }

  private int bitField0_;
  public static final int RULE_FIELD_NUMBER = 1;
  private com.google.ads.googleads.v11.common.UserListRuleInfo rule_;
  /**
   * <pre>
   * List of rule item groups that defines this rule.
   * Rule item groups are grouped together.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.UserListRuleInfo rule = 1;</code>
   * @return Whether the rule field is set.
   */
  @java.lang.Override
  public boolean hasRule() {
    return rule_ != null;
  }
  /**
   * <pre>
   * List of rule item groups that defines this rule.
   * Rule item groups are grouped together.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.UserListRuleInfo rule = 1;</code>
   * @return The rule.
   */
  @java.lang.Override
  public com.google.ads.googleads.v11.common.UserListRuleInfo getRule() {
    return rule_ == null ? com.google.ads.googleads.v11.common.UserListRuleInfo.getDefaultInstance() : rule_;
  }
  /**
   * <pre>
   * List of rule item groups that defines this rule.
   * Rule item groups are grouped together.
   * </pre>
   *
   * <code>.google.ads.googleads.v11.common.UserListRuleInfo rule = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v11.common.UserListRuleInfoOrBuilder getRuleOrBuilder() {
    return getRule();
  }

  public static final int LOOKBACK_WINDOW_DAYS_FIELD_NUMBER = 2;
  private long lookbackWindowDays_;
  /**
   * <pre>
   * Lookback window for this rule in days. From now until X days ago.
   * </pre>
   *
   * <code>optional int64 lookback_window_days = 2;</code>
   * @return Whether the lookbackWindowDays field is set.
   */
  @java.lang.Override
  public boolean hasLookbackWindowDays() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Lookback window for this rule in days. From now until X days ago.
   * </pre>
   *
   * <code>optional int64 lookback_window_days = 2;</code>
   * @return The lookbackWindowDays.
   */
  @java.lang.Override
  public long getLookbackWindowDays() {
    return lookbackWindowDays_;
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
    if (rule_ != null) {
      output.writeMessage(1, getRule());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt64(2, lookbackWindowDays_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (rule_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRule());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, lookbackWindowDays_);
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
    if (!(obj instanceof com.google.ads.googleads.v11.common.FlexibleRuleOperandInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v11.common.FlexibleRuleOperandInfo other = (com.google.ads.googleads.v11.common.FlexibleRuleOperandInfo) obj;

    if (hasRule() != other.hasRule()) return false;
    if (hasRule()) {
      if (!getRule()
          .equals(other.getRule())) return false;
    }
    if (hasLookbackWindowDays() != other.hasLookbackWindowDays()) return false;
    if (hasLookbackWindowDays()) {
      if (getLookbackWindowDays()
          != other.getLookbackWindowDays()) return false;
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
    if (hasRule()) {
      hash = (37 * hash) + RULE_FIELD_NUMBER;
      hash = (53 * hash) + getRule().hashCode();
    }
    if (hasLookbackWindowDays()) {
      hash = (37 * hash) + LOOKBACK_WINDOW_DAYS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getLookbackWindowDays());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v11.common.FlexibleRuleOperandInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.FlexibleRuleOperandInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.FlexibleRuleOperandInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.FlexibleRuleOperandInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.FlexibleRuleOperandInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v11.common.FlexibleRuleOperandInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.FlexibleRuleOperandInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.FlexibleRuleOperandInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.FlexibleRuleOperandInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.FlexibleRuleOperandInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v11.common.FlexibleRuleOperandInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v11.common.FlexibleRuleOperandInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v11.common.FlexibleRuleOperandInfo prototype) {
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
   * Flexible rule that wraps the common rule and a lookback window.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v11.common.FlexibleRuleOperandInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v11.common.FlexibleRuleOperandInfo)
      com.google.ads.googleads.v11.common.FlexibleRuleOperandInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v11.common.UserListsProto.internal_static_google_ads_googleads_v11_common_FlexibleRuleOperandInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v11.common.UserListsProto.internal_static_google_ads_googleads_v11_common_FlexibleRuleOperandInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v11.common.FlexibleRuleOperandInfo.class, com.google.ads.googleads.v11.common.FlexibleRuleOperandInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v11.common.FlexibleRuleOperandInfo.newBuilder()
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
      if (ruleBuilder_ == null) {
        rule_ = null;
      } else {
        rule_ = null;
        ruleBuilder_ = null;
      }
      lookbackWindowDays_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v11.common.UserListsProto.internal_static_google_ads_googleads_v11_common_FlexibleRuleOperandInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.FlexibleRuleOperandInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v11.common.FlexibleRuleOperandInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.FlexibleRuleOperandInfo build() {
      com.google.ads.googleads.v11.common.FlexibleRuleOperandInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v11.common.FlexibleRuleOperandInfo buildPartial() {
      com.google.ads.googleads.v11.common.FlexibleRuleOperandInfo result = new com.google.ads.googleads.v11.common.FlexibleRuleOperandInfo(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (ruleBuilder_ == null) {
        result.rule_ = rule_;
      } else {
        result.rule_ = ruleBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.lookbackWindowDays_ = lookbackWindowDays_;
        to_bitField0_ |= 0x00000001;
      }
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
      if (other instanceof com.google.ads.googleads.v11.common.FlexibleRuleOperandInfo) {
        return mergeFrom((com.google.ads.googleads.v11.common.FlexibleRuleOperandInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v11.common.FlexibleRuleOperandInfo other) {
      if (other == com.google.ads.googleads.v11.common.FlexibleRuleOperandInfo.getDefaultInstance()) return this;
      if (other.hasRule()) {
        mergeRule(other.getRule());
      }
      if (other.hasLookbackWindowDays()) {
        setLookbackWindowDays(other.getLookbackWindowDays());
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
      com.google.ads.googleads.v11.common.FlexibleRuleOperandInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v11.common.FlexibleRuleOperandInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.ads.googleads.v11.common.UserListRuleInfo rule_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v11.common.UserListRuleInfo, com.google.ads.googleads.v11.common.UserListRuleInfo.Builder, com.google.ads.googleads.v11.common.UserListRuleInfoOrBuilder> ruleBuilder_;
    /**
     * <pre>
     * List of rule item groups that defines this rule.
     * Rule item groups are grouped together.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.UserListRuleInfo rule = 1;</code>
     * @return Whether the rule field is set.
     */
    public boolean hasRule() {
      return ruleBuilder_ != null || rule_ != null;
    }
    /**
     * <pre>
     * List of rule item groups that defines this rule.
     * Rule item groups are grouped together.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.UserListRuleInfo rule = 1;</code>
     * @return The rule.
     */
    public com.google.ads.googleads.v11.common.UserListRuleInfo getRule() {
      if (ruleBuilder_ == null) {
        return rule_ == null ? com.google.ads.googleads.v11.common.UserListRuleInfo.getDefaultInstance() : rule_;
      } else {
        return ruleBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * List of rule item groups that defines this rule.
     * Rule item groups are grouped together.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.UserListRuleInfo rule = 1;</code>
     */
    public Builder setRule(com.google.ads.googleads.v11.common.UserListRuleInfo value) {
      if (ruleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rule_ = value;
        onChanged();
      } else {
        ruleBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * List of rule item groups that defines this rule.
     * Rule item groups are grouped together.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.UserListRuleInfo rule = 1;</code>
     */
    public Builder setRule(
        com.google.ads.googleads.v11.common.UserListRuleInfo.Builder builderForValue) {
      if (ruleBuilder_ == null) {
        rule_ = builderForValue.build();
        onChanged();
      } else {
        ruleBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * List of rule item groups that defines this rule.
     * Rule item groups are grouped together.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.UserListRuleInfo rule = 1;</code>
     */
    public Builder mergeRule(com.google.ads.googleads.v11.common.UserListRuleInfo value) {
      if (ruleBuilder_ == null) {
        if (rule_ != null) {
          rule_ =
            com.google.ads.googleads.v11.common.UserListRuleInfo.newBuilder(rule_).mergeFrom(value).buildPartial();
        } else {
          rule_ = value;
        }
        onChanged();
      } else {
        ruleBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * List of rule item groups that defines this rule.
     * Rule item groups are grouped together.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.UserListRuleInfo rule = 1;</code>
     */
    public Builder clearRule() {
      if (ruleBuilder_ == null) {
        rule_ = null;
        onChanged();
      } else {
        rule_ = null;
        ruleBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * List of rule item groups that defines this rule.
     * Rule item groups are grouped together.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.UserListRuleInfo rule = 1;</code>
     */
    public com.google.ads.googleads.v11.common.UserListRuleInfo.Builder getRuleBuilder() {
      
      onChanged();
      return getRuleFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * List of rule item groups that defines this rule.
     * Rule item groups are grouped together.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.UserListRuleInfo rule = 1;</code>
     */
    public com.google.ads.googleads.v11.common.UserListRuleInfoOrBuilder getRuleOrBuilder() {
      if (ruleBuilder_ != null) {
        return ruleBuilder_.getMessageOrBuilder();
      } else {
        return rule_ == null ?
            com.google.ads.googleads.v11.common.UserListRuleInfo.getDefaultInstance() : rule_;
      }
    }
    /**
     * <pre>
     * List of rule item groups that defines this rule.
     * Rule item groups are grouped together.
     * </pre>
     *
     * <code>.google.ads.googleads.v11.common.UserListRuleInfo rule = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v11.common.UserListRuleInfo, com.google.ads.googleads.v11.common.UserListRuleInfo.Builder, com.google.ads.googleads.v11.common.UserListRuleInfoOrBuilder> 
        getRuleFieldBuilder() {
      if (ruleBuilder_ == null) {
        ruleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v11.common.UserListRuleInfo, com.google.ads.googleads.v11.common.UserListRuleInfo.Builder, com.google.ads.googleads.v11.common.UserListRuleInfoOrBuilder>(
                getRule(),
                getParentForChildren(),
                isClean());
        rule_ = null;
      }
      return ruleBuilder_;
    }

    private long lookbackWindowDays_ ;
    /**
     * <pre>
     * Lookback window for this rule in days. From now until X days ago.
     * </pre>
     *
     * <code>optional int64 lookback_window_days = 2;</code>
     * @return Whether the lookbackWindowDays field is set.
     */
    @java.lang.Override
    public boolean hasLookbackWindowDays() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Lookback window for this rule in days. From now until X days ago.
     * </pre>
     *
     * <code>optional int64 lookback_window_days = 2;</code>
     * @return The lookbackWindowDays.
     */
    @java.lang.Override
    public long getLookbackWindowDays() {
      return lookbackWindowDays_;
    }
    /**
     * <pre>
     * Lookback window for this rule in days. From now until X days ago.
     * </pre>
     *
     * <code>optional int64 lookback_window_days = 2;</code>
     * @param value The lookbackWindowDays to set.
     * @return This builder for chaining.
     */
    public Builder setLookbackWindowDays(long value) {
      bitField0_ |= 0x00000001;
      lookbackWindowDays_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Lookback window for this rule in days. From now until X days ago.
     * </pre>
     *
     * <code>optional int64 lookback_window_days = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLookbackWindowDays() {
      bitField0_ = (bitField0_ & ~0x00000001);
      lookbackWindowDays_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v11.common.FlexibleRuleOperandInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v11.common.FlexibleRuleOperandInfo)
  private static final com.google.ads.googleads.v11.common.FlexibleRuleOperandInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v11.common.FlexibleRuleOperandInfo();
  }

  public static com.google.ads.googleads.v11.common.FlexibleRuleOperandInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FlexibleRuleOperandInfo>
      PARSER = new com.google.protobuf.AbstractParser<FlexibleRuleOperandInfo>() {
    @java.lang.Override
    public FlexibleRuleOperandInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FlexibleRuleOperandInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FlexibleRuleOperandInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FlexibleRuleOperandInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v11.common.FlexibleRuleOperandInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

