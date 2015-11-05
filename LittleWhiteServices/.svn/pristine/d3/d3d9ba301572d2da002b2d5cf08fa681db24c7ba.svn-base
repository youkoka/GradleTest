#!/bin/sh

#xcodebuild.sh
#
#
# argument
# 1. xcode project path
# 2. ipa output folder(unimplemented)
# 3. ipa name(unimplemented)
# 4. scheme
# 5. target

#!/bin/bash

if [ $# != 5 ]; then
	echo "usage : xcodebuild <source path> <ipa output path> <ipa name> <project scheme> <project target>"
	exit
fi

build_folder="build"
release_folder="Release-iphoneos"
configure_build_dir=$build_folder/$release_folder
source_path=$1
ipa_output_path=$2
ipa_name=$3
project_scheme=$4
project_target=$5

# entry source path
cd $source_path

# remove build/Release-iphoneos folder
rm -r $source_path/$build_folder

#build
/usr/bin/xcodebuild -scheme $project_scheme -target $project_target -configuration Release CONFIGURATION_BUILD_DIR=$configure_build_dir

#build ipa
applist=$(ls $source_path/$configure_build_dir | grep "app$")
for appname in $applist
do
	/usr/bin/xcrun -sdk iphoneos PackageApplication -v $source_path/$configure_build_dir/$appname
done
