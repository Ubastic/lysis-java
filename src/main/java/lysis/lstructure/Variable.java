package lysis.lstructure;

public class Variable {
	long addr_;
	long tag_id_;
	Tag tag_;
	long codeStart_;
	long codeEnd_;
	VariableType type_;
	Scope scope_;
	String name_;
	Dimension[] dims_;
	boolean statevar_;

	public Variable(long addr, int tag_id, Tag tag, long codeStart, long codeEnd, VariableType type, Scope scope,
			String name, Dimension[] dims) {
		addr_ = addr;
		tag_id_ = (long) tag_id;
		tag_ = tag;
		codeStart_ = codeStart;
		codeEnd_ = codeEnd;
		type_ = type;
		scope_ = scope;
		name_ = name;
		dims_ = dims;
		statevar_ = false;
	}

	public Variable(long addr, int tag_id, Tag tag, long codeStart, long codeEnd, VariableType type, Scope scope,
			String name) {
		this(addr, tag_id, tag, codeStart, codeEnd, type, scope, name, null);
	}

	public long address() {
		return addr_;
	}

	public long codeStart() {
		return codeStart_;
	}

	public long codeEnd() {
		return codeEnd_;
	}

	public String name() {
		return name_;
	}

	public VariableType type() {
		return type_;
	}

	public Scope scope() {
		return scope_;
	}

	public Tag tag() {
		return tag_;
	}

	public long tag_id() {
		return tag_id_;
	}

	public Dimension[] dims() {
		return dims_;
	}

	public boolean isStateVariable() {
		return statevar_;
	}

	public void setTag(Tag tag) {
		tag_ = tag;
		tag_id_ = tag.tag_id();
	}

	public void setTagId(long tag_id) {
		tag_id_ = tag_id;
	}

	public void setName(String name) {
		name_ = name;
	}

	public void markAsStateVariable() {
		statevar_ = true;
	}
}
