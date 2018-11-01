package main

import "fmt"

func sortArrayByParity(A []int) []int {
	start, end := 0, len(A)-1
	for {
		if start >= end {
			break
		}
		if A[start]%2 == 0 {
			start += 1
		} else {
			for {
				if (A[end]%2 == 0) || (start >= end) {
					break
				} else {
					end -= 1
				}
			}
			if start >= end{
				break
			} else{
				A[start], A[end] =  A[end], A[start]
				start += 1
				end -= 1
			}
		}
	}
	return A
}

func main() {
	arr := []int{3,1,2,4}
	sortArrayByParity(arr)
	for _, v := range arr{
		fmt.Println(v)
	}
}
