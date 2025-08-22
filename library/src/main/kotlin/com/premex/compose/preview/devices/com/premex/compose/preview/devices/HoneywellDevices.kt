package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Honeywell device specifications for Android Compose previews.
 *
 * This extension provides Honeywell device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Honeywell.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Honeywell: Any
  get() = object {
      /** DeviceSpec(manufacturer=Honeywell, code=CK62, width=480, height=800, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=CK62, width=480,
      height=800, dpi=213, isGoogleDevice=false).code */
      val CK62 = "spec:width=480,height=800,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Honeywell, code=CK65-L0-C, width=480, height=800, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=CK65-L0-C,
      width=480, height=800, dpi=213, isGoogleDevice=false).code */
      val CK65_L0_C = "spec:width=480,height=800,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Honeywell, code=CK65-L0-N, width=480, height=800, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=CK65-L0-N,
      width=480, height=800, dpi=213, isGoogleDevice=false).code */
      val CK65_L0_N = "spec:width=480,height=800,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Honeywell, code=CK67, width=480, height=800, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=CK67, width=480,
      height=800, dpi=213, isGoogleDevice=false).code */
      val CK67 = "spec:width=480,height=800,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Honeywell, code=CK75, width=480, height=640, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=CK75, width=480,
      height=640, dpi=213, isGoogleDevice=false).code */
      val CK75 = "spec:width=480,height=640,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Honeywell, code=CN80-L0-C, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=CN80-L0-C,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val CN80_L0_C = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Honeywell, code=CN80-L0-N, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=CN80-L0-N,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val CN80_L0_N = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Honeywell, code=CN80-L1-C, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=CN80-L1-C,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val CN80_L1_C = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Honeywell, code=CT30P, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=CT30P, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val CT30P = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Honeywell, code=CT37, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=CT37, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val CT37 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Honeywell, code=CT40P-L0-F, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=CT40P-L0-F,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val CT40P_L0_F = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Honeywell, code=CT40P-L1-F, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=CT40P-L1-F,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val CT40P_L1_F = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Honeywell, code=CT40-L0-C, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=CT40-L0-C,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val CT40_L0_C = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Honeywell, code=CT40-L0-CA, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=CT40-L0-CA,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val CT40_L0_CA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Honeywell, code=CT40-L1-C, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=CT40-L1-C,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val CT40_L1_C = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Honeywell, code=CT45, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=CT45, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val CT45 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Honeywell, code=CT45P, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=CT45P, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val CT45P = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Honeywell, code=CT47, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=CT47, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val CT47 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Honeywell, code=CT50L0N-CS13S, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=CT50L0N-CS13S,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val CT50L0N_CS13S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Honeywell, code=CT50L0N-CS15S, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=CT50L0N-CS15S,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val CT50L0N_CS15S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Honeywell, code=CT50L0N-CS16S, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=CT50L0N-CS16S,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val CT50L0N_CS16S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Honeywell, code=CT50LFN-CS16S, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=CT50LFN-CS16S,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val CT50LFN_CS16S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Honeywell, code=CT50LUN-CS13S, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=CT50LUN-CS13S,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val CT50LUN_CS13S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Honeywell, code=CT50LUN-CS16S, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=CT50LUN-CS16S,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val CT50LUN_CS16S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Honeywell, code=CT60-L0-C, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=CT60-L0-C,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val CT60_L0_C = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Honeywell, code=CT60-L1-C, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=CT60-L1-C,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val CT60_L1_C = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Honeywell, code=CT70, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=CT70, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val CT70 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Honeywell, code=EDA10A, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=EDA10A, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val EDA10A = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Honeywell, code=EDA40-1, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=EDA40-1, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val EDA40_1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Honeywell, code=eda50k-0, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=eda50k-0,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val EDA50K_0 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Honeywell, code=eda50k-1, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=eda50k-1,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val EDA50K_1 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Honeywell, code=eda50-011, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=eda50-011,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val EDA50_011 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Honeywell, code=eda50-111, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=eda50-111,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val EDA50_111 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Honeywell, code=eda50-211, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=eda50-211,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val EDA50_211 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Honeywell, code=EDA51K-0, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=EDA51K-0,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val EDA51K_0 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Honeywell, code=EDA51K-1, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=EDA51K-1,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val EDA51K_1 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Honeywell, code=EDA51-0, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=EDA51-0, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val EDA51_0 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Honeywell, code=EDA51-1, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=EDA51-1, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val EDA51_1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Honeywell, code=EDA52, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=EDA52, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val EDA52 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Honeywell, code=EDA57, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=EDA57, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val EDA57 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Honeywell, code=EDA5S, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=EDA5S, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val EDA5S = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Honeywell, code=EDA61K-0C, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=EDA61K-0C,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val EDA61K_0C = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Honeywell, code=EDA61K-0U, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=EDA61K-0U,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val EDA61K_0U = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Honeywell, code=EDA61K-1C, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=EDA61K-1C,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val EDA61K_1C = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Honeywell, code=EDA61K-1U, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=EDA61K-1U,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val EDA61K_1U = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Honeywell, code=eda70-0, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=eda70-0, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val EDA70_0 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Honeywell, code=eda70-3, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=eda70-3, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val EDA70_3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Honeywell, code=EDA71-0, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=EDA71-0, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val EDA71_0 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Honeywell, code=EDA71-1, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=EDA71-1, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val EDA71_1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Honeywell, code=TA60A-L0-C, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=TA60A-L0-C,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val TA60A_L0_C = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Honeywell, code=TA60A-L1-C, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=TA60A-L1-C,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val TA60A_L1_C = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Honeywell, code=VM1A-L0-N, width=768, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=VM1A-L0-N,
      width=768, height=1280, dpi=160, isGoogleDevice=false).code */
      val VM1A_L0_N = "spec:width=768,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Honeywell, code=VM1A-L0-P, width=768, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=VM1A-L0-P,
      width=768, height=1280, dpi=160, isGoogleDevice=false).code */
      val VM1A_L0_P = "spec:width=768,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Honeywell, code=VM3A-L0-N, width=768, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=VM3A-L0-N,
      width=768, height=1024, dpi=160, isGoogleDevice=false).code */
      val VM3A_L0_N = "spec:width=768,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Honeywell, code=VM3A-L0-P, width=768, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=VM3A-L0-P,
      width=768, height=1024, dpi=160, isGoogleDevice=false).code */
      val VM3A_L0_P = "spec:width=768,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Honeywell, code=75E-L0N, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Honeywell, code=75E-L0N, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val _75E_L0N = "spec:width=480,height=800,unit=px,dpi=240"

  }
