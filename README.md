# Scala

Some tests on [Scala](http://www.scala-lang.org/) and attempt to use heroku.

## Setup

To setup Scala:

  - Download [Scala](http://www.scala-lang.org/downloads)
  - Unzip/untar to your favorite location and put the bin subdir in your `PATH` environment variable
  
## Getting Started

### REPL

Scala has a tool called the [REPL](https://docs.scala-lang.org/overviews/repl/overview.html) (Read-Eval-Print Loop) that is analogous to commandline interpreters in many other languages. You may type any Scala expression, and the result will be evaluated and printed.  

Start a Scala REPL by running `scala`. You should see the prompt:
```bash
  $ scala
  scala>
```

### IDE

As of now, scala does not really have a dedicated IDE, but plugins exists for Eclipse, IntelliJ and NetBeans.

- [Getting started with Scala on IntelliJ](https://docs.scala-lang.org/getting-started-intellij-track/getting-started-with-scala-in-intellij.html)

## HelloWorld

Compile the scala script:

```bash
scalac HelloWorld.scala
```

Execute the scala script (in the script directory):
```bash
scala HelloWorld
```

## .heroku deploy

Simple Scala application, to be deployed on heroku.

To link with my heroku account on [heroku dashboard](https://dashboard.heroku.com)

### Getting started on Scala with heroku 

- [Scala with heroku](https://devcenter.heroku.com/articles/getting-started-with-scala#introduction)
- [Link Github to heroku](https://devcenter.heroku.com/articles/github-integration)
