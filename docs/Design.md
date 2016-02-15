# Design Notes

Please review [Poker Rules](PokerRules.md) to understand the ranking system between various hands.

# Notes on numerical scoring of hand ranks and high card tie breakers
---

Give each level of hand a rank score, then ties within ranks can be settled by high card

Use hexadecimal digit for rank of hand 
        
    8 = 0x8) Straight Flush.
    7 = 0x7) 4 of a Kind.   
    6 = 0x6) Full House.    
    5 = 0x5) Flush.         
    4 = 0x4) Straight.      
    3 = 0x3) 3 of a Kind.   
    2 = 0x2) 2 Pairs.       
    1 = 0x1) 1 Pair.        
    0 = 0x0) High Card.     

and for each high card (2..A) == ( 2..14 ) == (0x2..0xE) == (0010..1110)

* First sort cards in rank order, this will put matching card ranks in contiguous sequence.
* Next, group cards in sets of matching ranks, this will create a minimum of 2 sets (4 of a kind and a single) to 5 sets (no matches:== straight, flush, high card)
* then sort matched groups by count of matches in each set (4 of a kind, 3 of a kind, pair, 1 single) which are all pre-sorted by rank.
* Then determine simple rank (what kind of hand is it) and assign score value (0x0..0x8)

Make rank and each ordinal high card value a position in a hex array:

    {hand rank}{high card 1}{high card 2}{high card 3}{high card 4}{high card 5}
    each field is 1 hex digit, or 4 bits. The hand rank is the most significant digit.

Then dump sorted groups into single array and iterate each card inserting it's rank into the field map above.
The cards will be sorted by highest number of matches first, then by rank order second.

Make each rank a hexadecimal digit, 10 J Q K A ==> A B C D E

then evaluate concatenated values of hand, or use bit shifting to achieve the same.

## 2 pair:

    1) 9h-9s-2h-2s-8c == \[0x2\]\[0x9\]\[0x9\]\[0x2\]\[0x2\]\[0x8\]
    2) 8d-8h-7s-7c-Ad == \[0x2\]\[0x8\]\[0x8\]\[0x7\]\[0x7\]\[0xE\]

    2 Pair Rank == 0x2

    0x299228 > 0x28877E  :: true

## flush ? 

    1) Ah-5h-4h-3h-2h  == \[0x5\]\[0xE\]\[0x5\]\[0x4\]\[0x3\]\[0x2\]
    2) Kh-Qh-Jh-10h-8h == \[0x5\]\[0xD\]\[0xC\]\[0xB\]\[0xA\]\[0x8\]
    
    flush rank = 0x5
    
    0x5E5432 > 0x5DCBA8 :: Player 1 wins

## close win ? 

    1) Ad-Kd-Qd-Jd-9d == 0xEDCB9
    2) Ah-Kh-Qh-Jh-8h == 0xEDCB8        

    flush rank = 0x5

    0x5EDCB9 > 0x5EDCB8 :: Player 1 wins ( by 1 pt)

## full house ?

    1) Kd-Kc-Ks-9h-9s == \[0x6\]\[0xD\]\[0xD\]\[0xD\]\[0x9\]\[0x9\]
    1) Qd-Qc-Qs-Ah-As == \[0x6\]\[0xC\]\[0xC\]\[0xC\]\[0xE\]\[0xE\]

    flush rank = 0x6

    0x6DDD99 > 0x6CCCEE :: Player 1 wins
    
    even though Player 2 had higher cards (Queens over Aces vs Kings over 9s 
    The Ace > King or 9, but the King was higher priority from the 3 of a kind match, while the Aces were only a pair.
