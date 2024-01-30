package me.bogeun.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class Review {
    private Gender gender;  // 리뷰어 성별
    private int age;        // 리뷰어 나이
    private int point;      // 영화 평점
}
