package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AGM device specifications for Android Compose previews.
 *
 * This extension provides AGM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AGM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AGM: Any
  get() = object {
      /** DeviceSpec(manufacturer=AGM, code=AGM_Glory_G1, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AGM, code=AGM_Glory_G1, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val AGM_GLORY_G1 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=AGM, code=AGM_Glory_G1S_EU, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AGM, code=AGM_Glory_G1S_EU,
      width=1080, height=2340, dpi=480, isGoogleDevice=false).code */
      val AGM_GLORY_G1S_EU = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=AGM, code=AGM_Glory_G1S_US, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AGM, code=AGM_Glory_G1S_US,
      width=1080, height=2340, dpi=480, isGoogleDevice=false).code */
      val AGM_GLORY_G1S_US = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=AGM, code=AGM_H3, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AGM, code=AGM_H3, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val AGM_H3 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=AGM, code=AGM_H5, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AGM, code=AGM_H5, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val AGM_H5 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=AGM, code=AGM_H5_PRO, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AGM, code=AGM_H5_PRO, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val AGM_H5_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=AGM, code=AGM_H6, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AGM, code=AGM_H6, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val AGM_H6 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=AGM, code=AGM_H_MAX, width=720, height=1612, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AGM, code=AGM_H_MAX, width=720,
      height=1612, dpi=480, isGoogleDevice=false).code */
      val AGM_H_MAX = "spec:width=720,height=1612,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=AGM, code=AGM_Note_N1, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AGM, code=AGM_Note_N1, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val AGM_NOTE_N1 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=AGM, code=AGM_PAD_P1, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AGM, code=AGM_PAD_P1, width=1200,
      height=2000, dpi=320, isGoogleDevice=false).code */
      val AGM_PAD_P1 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=AGM, code=AGM_PAD_P2, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AGM, code=AGM_PAD_P2, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val AGM_PAD_P2 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=AGM, code=AGM_PAD_P2_ACTIVE, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AGM, code=AGM_PAD_P2_ACTIVE,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val AGM_PAD_P2_ACTIVE = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=AGM, code=AGM_PAD_T1, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AGM, code=AGM_PAD_T1, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val AGM_PAD_T1 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=AGM, code=AGM_PAD_T1_WIFI, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AGM, code=AGM_PAD_T1_WIFI,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val AGM_PAD_T1_WIFI = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=AGM, code=AGM_PAD_T2, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AGM, code=AGM_PAD_T2, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val AGM_PAD_T2 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=AGM, code=AGM_PAD_T3, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AGM, code=AGM_PAD_T3, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val AGM_PAD_T3 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=AGM, code=AGM_X6_EEA, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AGM, code=AGM_X6_EEA, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val AGM_X6_EEA = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=AGM, code=AGM_X6_RU, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AGM, code=AGM_X6_RU, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val AGM_X6_RU = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=AGM, code=Android_Tablet, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AGM, code=Android_Tablet,
      width=1200, height=2000, dpi=320, isGoogleDevice=false).code */
      val ANDROID_TABLET = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=AGM, code=HS8952QC, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AGM, code=HS8952QC, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val HS8952QC = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=AGM, code=HS8976QC, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AGM, code=HS8976QC, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val HS8976QC = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=AGM, code=HSSDM450QC, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AGM, code=HSSDM450QC, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val HSSDM450QC = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=AGM, code=HSSDM845QC, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AGM, code=HSSDM845QC, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val HSSDM845QC = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=AGM, code=SHARKL5, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AGM, code=SHARKL5, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val SHARKL5 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=AGM, code=T91EUE1, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AGM, code=T91EUE1, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val T91EUE1 = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
