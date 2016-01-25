## Hand Scoring


### 8) Straight Flush, Royal Flush
---

5 cards in a contiguous sequence of card ranks all of the same suit.
(A Royal flush is an Ace high straight flush.)

#### Possible tie: 

high card is most significant. Tie is possible with same card ranks with different suits

  * 9h-8h-7h-6h-5h
  * 9d-8d-7d-6d-5d
  * 9c-8c-7c-6c-5c
  * 9s-8s-7s-6s-5s


### 7) 4 of a kind
---

4 cards of same rank and 1 single

Higher value of card in 4 card match is winner

#### absolute win: 


### 6) Full House
---

3 of a kind and 1 pair.  

Higher value of card in 3 card match is winner.

#### absolute win: 
 
cannot tie since the 3 of a kind match is unique in a deck of 52 cards (4 suits * 13 ordinals)
even if 3 of a kind is a lower card than the pair it is still the most significant high card


### 5) Flush
---

5 cards of the same suit.  

Cascading high card match:
    Higher card, in ordinal order of sorted hand, is winner.

#### Possible tie: 

Can have up to 4 hands each with having the same suit and identical card ranks as other hands.
If not a tie, winner is with the highest high card in cascading order highest to lowest.


### 4) Straight
---

5 cards in a contiguous sequence of card ranks, at least 2 different suits.

High card wins.

#### Possible tie: 

can have 4 hands with similar card ranks in varying suits

* player 1)  9h 8d 7h 6h 5h
* player 2)  9d 8h 7c 6s 5d
* player 3)  9c 8c 7d 6c 5c
* player 4)  9s 8s 7s 6d 5s



### 3) 3 of a Kind
---

3 cards of same rank and 2 singles.

Higher value of card in 3 card match is winner.

#### absolute win: 

cannot tie since the 3 of a kind match is unique in a deck of 52 cards (4 suits * 13 ordinals)



### 2) 2 pair
---

2 cards of same rank, another 2 cards of same rank (different from first set) and a single.

high card matching with higher pair, then second pair, then solo card.

#### Possible tie: 

2 players can each of identical sets of pairs 

* 9d-9s + 5h-5d + 4h
* 9c-9h + 5c-5s + 4c


### 1) 1 pair
---

2 cards of same rank and 3 singles

Higher value of card rank in pair, then ranks of sorted ranks in ordinal order.

#### Possible tie: 

2 players can each have identical sets with different suits: 

* 9d-9s + 7h + 5d + 4h
* 9c-9h + 7d + 5s + 4c


### 0) High card
---

5 singles, no similar ranks, not contiguous sequence and at least 2 different suits.

Higher card , in ordinal order of sorted hand, is winner.

#### Possible tie: 

can have up to 4 hands with identical numerical sequences that are not flush, straight or have any matches.

