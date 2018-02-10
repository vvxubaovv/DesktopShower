// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/resources/proto/connection.proto

package com.xubao.comment.proto;

public final class Connection {
  private Connection() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HeartbeatOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.xubao.comment.proto.Heartbeat)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * <pre>
   *心跳包
   * </pre>
   *
   * Protobuf type {@code com.xubao.comment.proto.Heartbeat}
   */
  public  static final class Heartbeat extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.xubao.comment.proto.Heartbeat)
      HeartbeatOrBuilder {
    // Use Heartbeat.newBuilder() to construct.
    private Heartbeat(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Heartbeat() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Heartbeat(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
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
      return com.xubao.comment.proto.Connection.internal_static_com_xubao_comment_proto_Heartbeat_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xubao.comment.proto.Connection.internal_static_com_xubao_comment_proto_Heartbeat_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xubao.comment.proto.Connection.Heartbeat.class, com.xubao.comment.proto.Connection.Heartbeat.Builder.class);
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.xubao.comment.proto.Connection.Heartbeat)) {
        return super.equals(obj);
      }
      com.xubao.comment.proto.Connection.Heartbeat other = (com.xubao.comment.proto.Connection.Heartbeat) obj;

      boolean result = true;
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.xubao.comment.proto.Connection.Heartbeat parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.xubao.comment.proto.Connection.Heartbeat parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.xubao.comment.proto.Connection.Heartbeat parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.xubao.comment.proto.Connection.Heartbeat parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.xubao.comment.proto.Connection.Heartbeat parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.xubao.comment.proto.Connection.Heartbeat parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.xubao.comment.proto.Connection.Heartbeat parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.xubao.comment.proto.Connection.Heartbeat parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.xubao.comment.proto.Connection.Heartbeat parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.xubao.comment.proto.Connection.Heartbeat parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.xubao.comment.proto.Connection.Heartbeat prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     *心跳包
     * </pre>
     *
     * Protobuf type {@code com.xubao.comment.proto.Heartbeat}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.xubao.comment.proto.Heartbeat)
        com.xubao.comment.proto.Connection.HeartbeatOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xubao.comment.proto.Connection.internal_static_com_xubao_comment_proto_Heartbeat_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xubao.comment.proto.Connection.internal_static_com_xubao_comment_proto_Heartbeat_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.xubao.comment.proto.Connection.Heartbeat.class, com.xubao.comment.proto.Connection.Heartbeat.Builder.class);
      }

      // Construct using com.xubao.comment.proto.Connection.Heartbeat.newBuilder()
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
      public Builder clear() {
        super.clear();
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xubao.comment.proto.Connection.internal_static_com_xubao_comment_proto_Heartbeat_descriptor;
      }

      public com.xubao.comment.proto.Connection.Heartbeat getDefaultInstanceForType() {
        return com.xubao.comment.proto.Connection.Heartbeat.getDefaultInstance();
      }

      public com.xubao.comment.proto.Connection.Heartbeat build() {
        com.xubao.comment.proto.Connection.Heartbeat result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.xubao.comment.proto.Connection.Heartbeat buildPartial() {
        com.xubao.comment.proto.Connection.Heartbeat result = new com.xubao.comment.proto.Connection.Heartbeat(this);
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xubao.comment.proto.Connection.Heartbeat) {
          return mergeFrom((com.xubao.comment.proto.Connection.Heartbeat)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.xubao.comment.proto.Connection.Heartbeat other) {
        if (other == com.xubao.comment.proto.Connection.Heartbeat.getDefaultInstance()) return this;
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.xubao.comment.proto.Connection.Heartbeat parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.xubao.comment.proto.Connection.Heartbeat) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.xubao.comment.proto.Heartbeat)
    }

    // @@protoc_insertion_point(class_scope:com.xubao.comment.proto.Heartbeat)
    private static final com.xubao.comment.proto.Connection.Heartbeat DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.xubao.comment.proto.Connection.Heartbeat();
    }

    public static com.xubao.comment.proto.Connection.Heartbeat getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<Heartbeat>
        PARSER = new com.google.protobuf.AbstractParser<Heartbeat>() {
      public Heartbeat parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new Heartbeat(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Heartbeat> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Heartbeat> getParserForType() {
      return PARSER;
    }

    public com.xubao.comment.proto.Connection.Heartbeat getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface HeartbeatResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.xubao.comment.proto.HeartbeatResponse)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code com.xubao.comment.proto.HeartbeatResponse}
   */
  public  static final class HeartbeatResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.xubao.comment.proto.HeartbeatResponse)
      HeartbeatResponseOrBuilder {
    // Use HeartbeatResponse.newBuilder() to construct.
    private HeartbeatResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HeartbeatResponse() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HeartbeatResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
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
      return com.xubao.comment.proto.Connection.internal_static_com_xubao_comment_proto_HeartbeatResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xubao.comment.proto.Connection.internal_static_com_xubao_comment_proto_HeartbeatResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.xubao.comment.proto.Connection.HeartbeatResponse.class, com.xubao.comment.proto.Connection.HeartbeatResponse.Builder.class);
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.xubao.comment.proto.Connection.HeartbeatResponse)) {
        return super.equals(obj);
      }
      com.xubao.comment.proto.Connection.HeartbeatResponse other = (com.xubao.comment.proto.Connection.HeartbeatResponse) obj;

      boolean result = true;
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.xubao.comment.proto.Connection.HeartbeatResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.xubao.comment.proto.Connection.HeartbeatResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.xubao.comment.proto.Connection.HeartbeatResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.xubao.comment.proto.Connection.HeartbeatResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.xubao.comment.proto.Connection.HeartbeatResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.xubao.comment.proto.Connection.HeartbeatResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.xubao.comment.proto.Connection.HeartbeatResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.xubao.comment.proto.Connection.HeartbeatResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.xubao.comment.proto.Connection.HeartbeatResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.xubao.comment.proto.Connection.HeartbeatResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.xubao.comment.proto.Connection.HeartbeatResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * Protobuf type {@code com.xubao.comment.proto.HeartbeatResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.xubao.comment.proto.HeartbeatResponse)
        com.xubao.comment.proto.Connection.HeartbeatResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xubao.comment.proto.Connection.internal_static_com_xubao_comment_proto_HeartbeatResponse_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xubao.comment.proto.Connection.internal_static_com_xubao_comment_proto_HeartbeatResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.xubao.comment.proto.Connection.HeartbeatResponse.class, com.xubao.comment.proto.Connection.HeartbeatResponse.Builder.class);
      }

      // Construct using com.xubao.comment.proto.Connection.HeartbeatResponse.newBuilder()
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
      public Builder clear() {
        super.clear();
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xubao.comment.proto.Connection.internal_static_com_xubao_comment_proto_HeartbeatResponse_descriptor;
      }

      public com.xubao.comment.proto.Connection.HeartbeatResponse getDefaultInstanceForType() {
        return com.xubao.comment.proto.Connection.HeartbeatResponse.getDefaultInstance();
      }

      public com.xubao.comment.proto.Connection.HeartbeatResponse build() {
        com.xubao.comment.proto.Connection.HeartbeatResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.xubao.comment.proto.Connection.HeartbeatResponse buildPartial() {
        com.xubao.comment.proto.Connection.HeartbeatResponse result = new com.xubao.comment.proto.Connection.HeartbeatResponse(this);
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xubao.comment.proto.Connection.HeartbeatResponse) {
          return mergeFrom((com.xubao.comment.proto.Connection.HeartbeatResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.xubao.comment.proto.Connection.HeartbeatResponse other) {
        if (other == com.xubao.comment.proto.Connection.HeartbeatResponse.getDefaultInstance()) return this;
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.xubao.comment.proto.Connection.HeartbeatResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.xubao.comment.proto.Connection.HeartbeatResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.xubao.comment.proto.HeartbeatResponse)
    }

    // @@protoc_insertion_point(class_scope:com.xubao.comment.proto.HeartbeatResponse)
    private static final com.xubao.comment.proto.Connection.HeartbeatResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.xubao.comment.proto.Connection.HeartbeatResponse();
    }

    public static com.xubao.comment.proto.Connection.HeartbeatResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<HeartbeatResponse>
        PARSER = new com.google.protobuf.AbstractParser<HeartbeatResponse>() {
      public HeartbeatResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new HeartbeatResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HeartbeatResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HeartbeatResponse> getParserForType() {
      return PARSER;
    }

    public com.xubao.comment.proto.Connection.HeartbeatResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xubao_comment_proto_Heartbeat_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_xubao_comment_proto_Heartbeat_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xubao_comment_proto_HeartbeatResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_xubao_comment_proto_HeartbeatResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)src/main/resources/proto/connection.pr" +
      "oto\022\027com.xubao.comment.proto\"\013\n\tHeartbea" +
      "t\"\023\n\021HeartbeatResponse"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_xubao_comment_proto_Heartbeat_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_xubao_comment_proto_Heartbeat_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_xubao_comment_proto_Heartbeat_descriptor,
        new java.lang.String[] { });
    internal_static_com_xubao_comment_proto_HeartbeatResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_xubao_comment_proto_HeartbeatResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_xubao_comment_proto_HeartbeatResponse_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
