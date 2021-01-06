package com.ma.queue.String;

public class Demo01  implements IString{


    @Override
    public int length() {
        return 0;
    }

    @Override
    public IString contant(IString anotherString) {
        return null;
    }

    @Override
    public IString substring(int start, int end) {
        return null;
    }

    @Override
    public int indexOf(IString str, int fromIndex) {
        return 0;
    }

    @Override
    public IString append(String str) {
        return null;
    }

    @Override
    public IString delete(int start, int end) {
        return null;
    }

    @Override
    public IString insert(int offset, IString str) {
        return null;
    }
}
