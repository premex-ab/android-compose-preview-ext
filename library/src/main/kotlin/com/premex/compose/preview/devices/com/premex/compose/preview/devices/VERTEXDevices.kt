package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VERTEX device specifications for Android Compose previews.
 *
 * This extension provides VERTEX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VERTEX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VERTEX: Any
  get() = object {
      /** DeviceSpec(manufacturer=VERTEX, code=IMPRESS_CLICK, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VERTEX, code=IMPRESS_CLICK,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val IMPRESS_CLICK = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=VERTEX, code=Impress_Win, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VERTEX, code=Impress_Win,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val IMPRESS_WIN = "spec:width=720,height=1280,unit=px,dpi=320"

  }
