package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Move device specifications for Android Compose previews.
 *
 * This extension provides Move device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Move.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Move: Any
  get() = object {
      /** DeviceSpec(manufacturer=Move, code=DV8919-KSM, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Move, code=DV8919-KSM, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val DV8919_KSM = "spec:width=720,height=1280,unit=px,dpi=320"

  }
