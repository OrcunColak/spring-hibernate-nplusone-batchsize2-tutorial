# Read Me

The original idea is from
https://medium.com/jpa-java-persistence-api-guide/hibernate-optimization-with-batchsize-and-batch-size-configuration-579bf759fc05

This example shows @BatchSize At Class Level

# @BatchSize At Class Level

Applying @BatchSize(size=50) loads the N authors at once when iterating over Books.

Books have ManyToOne relationship to Author




