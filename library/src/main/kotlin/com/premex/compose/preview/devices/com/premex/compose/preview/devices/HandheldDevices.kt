package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * handheld device specifications for Android Compose previews.
 *
 * This extension provides handheld device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Handheld.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Handheld: Any
  get() = object {
      /** DeviceSpec(manufacturer=handheld, code=Nautiz_X9P, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=handheld, code=Nautiz_X9P,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val NAUTIZ_X9P = "spec:width=720,height=1280,unit=px,dpi=320"

  }
