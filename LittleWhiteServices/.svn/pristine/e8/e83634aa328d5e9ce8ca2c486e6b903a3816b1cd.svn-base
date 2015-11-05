#!/bin/sh

#svnlink.sh
#
#
# argument
# 1. cmd, ex: ls, update, checkout
# 2. svn link
# 3. username
# 4. password

#!/bin/bash

if [ $# != 4 ] && [ $# != 5 ]; then
	echo "useage : "
	echo "<cmd, ex:ls, update, checkout> <svn link> <username> <password>"
	echo "or"
	echo "<cmd, ex:ls, update, checkout> <svn link> <dest path> <username> <password>"
	exit
fi

if [ $# == 4 ]; then
	cmd=$1
	svnlink=$2
	username=$3
	password=$4
	destpath="."
elif [ $# == 5 ]; then
	
	cmd=$1
	svnlink=$2
	destpath=$3
	username=$4
	password=$5
fi

if [ $cmd == "ls" ]; then
	svn ls $svnlink --username $username --password $password
elif [ $cmd == "update" ]; then
	svn up $svnlink --username $username --password $password
elif [ $cmd == "checkout" ]; then
	svn co $svnlink $destpath --username $username --password $password
else 
	echo "useage : "
	echo "<cmd, ex:ls, update, checkout> <svn link> <username> <password>"
	echo "or"
	echo "<cmd, ex:ls, update, checkout> <svn link> <dest path> <username> <password>"
	exit
fi
