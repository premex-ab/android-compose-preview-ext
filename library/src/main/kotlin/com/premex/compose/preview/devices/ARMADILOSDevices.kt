package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ARMADILOS device specifications for Android Compose previews.
 *
 * This extension provides ARMADILOS device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ARMADILOS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ARMADILOS: Any
  get() = object {
      /** ARMADILOS Listo22 */
      val LISTO22 = "spec:width=600,height=1024,unit=px,dpi=220"

  }
