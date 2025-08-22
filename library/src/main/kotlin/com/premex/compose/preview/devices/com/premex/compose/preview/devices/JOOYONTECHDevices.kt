package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * JOOYONTECH device specifications for Android Compose previews.
 *
 * This extension provides JOOYONTECH device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.JOOYONTECH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.JOOYONTECH: Any
  get() = object {
      /** DeviceSpec(manufacturer=JOOYONTECH, code=Q27CMA11, width=1440, height=2560, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JOOYONTECH, code=Q27CMA11,
      width=1440, height=2560, dpi=240, isGoogleDevice=false).code */
      val Q27CMA11 = "spec:width=1440,height=2560,unit=px,dpi=240"

  }
