package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Marshall device specifications for Android Compose previews.
 *
 * This extension provides Marshall device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Marshall.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Marshall: Any
  get() = object {
      /** DeviceSpec(manufacturer=Marshall, code=KB-1501, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Marshall, code=KB-1501, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val KB_1501 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
