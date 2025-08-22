package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

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
      /** Honeywell CK62 */
      val CK62 = "spec:width=480,height=800,unit=px,dpi=213"

      /** Honeywell CK65-L0-C */
      val CK65_L0_C = "spec:width=480,height=800,unit=px,dpi=213"

      /** Honeywell CK65-L0-N */
      val CK65_L0_N = "spec:width=480,height=800,unit=px,dpi=213"

      /** Honeywell CK67 */
      val CK67 = "spec:width=480,height=800,unit=px,dpi=213"

      /** Honeywell CK75 */
      val CK75 = "spec:width=480,height=640,unit=px,dpi=213"

      /** Honeywell CN80-L0-C */
      val CN80_L0_C = "spec:width=480,height=854,unit=px,dpi=240"

      /** Honeywell CN80-L0-N */
      val CN80_L0_N = "spec:width=480,height=854,unit=px,dpi=240"

      /** Honeywell CN80-L1-C */
      val CN80_L1_C = "spec:width=480,height=854,unit=px,dpi=240"

      /** Honeywell CT30P */
      val CT30P = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Honeywell CT37 */
      val CT37 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** Honeywell CT40P-L0-F */
      val CT40P_L0_F = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Honeywell CT40P-L1-F */
      val CT40P_L1_F = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Honeywell CT40-L0-C */
      val CT40_L0_C = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Honeywell CT40-L0-CA */
      val CT40_L0_CA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Honeywell CT40-L1-C */
      val CT40_L1_C = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Honeywell CT45 */
      val CT45 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Honeywell CT45P */
      val CT45P = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Honeywell CT47 */
      val CT47 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** Honeywell CT50L0N-CS13S */
      val CT50L0N_CS13S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Honeywell CT50L0N-CS15S */
      val CT50L0N_CS15S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Honeywell CT50L0N-CS16S */
      val CT50L0N_CS16S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Honeywell CT50LFN-CS16S */
      val CT50LFN_CS16S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Honeywell CT50LUN-CS13S */
      val CT50LUN_CS13S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Honeywell CT50LUN-CS16S */
      val CT50LUN_CS16S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Honeywell CT60-L0-C */
      val CT60_L0_C = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Honeywell CT60-L1-C */
      val CT60_L1_C = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Honeywell CT70 */
      val CT70 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** Honeywell EDA10A */
      val EDA10A = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Honeywell EDA40-1 */
      val EDA40_1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Honeywell eda50k-0 */
      val EDA50K_0 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Honeywell eda50k-1 */
      val EDA50K_1 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Honeywell eda50-011 */
      val EDA50_011 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Honeywell eda50-111 */
      val EDA50_111 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Honeywell eda50-211 */
      val EDA50_211 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Honeywell EDA51K-0 */
      val EDA51K_0 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Honeywell EDA51K-1 */
      val EDA51K_1 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Honeywell EDA51-0 */
      val EDA51_0 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Honeywell EDA51-1 */
      val EDA51_1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Honeywell EDA52 */
      val EDA52 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Honeywell EDA57 */
      val EDA57 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Honeywell EDA5S */
      val EDA5S = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Honeywell EDA61K-0C */
      val EDA61K_0C = "spec:width=480,height=800,unit=px,dpi=240"

      /** Honeywell EDA61K-0U */
      val EDA61K_0U = "spec:width=480,height=800,unit=px,dpi=240"

      /** Honeywell EDA61K-1C */
      val EDA61K_1C = "spec:width=480,height=800,unit=px,dpi=240"

      /** Honeywell EDA61K-1U */
      val EDA61K_1U = "spec:width=480,height=800,unit=px,dpi=240"

      /** Honeywell eda70-0 */
      val EDA70_0 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Honeywell eda70-3 */
      val EDA70_3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Honeywell EDA71-0 */
      val EDA71_0 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Honeywell EDA71-1 */
      val EDA71_1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Honeywell TA60A-L0-C */
      val TA60A_L0_C = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Honeywell TA60A-L1-C */
      val TA60A_L1_C = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** Honeywell VM1A-L0-N */
      val VM1A_L0_N = "spec:width=768,height=1280,unit=px,dpi=160"

      /** Honeywell VM1A-L0-P */
      val VM1A_L0_P = "spec:width=768,height=1280,unit=px,dpi=160"

      /** Honeywell VM3A-L0-N */
      val VM3A_L0_N = "spec:width=768,height=1024,unit=px,dpi=160"

      /** Honeywell VM3A-L0-P */
      val VM3A_L0_P = "spec:width=768,height=1024,unit=px,dpi=160"

      /** Honeywell 75E-L0N */
      val _75E_L0N = "spec:width=480,height=800,unit=px,dpi=240"

  }
