package f_game;

public class Character {
	
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

	Character(String name, int hp, int mp, int att, int def) {
		this.name = name;
		this.maxHp = hp;
		this.maxMp = mp;
		this.hp = this.maxHp;
		this.mp = this.maxMp;
		this.att = att;
		this.def = def;
		this.level = 1;
		this.exp = 0;
		this.items = new Item[10];
	}
	
	void status() {
		System.out.println("================== 상태 =================");
		System.out.println("이름 : " + name);
		System.out.println("레벨 : " + level + "(" + exp + "/100)");
		System.out.println("체력 : " + hp + "/" + maxHp);
		System.out.println("마나 : " + mp + "/" + maxMp);
		System.out.println("공격력 : " + att);
		System.out.println("방어력 : " + def);
		System.out.println("================== 아이템 ================");
		for(int i = 0; i < items.length; i++) {
			if(items[i] != null) {
				System.out.println(items[i]);
			}
		}
		System.out.println("========================================");
	}
	
	void attack(Monster m) {
		int damage = att - m.def;
		damage = damage <= 0 ? 1 : damage;
		m.hp -= damage <= m.hp ? damage : m.hp;
		System.out.println(name + "가 공격으로 " + m.name + "에게" + damage + "만큼 데미지를 주었습니다.");
		System.out.println(m.name + "의 남은 체력 : " + m.hp);
	}
	
	void getExp(int exp) {
		this.exp += exp;
		System.out.println(exp + "의 경험치를 획득하였습니다.");
		
		while(100 <= this.exp) {
			levelup();
			this.exp -= 100;
		}
	}
	
	void levelup() {
		level++;
		maxHp += 10;
		maxMp += 5;
		att += 2;
		def += 2;
		hp = maxHp;
		mp = maxMp;
		System.out.println("레벨업!!!");
	}
	
	void getItem(Item item) {
		System.out.println(item.name + "을 획득하였습니다.");
		for(int i = 0; i < items.length; i++) {
			if(items[i] == null) {
				items[i] = item;
				break;
			}
		}
		maxHp += item.hp;
		maxMp += item.mp;
		att += item.att;
		def += item.def;
	}
		
}
