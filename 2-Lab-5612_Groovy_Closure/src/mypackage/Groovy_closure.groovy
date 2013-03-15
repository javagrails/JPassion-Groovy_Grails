package mypackage

myMap = ["Korea": 2 , "India" : 1, "USA" : 3]

results = 0
myMap.keySet().each { results += myMap[it] }
println "total=${results}"
