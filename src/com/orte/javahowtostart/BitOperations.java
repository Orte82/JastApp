package com.orte.javahowtostart;

public class BitOperations {
    // binary And  => &
    // 1 & 1 = 1    1 & 0 = 0           result = 255&1 = 1  =>    1111 1111
    //                                                                      &
    // 0 & 0 = 0    0 & 1 = 0                                     0000 0001    =    0000 0001


    //binary or => |
    // 1 | 1 = 1     1 | 0 = 1
    // 0 | 0 = 0     0 | 1 = 1

    //binary xor => ^
    // 1 ^ 1 = 1     1 ^ 0 = 1
    // 0 ^ 0 = 0     0 ^ 1 = 1

    //not ~
    // ~0 = 1
    // ~1 = 0

    // change number sign   ~( +N) + 1 = -N    ~( -N) + 1 = +N
    //  0000 0001   1
    //  ~
    //  1111 1110  -2
    //  +
    //  0000 0001   1
    //  =
    //  1111 1111  -1

}
