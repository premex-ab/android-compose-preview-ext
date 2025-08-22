package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * OWXmobile device specifications for Android Compose previews.
 *
 * This extension provides OWXmobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.OWXmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.OWXmobile: Any
  get() = object {
      /** DeviceSpec(manufacturer=OWXmobile, code=W50s, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OWXmobile, code=W50s, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val W50S = "spec:width=480,height=960,unit=px,dpi=200"

  }
