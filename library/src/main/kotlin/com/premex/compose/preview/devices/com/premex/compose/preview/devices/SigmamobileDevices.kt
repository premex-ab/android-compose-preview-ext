package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Sigma_mobile device specifications for Android Compose previews.
 *
 * This extension provides Sigma_mobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sigmamobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sigmamobile: Any
  get() = object {
      /** DeviceSpec(manufacturer=Sigma_mobile, code=PQ18_MAX, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sigma_mobile, code=PQ18_MAX,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val PQ18_MAX = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sigma_mobile, code=Tab_A1010_Neo, width=1200, height=1920,
      dpi=280, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sigma_mobile,
      code=Tab_A1010_Neo, width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val TAB_A1010_NEO = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Sigma_mobile, code=Tab_A1025_2, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sigma_mobile, code=Tab_A1025_2,
      width=1200, height=2000, dpi=320, isGoogleDevice=false).code */
      val TAB_A1025_2 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sigma_mobile, code=Tab_A1033_X-treme, width=800, height=1280,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sigma_mobile,
      code=Tab_A1033_X-treme, width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val TAB_A1033_X_TREME = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Sigma_mobile, code=Tab_A802, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sigma_mobile, code=Tab_A802,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val TAB_A802 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Sigma_mobile, code=X-Style_S5501, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sigma_mobile, code=X-Style_S5501,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val X_STYLE_S5501 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sigma_mobile, code=X-Style_S5502, width=480, height=1016, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sigma_mobile, code=X-Style_S5502,
      width=480, height=1016, dpi=200, isGoogleDevice=false).code */
      val X_STYLE_S5502 = "spec:width=480,height=1016,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Sigma_mobile, code=X_style_Tab_A1010, width=1200, height=1920,
      dpi=280, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sigma_mobile,
      code=X_style_Tab_A1010, width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val X_STYLE_TAB_A1010 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Sigma_mobile, code=X_Style_Tab_A103, width=800, height=1280,
      dpi=213, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sigma_mobile,
      code=X_Style_Tab_A103, width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val X_STYLE_TAB_A103 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Sigma_mobile, code=X_Style_Tab_A104, width=800, height=1280,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sigma_mobile,
      code=X_Style_Tab_A104, width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val X_STYLE_TAB_A104 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Sigma_mobile, code=X_style_Tab_A801, width=1200, height=1920,
      dpi=280, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sigma_mobile,
      code=X_style_Tab_A801, width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val X_STYLE_TAB_A801 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Sigma_mobile, code=X_style_Tab_A83, width=800, height=1280,
      dpi=213, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sigma_mobile,
      code=X_style_Tab_A83, width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val X_STYLE_TAB_A83 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Sigma_mobile, code=X-treme_PQ18, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sigma_mobile, code=X-treme_PQ18,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val X_TREME_PQ18 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sigma_mobile, code=X-treme_PQ20, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sigma_mobile, code=X-treme_PQ20,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val X_TREME_PQ20 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sigma_mobile, code=X-treme_PQ24, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sigma_mobile, code=X-treme_PQ24,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val X_TREME_PQ24 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sigma_mobile, code=X-treme_PQ28, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sigma_mobile, code=X-treme_PQ28,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val X_TREME_PQ28 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sigma_mobile, code=X-treme_PQ29, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sigma_mobile, code=X-treme_PQ29,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val X_TREME_PQ29 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sigma_mobile, code=X-treme_PQ36, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sigma_mobile, code=X-treme_PQ36,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val X_TREME_PQ36 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sigma_mobile, code=X-TREME_PQ37, width=640, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sigma_mobile, code=X-TREME_PQ37,
      width=640, height=1280, dpi=320, isGoogleDevice=false).code */
      val X_TREME_PQ37 = "spec:width=640,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sigma_mobile, code=X-TREME_PQ52, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sigma_mobile, code=X-TREME_PQ52,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val X_TREME_PQ52 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sigma_mobile, code=X-treme_PQ53, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sigma_mobile, code=X-treme_PQ53,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val X_TREME_PQ53 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sigma_mobile, code=X-treme_PQ54, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sigma_mobile, code=X-treme_PQ54,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val X_TREME_PQ54 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sigma_mobile, code=X-treme_PQ54_MAX, width=720, height=1440,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sigma_mobile,
      code=X-treme_PQ54_MAX, width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val X_TREME_PQ54_MAX = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sigma_mobile, code=X-treme_PQ55, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sigma_mobile, code=X-treme_PQ55,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val X_TREME_PQ55 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Sigma_mobile, code=X_treme_PQ56, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sigma_mobile, code=X_treme_PQ56,
      width=720, height=1600, dpi=300, isGoogleDevice=false).code */
      val X_TREME_PQ56 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=Sigma_mobile, code=X-treme_PQ57, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sigma_mobile, code=X-treme_PQ57,
      width=1080, height=2408, dpi=480, isGoogleDevice=false).code */
      val X_TREME_PQ57 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Sigma_mobile, code=X-treme_PQ58, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Sigma_mobile, code=X-treme_PQ58,
      width=1080, height=2408, dpi=480, isGoogleDevice=false).code */
      val X_TREME_PQ58 = "spec:width=1080,height=2408,unit=px,dpi=480"

  }
