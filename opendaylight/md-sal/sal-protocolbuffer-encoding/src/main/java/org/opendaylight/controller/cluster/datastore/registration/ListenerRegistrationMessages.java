// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ListenerRegistration.proto

package org.opendaylight.controller.cluster.datastore.registration;

public final class ListenerRegistrationMessages {
  private ListenerRegistrationMessages() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface CloseOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code org.opendaylight.controller.mdsal.Close}
   */
  public static final class Close extends
      com.google.protobuf.GeneratedMessage
      implements CloseOrBuilder {
    // Use Close.newBuilder() to construct.
    private Close(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Close(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Close defaultInstance;
    public static Close getDefaultInstance() {
      return defaultInstance;
    }

    public Close getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Close(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.internal_static_org_opendaylight_controller_mdsal_Close_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.internal_static_org_opendaylight_controller_mdsal_Close_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.Close.class, org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.Close.Builder.class);
    }

    public static com.google.protobuf.Parser<Close> PARSER =
        new com.google.protobuf.AbstractParser<Close>() {
      public Close parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Close(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Close> getParserForType() {
      return PARSER;
    }

    private void initFields() {
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.Close parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.Close parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.Close parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.Close parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.Close parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.Close parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.Close parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.Close parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.Close parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.Close parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.Close prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code org.opendaylight.controller.mdsal.Close}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.CloseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.internal_static_org_opendaylight_controller_mdsal_Close_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.internal_static_org_opendaylight_controller_mdsal_Close_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.Close.class, org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.Close.Builder.class);
      }

      // Construct using org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.Close.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.internal_static_org_opendaylight_controller_mdsal_Close_descriptor;
      }

      public org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.Close getDefaultInstanceForType() {
        return org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.Close.getDefaultInstance();
      }

      public org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.Close build() {
        org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.Close result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.Close buildPartial() {
        org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.Close result = new org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.Close(this);
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.Close) {
          return mergeFrom((org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.Close)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.Close other) {
        if (other == org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.Close.getDefaultInstance()) return this;
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.Close parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.Close) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      // @@protoc_insertion_point(builder_scope:org.opendaylight.controller.mdsal.Close)
    }

    static {
      defaultInstance = new Close(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:org.opendaylight.controller.mdsal.Close)
  }

  public interface CloseReplyOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code org.opendaylight.controller.mdsal.CloseReply}
   */
  public static final class CloseReply extends
      com.google.protobuf.GeneratedMessage
      implements CloseReplyOrBuilder {
    // Use CloseReply.newBuilder() to construct.
    private CloseReply(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private CloseReply(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final CloseReply defaultInstance;
    public static CloseReply getDefaultInstance() {
      return defaultInstance;
    }

    public CloseReply getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private CloseReply(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.internal_static_org_opendaylight_controller_mdsal_CloseReply_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.internal_static_org_opendaylight_controller_mdsal_CloseReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.CloseReply.class, org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.CloseReply.Builder.class);
    }

    public static com.google.protobuf.Parser<CloseReply> PARSER =
        new com.google.protobuf.AbstractParser<CloseReply>() {
      public CloseReply parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CloseReply(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<CloseReply> getParserForType() {
      return PARSER;
    }

    private void initFields() {
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.CloseReply parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.CloseReply parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.CloseReply parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.CloseReply parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.CloseReply parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.CloseReply parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.CloseReply parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.CloseReply parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.CloseReply parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.CloseReply parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.CloseReply prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code org.opendaylight.controller.mdsal.CloseReply}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.CloseReplyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.internal_static_org_opendaylight_controller_mdsal_CloseReply_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.internal_static_org_opendaylight_controller_mdsal_CloseReply_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.CloseReply.class, org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.CloseReply.Builder.class);
      }

      // Construct using org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.CloseReply.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.internal_static_org_opendaylight_controller_mdsal_CloseReply_descriptor;
      }

      public org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.CloseReply getDefaultInstanceForType() {
        return org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.CloseReply.getDefaultInstance();
      }

      public org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.CloseReply build() {
        org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.CloseReply result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.CloseReply buildPartial() {
        org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.CloseReply result = new org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.CloseReply(this);
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.CloseReply) {
          return mergeFrom((org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.CloseReply)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.CloseReply other) {
        if (other == org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.CloseReply.getDefaultInstance()) return this;
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.CloseReply parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.opendaylight.controller.cluster.datastore.registration.ListenerRegistrationMessages.CloseReply) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      // @@protoc_insertion_point(builder_scope:org.opendaylight.controller.mdsal.CloseReply)
    }

    static {
      defaultInstance = new CloseReply(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:org.opendaylight.controller.mdsal.CloseReply)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_org_opendaylight_controller_mdsal_Close_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_org_opendaylight_controller_mdsal_Close_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_org_opendaylight_controller_mdsal_CloseReply_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_org_opendaylight_controller_mdsal_CloseReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032ListenerRegistration.proto\022!org.openda" +
      "ylight.controller.mdsal\"\007\n\005Close\"\014\n\nClos" +
      "eReplyBZ\n:org.opendaylight.controller.cl" +
      "uster.datastore.registrationB\034ListenerRe" +
      "gistrationMessages"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_org_opendaylight_controller_mdsal_Close_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_org_opendaylight_controller_mdsal_Close_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_org_opendaylight_controller_mdsal_Close_descriptor,
              new java.lang.String[] { });
          internal_static_org_opendaylight_controller_mdsal_CloseReply_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_org_opendaylight_controller_mdsal_CloseReply_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_org_opendaylight_controller_mdsal_CloseReply_descriptor,
              new java.lang.String[] { });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}