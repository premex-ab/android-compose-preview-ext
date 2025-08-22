package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * strawberry device specifications for Android Compose previews.
 *
 * This extension provides strawberry device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Strawberry.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Strawberry: Any
  get() = object {
      /** DeviceSpec(manufacturer=strawberry, code=SX, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=strawberry, code=SX, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val SX = "spec:width=720,height=1520,unit=px,dpi=320"

  }
