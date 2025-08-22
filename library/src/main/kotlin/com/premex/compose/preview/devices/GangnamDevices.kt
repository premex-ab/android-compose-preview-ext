package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Gangnam device specifications for Android Compose previews.
 *
 * This extension provides Gangnam device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Gangnam.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Gangnam: Any
  get() = object {
      /** Gangnam anglelake */
      val ANGLELAKE = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Gangnam waiawa */
      val WAIAWA = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
