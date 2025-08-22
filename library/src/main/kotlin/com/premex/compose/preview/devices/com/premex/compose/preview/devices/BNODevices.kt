package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BNO device specifications for Android Compose previews.
 *
 * This extension provides BNO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BNO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BNO: Any
  get() = object {
      /** DeviceSpec(manufacturer=BNO, code=bno_MT5593Uplus_EU, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BNO, code=bno_MT5593Uplus_EU,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val BNO_MT5593UPLUS_EU = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
