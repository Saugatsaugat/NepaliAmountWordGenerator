
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author saugat
 */
public class NepaliConverter {

    public static String getNepali(BigDecimal amount) {
        // Nepali Money Expression Words
        String nepaliExpress[] = {"", "सय", "हजार", "लाख", "करोड", "अर्ब", "खर्ब", "नील", "पद्म", "शंख", "महाशंख"};
        String paisaWord = "";
        String result = "";
        String paisa = "";
        String nepaliRupaiya = "";
        String nepaliPaisa = "";
        String firstTwoCharacters = "";
        
        // Checking if value is negative or zero.
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            return "Enter value greater than zero";
        } else {
            List<String> finalSentence = new ArrayList<>();

            String arr[] = amount.toString().split("\\.");
            String rupaiya = arr[0];

            //getting nepali number values
            for (char c : rupaiya.toCharArray()) {
                String nepaliValue = getNepaliNumber(String.valueOf(c));
                nepaliRupaiya = nepaliRupaiya + nepaliValue;
            }
            finalSentence.add(nepaliRupaiya);

            if (arr.length > 1) {
                paisa = arr[1];
                if (paisa.length() > 1) {
                    firstTwoCharacters = paisa.substring(0, 2);
                    paisaWord = getValue(firstTwoCharacters);
                } else {
                    paisaWord = getValue(paisa);
                }
                for (char c : firstTwoCharacters.toCharArray()) {
                    String nepaliValue = getNepaliNumber(String.valueOf(c));
                    nepaliPaisa = nepaliPaisa + nepaliValue;
                }
                finalSentence.add("." + nepaliPaisa + " : ");

            } else {
                finalSentence.add(" : ");

            }

            int rupaiyaLength = rupaiya.length();
            int rupaiyaLengthRef = rupaiyaLength;

            if (rupaiyaLength > 3 && rupaiyaLength < 22) {
                for (int i = 0; i < rupaiyaLength - 3; i++) {
                    if (rupaiyaLengthRef != 0 && rupaiyaLengthRef % 2 == 0) {
                        String value = getValue(String.valueOf(rupaiya.charAt(i)));
                        if (!"".equals(value)) {
                            finalSentence.add(" ");
                            finalSentence.add(value);
                            String express = nepaliExpress[rupaiyaLengthRef / 2];
                            if (express != null) {
                                finalSentence.add(" ");
                                finalSentence.add(express);
                            }
                            rupaiyaLengthRef--;
                        }
                    } else if (rupaiyaLengthRef != 0 && rupaiyaLengthRef % 2 != 0) {
                        String value = getValue((String.valueOf(rupaiya.charAt(i))) + (String.valueOf(rupaiya.charAt(i + 1))));
                        if (!"".equals(value)) {
                            finalSentence.add(" ");
                            finalSentence.add(value);
                            String express = nepaliExpress[(rupaiyaLengthRef - 1) / 2];
                            finalSentence.add(" ");
                            finalSentence.add(express);
                        }
                        i++;
                        rupaiyaLengthRef = rupaiyaLengthRef - 2;
                    }
                }
                rupaiya = rupaiya.substring(rupaiya.length() - 3);
                String indexVal = String.valueOf(rupaiya.charAt(0));
                String valueWord = getValue(indexVal);
                if (!"".equals(valueWord)) {
                    finalSentence.add(" ");
                    finalSentence.add(valueWord);
                    finalSentence.add(" ");
                    finalSentence.add("सय");
                }
                valueWord = getValue(rupaiya.substring(1, 3));
                if (!"".equals(valueWord)) {
                    finalSentence.add(" ");
                    finalSentence.add(valueWord);
                }
                finalSentence.add(" रुपैयाँ ");

            } else if (rupaiya.length() == 3) {
                String indexVal = String.valueOf(rupaiya.charAt(0));
                String valueWord = getValue(indexVal);

                if (!"".equals(valueWord)) {
                    finalSentence.add(" ");
                    finalSentence.add(valueWord);
                    finalSentence.add(" ");
                    finalSentence.add("सय");
                }
                valueWord = getValue(rupaiya.substring(1, 3));
                if (!"".equals(valueWord)) {
                    finalSentence.add(" ");
                    finalSentence.add(valueWord);
                }
                finalSentence.add(" रुपैयाँ ");

            } else if (rupaiya.length() == 2 || rupaiya.length() == 1) {
                String valueWord = getValue(rupaiya);
                if (!"".equals(valueWord)) {
                    finalSentence.add(" ");
                    finalSentence.add(valueWord);
                    finalSentence.add(" रुपैयाँ ");

                }
            } else {
                return "Sorry! Value is not recognizable";
            }

            if (paisa.length() > 0) {
                finalSentence.add(paisaWord);
                finalSentence.add(" पैसा ");
            }
            finalSentence.add("मात्र");

            for (String word : finalSentence) {
                result = result + word;
            }

            result = result.trim();
            return result;
        }
    }

    public static String getValue(String value) {
        String[] numbers = {"एक", "दुई", "तीन", "चार", "पाँच", "छ", "सात", "आठ", "नौ", "दश", "एघार", "बाह्र", "तेह्र", "चौध", "पन्ध्र", "सोह्र", "सत्र", "अठार", "उन्नाइस", "बीस", "एक्काइस", "बाइस", "तेइस", "चौबीस", "पच्चीस", "छब्बीस", "सत्ताइस", "अठ्ठाइस", "उनन्तीस", "तीस", "एकतीस", "बत्तीस", "तेत्तिस", "चौँतीस", "पैंतीस", "छत्तीस", "सैंतीस", "अड्तीस", "उनन्चालीस", "चालीस", "एकचालीस", "बयालीस", "त्रिचालीस", "चौवालीस", "पैंतालीस", "छयालीस", "सच्चालीस", "अड्चालीस", "उनन्पचास", "पचास", "एकाउन्न", "बाउन्न", "त्रिपन्न", "चौवन्न", "पचपन्न", "छपन्न", "सन्ताउन्न", "अन्ठाउन्न", "उनान्साठी", "साठी", "एकसट्ठी", "बैसट्ठी", "त्रिसट्ठी", "चौसट्ठी", "पैंसट्ठी", "छयसट्ठी", "सत्सट्ठी", "अड्सट्ठी", "उनन्सत्तरी", "सत्तरी", "एकहत्तर", "बहत्तर", "त्रिहत्तर", "चौहत्तर", "पचहत्तर", "छयहत्तर", "सतहत्तर", "अठहत्तर", "उनासी", "असी", "एकासी", "बयासी", "त्रियासी", "चौरासी", "पचासी", "छयासी", "सतासी", "अठासी", "उनान्नब्बे", "नब्बे",
            "एकान्नब्बे", "बयान्नब्बे", "त्रियान्नब्बे", "चौरान्नब्बे", "पन्चान्नब्बे", "छयान्नब्बे", "सन्तान्नब्बे", "अन्ठान्नब्बे", "उनान्सय"};
        int val = Integer.parseInt(value);
        if (val != 0) {
            return numbers[(Integer.parseInt(value)) - 1];
        } else {
            return "";
        }
    }

    public static String getNepaliNumber(String value) {
        String[] nepaliNumbers = {"०", "१", "२", "३", "४", "५", "६", "७", "८", "९"};
        int val = Integer.parseInt(value);
        if (val >= 0) {
            return nepaliNumbers[val];
        } else {
            return "";
        }
    }
}
