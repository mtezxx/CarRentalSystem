// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: reservation.proto

package proto;

public final class Reservation {
  private Reservation() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReservationProtoObjOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.ReservationProtoObj)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 id = 1;</code>
     */
    int getId();

    /**
     * <code>int32 carId = 2;</code>
     */
    int getCarId();

    /**
     * <code>int32 userId = 3;</code>
     */
    int getUserId();

    /**
     * <code>.google.protobuf.Timestamp startDate = 4;</code>
     */
    boolean hasStartDate();
    /**
     * <code>.google.protobuf.Timestamp startDate = 4;</code>
     */
    com.google.protobuf.Timestamp getStartDate();
    /**
     * <code>.google.protobuf.Timestamp startDate = 4;</code>
     */
    com.google.protobuf.TimestampOrBuilder getStartDateOrBuilder();

    /**
     * <code>.google.protobuf.Timestamp endDate = 5;</code>
     */
    boolean hasEndDate();
    /**
     * <code>.google.protobuf.Timestamp endDate = 5;</code>
     */
    com.google.protobuf.Timestamp getEndDate();
    /**
     * <code>.google.protobuf.Timestamp endDate = 5;</code>
     */
    com.google.protobuf.TimestampOrBuilder getEndDateOrBuilder();

    /**
     * <code>double totalPrice = 6;</code>
     */
    double getTotalPrice();
  }
  /**
   * Protobuf type {@code proto.ReservationProtoObj}
   */
  public  static final class ReservationProtoObj extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:proto.ReservationProtoObj)
      ReservationProtoObjOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReservationProtoObj.newBuilder() to construct.
    private ReservationProtoObj(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReservationProtoObj() {
      id_ = 0;
      carId_ = 0;
      userId_ = 0;
      totalPrice_ = 0D;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReservationProtoObj(
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

              id_ = input.readInt32();
              break;
            }
            case 16: {

              carId_ = input.readInt32();
              break;
            }
            case 24: {

              userId_ = input.readInt32();
              break;
            }
            case 34: {
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (startDate_ != null) {
                subBuilder = startDate_.toBuilder();
              }
              startDate_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(startDate_);
                startDate_ = subBuilder.buildPartial();
              }

              break;
            }
            case 42: {
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (endDate_ != null) {
                subBuilder = endDate_.toBuilder();
              }
              endDate_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(endDate_);
                endDate_ = subBuilder.buildPartial();
              }

              break;
            }
            case 49: {

              totalPrice_ = input.readDouble();
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
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
      return proto.Reservation.internal_static_proto_ReservationProtoObj_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.Reservation.internal_static_proto_ReservationProtoObj_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.Reservation.ReservationProtoObj.class, proto.Reservation.ReservationProtoObj.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }

    public static final int CARID_FIELD_NUMBER = 2;
    private int carId_;
    /**
     * <code>int32 carId = 2;</code>
     */
    public int getCarId() {
      return carId_;
    }

    public static final int USERID_FIELD_NUMBER = 3;
    private int userId_;
    /**
     * <code>int32 userId = 3;</code>
     */
    public int getUserId() {
      return userId_;
    }

    public static final int STARTDATE_FIELD_NUMBER = 4;
    private com.google.protobuf.Timestamp startDate_;
    /**
     * <code>.google.protobuf.Timestamp startDate = 4;</code>
     */
    public boolean hasStartDate() {
      return startDate_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp startDate = 4;</code>
     */
    public com.google.protobuf.Timestamp getStartDate() {
      return startDate_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startDate_;
    }
    /**
     * <code>.google.protobuf.Timestamp startDate = 4;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getStartDateOrBuilder() {
      return getStartDate();
    }

    public static final int ENDDATE_FIELD_NUMBER = 5;
    private com.google.protobuf.Timestamp endDate_;
    /**
     * <code>.google.protobuf.Timestamp endDate = 5;</code>
     */
    public boolean hasEndDate() {
      return endDate_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp endDate = 5;</code>
     */
    public com.google.protobuf.Timestamp getEndDate() {
      return endDate_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : endDate_;
    }
    /**
     * <code>.google.protobuf.Timestamp endDate = 5;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getEndDateOrBuilder() {
      return getEndDate();
    }

    public static final int TOTALPRICE_FIELD_NUMBER = 6;
    private double totalPrice_;
    /**
     * <code>double totalPrice = 6;</code>
     */
    public double getTotalPrice() {
      return totalPrice_;
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
      if (id_ != 0) {
        output.writeInt32(1, id_);
      }
      if (carId_ != 0) {
        output.writeInt32(2, carId_);
      }
      if (userId_ != 0) {
        output.writeInt32(3, userId_);
      }
      if (startDate_ != null) {
        output.writeMessage(4, getStartDate());
      }
      if (endDate_ != null) {
        output.writeMessage(5, getEndDate());
      }
      if (totalPrice_ != 0D) {
        output.writeDouble(6, totalPrice_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, id_);
      }
      if (carId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, carId_);
      }
      if (userId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, userId_);
      }
      if (startDate_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getStartDate());
      }
      if (endDate_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, getEndDate());
      }
      if (totalPrice_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(6, totalPrice_);
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
      if (!(obj instanceof proto.Reservation.ReservationProtoObj)) {
        return super.equals(obj);
      }
      proto.Reservation.ReservationProtoObj other = (proto.Reservation.ReservationProtoObj) obj;

      boolean result = true;
      result = result && (getId()
          == other.getId());
      result = result && (getCarId()
          == other.getCarId());
      result = result && (getUserId()
          == other.getUserId());
      result = result && (hasStartDate() == other.hasStartDate());
      if (hasStartDate()) {
        result = result && getStartDate()
            .equals(other.getStartDate());
      }
      result = result && (hasEndDate() == other.hasEndDate());
      if (hasEndDate()) {
        result = result && getEndDate()
            .equals(other.getEndDate());
      }
      result = result && (
          java.lang.Double.doubleToLongBits(getTotalPrice())
          == java.lang.Double.doubleToLongBits(
              other.getTotalPrice()));
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (37 * hash) + CARID_FIELD_NUMBER;
      hash = (53 * hash) + getCarId();
      hash = (37 * hash) + USERID_FIELD_NUMBER;
      hash = (53 * hash) + getUserId();
      if (hasStartDate()) {
        hash = (37 * hash) + STARTDATE_FIELD_NUMBER;
        hash = (53 * hash) + getStartDate().hashCode();
      }
      if (hasEndDate()) {
        hash = (37 * hash) + ENDDATE_FIELD_NUMBER;
        hash = (53 * hash) + getEndDate().hashCode();
      }
      hash = (37 * hash) + TOTALPRICE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getTotalPrice()));
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static proto.Reservation.ReservationProtoObj parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static proto.Reservation.ReservationProtoObj parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static proto.Reservation.ReservationProtoObj parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static proto.Reservation.ReservationProtoObj parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static proto.Reservation.ReservationProtoObj parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static proto.Reservation.ReservationProtoObj parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static proto.Reservation.ReservationProtoObj parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static proto.Reservation.ReservationProtoObj parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static proto.Reservation.ReservationProtoObj parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static proto.Reservation.ReservationProtoObj parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static proto.Reservation.ReservationProtoObj parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static proto.Reservation.ReservationProtoObj parseFrom(
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
    public static Builder newBuilder(proto.Reservation.ReservationProtoObj prototype) {
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
     * Protobuf type {@code proto.ReservationProtoObj}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.ReservationProtoObj)
        proto.Reservation.ReservationProtoObjOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return proto.Reservation.internal_static_proto_ReservationProtoObj_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return proto.Reservation.internal_static_proto_ReservationProtoObj_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                proto.Reservation.ReservationProtoObj.class, proto.Reservation.ReservationProtoObj.Builder.class);
      }

      // Construct using proto.Reservation.ReservationProtoObj.newBuilder()
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
        id_ = 0;

        carId_ = 0;

        userId_ = 0;

        if (startDateBuilder_ == null) {
          startDate_ = null;
        } else {
          startDate_ = null;
          startDateBuilder_ = null;
        }
        if (endDateBuilder_ == null) {
          endDate_ = null;
        } else {
          endDate_ = null;
          endDateBuilder_ = null;
        }
        totalPrice_ = 0D;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return proto.Reservation.internal_static_proto_ReservationProtoObj_descriptor;
      }

      @java.lang.Override
      public proto.Reservation.ReservationProtoObj getDefaultInstanceForType() {
        return proto.Reservation.ReservationProtoObj.getDefaultInstance();
      }

      @java.lang.Override
      public proto.Reservation.ReservationProtoObj build() {
        proto.Reservation.ReservationProtoObj result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public proto.Reservation.ReservationProtoObj buildPartial() {
        proto.Reservation.ReservationProtoObj result = new proto.Reservation.ReservationProtoObj(this);
        result.id_ = id_;
        result.carId_ = carId_;
        result.userId_ = userId_;
        if (startDateBuilder_ == null) {
          result.startDate_ = startDate_;
        } else {
          result.startDate_ = startDateBuilder_.build();
        }
        if (endDateBuilder_ == null) {
          result.endDate_ = endDate_;
        } else {
          result.endDate_ = endDateBuilder_.build();
        }
        result.totalPrice_ = totalPrice_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof proto.Reservation.ReservationProtoObj) {
          return mergeFrom((proto.Reservation.ReservationProtoObj)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(proto.Reservation.ReservationProtoObj other) {
        if (other == proto.Reservation.ReservationProtoObj.getDefaultInstance()) return this;
        if (other.getId() != 0) {
          setId(other.getId());
        }
        if (other.getCarId() != 0) {
          setCarId(other.getCarId());
        }
        if (other.getUserId() != 0) {
          setUserId(other.getUserId());
        }
        if (other.hasStartDate()) {
          mergeStartDate(other.getStartDate());
        }
        if (other.hasEndDate()) {
          mergeEndDate(other.getEndDate());
        }
        if (other.getTotalPrice() != 0D) {
          setTotalPrice(other.getTotalPrice());
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
        proto.Reservation.ReservationProtoObj parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (proto.Reservation.ReservationProtoObj) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int id_ ;
      /**
       * <code>int32 id = 1;</code>
       */
      public int getId() {
        return id_;
      }
      /**
       * <code>int32 id = 1;</code>
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 id = 1;</code>
       */
      public Builder clearId() {
        
        id_ = 0;
        onChanged();
        return this;
      }

      private int carId_ ;
      /**
       * <code>int32 carId = 2;</code>
       */
      public int getCarId() {
        return carId_;
      }
      /**
       * <code>int32 carId = 2;</code>
       */
      public Builder setCarId(int value) {
        
        carId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 carId = 2;</code>
       */
      public Builder clearCarId() {
        
        carId_ = 0;
        onChanged();
        return this;
      }

      private int userId_ ;
      /**
       * <code>int32 userId = 3;</code>
       */
      public int getUserId() {
        return userId_;
      }
      /**
       * <code>int32 userId = 3;</code>
       */
      public Builder setUserId(int value) {
        
        userId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 userId = 3;</code>
       */
      public Builder clearUserId() {
        
        userId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Timestamp startDate_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> startDateBuilder_;
      /**
       * <code>.google.protobuf.Timestamp startDate = 4;</code>
       */
      public boolean hasStartDate() {
        return startDateBuilder_ != null || startDate_ != null;
      }
      /**
       * <code>.google.protobuf.Timestamp startDate = 4;</code>
       */
      public com.google.protobuf.Timestamp getStartDate() {
        if (startDateBuilder_ == null) {
          return startDate_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startDate_;
        } else {
          return startDateBuilder_.getMessage();
        }
      }
      /**
       * <code>.google.protobuf.Timestamp startDate = 4;</code>
       */
      public Builder setStartDate(com.google.protobuf.Timestamp value) {
        if (startDateBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          startDate_ = value;
          onChanged();
        } else {
          startDateBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp startDate = 4;</code>
       */
      public Builder setStartDate(
          com.google.protobuf.Timestamp.Builder builderForValue) {
        if (startDateBuilder_ == null) {
          startDate_ = builderForValue.build();
          onChanged();
        } else {
          startDateBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp startDate = 4;</code>
       */
      public Builder mergeStartDate(com.google.protobuf.Timestamp value) {
        if (startDateBuilder_ == null) {
          if (startDate_ != null) {
            startDate_ =
              com.google.protobuf.Timestamp.newBuilder(startDate_).mergeFrom(value).buildPartial();
          } else {
            startDate_ = value;
          }
          onChanged();
        } else {
          startDateBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp startDate = 4;</code>
       */
      public Builder clearStartDate() {
        if (startDateBuilder_ == null) {
          startDate_ = null;
          onChanged();
        } else {
          startDate_ = null;
          startDateBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp startDate = 4;</code>
       */
      public com.google.protobuf.Timestamp.Builder getStartDateBuilder() {
        
        onChanged();
        return getStartDateFieldBuilder().getBuilder();
      }
      /**
       * <code>.google.protobuf.Timestamp startDate = 4;</code>
       */
      public com.google.protobuf.TimestampOrBuilder getStartDateOrBuilder() {
        if (startDateBuilder_ != null) {
          return startDateBuilder_.getMessageOrBuilder();
        } else {
          return startDate_ == null ?
              com.google.protobuf.Timestamp.getDefaultInstance() : startDate_;
        }
      }
      /**
       * <code>.google.protobuf.Timestamp startDate = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
          getStartDateFieldBuilder() {
        if (startDateBuilder_ == null) {
          startDateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                  getStartDate(),
                  getParentForChildren(),
                  isClean());
          startDate_ = null;
        }
        return startDateBuilder_;
      }

      private com.google.protobuf.Timestamp endDate_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> endDateBuilder_;
      /**
       * <code>.google.protobuf.Timestamp endDate = 5;</code>
       */
      public boolean hasEndDate() {
        return endDateBuilder_ != null || endDate_ != null;
      }
      /**
       * <code>.google.protobuf.Timestamp endDate = 5;</code>
       */
      public com.google.protobuf.Timestamp getEndDate() {
        if (endDateBuilder_ == null) {
          return endDate_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : endDate_;
        } else {
          return endDateBuilder_.getMessage();
        }
      }
      /**
       * <code>.google.protobuf.Timestamp endDate = 5;</code>
       */
      public Builder setEndDate(com.google.protobuf.Timestamp value) {
        if (endDateBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          endDate_ = value;
          onChanged();
        } else {
          endDateBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp endDate = 5;</code>
       */
      public Builder setEndDate(
          com.google.protobuf.Timestamp.Builder builderForValue) {
        if (endDateBuilder_ == null) {
          endDate_ = builderForValue.build();
          onChanged();
        } else {
          endDateBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp endDate = 5;</code>
       */
      public Builder mergeEndDate(com.google.protobuf.Timestamp value) {
        if (endDateBuilder_ == null) {
          if (endDate_ != null) {
            endDate_ =
              com.google.protobuf.Timestamp.newBuilder(endDate_).mergeFrom(value).buildPartial();
          } else {
            endDate_ = value;
          }
          onChanged();
        } else {
          endDateBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp endDate = 5;</code>
       */
      public Builder clearEndDate() {
        if (endDateBuilder_ == null) {
          endDate_ = null;
          onChanged();
        } else {
          endDate_ = null;
          endDateBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp endDate = 5;</code>
       */
      public com.google.protobuf.Timestamp.Builder getEndDateBuilder() {
        
        onChanged();
        return getEndDateFieldBuilder().getBuilder();
      }
      /**
       * <code>.google.protobuf.Timestamp endDate = 5;</code>
       */
      public com.google.protobuf.TimestampOrBuilder getEndDateOrBuilder() {
        if (endDateBuilder_ != null) {
          return endDateBuilder_.getMessageOrBuilder();
        } else {
          return endDate_ == null ?
              com.google.protobuf.Timestamp.getDefaultInstance() : endDate_;
        }
      }
      /**
       * <code>.google.protobuf.Timestamp endDate = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
          getEndDateFieldBuilder() {
        if (endDateBuilder_ == null) {
          endDateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                  getEndDate(),
                  getParentForChildren(),
                  isClean());
          endDate_ = null;
        }
        return endDateBuilder_;
      }

      private double totalPrice_ ;
      /**
       * <code>double totalPrice = 6;</code>
       */
      public double getTotalPrice() {
        return totalPrice_;
      }
      /**
       * <code>double totalPrice = 6;</code>
       */
      public Builder setTotalPrice(double value) {
        
        totalPrice_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double totalPrice = 6;</code>
       */
      public Builder clearTotalPrice() {
        
        totalPrice_ = 0D;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:proto.ReservationProtoObj)
    }

    // @@protoc_insertion_point(class_scope:proto.ReservationProtoObj)
    private static final proto.Reservation.ReservationProtoObj DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new proto.Reservation.ReservationProtoObj();
    }

    public static proto.Reservation.ReservationProtoObj getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReservationProtoObj>
        PARSER = new com.google.protobuf.AbstractParser<ReservationProtoObj>() {
      @java.lang.Override
      public ReservationProtoObj parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReservationProtoObj(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReservationProtoObj> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReservationProtoObj> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public proto.Reservation.ReservationProtoObj getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_ReservationProtoObj_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_ReservationProtoObj_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021reservation.proto\022\005proto\032\036google/proto" +
      "buf/wrappers.proto\032\033google/protobuf/empt" +
      "y.proto\032\037google/protobuf/timestamp.proto" +
      "\"\260\001\n\023ReservationProtoObj\022\n\n\002id\030\001 \001(\005\022\r\n\005" +
      "carId\030\002 \001(\005\022\016\n\006userId\030\003 \001(\005\022-\n\tstartDate" +
      "\030\004 \001(\0132\032.google.protobuf.Timestamp\022+\n\007en" +
      "dDate\030\005 \001(\0132\032.google.protobuf.Timestamp\022" +
      "\022\n\ntotalPrice\030\006 \001(\0012f\n\027ReservationProtoS" +
      "ervice\022K\n\021CreateReservation\022\032.proto.Rese" +
      "rvationProtoObj\032\032.proto.ReservationProto" +
      "Objb\006proto3"
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
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        }, assigner);
    internal_static_proto_ReservationProtoObj_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_ReservationProtoObj_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_ReservationProtoObj_descriptor,
        new java.lang.String[] { "Id", "CarId", "UserId", "StartDate", "EndDate", "TotalPrice", });
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
