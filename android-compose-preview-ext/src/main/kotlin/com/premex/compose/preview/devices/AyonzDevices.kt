package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Ayonz device specifications for Android Compose previews.
 *
 * This extension provides Ayonz device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ayonz.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ayonz: Any
  get() = object {
      /** Ayonz hanyang */
      val HANYANG = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
