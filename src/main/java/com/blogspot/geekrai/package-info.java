/**
 * Root Package
 * <p>
 * Sub-Packages:
 * rest: Rest controller and Request and Response classes.
 * service: Business logic, DB interactions and (business) validations.
 * common: All common functionalities
 *
 * Approach : 2-Layer, 2-Package approach
 * 
 * This way, package structure follows our logical structure.
 * rest - http aware and are entry point of the service.
 * service - business layer which abstracts business logic, CRUD operation to DB.
 * 
 */
package com.blogspot.geekrai;
