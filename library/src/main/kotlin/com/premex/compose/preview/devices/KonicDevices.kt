package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KONIC device specifications for Android Compose previews.
 *
 * This extension provides KONIC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Konic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Konic: Any
  get() = object {
      /** KONIC mateo */
      val MATEO = "spec:width=720,height=1280,unit=px,dpi=213"

  }
