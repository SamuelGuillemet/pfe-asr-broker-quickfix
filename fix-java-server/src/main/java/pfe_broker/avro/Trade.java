/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package pfe_broker.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Trade extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5736402585144105847L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Trade\",\"namespace\":\"pfe_broker.avro\",\"fields\":[{\"name\":\"order\",\"type\":{\"type\":\"record\",\"name\":\"Order\",\"fields\":[{\"name\":\"username\",\"type\":\"string\"},{\"name\":\"symbol\",\"type\":\"string\"},{\"name\":\"quantity\",\"type\":\"int\"},{\"name\":\"side\",\"type\":{\"type\":\"enum\",\"name\":\"Side\",\"symbols\":[\"BUY\",\"SELL\"]}}]}},{\"name\":\"symbol\",\"type\":\"string\"},{\"name\":\"price\",\"type\":\"double\"},{\"name\":\"quantity\",\"type\":\"int\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Trade> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Trade> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Trade> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Trade> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Trade> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Trade to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Trade from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Trade instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Trade fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private pfe_broker.avro.Order order;
  private java.lang.CharSequence symbol;
  private double price;
  private int quantity;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Trade() {}

  /**
   * All-args constructor.
   * @param order The new value for order
   * @param symbol The new value for symbol
   * @param price The new value for price
   * @param quantity The new value for quantity
   */
  public Trade(pfe_broker.avro.Order order, java.lang.CharSequence symbol, java.lang.Double price, java.lang.Integer quantity) {
    this.order = order;
    this.symbol = symbol;
    this.price = price;
    this.quantity = quantity;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return order;
    case 1: return symbol;
    case 2: return price;
    case 3: return quantity;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: order = (pfe_broker.avro.Order)value$; break;
    case 1: symbol = (java.lang.CharSequence)value$; break;
    case 2: price = (java.lang.Double)value$; break;
    case 3: quantity = (java.lang.Integer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'order' field.
   * @return The value of the 'order' field.
   */
  public pfe_broker.avro.Order getOrder() {
    return order;
  }


  /**
   * Sets the value of the 'order' field.
   * @param value the value to set.
   */
  public void setOrder(pfe_broker.avro.Order value) {
    this.order = value;
  }

  /**
   * Gets the value of the 'symbol' field.
   * @return The value of the 'symbol' field.
   */
  public java.lang.CharSequence getSymbol() {
    return symbol;
  }


  /**
   * Sets the value of the 'symbol' field.
   * @param value the value to set.
   */
  public void setSymbol(java.lang.CharSequence value) {
    this.symbol = value;
  }

  /**
   * Gets the value of the 'price' field.
   * @return The value of the 'price' field.
   */
  public double getPrice() {
    return price;
  }


  /**
   * Sets the value of the 'price' field.
   * @param value the value to set.
   */
  public void setPrice(double value) {
    this.price = value;
  }

  /**
   * Gets the value of the 'quantity' field.
   * @return The value of the 'quantity' field.
   */
  public int getQuantity() {
    return quantity;
  }


  /**
   * Sets the value of the 'quantity' field.
   * @param value the value to set.
   */
  public void setQuantity(int value) {
    this.quantity = value;
  }

  /**
   * Creates a new Trade RecordBuilder.
   * @return A new Trade RecordBuilder
   */
  public static pfe_broker.avro.Trade.Builder newBuilder() {
    return new pfe_broker.avro.Trade.Builder();
  }

  /**
   * Creates a new Trade RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Trade RecordBuilder
   */
  public static pfe_broker.avro.Trade.Builder newBuilder(pfe_broker.avro.Trade.Builder other) {
    if (other == null) {
      return new pfe_broker.avro.Trade.Builder();
    } else {
      return new pfe_broker.avro.Trade.Builder(other);
    }
  }

  /**
   * Creates a new Trade RecordBuilder by copying an existing Trade instance.
   * @param other The existing instance to copy.
   * @return A new Trade RecordBuilder
   */
  public static pfe_broker.avro.Trade.Builder newBuilder(pfe_broker.avro.Trade other) {
    if (other == null) {
      return new pfe_broker.avro.Trade.Builder();
    } else {
      return new pfe_broker.avro.Trade.Builder(other);
    }
  }

  /**
   * RecordBuilder for Trade instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Trade>
    implements org.apache.avro.data.RecordBuilder<Trade> {

    private pfe_broker.avro.Order order;
    private pfe_broker.avro.Order.Builder orderBuilder;
    private java.lang.CharSequence symbol;
    private double price;
    private int quantity;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(pfe_broker.avro.Trade.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.order)) {
        this.order = data().deepCopy(fields()[0].schema(), other.order);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (other.hasOrderBuilder()) {
        this.orderBuilder = pfe_broker.avro.Order.newBuilder(other.getOrderBuilder());
      }
      if (isValidValue(fields()[1], other.symbol)) {
        this.symbol = data().deepCopy(fields()[1].schema(), other.symbol);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.price)) {
        this.price = data().deepCopy(fields()[2].schema(), other.price);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.quantity)) {
        this.quantity = data().deepCopy(fields()[3].schema(), other.quantity);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing Trade instance
     * @param other The existing instance to copy.
     */
    private Builder(pfe_broker.avro.Trade other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.order)) {
        this.order = data().deepCopy(fields()[0].schema(), other.order);
        fieldSetFlags()[0] = true;
      }
      this.orderBuilder = null;
      if (isValidValue(fields()[1], other.symbol)) {
        this.symbol = data().deepCopy(fields()[1].schema(), other.symbol);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.price)) {
        this.price = data().deepCopy(fields()[2].schema(), other.price);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.quantity)) {
        this.quantity = data().deepCopy(fields()[3].schema(), other.quantity);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'order' field.
      * @return The value.
      */
    public pfe_broker.avro.Order getOrder() {
      return order;
    }


    /**
      * Sets the value of the 'order' field.
      * @param value The value of 'order'.
      * @return This builder.
      */
    public pfe_broker.avro.Trade.Builder setOrder(pfe_broker.avro.Order value) {
      validate(fields()[0], value);
      this.orderBuilder = null;
      this.order = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'order' field has been set.
      * @return True if the 'order' field has been set, false otherwise.
      */
    public boolean hasOrder() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'order' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public pfe_broker.avro.Order.Builder getOrderBuilder() {
      if (orderBuilder == null) {
        if (hasOrder()) {
          setOrderBuilder(pfe_broker.avro.Order.newBuilder(order));
        } else {
          setOrderBuilder(pfe_broker.avro.Order.newBuilder());
        }
      }
      return orderBuilder;
    }

    /**
     * Sets the Builder instance for the 'order' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public pfe_broker.avro.Trade.Builder setOrderBuilder(pfe_broker.avro.Order.Builder value) {
      clearOrder();
      orderBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'order' field has an active Builder instance
     * @return True if the 'order' field has an active Builder instance
     */
    public boolean hasOrderBuilder() {
      return orderBuilder != null;
    }

    /**
      * Clears the value of the 'order' field.
      * @return This builder.
      */
    public pfe_broker.avro.Trade.Builder clearOrder() {
      order = null;
      orderBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'symbol' field.
      * @return The value.
      */
    public java.lang.CharSequence getSymbol() {
      return symbol;
    }


    /**
      * Sets the value of the 'symbol' field.
      * @param value The value of 'symbol'.
      * @return This builder.
      */
    public pfe_broker.avro.Trade.Builder setSymbol(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.symbol = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'symbol' field has been set.
      * @return True if the 'symbol' field has been set, false otherwise.
      */
    public boolean hasSymbol() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'symbol' field.
      * @return This builder.
      */
    public pfe_broker.avro.Trade.Builder clearSymbol() {
      symbol = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'price' field.
      * @return The value.
      */
    public double getPrice() {
      return price;
    }


    /**
      * Sets the value of the 'price' field.
      * @param value The value of 'price'.
      * @return This builder.
      */
    public pfe_broker.avro.Trade.Builder setPrice(double value) {
      validate(fields()[2], value);
      this.price = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'price' field has been set.
      * @return True if the 'price' field has been set, false otherwise.
      */
    public boolean hasPrice() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'price' field.
      * @return This builder.
      */
    public pfe_broker.avro.Trade.Builder clearPrice() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'quantity' field.
      * @return The value.
      */
    public int getQuantity() {
      return quantity;
    }


    /**
      * Sets the value of the 'quantity' field.
      * @param value The value of 'quantity'.
      * @return This builder.
      */
    public pfe_broker.avro.Trade.Builder setQuantity(int value) {
      validate(fields()[3], value);
      this.quantity = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'quantity' field has been set.
      * @return True if the 'quantity' field has been set, false otherwise.
      */
    public boolean hasQuantity() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'quantity' field.
      * @return This builder.
      */
    public pfe_broker.avro.Trade.Builder clearQuantity() {
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Trade build() {
      try {
        Trade record = new Trade();
        if (orderBuilder != null) {
          try {
            record.order = this.orderBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("order"));
            throw e;
          }
        } else {
          record.order = fieldSetFlags()[0] ? this.order : (pfe_broker.avro.Order) defaultValue(fields()[0]);
        }
        record.symbol = fieldSetFlags()[1] ? this.symbol : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.price = fieldSetFlags()[2] ? this.price : (java.lang.Double) defaultValue(fields()[2]);
        record.quantity = fieldSetFlags()[3] ? this.quantity : (java.lang.Integer) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Trade>
    WRITER$ = (org.apache.avro.io.DatumWriter<Trade>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Trade>
    READER$ = (org.apache.avro.io.DatumReader<Trade>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    this.order.customEncode(out);

    out.writeString(this.symbol);

    out.writeDouble(this.price);

    out.writeInt(this.quantity);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (this.order == null) {
        this.order = new pfe_broker.avro.Order();
      }
      this.order.customDecode(in);

      this.symbol = in.readString(this.symbol instanceof Utf8 ? (Utf8)this.symbol : null);

      this.price = in.readDouble();

      this.quantity = in.readInt();

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (this.order == null) {
            this.order = new pfe_broker.avro.Order();
          }
          this.order.customDecode(in);
          break;

        case 1:
          this.symbol = in.readString(this.symbol instanceof Utf8 ? (Utf8)this.symbol : null);
          break;

        case 2:
          this.price = in.readDouble();
          break;

        case 3:
          this.quantity = in.readInt();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










