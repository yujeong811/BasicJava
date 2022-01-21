package e_oop.score2;

public class Student { 
	String name; // 전역변수 : 자동으로 초기화 됨
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	int rank;

	void randomScore() { // 왜 void를 쓰는지?
		kor = (int) (Math.random() * 101);
		eng = (int) (Math.random() * 101);
		math = (int) (Math.random() * 101);
	}

	int getSum() { 
		return sum = kor + eng + math;
	}

	double getAverage() { // return을 쓰는 이유 : 나중에 쓸 일이 있을 수 있어서
		return avg = Math.round(getSum() / 3.0 * 100) / 100.0;
	}

	int getRank(Student[] students) { // 석차를 구하기 위해 다른 사람의 점수 정보가 필요
		rank = 1;

		for (int i = 0; i < students.length; i++) { // 내 합계와 다른 사람의 합계 비교하여 석차 구함
			if (getSum() < students[i].getSum()) {
				rank++;
			}
		}

		return rank;
	}

	String getInfo() {
		return name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + sum + "\t" + avg + "\t" + rank;
	}

}
