package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MAXWELL device specifications for Android Compose previews.
 *
 * This extension provides MAXWELL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Maxwell.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Maxwell: Any
  get() = object {
      /** MAXWELL marina */
      val MARINA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MAXWELL nagata */
      val NAGATA = "spec:width=720,height=1280,unit=px,dpi=213"

  }
