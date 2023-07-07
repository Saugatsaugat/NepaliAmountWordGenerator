
import com.mycompany.nepaliamountdisplayer.NepaliAmountDisplayer;
import java.math.BigDecimal;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author saugat
 */
public class ConvertToNepaliTest {

    @Test
    public void zeroAmountTest() {
        BigDecimal amounts = new BigDecimal(0);
        String expected = "Enter value greater than zero";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void singleDigitAmountTest() {
        BigDecimal amounts = new BigDecimal("1");
        String expected = "१ :  एक रुपैयाँ मात्र";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void singleDigitAmountWithPaisaTest() {
        BigDecimal amounts = new BigDecimal("1.50");
        String expected = "१.५० :  एक रुपैयाँ पचास पैसा मात्र";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void twoDigitAmountTest() {
        BigDecimal amounts = new BigDecimal("99");
        String expected = "९९ :  उनान्सय रुपैयाँ मात्र";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void twoDigitAmountWithPaisaTest() {
        BigDecimal amounts = new BigDecimal("99.99");
        String expected = "९९.९९ :  उनान्सय रुपैयाँ उनान्सय पैसा मात्र";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void threeDigitAmountTest() {
        BigDecimal amounts = new BigDecimal("123");
        String expected = "१२३ :  एक सय तेइस रुपैयाँ मात्र";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void threeDigitAmountWithPaisaTest() {
        BigDecimal amounts = new BigDecimal("999.99");
        String expected = "९९९.९९ :  नौ सय उनान्सय रुपैयाँ उनान्सय पैसा मात्र";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void fourDigitAmountTest() {
        BigDecimal amounts = new BigDecimal("1234");
        String expected = "१२३४ :  एक हजार दुई सय चौँतीस रुपैयाँ मात्र";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void fourDigitAmountWithPaisaTest() {
        BigDecimal amounts = new BigDecimal("1234.89");
        String expected = "१२३४.८९ :  एक हजार दुई सय चौँतीस रुपैयाँ उनान्नब्बे पैसा मात्र";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void fiveDigitAmountTest() {
        BigDecimal amounts = new BigDecimal("12345");
        String expected = "१२३४५ :  बाह्र हजार तीन सय पैंतालीस रुपैयाँ मात्र";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void fiveDigitAmountWithPaisaTest() {
        BigDecimal amounts = new BigDecimal("19195.08");
        String expected = "१९१९५.०८ :  उन्नाइस हजार एक सय पन्चान्नब्बे रुपैयाँ आठ पैसा मात्र";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void sixDigitAmountTest() {
        BigDecimal amounts = new BigDecimal("999999");
        String expected = "९९९९९९ :  नौ लाख उनान्सय हजार नौ सय उनान्सय रुपैयाँ मात्र";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void sixDigitAmountWithPaisaTest() {
        BigDecimal amounts = new BigDecimal("123456.55");
        String expected = "१२३४५६.५५ :  एक लाख तेइस हजार चार सय छपन्न रुपैयाँ पचपन्न पैसा मात्र";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void sevenDigitAmountTest() {
        BigDecimal amounts = new BigDecimal("1234567");
        String expected = "१२३४५६७ :  बाह्र लाख चौँतीस हजार पाँच सय सत्सट्ठी रुपैयाँ मात्र";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void sevenDigitAmountWithPaisaTest() {
        BigDecimal amounts = new BigDecimal("7777777.77");
        String expected = "७७७७७७७.७७ :  सतहत्तर लाख सतहत्तर हजार सात सय सतहत्तर रुपैयाँ सतहत्तर पैसा मात्र";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void eightDigitAmountTest() {
        BigDecimal amounts = new BigDecimal("87654321");
        String expected = "८७६५४३२१ :  आठ करोड छयहत्तर लाख चौवन्न हजार तीन सय एक्काइस रुपैयाँ मात्र";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void eightDigitAmountWithPaisaTest() {
        BigDecimal amounts = new BigDecimal("87654321.88");
        String expected = "८७६५४३२१.८८ :  आठ करोड छयहत्तर लाख चौवन्न हजार तीन सय एक्काइस रुपैयाँ अठासी पैसा मात्र";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void nineDigitAmountTest() {
        BigDecimal amounts = new BigDecimal("809189901");
        String expected = "८०९१८९९०१ :  असी करोड एकान्नब्बे लाख उनान्नब्बे हजार नौ सय एक रुपैयाँ मात्र";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void nineDigitAmountWithPaisaTest() {
        BigDecimal amounts = new BigDecimal("809189901.78");
        String expected = "८०९१८९९०१.७८ :  असी करोड एकान्नब्बे लाख उनान्नब्बे हजार नौ सय एक रुपैयाँ अठहत्तर पैसा मात्र";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void tenDigitAmountTest() {
        BigDecimal amounts = new BigDecimal("0123456789");
        String expected = "१२३४५६७८९ :  बाह्र करोड चौँतीस लाख छपन्न हजार सात सय उनान्नब्बे रुपैयाँ मात्र";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void tenDigitAmountWithPaisaTest() {
        BigDecimal amounts = new BigDecimal("9876543210.10");
        String expected = "९८७६५४३२१०.१० :  नौ अर्ब सतासी करोड पैंसट्ठी लाख त्रिचालीस हजार दुई सय दश रुपैयाँ दश पैसा मात्र";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void elevenDigitAmountTest() {
        BigDecimal amounts = new BigDecimal("12345678912");
        String expected = "१२३४५६७८९१२ :  बाह्र अर्ब चौँतीस करोड छपन्न लाख अठहत्तर हजार नौ सय बाह्र रुपैयाँ मात्र";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void elevenDigitAmountWithPaisaTest() {
        BigDecimal amounts = new BigDecimal("12345678912.65");
        String expected = "१२३४५६७८९१२.६५ :  बाह्र अर्ब चौँतीस करोड छपन्न लाख अठहत्तर हजार नौ सय बाह्र रुपैयाँ पैंसट्ठी पैसा मात्र";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void twelveDigitAmountTest() {
        BigDecimal amounts = new BigDecimal("999999999999");
        String expected = "९९९९९९९९९९९९ :  नौ खर्ब उनान्सय अर्ब उनान्सय करोड उनान्सय लाख उनान्सय हजार नौ सय उनान्सय रुपैयाँ मात्र";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void twelveDigitAmountWithPaisaTest() {
        BigDecimal amounts = new BigDecimal("999999999999.33");
        String expected = "९९९९९९९९९९९९.३३ :  नौ खर्ब उनान्सय अर्ब उनान्सय करोड उनान्सय लाख उनान्सय हजार नौ सय उनान्सय रुपैयाँ तेत्तिस पैसा मात्र";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void thirteenDigitAmountTest() {
        BigDecimal amounts = new BigDecimal("5432167890123");
        String expected = "५४३२१६७८९०१२३ :  चौवन्न खर्ब बत्तीस अर्ब सोह्र करोड अठहत्तर लाख नब्बे हजार एक सय तेइस रुपैयाँ मात्र";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void thirteenDigitAmountWithPaisaTest() {
        BigDecimal amounts = new BigDecimal("5432167890123.11");
        String expected = "५४३२१६७८९०१२३.११ :  चौवन्न खर्ब बत्तीस अर्ब सोह्र करोड अठहत्तर लाख नब्बे हजार एक सय तेइस रुपैयाँ एघार पैसा मात्र";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void fourteenDigitAmountTest() {
        BigDecimal amounts = new BigDecimal("98989898989898");
        String expected = "९८९८९८९८९८९८९८ :  नौ नील उनान्नब्बे खर्ब उनान्नब्बे अर्ब उनान्नब्बे करोड उनान्नब्बे लाख उनान्नब्बे हजार आठ सय अन्ठान्नब्बे रुपैयाँ मात्र";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void fourteenDigitAmountWithPaisaTest() {
        BigDecimal amounts = new BigDecimal("98989898989898.01");
        String expected = "९८९८९८९८९८९८९८.०१ :  नौ नील उनान्नब्बे खर्ब उनान्नब्बे अर्ब उनान्नब्बे करोड उनान्नब्बे लाख उनान्नब्बे हजार आठ सय अन्ठान्नब्बे रुपैयाँ एक पैसा मात्र";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void fifteenDigitAmountTest() {
        BigDecimal amounts = new BigDecimal("765432189011111");
        String expected = "७६५४३२१८९०१११११ :  छयहत्तर नील चौवन्न खर्ब बत्तीस अर्ब अठार करोड नब्बे लाख एघार हजार एक सय एघार रुपैयाँ मात्र";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void fifteenDigitAmountWithPaisaTest() {
        BigDecimal amounts = new BigDecimal("765432189011111.22");
        String expected = "७६५४३२१८९०१११११.२२ :  छयहत्तर नील चौवन्न खर्ब बत्तीस अर्ब अठार करोड नब्बे लाख एघार हजार एक सय एघार रुपैयाँ बाइस पैसा मात्र";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void sixteenDigitAmountTest() {
        BigDecimal amounts = new BigDecimal("7654321890111112");
        String expected = "७६५४३२१८९०१११११२ :  सात पद्म पैंसट्ठी नील त्रिचालीस खर्ब एक्काइस अर्ब उनान्नब्बे करोड एक लाख एघार हजार एक सय बाह्र रुपैयाँ मात्र";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void sixteenDigitAmountWithPaisaTest() {
        BigDecimal amounts = new BigDecimal("7654321890111112.99");
        String expected = "७६५४३२१८९०१११११२.९९ :  सात पद्म पैंसट्ठी नील त्रिचालीस खर्ब एक्काइस अर्ब उनान्नब्बे करोड एक लाख एघार हजार एक सय बाह्र रुपैयाँ उनान्सय पैसा मात्र";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void seventeenDigitAmountTest() {
        BigDecimal amounts = new BigDecimal("12345678901234567");
        String expected = "१२३४५६७८९०१२३४५६७ :  बाह्र पद्म चौँतीस नील छपन्न खर्ब अठहत्तर अर्ब नब्बे करोड बाह्र लाख चौँतीस हजार पाँच सय सत्सट्ठी रुपैयाँ मात्र";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void seventeenDigitAmountWithPaisaTest() {
        BigDecimal amounts = new BigDecimal("12345678901234567.36");
        String expected = "१२३४५६७८९०१२३४५६७.३६ :  बाह्र पद्म चौँतीस नील छपन्न खर्ब अठहत्तर अर्ब नब्बे करोड बाह्र लाख चौँतीस हजार पाँच सय सत्सट्ठी रुपैयाँ छत्तीस पैसा मात्र";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void eighteenDigitAmountTest() {
        BigDecimal amounts = new BigDecimal("981267540012345678");
        String expected = "९८१२६७५४००१२३४५६७८ :  नौ शंख एकासी पद्म छब्बीस नील पचहत्तर खर्ब चालीस अर्ब एक करोड तेइस लाख पैंतालीस हजार छ सय अठहत्तर रुपैयाँ मात्र";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void eighteenDigitAmountWithPaisaTest() {
        BigDecimal amounts = new BigDecimal("981267540012345678.21");
        String expected = "९८१२६७५४००१२३४५६७८.२१ :  नौ शंख एकासी पद्म छब्बीस नील पचहत्तर खर्ब चालीस अर्ब एक करोड तेइस लाख पैंतालीस हजार छ सय अठहत्तर रुपैयाँ एक्काइस पैसा मात्र";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void nineteenDigitAmountTest() {
        BigDecimal amounts = new BigDecimal("9812675400123456789");
        String expected = "९८१२६७५४००१२३४५६७८९ :  अन्ठान्नब्बे शंख बाह्र पद्म सत्सट्ठी नील चौवन्न खर्ब बाह्र करोड चौँतीस लाख छपन्न हजार सात सय उनान्नब्बे रुपैयाँ मात्र";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void nineteenDigitAmountWithPaisaTest() {
        BigDecimal amounts = new BigDecimal("9812675400123456789.89");
        String expected = "९८१२६७५४००१२३४५६७८९.८९ :  अन्ठान्नब्बे शंख बाह्र पद्म सत्सट्ठी नील चौवन्न खर्ब बाह्र करोड चौँतीस लाख छपन्न हजार सात सय उनान्नब्बे रुपैयाँ उनान्नब्बे पैसा मात्र";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void twentyDigitAmountTest() {
        BigDecimal amounts = new BigDecimal("98126754001234567891");
        String expected = "९८१२६७५४००१२३४५६७८९१ :  नौ महाशंख एकासी शंख छब्बीस पद्म पचहत्तर नील चालीस खर्ब एक अर्ब तेइस करोड पैंतालीस लाख सत्सट्ठी हजार आठ सय एकान्नब्बे रुपैयाँ मात्र";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void twentyDigitAmountWithPaisaTest() {
        BigDecimal amounts = new BigDecimal("98126754001234567891.19");
        String expected = "९८१२६७५४००१२३४५६७८९१.१९ :  नौ महाशंख एकासी शंख छब्बीस पद्म पचहत्तर नील चालीस खर्ब एक अर्ब तेइस करोड पैंतालीस लाख सत्सट्ठी हजार आठ सय एकान्नब्बे रुपैयाँ उन्नाइस पैसा मात्र";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void twentyOneDigitAmountTest() {
        BigDecimal amounts = new BigDecimal("198765432112345678900");
        String expected = "१९८७६५४३२११२३४५६७८९०० :  उन्नाइस महाशंख सतासी शंख पैंसट्ठी पद्म त्रिचालीस नील एक्काइस खर्ब बाह्र अर्ब चौँतीस करोड छपन्न लाख अठहत्तर हजार नौ सय रुपैयाँ मात्र";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void twentyOneDigitAmountWithPaisaTest() {
        BigDecimal amounts = new BigDecimal("198765432112345678900.66");
        String expected = "१९८७६५४३२११२३४५६७८९००.६६ :  उन्नाइस महाशंख सतासी शंख पैंसट्ठी पद्म त्रिचालीस नील एक्काइस खर्ब बाह्र अर्ब चौँतीस करोड छपन्न लाख अठहत्तर हजार नौ सय रुपैयाँ छयसट्ठी पैसा मात्र";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

    @Test
    public void moreThanTwentyOneDigitAmountTest() {
        BigDecimal amounts = new BigDecimal("1987654321123456789001");
        String expected = "Sorry! Value is not recognizable";
        String result = NepaliAmountDisplayer.convertToNepali(amounts);
        assertEquals(expected, result);
    }

}
