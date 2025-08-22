package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KUNFT device specifications for Android Compose previews.
 *
 * This extension provides KUNFT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kunft.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kunft: Any
  get() = object {
      /** KUNFT ikebukuro */
      val IKEBUKURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** KUNFT redwood */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** KUNFT samseong */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
