Pod::Spec.new do |s|

# 1
s.platform = :ios
s.ios.deployment_target = '12.0'
s.name = "KotlinNativeTestLibrar"
s.summary = "KotlinNativeTestLibrar."
s.requires_arc = true

# 2
s.version = "0.1.0"

# 3
s.license = { :type => "MIT", :file => "LICENSE" }

# 4 - Replace with your name and e-mail address
s.author = { "Keegan Rush" => "keeganrush@gmail.com" }

# 5 - Replace this URL with your own GitHub page's URL (from the address bar)
s.homepage = "https://github.com/gforeroCondorLabs/KotlinNativeTestLibrary"

# 6 - Replace this URL with your own Git URL from "Quick Setup"
s.source = { :git => "https://github.com/gforeroCondorLabs/KotlinNativeTestLibrary.git", 
             :tag => "#{0.1.0}" }
# 17
s.swift_version = "4.2"

end
