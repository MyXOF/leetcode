package main

import (
	"strings"
	"fmt"
)

func numUniqueEmails(emails []string) int {
	set := make(map[string] int)
	for _, email := range emails{
		s := strings.Index(email, "@")
		local := email[0:s]
		rest := email[s+1:]
		plus := strings.Index(email, "+")
		local = local[0:plus]
		local = strings.Replace(local, ".", "", -1)
		set[local+rest] = 1
	}
	return len(set)
}

func main(){
	input := []string{"test.email+alex@leetcode.com",
		"test.e.mail+bob.cathy@leetcode.com",
		"testemail+david@lee.tcode.com"}
	fmt.Println(numUniqueEmails(input))
}
