package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * innex device specifications for Android Compose previews.
 *
 * This extension provides innex device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Innex.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Innex: Any
  get() = object {
      /** DeviceSpec(manufacturer=innex, code=EU_3588, width=2160, height=3840, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=innex, code=EU_3588, width=2160,
      height=3840, dpi=420, isGoogleDevice=false).code */
      val EU_3588 = "spec:width=2160,height=3840,unit=px,dpi=420"

  }
