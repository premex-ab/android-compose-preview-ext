package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Phoenix_Note device specifications for Android Compose previews.
 *
 * This extension provides Phoenix_Note device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PhoenixNote.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PhoenixNote: Any
  get() = object {
      /** DeviceSpec(manufacturer=Phoenix_Note, code=PPS2022-P156, width=1080, height=1920, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Phoenix_Note, code=PPS2022-P156,
      width=1080, height=1920, dpi=160, isGoogleDevice=false).code */
      val PPS2022_P156 = "spec:width=1080,height=1920,unit=px,dpi=160"

  }
