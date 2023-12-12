package practicum_iterator_1;

public class TeamIterator implements Iterator<Person> {

    private Person[] members;
    private int curIndex;

    public TeamIterator(Person[] members) {
        this.members = members;
        this.curIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return curIndex<members.length && members[curIndex]!=null;
    }

    @Override
    public Person next() {
        if (hasNext()) {
            return members[curIndex++];
        };
        throw new IllegalStateException("Iterator is already done.");
    }
}
