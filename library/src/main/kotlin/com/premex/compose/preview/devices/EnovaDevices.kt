package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * eNOVA device specifications for Android Compose previews.
 *
 * This extension provides eNOVA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Enova.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Enova: Any
  get() = object {
      /** eNOVA TAE08N10 */
      val TAE08N10 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
