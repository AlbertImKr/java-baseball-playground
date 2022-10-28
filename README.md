## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

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

4. 구현하기
   1. 컴퓨터 볼 3개를 생성한다.
   2. 고객이 숫자 3개를 입력 받는다.
   3. 숫자를 list로 변환한다.
   4. 예외 처리 한다.
   5. 컴퓨터 볼들과 고객 볼들을 비교한다.
      5.1 볼과 보들과 비교 구현
      5.2 볼과 볼을 비교 구현
            5.2.1 볼이 같은 위치에 있으면 스트라이크
            5.2.2 볼이 같은 위치에 없는데 고객의 볼이 컴퓨터 볼에 포함되면 볼
            5.2.3 스트라이크도 없고 볼도 없으면 낫싱
   6. 게임이 종료 여부를 확인한다. 스트라이크 3개 종료 아니면 다시 2.다시 입력받는다.
   7. 게임을 다시 사작한다.
