package org.maitreya.poseidon.framework.sql.builder;

/**
 * Create by 2BKeyboard on 2019/12/16 11:05
 */
@SuppressWarnings("SpellCheckingInspection")
public enum Token {
    OP, IDEN, LOGICAL,
    LT,LE,EQ,NE,GE,GT, AND,OR,
    STRING, NUMBER, VARIABLE,
    PROVIDE,NULL
}