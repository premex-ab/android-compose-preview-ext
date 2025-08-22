package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Aborder device specifications for Android Compose previews.
 *
 * This extension provides Aborder device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Aborder.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Aborder: Any
  get() = object {
      /** Aborder guandu */
      val GUANDU = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Aborder martin */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

  }
