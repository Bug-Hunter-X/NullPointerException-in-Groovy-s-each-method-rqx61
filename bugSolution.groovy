```groovy
def myMethod(List<String> strings) {
  strings?.each { string ->
    println string?.toUpperCase()
  }
}

myMethod(null)
myMethod(['hello', 'world'])
```