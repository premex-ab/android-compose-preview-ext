package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DIXON device specifications for Android Compose previews.
 *
 * This extension provides DIXON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DIXON.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DIXON: Any
  get() = object {
      /** DeviceSpec(manufacturer=DIXON, code=ACK1010, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIXON, code=ACK1010, width=480,
      height=854, dpi=213, isGoogleDevice=false).code */
      val ACK1010 = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DIXON, code=DFM48, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIXON, code=DFM48, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val DFM48 = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=DIXON, code=DN6015, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIXON, code=DN6015, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val DN6015 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DIXON, code=DN6023D, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIXON, code=DN6023D, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val DN6023D = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DIXON, code=DN6901, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIXON, code=DN6901, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val DN6901 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DIXON, code=KT5512, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIXON, code=KT5512, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val KT5512 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DIXON, code=L1, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIXON, code=L1, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val L1 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DIXON, code=L-5, width=442, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIXON, code=L-5, width=442,
      height=960, dpi=240, isGoogleDevice=false).code */
      val L_5 = "spec:width=442,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DIXON, code=S90, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIXON, code=S90, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val S90 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DIXON, code=TS-M105D, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIXON, code=TS-M105D, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val TS_M105D = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=DIXON, code=TS-M105D-MKII, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIXON, code=TS-M105D-MKII,
      width=800, height=1280, dpi=180, isGoogleDevice=false).code */
      val TS_M105D_MKII = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=DIXON, code=TS-M105G-1, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIXON, code=TS-M105G-1, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TS_M105G_1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DIXON, code=TS-M704F-1, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIXON, code=TS-M704F-1, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TS_M704F_1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DIXON, code=TS-M704G, width=800, height=1280, dpi=238,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIXON, code=TS-M704G, width=800,
      height=1280, dpi=238, isGoogleDevice=false).code */
      val TS_M704G = "spec:width=800,height=1280,unit=px,dpi=238"

  }
