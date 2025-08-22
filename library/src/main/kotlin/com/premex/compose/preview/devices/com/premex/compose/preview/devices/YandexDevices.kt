package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Yandex device specifications for Android Compose previews.
 *
 * This extension provides Yandex device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Yandex.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Yandex: Any
  get() = object {
      /** DeviceSpec(manufacturer=Yandex, code=Amber, width=1080, height=2160, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Yandex, code=Amber, width=1080,
      height=2160, dpi=420, isGoogleDevice=false).code */
      val AMBER = "spec:width=1080,height=2160,unit=px,dpi=420"

  }
