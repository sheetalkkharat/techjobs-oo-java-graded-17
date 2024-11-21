package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType extends JobField{


    public PositionType(String value) {
        super(value);
    }



    @Override
    public String toString() {
        return getValue();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (getClass() != o.getClass()) {
            return false;
        }

        PositionType that = (PositionType) o;
        return this.getId() == that.getId()
                && Objects.equals(getValue(), that.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getValue());
    }

}
