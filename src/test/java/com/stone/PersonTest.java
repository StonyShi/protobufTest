package com.stone;

import com.example.tutorial.AddressBookProtos;
import com.google.protobuf.InvalidProtocolBufferException;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * <p>Created with IntelliJ IDEA. </p>
 * <p>User: Stony </p>
 * <p>Date: 2016/8/26 </p>
 * <p>Time: 19:05 </p>
 * <p>Version: 1.0.0 </p>
 */
public class PersonTest {

    public static void main(String[] args) throws IOException {
        AddressBookProtos.Person john =
                AddressBookProtos.Person.newBuilder()
                .setId(1234)
                .setName("John Doe")
                .setEmail("jdoe@example.com")
                .addPhone(
                        AddressBookProtos.Person.PhoneNumber.newBuilder()
                                .setNumber("555-4321")
                                .setType(AddressBookProtos.Person.PhoneType.HOME))
                .build();
        System.out.println("---------------------");
        System.out.println(john.toByteArray());
        System.out.println("---------------------");
        System.out.println(AddressBookProtos.Person.parseFrom(john.toByteString()));
        System.out.println("---------------------");
        System.out.println(AddressBookProtos.Person.parseFrom(john.toByteArray()));
        System.out.println(" out ---------------------");
        john.writeTo(System.out);
        System.out.println("inputStream ---------------------");
        ByteArrayInputStream inputStream  = new ByteArrayInputStream(john.toByteArray());
        System.out.println(AddressBookProtos.Person.parseFrom(inputStream));
    }
}
