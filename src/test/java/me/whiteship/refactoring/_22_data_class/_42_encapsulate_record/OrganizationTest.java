package me.whiteship.refactoring._22_data_class._42_encapsulate_record;

import org.junit.jupiter.api.Test;

class OrganizationTest {

    @Test
    public void test() throws Exception{
        Organization organization = new Organization("jongwoo", "USA");
        organization.name();
        organization.country();
    }
}