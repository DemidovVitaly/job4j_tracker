package ru.job4j.hmap;

import java.util.*;

public class AnalyzeByMap {

    /* общий средний балл */
    public static double averageScore(List<Pupil> pupils) {
        double sumScore = 0;
        int i = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                sumScore += subject.score();
                i++;
            }
        }
        return sumScore / i;
    }

    /* средний балл по каждому ученику */
    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double sumScore = 0;
            for (Subject subject: pupil.subjects()) {
                sumScore += subject.score();
            }
            double averageScore = sumScore / pupils.size();
            labels.add(new Label(pupil.name(), averageScore));
        }
        return labels;
    }

    /* средний балл по каждому предмету */
    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> subj = new LinkedHashMap<>();
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                subj.putIfAbsent(subject.name(), 0);
                subj.put(subject.name(), subj.get(subject.name()) + subject.score());
            }
        }
        for (Map.Entry<String, Integer> subject : subj.entrySet()) {
            labels.add(new Label(subject.getKey(), (double) subject.getValue() / pupils.size()));
        }
        return labels;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double sumScore = 0;
            for (Subject subject: pupil.subjects()) {
                sumScore += subject.score();
            }
            labels.add(new Label(pupil.name(), sumScore));
        }
        labels.sort(Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> subj = new LinkedHashMap<>();
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                subj.putIfAbsent(subject.name(), 0);
                subj.put(subject.name(), subj.get(subject.name()) + subject.score());
            }
        }
        for (Map.Entry<String, Integer> subject : subj.entrySet()) {
            labels.add(new Label(subject.getKey(), (double) subject.getValue()));
        }
        labels.sort(Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }
}