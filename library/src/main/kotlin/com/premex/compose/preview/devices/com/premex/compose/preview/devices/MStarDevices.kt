package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MStar device specifications for Android Compose previews.
 *
 * This extension provides MStar device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MStar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MStar: Any
  get() = object {
      /** DeviceSpec(manufacturer=MStar, code=watermelon, width=720, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MStar, code=watermelon, width=720,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val WATERMELON = "spec:width=720,height=1280,unit=px,dpi=160"

  }
