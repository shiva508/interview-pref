package com.pool.version8.streams.toArray;

import com.pool.version8.streams.util.Role;
import com.pool.version8.streams.util.StreamUtil;

import java.util.Arrays;
import java.util.List;

public class StreamToArrayClient {
    public static void main(String[] args) {
        List<Role> roles= StreamUtil.rolesBuilder();
        var toArray = roles.stream().map(Role::getRoleName).toArray();
        System.out.println(Arrays.toString(toArray));

        var toArrayStr = roles.stream().map(Role::getRoleName).toArray(String[]::new);
        System.out.println(Arrays.toString(toArrayStr));
    }
}
