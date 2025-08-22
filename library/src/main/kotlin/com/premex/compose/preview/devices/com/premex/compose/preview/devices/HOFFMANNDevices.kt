package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HOFFMANN device specifications for Android Compose previews.
 *
 * This extension provides HOFFMANN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HOFFMANN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HOFFMANN: Any
  get() = object {
      /** DeviceSpec(manufacturer=HOFFMANN, code=X-Go, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOFFMANN, code=X-Go, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val X_GO = "spec:width=720,height=1280,unit=px,dpi=320"

  }
