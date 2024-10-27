// Declaring a mutable variable `a` of type Int (integer) with an initial value of 10.
var a: Int = 10

// Declaring a mutable variable `b` of inferred type Boolean with an initial value of true.
var b = true

// Declaring an immutable variable `c` of type Char (character) with an initial value of 'a'.
val c: Char = 'a'

// Declaring a mutable variable `d` with inferred type Double, given an initial value of 12.3.
// Note: If this needs to be a Float specifically, use `12.3f` to specify the float literal.
var d = 12.3 

// Printing the values of variables `a`, `b`, `c`, and `d` to the console.
println(a)
println(b)
println(c)
println(d)

// Uncommenting the following lines would cause a reassignment error, since `c` is immutable.
// c = 'b'
// println(c)

// Declaring a mutable variable `x` with an inferred type of Int.
// Here, `x` is assigned the sum of two inner immutable variables, `m` and `n`.
var x = {
  val m: Int = 200
  val n: Int = 300
  m + n
}
print(x)
print("\n")

// Declaring a mutable variable `y` with an inferred type of Int.
// The value of `y` is the sum of two inner immutable variables, `s` and `p`.
var y = {
  val s: Int = 100
  val p: Int = 700
  s + p
}
print(y)
print("\n")

// Demonstrating a simple variable manipulation.
// Declaring a mutable variable `q` of inferred type Int with an initial value of 10.
var q = 10
q = q * 5  // Reassigns `q` to its value multiplied by 5.
print(q)

// // Declaring a lazy, immutable variable `r` of type Int with an initial value of 100.
// `lazy val` ensures that `r` is only initialized when it is first accessed, not at the time of declaration.
print("\n")
lazy val r = 100
print(r)
