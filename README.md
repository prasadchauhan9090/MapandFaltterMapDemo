# Differences between Java 8 `map()` vs `flatMap()`

| `map()`                                                                  | `flatMap()`                                                                                |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| It processes a stream of values.                                         | It processes a stream of streams or other nested structures.                               |
| It performs only mapping (transformation).                               | It performs mapping as well as flattening.                                                 |
| The mapper function produces a single output value for each input value. | The mapper function can produce multiple values for each input value.                      |
| It is generally used for one-to-one mapping.                             | It is generally used for one-to-many mapping.                                              |
| Data transformation: `Stream<T>` to `Stream<R>`.                         | For streams: `Stream<T>` to `Stream<R>`, flattening the resulting streams into one stream. |
| Use it when the mapping function produces one result per input.          | Use it when the mapping function produces a stream of multiple results per input.          |

## Simple example

### 1. `map()` — transforms each value

```
List<String> names = Arrays.asList("roshan", "prasad");

names.stream()
     .map(String::toUpperCase)
     .forEach(System.out::println);
```

Output:

```
ROSHAN
PRASAD
```

Each name is transformed into one uppercase name.

### 2. `flatMap()` — transforms and flattens values

```
List<List<Integer>> numbers = Arrays.asList(
    Arrays.asList(1, 2),
    Arrays.asList(3, 4)
);

numbers.stream()
       .flatMap(List::stream)
       .forEach(System.out::println);
```

Output:

```
1
2
3
4
```

Here, `flatMap()` converts the nested lists into one flat stream of integers.

Interview tip: Remember that `map()` transforms each element, whereas `flatMap()` transforms each element and flattens the resulting streams into a single stream.