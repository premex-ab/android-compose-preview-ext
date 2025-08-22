package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Rindo device specifications for Android Compose previews.
 *
 * This extension provides Rindo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Rindo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Rindo: Any
  get() = object {
      /** Rindo ikebukuro */
      val IKEBUKURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Rindo longshan */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Rindo redwood */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Rindo samseong */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
