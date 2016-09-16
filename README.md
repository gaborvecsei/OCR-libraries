# OCR Library Comparison

So I wanted to compare popular OCR libraries so we can see the pros and cons.

## Results:

I tested with hungarian language because that's more complex than the english.

[This is the *.pdf* I used for testing](https://github.com/gaborvecsei/OCR-libraries/blob/master/szamla.pdf)

[And this is the *.png* image I generated from that image](https://github.com/gaborvecsei/OCR-libraries/blob/master/szamla.png)

### Tesseract with image

, . . Szamla/Invozce (Minta, ) Az eredeti bizonylat másolata, csak tájékoztatásra! Sorszám/lnvoice No. 287/2008/V Szállító/ Sold by Vev /Client Minta Kft Némedi László 1022 Budapest Budapest Törökvész u. 30/a Szent I. u. 34. 1200 Fizetési mód/ Teljesítés id pontja/ Számla kelte/ Esedékesseg/ Method of payment Date of fulfilment Date of invoice Due Készpénz/ Cash 2008. 10. 17. 2008. 10. 17. 2008. 10. 17. Megnevezés/ VTSZ/ SZJ/ Mennyiség/ Mee/ Egységár/ Nettó/ Áfa %/ Áfaérték/ Bruttó/ Description VTSZ/ SZJ Nr. Amount Unit Unit price Net VAT % Am. of VAT Gross Minta termék 10db 50 EUR 500 EUR 20% 100 EUR 600 EUR 20% 500 EUR 100 EUR 26 200 Ft 600 EUR Összesen/ Total 500 EUR 100 EUR 26 200 Ft 600 EUR Fizetend végösszeg/ Total: 600 EUR azaz Hatszáz Euró. (Árfolyam/Exchange rate: 262,0000 Ft/EUR) Köszönjük a vásárlást! Ez a számla a Kulcs-Solt Számítástechnika Zrt. rendszerével készült http://www.kulcs-solt.hu This invoice was prepared using the program ol Key-Solt Software Co. http://www.kulcs-solt.hu A számla a 47/2007. (Xll.29.) PM rendeletnek megfelel. The invoice is in compliance with the PM Decree 47/2007. (Xll.29.).

### Tesseract with pdf

l . . Szamla/Invozce ( Minta ) Az eredeti bizonylat másolata, csak tájékoztatásra! Sorszám/lnvoice No. 287/2008/V Szállító/ Solcl by Vevő/ Client Minta Kft Némedi László 1022 Budapest Budapest Törökvész u. 30/a Szent I. u. 34. 1200 Fizetési mód/ Telj esítés időpontja/ Számla kelte/ Esedékesség/ Method of payment Date of fulfilment Date of invoice Due Készpénz/ Cash 2008. 10. 17. 2008. 10. 17. 2008. 10. 17. Megnevezés/ VTSZ/ SZJ/ Mennyiség/ Mee/ Egységár/ Nettó/ Áfa %/ Áfaérték/ Bruttó/ Description VTSZ/ SZJ Nr. Amount Unit Unit price Net VAT % Am. of VAT Gross Minta termék 10db 50 EUR 500 EUR 20% 100 EUR 600 EUR Áfa % / VAT % Nettó/ Net ÁFA/ VAT ÁFA/ VAT (Ft) Bruttó/ Gross 20% 500 EUR 100 EUR 26 200 Ft 600 EUR Összesen/ Total 500 EUR 100 EUR 26 200 Ft 600 EUR Fizetendő végösszeg/ Total: 600 EUR azaz Hatszáz Euró. (Árfolyam/Exchange rate: 262,0000 Ft/EUR) Köszönjük a vásárlást! Ez a számla a Kulcs-Soft Számítástechnika Zrt. rendszerével készült http://www.kulcs-soit.hu This invoice was prepared using the program of Key-Soft Software Co. http://www.kulcs-soit.hu A számla a 47/2007. (Xll.29.) PM rendeletnek megfelel. The invoice is in compliance with the PM Decree 47/2007. (Xll.29.).

### Asprise with image

Szdmla/Invoice (Minta) Az eredeti bizonylat mésolata, csak téjékoztatésra! Sorszém/Invoice No. V Szélll’té/ Sold by Minta Kft 1022 Budapest T6r6kvész u. 30/a Vev / Client Ne'medi Ldszlo' Budapest Szent I. u. 34. 1200 ' Fizetési méd/ Teljesités id pontja/ Szamla kelte/ Esedékesség/ ‘ Method of payment Date of fulfilment Date of invoice Due Készpénz/ Cash 2008. 10. 17. 2008. 10. 17. 2008. 10. 17. 'Megnevezés/ VTSZ/ SZJ/ Mennyiség/ Mee/ Egységér/ Netté/ Afa %/ Afaérték/ Brutté/ ‘ Description VTSZ/ SZJ Nr. Amount Unit Unit price Net VAT % Am. of VAT Gross 50 EUR 500 EUR 20% 100 EUR 600 EUR Minta termék 10 db Afa % / VAT % Netté/ Net AFA/ VAT AFA/ VAT (Ft) Brutté/ Gross 20% 500 EUR 100 EUR 26 200 Ft 600 EUR ésszesen/ Total 500 EUR 100 EUR 26 200 Ft 600 EUR Fizetend végésszeg/ Total: 600 EUR azaz Hatszaz Euro. (Arfolyam/Exchange rate: 262.0000 Ft/EUR) KoszonjiJk a vésérlést! Ez a szamla a Kulcs-Soft Szamitastechnika Zrt. rendszerével késziilt http://www.ku|cs-soft.hu This invoice was prepared using the program of Key-Soft Software Co. http://www.ku|cs-soft.hu A szamla a 47/2007. (X||.29.) PM rendeletnek megfelel. The invoice is in compliance with the PM Decree 47/2007. (X||.29.). Afa % / VAT % Netté/ Net AFA/ VAT AFA/ VAT (Ft) Brutté/ Gross

### Asprise with pdf

Minta Kft Ne'medi Ldszlo' 1022 Budapest Budapest T6r6kvész u. 30/a Szent I. u. 34. 1200 KészénjUk a vésérlést!

### Google (only image)

*(Google cloud vision can't process pdf files so I could only test it on the .png file)*

Szamla/Invoice (Minta) Az eredeti bizonylat masolata, csak tajékoztatasra! Sorszam/Invoice No. 287/2008 V Szallitol Sold by Vev Client Minta Kft 1022 Budapest Némedi Laszlo Budapest Torok vész u. 30/a Szent I. u. 34 1200 Fizetési mod Teljesités id pontja/ Szamla kelte/ Esedékesség/ Method of payment Date of men Date of invoice Due 2008. 10. 17. Készpénz/ Cash 2008. 10. 17 2008. 1 Egységar/ Megnevezés/ VTSZI SZJ Mennyiség Mee/ Netto/ Afa Afaérték Brutto Description VTSZI SZJ Nr. Net VAT Am. of VAT Gross Amount Unit Unit price Minta termék 50 EUR 500 EUR 20% 0 db 00 EUR 600 EUR AFA/ VAT (Ft) Afa VAT Netto/ Net AFA VAT Brutto/ Gross 500 EUR 100 EUR 600 EUR 20% 26 200 Ft 600 EUR Osszesen Tota 500 EUR 26 200 Ft 100 EUR Fizetend végosszeg/ Total: 600 EUR azaz Hatszaz Euro Arfolyam/ Exchange rate 262,0000 Ft/EUR) Ez a szamla a Kulcs-Soft Sza astechnika Zrt. rendszerével kés http This invoice was prepared using the progra of Key-Soft Software Co. http://www.kulcs-soft.hu A szamla a 47/2007. (XII.29.) PM rendeletnek megfele The invoice is in compliance with the PM Decree 47/2007. (XII.29

## Thoughts

As you can see, Tesseract and Google is better than Asprise but unfortunately with Google we can't use pdfs.

Btw...That was an easy problem because we can say that this was a scanned document. If the image is a little bit rotated than the only solution is Google or you can rotate back and things like that with image processing. And after that tesseract is cool too.

## Google Cloud Vision Tutorial

When I wanted to use Google Cloud vision for the first time I couldn't start fast because theres were no easy tutorials on the net. So you can see my code and I think you will be able to understand it better.

[*You can find the code here*](https://github.com/gaborvecsei/OCR-libraries/blob/master/src/GoogleDetection.java)