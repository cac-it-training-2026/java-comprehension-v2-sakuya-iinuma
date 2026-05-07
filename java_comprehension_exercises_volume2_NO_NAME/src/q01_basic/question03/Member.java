package q01_basic.question03;

class Member {
	//TODO ここから実装する

	private String name;

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	private int age;

	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age セットする age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	private int rank;

	/**
	 * @return rank
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * @param rank セットする rank
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}

	public Member() {

	}

	public Member(String name, int age, int rank) {
		this.name = name;
		this.age = age;
		this.rank = rank;
	}

	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println("name:" + name);
		System.out.println("age" + age);
		System.out.println("rank" + rank);
		System.out.println("***************");
	}

}
