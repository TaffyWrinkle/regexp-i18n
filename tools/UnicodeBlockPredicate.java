/**
 * UnicodeBlockPredicate.java
 *
 * Copyright (c) Microsoft Corporation 2018. All rights reserved.
 * Licensed under the MIT license
 *
 * Predicates for the unicode character blocks.
 */
package com.microsoft;

import java.lang.Character.UnicodeBlock;

public class UnicodeBlockPredicate implements Predicate {

    public static final UnicodeBlockPredicate BASIC_LATIN =
            new UnicodeBlockPredicate(UnicodeBlock.BASIC_LATIN);

    public static final UnicodeBlockPredicate EASTERN_NAGARI =
            new UnicodeBlockPredicate(UnicodeBlock.BENGALI);

    public static final UnicodeBlockPredicate SYLOTI_NAGRI =
            new UnicodeBlockPredicate(UnicodeBlock.SYLOTI_NAGRI);

    public static final UnicodeBlockPredicate TAMIL =
            new UnicodeBlockPredicate(UnicodeBlock.TAMIL);

    public static final UnicodeBlockPredicate KANNADA =
            new UnicodeBlockPredicate((UnicodeBlock.KANNADA));

    public static final UnicodeBlockPredicate MALAYALAM =
            new UnicodeBlockPredicate(UnicodeBlock.MALAYALAM);

    public static final UnicodeBlockPredicate BURMESE =
            new UnicodeBlockPredicate(UnicodeBlock.MYANMAR);

    public static final UnicodeBlockPredicate SUNDANESE =
            new UnicodeBlockPredicate(UnicodeBlock.SUNDANESE);
    public static final UnicodeBlockPredicate ODIA =
            new UnicodeBlockPredicate(UnicodeBlock.ORIYA);

    public static final UnicodeBlockPredicate KHMER =
            new UnicodeBlockPredicate(UnicodeBlock.KHMER);

    public static final UnicodeBlockPredicate BATAK =
            new UnicodeBlockPredicate(UnicodeBlock.BATAK);

    public static final UnicodeBlockPredicate DEVANAGARI =
            new UnicodeBlockPredicate(UnicodeBlock.DEVANAGARI);

    public static final UnicodeBlockPredicate TIBETAN =
            new UnicodeBlockPredicate(UnicodeBlock.TIBETAN);

    private UnicodeBlock block;

    public UnicodeBlockPredicate(UnicodeBlock block) {
        this.block = block;
    }

    @Override
    public boolean test(int codepoint) {
        return UnicodeBlock.of(codepoint) == block;
    }
}
