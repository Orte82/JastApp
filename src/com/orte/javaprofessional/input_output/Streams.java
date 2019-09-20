package com.orte.javaprofessional.input_output;

public class Streams {
    // Stream is abstraction of input source and output source of data which can process information
    //  input stream consists of Unicode symbols or just bytes and they are received by method read()
    // output stream is processed by methods write() print() and println()
    // Input/Output are essential to know

    // System has 3 stream
    // in => input
    // out => output
    // err => error

    // out and err are object of PrintStream that create byte stream
    // with methods print() println write()

    // in is object for InputStream
    // applies keyboard input with read()
    // InputStream is abstract so one uses some of his subclasses

    // Streams hierarchy

    // Reader => abstract class with general methods of symbol input
    // Writer => abstract class with general methods of symbol output
    // InputStream => abstract class with general methods of byte input
    // OutputStream => abstract class with general methods of byte output

    // Reader       => on error throws IOException
    // abstract void close() => closes input stream. Must be used
    // void mark (int readLimit) => puts mark on current position in input stream
    // boolean markSupported() => true if stream supports mark() and reset()
    // int read() => reads bytes but return integer value of next symbol of input stream. Return -1 on the end of file
    // there are other overloaded versions of this method
    // boolean read() => returns true if next call will not wait
    // void reset() => resets input marker to previously placed mark
    // long skip(long charCount) => skips charCount of input symbols and returns exact length of skipped symbols

    // Writer      => on error throws IOException
    // Writer append(char c) => adds symbol at the end of input stream. Returns reference at the calling stream
    // Writer append(CharSequence csq) => adds symbols at the end of input stream. Returns reference at the calling stream
    // abstract void close() => closes output stream. Must be used
    // abstract void flush() => finalizes state clearing buffers
    // void write(int oneChar) => writes one symbol in output stream (there are other overloaded methods)

    // InputStream
    // int available() => returns quantity of input bytes available to read
    // close() => it's already clear :)
    // void mark(int readlimit) => puts mark in inputs stream, which is correct until readlimit bytes is read
    // boolean markSupported() => true if stream supports mark() and reset()
    // int read() returns integer value of next byte in stream. Returns -1 in the end
    // int read(byte[] buffer) => tries to read bytes to buffer
    // void reset() => resets input marker to previously placed mark
    // long skip(long byteCount) => skip byteCount bytes of input returning quantity of ignored bytes
}
