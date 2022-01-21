package e_oop.score;

public class Score {

	public static void main(String[] args) {
		String[] studentNames = { "김기웅", "박태정", "이정규", "오지현" };
		Student[] students = new Student[studentNames.length];

		for (int i = 0; i < students.length; i++) {
			students[i] = new Student(); // 객체 생성 후 배열에 저장

			students[i].name = studentNames[i];
			students[i].kor = (int) (Math.random() * 101);
			students[i].eng = (int) (Math.random() * 101);
			students[i].math = (int) (Math.random() * 101);
			students[i].rank = 1;

			students[i].sum = students[i].kor + students[i].eng + students[i].math;
			students[i].avg = Math.round(students[i].sum / 3.0 * 100) / 100.0;
		}

		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length; j++) {
				if (students[i].avg < students[j].avg) {
					students[i].rank++;
				}
			}
		}

		for (int i = 0; i < students.length; i++) {
			int min = i;
			for (int j = i + 1; j < students.length; j++) {
				if (students[j].rank < students[min].rank) {
					min = j;
				}
			}
			Student temp = students[i]; // Student라는 클래스만 바꾸면 다 바뀜 (국어, 영어, 수학, 합계, 평균, 석차)
			students[i] = students[min];
			students[min] = temp;
		}

		for (int i = 0; i < students.length; i++) {
			students[1].subSum += students[i].kor;
			students[2].subSum += students[i].eng;
			students[3].subSum += students[i].math;

			students[1].subAvg = Math.round(students[1].subSum / 4.0 * 100) / 100.0;
			students[2].subAvg = Math.round(students[2].subSum / 4.0 * 100) / 100.0;
			students[3].subAvg = Math.round(students[3].subSum / 4.0 * 100) / 100.0;
		}
		
//		int[] sums = new int[3]; // 선생님 방법
//		for(int i =0; i < students.length; i++) {
//			sums[0] += students[i].kor;
//			sums[1] += students[i].eng;
//			sums[2] += students[i].math;
//		}
//		
//		double[] avgs = new double[3];
//		for(int i =0; i < students.length; i++) {
//			avgs[i] = Math.round((double)sums[i] / students.length * 100) / 100.0;
//		}

		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t석차");

		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].name + "\t" + students[i].kor + "\t" + students[i].eng + "\t"
					         + students[i].math + "\t" + students[i].sum + "\t" + students[i].avg + "\t" + students[i].rank);
		}

		System.out.print("과목합계\t");
		for (int i = 1; i < students.length; i++) {
			System.out.print(students[i].subSum + "\t");
		}
		System.out.println();

		System.out.print("과목평균\t");
		for (int i = 1; i < students.length; i++) {
			System.out.print(students[i].subAvg + "\t");
		}
	}
}
