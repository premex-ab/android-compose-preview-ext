package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BouyguesTelecom device specifications for Android Compose previews.
 *
 * This extension provides BouyguesTelecom device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BouyguesTelecom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BouyguesTelecom: Any
  get() = object {
      /** DeviceSpec(manufacturer=BouyguesTelecom, code=HMB4213H, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BouyguesTelecom, code=HMB4213H,
      width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val HMB4213H = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BouyguesTelecom, code=HMB9213NW, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BouyguesTelecom, code=HMB9213NW,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val HMB9213NW = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=BouyguesTelecom, code=UZW4020BYT, width=1080, height=1920,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BouyguesTelecom,
      code=UZW4020BYT, width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val UZW4020BYT = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
