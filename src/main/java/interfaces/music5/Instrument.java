package interfaces.music5;

import polymorphism.Note;

/**
 * Created by weixiao on 2018/9/5.
 */
interface Instrument {
    int VALUE = 5;
    void play(Note n);
    void adjust();
}

