package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ROYALRAHMANI device specifications for Android Compose previews.
 *
 * This extension provides ROYALRAHMANI device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ROYALRAHMANI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ROYALRAHMANI: Any
  get() = object {
      /** ROYALRAHMANI hongkong */
      val HONGKONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ROYALRAHMANI stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

  }
