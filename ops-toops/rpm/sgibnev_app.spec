Name:       sgibnev_app
Version:    1
Release:    1
Summary:    Install and run backend daemon-app on 3000 port
License:    MIT

%description
Homtask 3 with RPM backend package.

%prep

%build

%install

[ "$RPM_BUILD_ROOT" != "/" ] && rm -rf $RPM_BUILD_ROOT

mkdir -p %{buildroot}/usr/bin/backapp
mkdir -p %{buildroot}/etc/systemd/system/

install -m 755 /var/lib/jenkins/workspace/Build-Back/backend/target/ops_school-0.0.1-SNAPSHOT-jar-with-dependencies.jar %{buildroot}/usr/bin/backapp/backend.jar
install -m 755 /var/lib/jenkins/workspace/Build-Back/ops-toops/rpm/backend_app.service %{buildroot}/etc/systemd/system/backend_app.service

%files

/etc/systemd/system/backend_app.service
/usr/bin/backapp/backend.jar

%post
systemctl daemon-reload
systemctl start backend_app.service
systemctl enable backend_app

%clean
rm -rf %{buildroot}

%preun
systemctl stop backend_app.service
systemctl disable backend_app.service
systemctl daemon-reload

%changelog
# skip this for now
