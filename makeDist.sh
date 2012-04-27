
VERSION=current

while getopts "v:" OPTION
do
    case $OPTION in 
        v)
            VERSION=$OPTARG
            ;;
    esac
done

mvn assembly:assembly

mkdir -p target/oculus
rm -rf target/oculus/*

mv target/oculus-sample-project-jar-with-dependencies.jar target/oculus/oculus-sample-project-$VERSION.jar
cp *.properties target/oculus/.
cp *.conf target/oculus/.

cd target/oculus/
zip -9 -r oculus-sample-project-$VERSION.zip *

cd ../..
mv target/oculus/oculus-sample-project-$VERSION.zip ../.
rm -rf target/oculus
