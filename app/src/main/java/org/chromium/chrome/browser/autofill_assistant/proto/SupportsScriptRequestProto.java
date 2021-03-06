// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package org.chromium.chrome.browser.autofill_assistant.proto;

/**
 * <pre>
 * Get the list of scripts that can potentially be run on a url.
 * </pre>
 *
 * Protobuf type {@code autofill_assistant.SupportsScriptRequestProto}
 */
public  final class SupportsScriptRequestProto extends
    com.google.protobuf.GeneratedMessageLite<
        SupportsScriptRequestProto, SupportsScriptRequestProto.Builder> implements
    // @@protoc_insertion_point(message_implements:autofill_assistant.SupportsScriptRequestProto)
    SupportsScriptRequestProtoOrBuilder {
  private SupportsScriptRequestProto() {
    url_ = "";
    scriptParameters_ = emptyProtobufList();
  }
  private int bitField0_;
  public static final int URL_FIELD_NUMBER = 1;
  private java.lang.String url_;
  /**
   * <code>optional string url = 1;</code>
   */
  public boolean hasUrl() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional string url = 1;</code>
   */
  public java.lang.String getUrl() {
    return url_;
  }
  /**
   * <code>optional string url = 1;</code>
   */
  public com.google.protobuf.ByteString
      getUrlBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(url_);
  }
  /**
   * <code>optional string url = 1;</code>
   */
  private void setUrl(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    url_ = value;
  }
  /**
   * <code>optional string url = 1;</code>
   */
  private void clearUrl() {
    bitField0_ = (bitField0_ & ~0x00000001);
    url_ = getDefaultInstance().getUrl();
  }
  /**
   * <code>optional string url = 1;</code>
   */
  private void setUrlBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
    url_ = value.toStringUtf8();
  }

  public static final int SCRIPT_PARAMETERS_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.ProtobufList<org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto> scriptParameters_;
  /**
   * <pre>
   * Parameters that can be used to filter the scripts suitable for execution.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ScriptParameterProto script_parameters = 2;</code>
   */
  public java.util.List<org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto> getScriptParametersList() {
    return scriptParameters_;
  }
  /**
   * <pre>
   * Parameters that can be used to filter the scripts suitable for execution.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ScriptParameterProto script_parameters = 2;</code>
   */
  public java.util.List<? extends org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProtoOrBuilder> 
      getScriptParametersOrBuilderList() {
    return scriptParameters_;
  }
  /**
   * <pre>
   * Parameters that can be used to filter the scripts suitable for execution.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ScriptParameterProto script_parameters = 2;</code>
   */
  public int getScriptParametersCount() {
    return scriptParameters_.size();
  }
  /**
   * <pre>
   * Parameters that can be used to filter the scripts suitable for execution.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ScriptParameterProto script_parameters = 2;</code>
   */
  public org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto getScriptParameters(int index) {
    return scriptParameters_.get(index);
  }
  /**
   * <pre>
   * Parameters that can be used to filter the scripts suitable for execution.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ScriptParameterProto script_parameters = 2;</code>
   */
  public org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProtoOrBuilder getScriptParametersOrBuilder(
      int index) {
    return scriptParameters_.get(index);
  }
  private void ensureScriptParametersIsMutable() {
    if (!scriptParameters_.isModifiable()) {
      scriptParameters_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(scriptParameters_);
     }
  }

  /**
   * <pre>
   * Parameters that can be used to filter the scripts suitable for execution.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ScriptParameterProto script_parameters = 2;</code>
   */
  private void setScriptParameters(
      int index, org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureScriptParametersIsMutable();
    scriptParameters_.set(index, value);
  }
  /**
   * <pre>
   * Parameters that can be used to filter the scripts suitable for execution.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ScriptParameterProto script_parameters = 2;</code>
   */
  private void setScriptParameters(
      int index, org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto.Builder builderForValue) {
    ensureScriptParametersIsMutable();
    scriptParameters_.set(index, builderForValue.build());
  }
  /**
   * <pre>
   * Parameters that can be used to filter the scripts suitable for execution.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ScriptParameterProto script_parameters = 2;</code>
   */
  private void addScriptParameters(org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureScriptParametersIsMutable();
    scriptParameters_.add(value);
  }
  /**
   * <pre>
   * Parameters that can be used to filter the scripts suitable for execution.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ScriptParameterProto script_parameters = 2;</code>
   */
  private void addScriptParameters(
      int index, org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureScriptParametersIsMutable();
    scriptParameters_.add(index, value);
  }
  /**
   * <pre>
   * Parameters that can be used to filter the scripts suitable for execution.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ScriptParameterProto script_parameters = 2;</code>
   */
  private void addScriptParameters(
      org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto.Builder builderForValue) {
    ensureScriptParametersIsMutable();
    scriptParameters_.add(builderForValue.build());
  }
  /**
   * <pre>
   * Parameters that can be used to filter the scripts suitable for execution.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ScriptParameterProto script_parameters = 2;</code>
   */
  private void addScriptParameters(
      int index, org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto.Builder builderForValue) {
    ensureScriptParametersIsMutable();
    scriptParameters_.add(index, builderForValue.build());
  }
  /**
   * <pre>
   * Parameters that can be used to filter the scripts suitable for execution.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ScriptParameterProto script_parameters = 2;</code>
   */
  private void addAllScriptParameters(
      java.lang.Iterable<? extends org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto> values) {
    ensureScriptParametersIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, scriptParameters_);
  }
  /**
   * <pre>
   * Parameters that can be used to filter the scripts suitable for execution.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ScriptParameterProto script_parameters = 2;</code>
   */
  private void clearScriptParameters() {
    scriptParameters_ = emptyProtobufList();
  }
  /**
   * <pre>
   * Parameters that can be used to filter the scripts suitable for execution.
   * </pre>
   *
   * <code>repeated .autofill_assistant.ScriptParameterProto script_parameters = 2;</code>
   */
  private void removeScriptParameters(int index) {
    ensureScriptParametersIsMutable();
    scriptParameters_.remove(index);
  }

  public static final int CLIENT_CONTEXT_FIELD_NUMBER = 3;
  private org.chromium.chrome.browser.autofill_assistant.proto.ClientContextProto clientContext_;
  /**
   * <code>optional .autofill_assistant.ClientContextProto client_context = 3;</code>
   */
  public boolean hasClientContext() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional .autofill_assistant.ClientContextProto client_context = 3;</code>
   */
  public org.chromium.chrome.browser.autofill_assistant.proto.ClientContextProto getClientContext() {
    return clientContext_ == null ? org.chromium.chrome.browser.autofill_assistant.proto.ClientContextProto.getDefaultInstance() : clientContext_;
  }
  /**
   * <code>optional .autofill_assistant.ClientContextProto client_context = 3;</code>
   */
  private void setClientContext(org.chromium.chrome.browser.autofill_assistant.proto.ClientContextProto value) {
    if (value == null) {
      throw new NullPointerException();
    }
    clientContext_ = value;
    bitField0_ |= 0x00000002;
    }
  /**
   * <code>optional .autofill_assistant.ClientContextProto client_context = 3;</code>
   */
  private void setClientContext(
      org.chromium.chrome.browser.autofill_assistant.proto.ClientContextProto.Builder builderForValue) {
    clientContext_ = builderForValue.build();
    bitField0_ |= 0x00000002;
  }
  /**
   * <code>optional .autofill_assistant.ClientContextProto client_context = 3;</code>
   */
  private void mergeClientContext(org.chromium.chrome.browser.autofill_assistant.proto.ClientContextProto value) {
    if (clientContext_ != null &&
        clientContext_ != org.chromium.chrome.browser.autofill_assistant.proto.ClientContextProto.getDefaultInstance()) {
      clientContext_ =
        org.chromium.chrome.browser.autofill_assistant.proto.ClientContextProto.newBuilder(clientContext_).mergeFrom(value).buildPartial();
    } else {
      clientContext_ = value;
    }
    bitField0_ |= 0x00000002;
  }
  /**
   * <code>optional .autofill_assistant.ClientContextProto client_context = 3;</code>
   */
  private void clearClientContext() {  clientContext_ = null;
    bitField0_ = (bitField0_ & ~0x00000002);
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeString(1, getUrl());
    }
    for (int i = 0; i < scriptParameters_.size(); i++) {
      output.writeMessage(2, scriptParameters_.get(i));
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeMessage(3, getClientContext());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getUrl());
    }
    for (int i = 0; i < scriptParameters_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, scriptParameters_.get(i));
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getClientContext());
    }
    size += unknownFields.getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.SupportsScriptRequestProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SupportsScriptRequestProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SupportsScriptRequestProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SupportsScriptRequestProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SupportsScriptRequestProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SupportsScriptRequestProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SupportsScriptRequestProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SupportsScriptRequestProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SupportsScriptRequestProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static org.chromium.chrome.browser.autofill_assistant.proto.SupportsScriptRequestProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.chromium.chrome.browser.autofill_assistant.proto.SupportsScriptRequestProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Get the list of scripts that can potentially be run on a url.
   * </pre>
   *
   * Protobuf type {@code autofill_assistant.SupportsScriptRequestProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        org.chromium.chrome.browser.autofill_assistant.proto.SupportsScriptRequestProto, Builder> implements
      // @@protoc_insertion_point(builder_implements:autofill_assistant.SupportsScriptRequestProto)
      org.chromium.chrome.browser.autofill_assistant.proto.SupportsScriptRequestProtoOrBuilder {
    // Construct using org.chromium.chrome.browser.autofill_assistant.proto.SupportsScriptRequestProto.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional string url = 1;</code>
     */
    public boolean hasUrl() {
      return instance.hasUrl();
    }
    /**
     * <code>optional string url = 1;</code>
     */
    public java.lang.String getUrl() {
      return instance.getUrl();
    }
    /**
     * <code>optional string url = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUrlBytes() {
      return instance.getUrlBytes();
    }
    /**
     * <code>optional string url = 1;</code>
     */
    public Builder setUrl(
        java.lang.String value) {
      copyOnWrite();
      instance.setUrl(value);
      return this;
    }
    /**
     * <code>optional string url = 1;</code>
     */
    public Builder clearUrl() {
      copyOnWrite();
      instance.clearUrl();
      return this;
    }
    /**
     * <code>optional string url = 1;</code>
     */
    public Builder setUrlBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setUrlBytes(value);
      return this;
    }

    /**
     * <pre>
     * Parameters that can be used to filter the scripts suitable for execution.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ScriptParameterProto script_parameters = 2;</code>
     */
    public java.util.List<org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto> getScriptParametersList() {
      return java.util.Collections.unmodifiableList(
          instance.getScriptParametersList());
    }
    /**
     * <pre>
     * Parameters that can be used to filter the scripts suitable for execution.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ScriptParameterProto script_parameters = 2;</code>
     */
    public int getScriptParametersCount() {
      return instance.getScriptParametersCount();
    }/**
     * <pre>
     * Parameters that can be used to filter the scripts suitable for execution.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ScriptParameterProto script_parameters = 2;</code>
     */
    public org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto getScriptParameters(int index) {
      return instance.getScriptParameters(index);
    }
    /**
     * <pre>
     * Parameters that can be used to filter the scripts suitable for execution.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ScriptParameterProto script_parameters = 2;</code>
     */
    public Builder setScriptParameters(
        int index, org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto value) {
      copyOnWrite();
      instance.setScriptParameters(index, value);
      return this;
    }
    /**
     * <pre>
     * Parameters that can be used to filter the scripts suitable for execution.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ScriptParameterProto script_parameters = 2;</code>
     */
    public Builder setScriptParameters(
        int index, org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto.Builder builderForValue) {
      copyOnWrite();
      instance.setScriptParameters(index, builderForValue);
      return this;
    }
    /**
     * <pre>
     * Parameters that can be used to filter the scripts suitable for execution.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ScriptParameterProto script_parameters = 2;</code>
     */
    public Builder addScriptParameters(org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto value) {
      copyOnWrite();
      instance.addScriptParameters(value);
      return this;
    }
    /**
     * <pre>
     * Parameters that can be used to filter the scripts suitable for execution.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ScriptParameterProto script_parameters = 2;</code>
     */
    public Builder addScriptParameters(
        int index, org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto value) {
      copyOnWrite();
      instance.addScriptParameters(index, value);
      return this;
    }
    /**
     * <pre>
     * Parameters that can be used to filter the scripts suitable for execution.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ScriptParameterProto script_parameters = 2;</code>
     */
    public Builder addScriptParameters(
        org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto.Builder builderForValue) {
      copyOnWrite();
      instance.addScriptParameters(builderForValue);
      return this;
    }
    /**
     * <pre>
     * Parameters that can be used to filter the scripts suitable for execution.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ScriptParameterProto script_parameters = 2;</code>
     */
    public Builder addScriptParameters(
        int index, org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto.Builder builderForValue) {
      copyOnWrite();
      instance.addScriptParameters(index, builderForValue);
      return this;
    }
    /**
     * <pre>
     * Parameters that can be used to filter the scripts suitable for execution.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ScriptParameterProto script_parameters = 2;</code>
     */
    public Builder addAllScriptParameters(
        java.lang.Iterable<? extends org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto> values) {
      copyOnWrite();
      instance.addAllScriptParameters(values);
      return this;
    }
    /**
     * <pre>
     * Parameters that can be used to filter the scripts suitable for execution.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ScriptParameterProto script_parameters = 2;</code>
     */
    public Builder clearScriptParameters() {
      copyOnWrite();
      instance.clearScriptParameters();
      return this;
    }
    /**
     * <pre>
     * Parameters that can be used to filter the scripts suitable for execution.
     * </pre>
     *
     * <code>repeated .autofill_assistant.ScriptParameterProto script_parameters = 2;</code>
     */
    public Builder removeScriptParameters(int index) {
      copyOnWrite();
      instance.removeScriptParameters(index);
      return this;
    }

    /**
     * <code>optional .autofill_assistant.ClientContextProto client_context = 3;</code>
     */
    public boolean hasClientContext() {
      return instance.hasClientContext();
    }
    /**
     * <code>optional .autofill_assistant.ClientContextProto client_context = 3;</code>
     */
    public org.chromium.chrome.browser.autofill_assistant.proto.ClientContextProto getClientContext() {
      return instance.getClientContext();
    }
    /**
     * <code>optional .autofill_assistant.ClientContextProto client_context = 3;</code>
     */
    public Builder setClientContext(org.chromium.chrome.browser.autofill_assistant.proto.ClientContextProto value) {
      copyOnWrite();
      instance.setClientContext(value);
      return this;
      }
    /**
     * <code>optional .autofill_assistant.ClientContextProto client_context = 3;</code>
     */
    public Builder setClientContext(
        org.chromium.chrome.browser.autofill_assistant.proto.ClientContextProto.Builder builderForValue) {
      copyOnWrite();
      instance.setClientContext(builderForValue);
      return this;
    }
    /**
     * <code>optional .autofill_assistant.ClientContextProto client_context = 3;</code>
     */
    public Builder mergeClientContext(org.chromium.chrome.browser.autofill_assistant.proto.ClientContextProto value) {
      copyOnWrite();
      instance.mergeClientContext(value);
      return this;
    }
    /**
     * <code>optional .autofill_assistant.ClientContextProto client_context = 3;</code>
     */
    public Builder clearClientContext() {  copyOnWrite();
      instance.clearClientContext();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:autofill_assistant.SupportsScriptRequestProto)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new org.chromium.chrome.browser.autofill_assistant.proto.SupportsScriptRequestProto();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        scriptParameters_.makeImmutable();
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        org.chromium.chrome.browser.autofill_assistant.proto.SupportsScriptRequestProto other = (org.chromium.chrome.browser.autofill_assistant.proto.SupportsScriptRequestProto) arg1;
        url_ = visitor.visitString(
            hasUrl(), url_,
            other.hasUrl(), other.url_);
        scriptParameters_= visitor.visitList(scriptParameters_, other.scriptParameters_);
        clientContext_ = visitor.visitMessage(clientContext_, other.clientContext_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
          bitField0_ |= other.bitField0_;
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!parseUnknownField(tag, input)) {
                  done = true;
                }
                break;
              }
              case 10: {
                String s = input.readString();
                bitField0_ |= 0x00000001;
                url_ = s;
                break;
              }
              case 18: {
                if (!scriptParameters_.isModifiable()) {
                  scriptParameters_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(scriptParameters_);
                }
                scriptParameters_.add(
                    input.readMessage(org.chromium.chrome.browser.autofill_assistant.proto.ScriptParameterProto.parser(), extensionRegistry));
                break;
              }
              case 26: {
                org.chromium.chrome.browser.autofill_assistant.proto.ClientContextProto.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                  subBuilder = clientContext_.toBuilder();
                }
                clientContext_ = input.readMessage(org.chromium.chrome.browser.autofill_assistant.proto.ClientContextProto.parser(), extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(clientContext_);
                  clientContext_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (org.chromium.chrome.browser.autofill_assistant.proto.SupportsScriptRequestProto.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:autofill_assistant.SupportsScriptRequestProto)
  private static final org.chromium.chrome.browser.autofill_assistant.proto.SupportsScriptRequestProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new SupportsScriptRequestProto();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static org.chromium.chrome.browser.autofill_assistant.proto.SupportsScriptRequestProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<SupportsScriptRequestProto> PARSER;

  public static com.google.protobuf.Parser<SupportsScriptRequestProto> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

