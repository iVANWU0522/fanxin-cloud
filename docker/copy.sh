#!/bin/sh

# 复制项目的文件到对应docker路径，便于一键生成镜像。
usage() {
	echo "Usage: sh copy.sh"
	exit 1
}


# copy sql
echo "begin copy sql "
cp ../sql/fx_20230706.sql ./mysql/db
cp ../sql/fx_config_20220929.sql ./mysql/db

# copy html
echo "begin copy html "
cp -r ../fanxin-ui/dist/** ./nginx/html/dist


# copy jar
echo "begin copy fanxin-gateway "
cp ../fanxin-gateway/target/fanxin-gateway.jar ./fanxin/gateway/jar

echo "begin copy fanxin-auth "
cp ../fanxin-auth/target/fanxin-auth.jar ./fanxin/auth/jar

echo "begin copy fanxin-visual "
cp ../fanxin-visual/fanxin-monitor/target/fanxin-visual-monitor.jar  ./fanxin/visual/monitor/jar

echo "begin copy fanxin-modules-system "
cp ../fanxin-modules/fanxin-system/target/fanxin-modules-system.jar ./fanxin/modules/system/jar

echo "begin copy fanxin-modules-file "
cp ../fanxin-modules/fanxin-file/target/fanxin-modules-file.jar ./fanxin/modules/file/jar

echo "begin copy fanxin-modules-job "
cp ../fanxin-modules/fanxin-job/target/fanxin-modules-job.jar ./fanxin/modules/job/jar

echo "begin copy fanxin-modules-gen "
cp ../fanxin-modules/fanxin-gen/target/fanxin-modules-gen.jar ./fanxin/modules/gen/jar

