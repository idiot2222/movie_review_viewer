package me.bogeun.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Movie {

    private String title;           // 제목
    private String director;        // 감독
    private String distributor;     // 배급사

    private List<Review> reviews; // 해당 영화 리뷰 리스트

    public String reviewsToString() {
        StringBuilder sb = new StringBuilder();

        int len = reviews.size();
        for (int i = 0; i < len; i++) {
            sb.append(reviews.get(i).toString());

            if(i != len-1) {
                sb.append(", ");
            }
        }

        return sb.toString();
    }
}
