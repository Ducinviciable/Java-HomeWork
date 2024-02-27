// package discount.machine;

public class Customer {
	private String name;
	private boolean member ;
	private MemberType memberType;
	
	public Customer(String name) {
		this.name = name;
		this.member = false ;
	}
	
	public Customer(String name, boolean member, MemberType memberType) {
		this.member = member ;
		this.name = name ;
		this.memberType = memberType;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isMember() {
		return member;
	}

	public void setMember(boolean member) {
		this.member = member;
	}

	public MemberType getMemberType() {
		return memberType;
	}

	public void setMemberType(MemberType memberType) {
		this.memberType = memberType;
	}

	@Override
	public String toString() {
		return "Customer{" +
            "name='" + name + '\'' +
            ", member=" + member +
            ", memberType='" + memberType + '\'' +
            '}';
	}
}
