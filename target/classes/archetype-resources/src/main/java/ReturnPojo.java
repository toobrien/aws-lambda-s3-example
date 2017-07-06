package ${groupId};

public class ReturnPojo {

  private String bucket;
  private String object;
  private byte[] bytes;

  public ReturnPojo(String bucket, String object, byte[] bytes) {
    this.bucket = bucket;
    this.object = object;
    this.bytes = bytes;
  }

  public ReturnPojo() {}

  public String getBucket() { return this.bucket; }
  public String setBucket(String bucket) { this.bucket = bucket };
  public String getObject() { return this.object; }
  public String setobject(String object) { this.object = object; }
  public byte[] getBytes() { return this.bytes; }
  public byte[] setBytes(byte[] bytes) { this.bytes = bytes; }

}
