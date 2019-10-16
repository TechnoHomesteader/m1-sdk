// Copyright 1998-2016 Epic Games, Inc. All Rights Reserved.
using System.IO;
using System.Diagnostics;

namespace UnrealBuildTool.Rules
{
    public class Mach1DecodePlugin : ModuleRules
    {
        public string GetUProjectPath()
        {
            return Directory.GetParent(ModuleDirectory).Parent.Parent.Parent.FullName;
        } 

        private void CopyToBinaries(string Filepath, ReadOnlyTargetRules Target)
        { 
            //string binariesDir = Path.GetFullPath(Path.Combine(ModuleDirectory, "..", "..", "Binaries", Target.Platform.ToString()));
            string binariesDir = Path.Combine(GetUProjectPath(), "Binaries", Target.Platform.ToString());
            string filename = Path.GetFileName(Filepath);

            if (!Directory.Exists(binariesDir))
                Directory.CreateDirectory(binariesDir);

            if (!File.Exists(Path.Combine(binariesDir, filename)))
                File.Copy(Filepath, Path.Combine(binariesDir, filename), true);
        }

        public Mach1DecodePlugin(ReadOnlyTargetRules Target) : base(Target)
        {
            PCHUsage = ModuleRules.PCHUsageMode.UseExplicitOrSharedPCHs;

            PublicIncludePaths.AddRange(
                new string[] {
                    "Developer/TargetPlatform/Public"
                    // ... add public include paths required here ...
                }
                );

            PrivateIncludePaths.AddRange(
                new string[] {
                   "Developer/Mach1DecodePlugin/Private"
                    // ... add other private include paths required here ...
                }
                );

             PublicDependencyModuleNames.AddRange(
                new string[]
                {
                    // in UE 4.18 needed HeadMountedDisplay
                    "Core", "CoreUObject", "Engine", "InputCore", "HeadMountedDisplay"
                    // ... add other public dependencies that you statically link with here ...
                }
                );

            PrivateDependencyModuleNames.AddRange(
                new string[]
                {
                    // ... add private dependencies that you statically link with here ...
                }
                );

            DynamicallyLoadedModuleNames.AddRange(
                new string[]
                {
                    // ... add any modules that your module loads dynamically here ...
                }
                );

            // add Mach1 library
            string Mach1BaseDirectory = Path.GetFullPath(Path.Combine(ModuleDirectory, "..", "..", "ThirdParty", "Mach1"));
            string Mach1BinDirectory = Path.Combine(Mach1BaseDirectory, "bin", Target.Platform.ToString());

            PublicIncludePaths.Add(Path.Combine(Mach1BaseDirectory, "include"));

            if (Target.Platform == UnrealTargetPlatform.Android)
            {
                //Mach1BinDirectory = Path.Combine(Mach1BinDirectory, Target.Architecture);
                var archs =  new string[] { "armeabi-v7a", "x86" };
				foreach(var arch in archs)
				{
					PublicLibraryPaths.Add(Path.Combine(Mach1BinDirectory, arch));
                    PublicAdditionalLibraries.Add(Path.Combine(Mach1BinDirectory, arch, "libMach1EncodeCAPI.a"));
                    PublicAdditionalLibraries.Add(Path.Combine(Mach1BinDirectory, arch, "libMach1DecodeCAPI.a"));
                    PublicAdditionalLibraries.Add(Path.Combine(Mach1BinDirectory, arch, "libMach1DecodePositionalCAPI.a"));
                }
            }
            else if (Target.Platform == UnrealTargetPlatform.IOS)
            {
                PublicAdditionalLibraries.Add(Path.Combine(Mach1BinDirectory, "libMach1EncodeCAPI.a"));
                PublicAdditionalLibraries.Add(Path.Combine(Mach1BinDirectory, "libMach1DecodeCAPI.a"));
                PublicAdditionalLibraries.Add(Path.Combine(Mach1BinDirectory, "libMach1DecodePositionalCAPI.a"));
            }
            else if (Target.Platform == UnrealTargetPlatform.Mac)
            {
                PublicLibraryPaths.Add(Mach1BinDirectory);
                PublicAdditionalLibraries.Add(Path.Combine(Mach1BinDirectory, "libMach1EncodeCAPI.dylib"));
                PublicAdditionalLibraries.Add(Path.Combine(Mach1BinDirectory, "libMach1DecodeCAPI.dylib"));
                PublicAdditionalLibraries.Add(Path.Combine(Mach1BinDirectory, "libMach1DecodePositionalCAPI.dylib"));
                
                RuntimeDependencies.Add(Path.Combine(Mach1BinDirectory, "libMach1EncodeCAPI.dylib"));
                RuntimeDependencies.Add(Path.Combine(Mach1BinDirectory, "libMach1DecodeCAPI.dylib"));
                RuntimeDependencies.Add(Path.Combine(Mach1BinDirectory, "libMach1DecodePositionalCAPI.dylib"));

                CopyToBinaries(Path.Combine(Mach1BinDirectory, "libMach1EncodeCAPI.dylib"), Target);
                CopyToBinaries(Path.Combine(Mach1BinDirectory, "libMach1DecodeCAPI.dylib"), Target);
                CopyToBinaries(Path.Combine(Mach1BinDirectory, "libMach1DecodePositionalCAPI.dylib"), Target);
                 
            }
            else if (Target.Platform == UnrealTargetPlatform.Win32 || Target.Platform == UnrealTargetPlatform.Win64)
            { 
                PublicAdditionalLibraries.Add(Path.Combine(Mach1BinDirectory, "Mach1EncodeCAPI.lib"));
                PublicAdditionalLibraries.Add(Path.Combine(Mach1BinDirectory, "Mach1DecodeCAPI.lib"));
                PublicAdditionalLibraries.Add(Path.Combine(Mach1BinDirectory, "Mach1DecodePositionalCAPI.lib"));
                 
                RuntimeDependencies.Add(Path.Combine(Mach1BinDirectory, "Mach1EncodeCAPI.dll"));
                RuntimeDependencies.Add(Path.Combine(Mach1BinDirectory, "Mach1DecodeCAPI.dll"));
                RuntimeDependencies.Add(Path.Combine(Mach1BinDirectory, "Mach1DecodePositionalCAPI.dll"));

                CopyToBinaries(Path.Combine(Mach1BinDirectory, "Mach1EncodeCAPI.dll"), Target);
                CopyToBinaries(Path.Combine(Mach1BinDirectory, "Mach1DecodeCAPI.dll"), Target);
                CopyToBinaries(Path.Combine(Mach1BinDirectory, "Mach1DecodePositionalCAPI.dll"), Target);
            }

        }
    }
}