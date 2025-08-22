package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LOGIC device specifications for Android Compose previews.
 *
 * This extension provides LOGIC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LOGIC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LOGIC: Any
  get() = object {
      /** DeviceSpec(manufacturer=LOGIC, code=L4T, width=480, height=800, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGIC, code=L4T, width=480,
      height=800, dpi=200, isGoogleDevice=false).code */
      val L4T = "spec:width=480,height=800,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=LOGIC, code=L55B, width=444, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGIC, code=L55B, width=444,
      height=960, dpi=213, isGoogleDevice=false).code */
      val L55B = "spec:width=444,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=LOGIC, code=L63A, width=720, height=1520, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGIC, code=L63A, width=720,
      height=1520, dpi=300, isGoogleDevice=false).code */
      val L63A = "spec:width=720,height=1520,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=LOGIC, code=L66, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGIC, code=L66, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val L66 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LOGIC, code=L66_LITE, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGIC, code=L66_LITE, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val L66_LITE = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LOGIC, code=L66_PRO, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGIC, code=L66_PRO, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val L66_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LOGIC, code=L68_Ultra, width=720, height=1600, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGIC, code=L68_Ultra, width=720,
      height=1600, dpi=260, isGoogleDevice=false).code */
      val L68_ULTRA = "spec:width=720,height=1600,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=LOGIC, code=LOGIC_G1L, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGIC, code=LOGIC_G1L, width=720,
      height=1612, dpi=280, isGoogleDevice=false).code */
      val LOGIC_G1L = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=LOGIC, code=LOGIC_L4T, width=480, height=800, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGIC, code=LOGIC_L4T, width=480,
      height=800, dpi=200, isGoogleDevice=false).code */
      val LOGIC_L4T = "spec:width=480,height=800,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=LOGIC, code=LOGIC_L50, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGIC, code=LOGIC_L50, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val LOGIC_L50 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LOGIC, code=LOGIC_L50T, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGIC, code=LOGIC_L50T, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val LOGIC_L50T = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LOGIC, code=LOGIC_L55S, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGIC, code=LOGIC_L55S, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val LOGIC_L55S = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LOGIC, code=LOGIC_L55V_PLUS, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGIC, code=LOGIC_L55V_PLUS,
      width=480, height=960, dpi=200, isGoogleDevice=false).code */
      val LOGIC_L55V_PLUS = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=LOGIC, code=LOGIC_L5D, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGIC, code=LOGIC_L5D, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val LOGIC_L5D = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LOGIC, code=LOGIC_L60, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGIC, code=LOGIC_L60, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val LOGIC_L60 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LOGIC, code=LOGIC_L61, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGIC, code=LOGIC_L61, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val LOGIC_L61 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LOGIC, code=LOGIC_L63, width=720, height=1520, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGIC, code=LOGIC_L63, width=720,
      height=1520, dpi=300, isGoogleDevice=false).code */
      val LOGIC_L63 = "spec:width=720,height=1520,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=LOGIC, code=LOGIC_L65, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGIC, code=LOGIC_L65, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val LOGIC_L65 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LOGIC, code=LOGIC_L65T, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGIC, code=LOGIC_L65T, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val LOGIC_L65T = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LOGIC, code=LOGIC_L65_LITE, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGIC, code=LOGIC_L65_LITE,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val LOGIC_L65_LITE = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LOGIC, code=LOGIC_L66M, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGIC, code=LOGIC_L66M, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val LOGIC_L66M = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LOGIC, code=LOGIC_L68, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGIC, code=LOGIC_L68, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val LOGIC_L68 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LOGIC, code=LOGIC_MV01, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGIC, code=LOGIC_MV01, width=480,
      height=854, dpi=200, isGoogleDevice=false).code */
      val LOGIC_MV01 = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=LOGIC, code=LOGIC_MV02, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGIC, code=LOGIC_MV02, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val LOGIC_MV02 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LOGIC, code=LOGIC_T10L_PLUS, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGIC, code=LOGIC_T10L_PLUS,
      width=800, height=1280, dpi=180, isGoogleDevice=false).code */
      val LOGIC_T10L_PLUS = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=LOGIC, code=LOGIC_T10M, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGIC, code=LOGIC_T10M, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val LOGIC_T10M = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=LOGIC, code=LOGIC_X40, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGIC, code=LOGIC_X40, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val LOGIC_X40 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LOGIC, code=LOGIC_X50, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGIC, code=LOGIC_X50, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val LOGIC_X50 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LOGIC, code=LOGIC_X50X, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGIC, code=LOGIC_X50X, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val LOGIC_X50X = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LOGIC, code=LOGIC_X57A, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGIC, code=LOGIC_X57A, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val LOGIC_X57A = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=LOGIC, code=T10B, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGIC, code=T10B, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val T10B = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LOGIC, code=T10L, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGIC, code=T10L, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val T10L = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LOGIC, code=T3G, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGIC, code=T3G, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val T3G = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=LOGIC, code=T3GPlus, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGIC, code=T3GPlus, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val T3GPLUS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LOGIC, code=T4G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGIC, code=T4G, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val T4G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LOGIC, code=X4G, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGIC, code=X4G, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val X4G = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LOGIC, code=X50A, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LOGIC, code=X50A, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val X50A = "spec:width=480,height=854,unit=px,dpi=240"

  }
