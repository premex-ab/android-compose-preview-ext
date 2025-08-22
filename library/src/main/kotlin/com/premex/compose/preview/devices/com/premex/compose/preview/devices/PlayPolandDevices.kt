package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PlayPoland device specifications for Android Compose previews.
 *
 * This extension provides PlayPoland device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PlayPoland.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PlayPoland: Any
  get() = object {
      /** DeviceSpec(manufacturer=PlayPoland, code=PLAY_BOX_TV_4B, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PlayPoland, code=PLAY_BOX_TV_4B,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val PLAY_BOX_TV_4B = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
