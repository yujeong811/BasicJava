package f_game;

public class Monster {

	String name;   // 이름
	int maxHp;     // 최대 체력
	int maxMp;     // 최대 마나
	int hp;        // 체력
	int mp;        // 마나
	int att;       // 공격력
	int def;       // 방어력
	int level;     // 레벨
	int exp;       // 경험치
	Item[] items;  // 보유아이템
	
	Monster(String name, int hp, int mp, int att, int def, int level, int exp, Item[] items) {
		this.name = name;
		this.maxHp = hp;
		this.maxMp = mp;
		this.hp = this.maxHp;
		this.mp = this.maxMp;
		this.att = att;
		this.def = def;
		this.level = level;
		this.exp = exp;
		this.items = items;	
	}

	void attack(Character c) {
		int damage = att - c.def;
		damage = damage <= 0 ? 1 : damage;
		c.hp -= damage <= c.hp ? damage : c.hp;
		System.out.println(name + "가 공격으로 " + c.name + "에게" + damage + "만큼 데미지를 주었습니다.");
		System.out.println(c.name + "의 남은 체력 : " + c.hp);
	}
	
	Item itemDrop() {
		return items[(int)(Math.random() * items.length)];
	}
	
}

