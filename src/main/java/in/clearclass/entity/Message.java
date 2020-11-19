package in.clearclass.entity;

public class Message {
	private Long id;
	private Integer msisdn;
	private MessageType action;
	private Long timestamp;
	
	public Long getId() {
		return id;
	}

	public Integer getMsisdn() {
		return msisdn;
	}

	public MessageType getAction() {
		return action;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setMsisdn(Integer msisdn) {
		this.msisdn = msisdn;
	}

	public void setAction(MessageType action) {
		this.action = action;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", msisdn=" + msisdn + ", action=" + action + ", timestamp=" + timestamp + "]";
	}
}