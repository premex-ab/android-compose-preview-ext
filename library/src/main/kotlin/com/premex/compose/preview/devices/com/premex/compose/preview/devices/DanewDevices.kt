package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Danew device specifications for Android Compose previews.
 *
 * This extension provides Danew device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Danew.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Danew: Any
  get() = object {
      /** DeviceSpec(manufacturer=Danew, code=D809ProPlus, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Danew, code=D809ProPlus, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val D809PROPLUS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Danew, code=Dbook112_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Danew, code=Dbook112_EEA,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val DBOOK112_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Danew, code=Dbook_110, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Danew, code=Dbook_110, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val DBOOK_110 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Danew, code=Dbook_111, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Danew, code=Dbook_111, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val DBOOK_111 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Danew, code=Dslide1013QC_v2, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Danew, code=Dslide1013QC_v2,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val DSLIDE1013QC_V2 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Danew, code=Dslide1013QC_v3, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Danew, code=Dslide1013QC_v3,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val DSLIDE1013QC_V3 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Danew, code=Dslide1013QC_v4, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Danew, code=Dslide1013QC_v4,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val DSLIDE1013QC_V4 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Danew, code=Dslide1016_V2, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Danew, code=Dslide1016_V2,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val DSLIDE1016_V2 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Danew, code=Dslide1019, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Danew, code=Dslide1019, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val DSLIDE1019 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Danew, code=Dslide716, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Danew, code=Dslide716, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val DSLIDE716 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Danew, code=Dslide807, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Danew, code=Dslide807, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val DSLIDE807 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Danew, code=Dslide808, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Danew, code=Dslide808, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val DSLIDE808 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Danew, code=Dslide_1020, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Danew, code=Dslide_1020,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val DSLIDE_1020 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Danew, code=Dslide_1020M, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Danew, code=Dslide_1020M,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val DSLIDE_1020M = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Danew, code=Dslide_1020Pro, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Danew, code=Dslide_1020Pro,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val DSLIDE_1020PRO = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Danew, code=Dslide_1021, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Danew, code=Dslide_1021, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val DSLIDE_1021 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Danew, code=Dslide_1021C, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Danew, code=Dslide_1021C,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val DSLIDE_1021C = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Danew, code=Dslide_1095, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Danew, code=Dslide_1095, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val DSLIDE_1095 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Danew, code=Dslide_113, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Danew, code=Dslide_113, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val DSLIDE_113 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Danew, code=Dslide_114, width=1200, height=1920, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Danew, code=Dslide_114, width=1200,
      height=1920, dpi=200, isGoogleDevice=false).code */
      val DSLIDE_114 = "spec:width=1200,height=1920,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Danew, code=Dslide_115, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Danew, code=Dslide_115, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val DSLIDE_115 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Danew, code=Dslide_809Pro, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Danew, code=Dslide_809Pro,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val DSLIDE_809PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Danew, code=Dslide_809_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Danew, code=Dslide_809_EEA,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val DSLIDE_809_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Danew, code=G27, width=640, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Danew, code=G27, width=640,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val G27 = "spec:width=640,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Danew, code=Konnect402, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Danew, code=Konnect402, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val KONNECT402 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Danew, code=Konnect602, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Danew, code=Konnect602, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val KONNECT602 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Danew, code=Konnect_508, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Danew, code=Konnect_508, width=480,
      height=854, dpi=213, isGoogleDevice=false).code */
      val KONNECT_508 = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Danew, code=Konnect_509, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Danew, code=Konnect_509, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val KONNECT_509 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Danew, code=Konnect_601, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Danew, code=Konnect_601, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val KONNECT_601 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Danew, code=Konnect_607, width=600, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Danew, code=Konnect_607, width=600,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val KONNECT_607 = "spec:width=600,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Danew, code=Konnect_608, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Danew, code=Konnect_608, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val KONNECT_608 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Danew, code=T_ONE, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Danew, code=T_ONE, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val T_ONE = "spec:width=720,height=1440,unit=px,dpi=320"

  }
