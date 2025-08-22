package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Noblex device specifications for Android Compose previews.
 *
 * This extension provides Noblex device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Noblex.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Noblex: Any
  get() = object {
      /** Noblex anaheim */
      val ANAHEIM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Noblex shinjuku */
      val SHINJUKU = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Noblex songshan */
      val SONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Noblex SW4H */
      val SW4H = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Noblex SW6H */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=160"

  }
