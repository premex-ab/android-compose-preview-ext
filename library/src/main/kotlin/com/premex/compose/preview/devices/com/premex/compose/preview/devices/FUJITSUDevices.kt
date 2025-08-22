package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FUJITSU device specifications for Android Compose previews.
 *
 * This extension provides FUJITSU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FUJITSU.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FUJITSU: Any
  get() = object {
      /** DeviceSpec(manufacturer=FUJITSU, code=arrowsM05, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FUJITSU, code=arrowsM05,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val ARROWSM05 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=FUJITSU, code=arrowsRX, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FUJITSU, code=arrowsRX, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ARROWSRX = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=FUJITSU, code=BZ01, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FUJITSU, code=BZ01, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val BZ01 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=FUJITSU, code=FARTM933KZ, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FUJITSU, code=FARTM933KZ,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val FARTM933KZ = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=FUJITSU, code=M01, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FUJITSU, code=M01, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val M01 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FUJITSU, code=M01T, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FUJITSU, code=M01T, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val M01T = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=FUJITSU, code=M02, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FUJITSU, code=M02, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val M02 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FUJITSU, code=M03, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FUJITSU, code=M03, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val M03 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FUJITSU, code=M04, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FUJITSU, code=M04, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val M04 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FUJITSU, code=M04P, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FUJITSU, code=M04P, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val M04P = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FUJITSU, code=M357, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FUJITSU, code=M357, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val M357 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FUJITSU, code=M555, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FUJITSU, code=M555, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val M555 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=FUJITSU, code=mx532, width=752, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FUJITSU, code=mx532, width=752,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val MX532 = "spec:width=752,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=FUJITSU, code=Patio600, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FUJITSU, code=Patio600, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PATIO600 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=FUJITSU, code=TONEm17, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FUJITSU, code=TONEm17, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TONEM17 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FUJITSU, code=YM901FJ, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FUJITSU, code=YM901FJ, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val YM901FJ = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
