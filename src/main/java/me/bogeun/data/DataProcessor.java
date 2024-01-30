package me.bogeun.data;

import me.bogeun.gui.panel.DataListPanel;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataProcessor {

    // 데이터들을 가공하여 출력하는 버튼 리스트
    public static List<JButton> getProcessedDataButtons() {
        List<JButton> buttons = new ArrayList<>();

        buttons.add(newJButtonWithAction("영화사 별 평균 점수", avgForDistributor()));
        buttons.add(newJButtonWithAction("감독 별 평균 점수", avgForDirector()));
        buttons.add(newJButtonWithAction("전체 영화의 평균 점수", avgForMovie()));
        buttons.add(newJButtonWithAction("잘 나가는 감독들의 평균 점수", avgForPopularDirector()));
        buttons.add(newJButtonWithAction("10대들의 평균 점수", avgForTeenagers()));
        buttons.add(newJButtonWithAction("남성들의 리뷰만 보기", listForMale()));
        buttons.add(newJButtonWithAction("전체 영화의 평점 낮은 순 보기", listSortedByLowPoints()));
        buttons.add(newJButtonWithAction("높은 평점만 보기", onlyHighPoints()));
        buttons.add(newJButtonWithAction("배급사 이름으로 정렬하여 보기", listSortedByName()));
        buttons.add(newJButtonWithAction("성인 여성들의 리뷰만 보기", listForAdultFemale()));

        return buttons;
    }


    // 전체 영화의 성인이면서 여성인 리뷰만 보여주기 (단, 해당하는 리뷰가 하나도 없을 시 제외)
    private static ActionListener listForAdultFemale() {
        return x -> {
            RawData.getMovieList().stream(); // 데이터 리스트

            DataListPanel.printDataList(""); // 출력 메서드
        };
    }


    // 전체 리스트를 배급사, 감독, 영화 제목 순으로 정렬하여 출력하기
    private static ActionListener listSortedByName() {
        return x -> {
            RawData.getMovieList().stream(); // 데이터 리스트

            DataListPanel.printDataList(""); // 출력 메서드
        };
    }

    // (영화, 배급사 관계 없이) 6점 이상(>= 6)의 리뷰들만 보기 (단, 6점 이상 리뷰가 하나도 없는 영화는 제외 처리)
    private static ActionListener onlyHighPoints() {
        return x -> {
            RawData.getMovieList().stream(); // 데이터 리스트

            DataListPanel.printDataList(""); // 출력 메서드
        };
    }


    // 각 영화들의 리뷰를 평점 낮은 순으로 정렬하여 출력
    private static ActionListener listSortedByLowPoints() {
        return x -> {
            RawData.getMovieList().stream(); // 데이터 리스트

            DataListPanel.printDataList(""); // 출력 메서드
        };
    }

    // (영화, 배급사 관계 없이) 남성들의 리뷰만 모아서 출력
    private static ActionListener listForMale() {
        return x -> {
            RawData.getMovieList().stream(); // 데이터 리스트

            DataListPanel.printDataList(""); // 출력 메서드
        };
    }


    // 모든 10대 리뷰어들의 리뷰 수 + 평균 점수
    private static ActionListener avgForTeenagers() {
        return x -> {
            RawData.getMovieList().stream(); // 데이터 리스트

            DataListPanel.printDataList(""); // 출력 메서드
        };
    }

    // 3개 이상의 작품을 맡은 감독들의 리뷰 수 + 평균 점수
    private static ActionListener avgForPopularDirector() {
        return x -> {
            RawData.getMovieList().stream(); // 데이터 리스트

            DataListPanel.printDataList(""); // 출력 메서드
        };
    }

    // 영화 별로 총 리뷰 수 + 평균 리뷰 점수를 출력하세요.
    private static ActionListener avgForMovie() {
        return x -> {
            RawData.getMovieList().stream(); // 데이터 리스트

            DataListPanel.printDataList(""); // 출력 메서드
        };
    }

    // 감독 별로 총 리뷰 수 + 평균 리뷰 점수를 출력하세요.
    private static ActionListener avgForDirector() {
        return x -> {
            RawData.getMovieList().stream(); // 데이터 리스트

            DataListPanel.printDataList(""); // 출력 메서드
        };
    }

    // 배급사 별로 총 리뷰 수 + 평균 리뷰 점수를 출력하세요.
    private static ActionListener avgForDistributor() {
        return x -> {
            RawData.getMovieList().stream(); // 데이터 리스트

            DataListPanel.printDataList(""); // 출력 메서드
        };
    }




    // 가공되지 않은 데이터들을 조회하는 버튼 리스트
    public static List<JButton> getRawDataRetrieveButtons() {
        List<JButton> buttonList = new ArrayList<>();

        buttonList.add(
                newJButtonWithAction("전체 데이터 조회", x -> {
                    List<Movie> totalList = RawData.getMovieList();

                    DataListPanel.printDataList(totalList);
                }));
        buttonList.add(
                newJButtonWithAction("영화 정보 조회", x -> {
                    List<String> movieList = RawData.getMovieList().stream()
                            .map(movie -> String.format("영화 제목 : %s \n감독: %s \n배급사: %s\n",
                                    movie.getTitle(), movie.getDirector(), movie.getDistributor()))
                            .collect(Collectors.toList());

                    DataListPanel.printDataList(movieList);
                }));
        buttonList.add(
                newJButtonWithAction("영화 리뷰 리스트", x -> {
                    List<String> directorList = RawData.getMovieList().stream()
                            .map(movie -> String.format("영화: %s \n리뷰 리스트: [ %s ]\n ",
                                    movie.getTitle(), movie.reviewsToString()))
                            .collect(Collectors.toList());

                    DataListPanel.printDataList(directorList);
                }));

        return buttonList;
    }

    private static JButton newJButtonWithAction(String title, ActionListener i) {
        JButton button = new JButton(title);
        button.addActionListener(i);

        return button;
    }

}
