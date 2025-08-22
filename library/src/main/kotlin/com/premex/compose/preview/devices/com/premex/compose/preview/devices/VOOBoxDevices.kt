package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VOOBox device specifications for Android Compose previews.
 *
 * This extension provides VOOBox device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VOOBox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VOOBox: Any
  get() = object {
      /** DeviceSpec(manufacturer=VOOBox, code=SEI700TMM, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VOOBox, code=SEI700TMM, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SEI700TMM = "spec:width=720,height=1280,unit=px,dpi=320"

  }
