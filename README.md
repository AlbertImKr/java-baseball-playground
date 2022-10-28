## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

## 피드팩 전 기능구현목록
1.Random 3자리의 수를 생성하고 리스트에 저장한다..
2.숫자를 입력 받는다.
3.받은 숫자와 3자리 수인지 확인한다. 아니면 2번으로다시 숫자를 입력 받는다.
4.받은 세자리수와 램덤된 3자리수 와 비교하여 스트라이크수량와 볼 수량을 구하고 출력한다.
5.3스트라이크 맞는지 확인한다 . 맞으면 6번 아니면 2번으로 넘어간다.
6.게임을 새로 사작 혹은 종료 여부를 확인한다. 시작시 다시 ->1  종료시 끝; 

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```
