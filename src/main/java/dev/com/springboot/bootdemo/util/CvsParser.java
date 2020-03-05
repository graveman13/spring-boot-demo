package dev.com.springboot.bootdemo.util;

import dev.com.springboot.bootdemo.entity.ReviewEntity;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class CvsParser {
    public List<ReviewEntity> parseCvsFile(String fileName) throws IOException {
        BufferedReader reader = Files.newBufferedReader(Paths.get(fileName));
        CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader()
                .withIgnoreHeaderCase()
                .withTrim());

        List<ReviewEntity> reviews = new ArrayList<>();
        for (CSVRecord record : csvParser) {
            ReviewEntity reviewEntity = new ReviewEntity();
            reviewEntity.setUserId(record.get(1));
            reviewEntity.setProductId(record.get(2));
            reviewEntity.setProfileName(record.get(3));
            reviewEntity.setHelpfulnessDenominator(record.get(4));
            reviewEntity.setHelpfulnessNumerator(record.get(5));
            reviewEntity.setScore(record.get(6));
            reviewEntity.setTime(record.get(7));
            reviewEntity.setSummary(record.get(8));
            reviewEntity.setText(record.get(9));
            reviews.add(reviewEntity);
        }
        return reviews;
    }
}
